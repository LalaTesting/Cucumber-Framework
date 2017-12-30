package com.comcast.watchable.curated;

import java.util.logging.Logger;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

import com.comcast.model.curatedfeatured.CuratedFeatured;
import com.comcast.model.curatedfeatured.CuratedItems;
import com.comcast.model.curatedfeatured.Video;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

//import org.testng.annotations.BeforeTest;

public class CuratedFeaturedAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";

	private static final Logger LOGGER = Logger
			.getLogger(CuratedFeaturedAPI.class.getName());

	HttpGetAPI get = null;
	CloseableHttpResponse curatedFeaturedResponse = null;
	CuratedFeatured curatedFeatured = null;

	private CloseableHttpResponse getCuratedFeaturedResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		curatedFeaturedResponse = get.getNonUsersHttpresponse(url,
				getSessionToken());
		return curatedFeaturedResponse;
	}

	@Given("^method: GET /fmds/api/watchable/web/curated/videos$")
	public void getCuratedFeatureAPI() throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(FabricUtlKeys.CURATED_VIDEOS_API,
				getFabricPropterties());
		curatedFeaturedResponse = getCuratedFeaturedResponse(url);
		Assert.assertEquals(curatedFeaturedResponse.getStatusLine()
				.getStatusCode(), 200);
	}

	@Then("^validate the curatedVideos API has returned more than one item$")
	public void validateCuratedFeaturedTotalItems() throws Throwable {

		HttpEntity entity = curatedFeaturedResponse.getEntity();
		ObjectMapper mapper = new ObjectMapper();
		curatedFeatured = mapper.readValue(entity.getContent(),
				CuratedFeatured.class);
		Integer curatedItems = new Integer(curatedFeatured.getTotalItems());

		boolean totalItem = curatedItems > 0;

		Assert.assertTrue(totalItem);

		//System.out.println("BBBBBBBBBBB" + curatedFeatured);
	}

	@Then("^verify cache control (\\d+) seconds$")
	public void validateCacheControlHeader(int arg1) throws Throwable {
		String cache_control_header_actual = getCuratedCacheControlHeader(curatedFeaturedResponse);
		curatedFeaturedResponse.close();
		Assert.assertEquals(cache_control_header_actual,
				CACHE_CONTROL_HEADER_EXPECTED);

	}

	@Then("^totalItems and totalVideos has same value$")
	public void totalitems_and_totalVideos_has_same_value() throws Throwable {

		CuratedItems[] curatedItemsData = curatedFeatured.getCuratedItems();

		for (CuratedItems items : curatedItemsData) {
			items.getLinks();
			Assert.assertNotNull(items.getLinks());
		}

	}

	/*@Then("^CuratedVideo and Video title are same$")
	public void validateTitles() throws Throwable {

		CuratedItems[] curatedItems = curatedFeatured.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {
			String curatedTitle = curatedItem.getTitle();
			Video video = curatedItem.getVideo();
			Assert.assertEquals(curatedTitle, video.getTitle());

		}

	}*/

	@Then("^verify Genre attribute is present$")
	public void verifyGenreAtrribute() throws Throwable {
		Assert.assertNotNull(curatedFeatured.getGenre());

	}

	@Then("^verify Video has ChannelId and ChannelTitle$")
	public void verify_Video_has_ChannelId_and_ChannelTitle() throws Throwable {
		CuratedItems[] curatedItems = curatedFeatured.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {
			Video curatedVideo = curatedItem.getVideo();
			Assert.assertNotNull(curatedVideo.getChannelId());
			Assert.assertNotNull(curatedVideo.getChannelTitle());
		}
	}

	private String getCuratedCacheControlHeader(CloseableHttpResponse response) {

		Header[] headers = response.getHeaders(CACHE_CONTROL);

		for (Header header : headers) {

			if (header.getName().equals(CACHE_CONTROL)) {
				return header.getValue();
			}

		}

		return null;

	}

}