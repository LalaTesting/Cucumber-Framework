package com.comcast.watchable.curated;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.model.curatedlists.Video;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CuratedVideosAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(CuratedVideosAPI.class.getName());

	HttpGetAPI get = null;
	CloseableHttpResponse curatedVideosResponse = null;
	CuratedList curatedlist = null;
	CuratedItems curatedItem = null;

	private CloseableHttpResponse getCuratedVideosResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		curatedVideosResponse = get.getNonUsersHttpresponse(url,
				getSessionToken());
		return curatedVideosResponse;

	}

	@Given("^method: GET /fds/api/watchable/web/curated/videos and Verify response as (\\d+) OK$")
	public void verifyCuratedVideosStatus(int arg1) throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CURATED_VIDEOS_API, getFabricPropterties());
		curatedVideosResponse = getCuratedVideosResponse(url);
		Assert.assertEquals(curatedVideosResponse.getStatusLine()
				.getStatusCode(), 200);

	}

	@Then("^verify (\\d+) seconds for cache-control header$")
	public void verify_seconds_for_cache_control_header(int arg1)
			throws Throwable {
		String cache_control_header_actual = getCuratedVideosCacheControlHeader(curatedVideosResponse);
		Assert.assertEquals(cache_control_header_actual,
				CACHE_CONTROL_HEADER_EXPECTED);

	}

	@Then("^validate curatedVideos api has returned more than zero item$")
	public void validate_curatedVideos_api_has_returned_more_than_zero_item()
			throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		curatedlist = mapper.readValue(curatedVideosResponse.getEntity()
				.getContent(), CuratedList.class);

		Integer curatedItem = new Integer(curatedlist.getTotalItems());

		boolean totalItem = curatedItem > 0;

		Assert.assertTrue(totalItem);

	}

	@Then("^verify totalItems and totalVideos has same count$")
	public void verify_totalItems_and_totalVideos_has_same_count()
			throws Throwable {

		Assert.assertEquals(curatedlist.getTotalItems(),
				curatedlist.getTotalVideos());

	}

	@Then("^verify CuratedListType argument's key value is FeaturedVideos$")
	public void verify_CuratedListType_argument_s_key_value_is_FeaturedVideos()
			throws Throwable {

		Assert.assertEquals("FeaturedVideos", curatedlist.getCuratedListType());
	}

	@Then("^verify for the presence of GENRE attribute$")
	public void verify_for_the_presence_of_GENRE_attribute() throws Throwable {

		Assert.assertNotNull(curatedlist.getGenre());

	}

	@Then("^verify curatedItems's TYPE is CuratedVideo$")
	public void verify_curatedItems_s_TYPE_is_CuratedVideo() throws Throwable {

		CuratedItems[] curatedItems = curatedlist.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {
			// String
			String curatedItemType = curatedItem.getType();

			Assert.assertNotNull(curatedItemType, "CuratedVideo");

		}
	}

	@Then("^verify VideoList has Type as video$")
	public void verify_VideoList_has_Type_as_video() throws Throwable {

		CuratedItems[] curatedItems = curatedlist.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			Video type = curatedItem.getVideo();

			Assert.assertNotNull(type.getType());
		}

	}

	@Then("^verify VideoList has id$")
	public void verify_VideList_has_id() throws Throwable {

		CuratedItems[] curatedItems = curatedlist.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			Video videoId = curatedItem.getVideo();
			Assert.assertNotNull(videoId.getId());

		}
	}

	@Then("^verify VideoList has channelTitle$")
	public void verify_VideoList_has_channelTitle() throws Throwable {
		CuratedItems[] curatedItems = curatedlist.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			Video videoChannelTitle = curatedItem.getVideo();
			Assert.assertNotNull(videoChannelTitle.getChannelTitle());

		}
	}

	@Then("^verify videoList has ChannelId$")
	public void verify_videoList_has_ChannelId() throws Throwable {
		CuratedItems[] curatedItems = curatedlist.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			Assert.assertNotNull(curatedItem.getVideo().getChannelId());
		}

	}

	@Then("^verify video's duration is not zero$")
	public void verify_video_s_duration_is_not_zero() throws Throwable {

		CuratedItems[] curatedItems = curatedlist.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			Video videoObject = curatedItem.getVideo();
			String videoDuration = videoObject.getDuration();
			String videoId = videoObject.getId();
			int duration = Integer.parseInt(videoDuration);

			if (duration <= 0) {
				log.info("Video " + videoId + " has 0 duration");
				Assert.assertTrue(false);

			}

		}
	}

	/*
	 * @Then("^curatedItem's title and Video's title is same$") public void
	 * curateditem_s_title_and_Video_s_title_is_same() throws Throwable {
	 * 
	 * CuratedItems[] curatedItems = curatedlist.getCuratedItems(); for
	 * (CuratedItems curatedItem : curatedItems) { String curatedTitle =
	 * curatedItem.getTitle(); Video videoObject = curatedItem.getVideo();
	 * Assert.assertEquals(curatedTitle, videoObject.getTitle());
	 * 
	 * }
	 * 
	 * }
	 */

	private String getCuratedVideosCacheControlHeader(
			CloseableHttpResponse response) {

		Header[] headers = response.getHeaders(CACHE_CONTROL);

		for (Header header : headers) {

			if (header.getName().equals(CACHE_CONTROL)) {
				return header.getValue();
			}

		}

		return null;

	}

}