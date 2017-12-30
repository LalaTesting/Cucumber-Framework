package com.comcast.watchable.channels;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.model.curatedlists.Items;
import com.comcast.model.curatedlists.Links;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VideosUnderChannel extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";

	HttpGetAPI get = null;
	CloseableHttpResponse videosUnderChannelResponse = null;
	CuratedList curatedlist = null;

	ChannelVideos channelVideos = null;
	Links links = null;
	Items items = null;

	private CloseableHttpResponse getVideosUnderChannelResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		videosUnderChannelResponse = get.getNonUsersHttpresponse(url,
				getSessionToken());
		return videosUnderChannelResponse;
	}

	@Given("^method: GET$")
	public void method_GET() throws Throwable {

	}

	@Given("^path: /api/web/channels/<channelId>/videos$")
	public void path_api_web_channels_channelId_videos() throws Throwable {

	}

	@Given("^request headers and SessionToken$")
	public void request_headers_and_SessionToken() throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CHANNELS_ID_API, getFabricPropterties())
				+ "/"
				+ AbstractSetup.getChannelList().get(0)
				+ "/"
				+ FabricUtlKeys.CHANNEL_ID_VIDEOS_API;

	

	}

	@When("^HttpRequest gets executed$")
	public void httprequest_gets_executed() throws Throwable {
	}

	@Then("^validate status code as (\\d+) OK$")
	public void validate_status_code_as_OK(int arg1) throws Throwable {
		
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CHANNELS_ID_API, getFabricPropterties())
				+ "/"
				+ AbstractSetup.getChannelList().get(0)
				+ "/"
				+ FabricUtlKeys.CHANNEL_ID_VIDEOS_API;
		
		videosUnderChannelResponse = getVideosUnderChannelResponse(url);
		Assert.assertEquals(videosUnderChannelResponse.getStatusLine()
				.getStatusCode(), arg1);

	}

	@Then("^response has totalItems and it has atleast one item in it$")
	public void response_has_totalItems_and_it_has_atleast_one_item_in_it()
			throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		channelVideos = mapper.readValue(videosUnderChannelResponse.getEntity()
				.getContent(), ChannelVideos.class);
		Assert.assertNotNull(channelVideos.getTotalItems());
		Integer totalItems = new Integer(channelVideos.getTotalItems());

		boolean totalItem = totalItems > 0;

		Assert.assertTrue(totalItem);

		videosUnderChannelResponse.close();
	}

	@Then("^response has link\\.self$")
	public void response_has_link_self() throws Throwable {
		Assert.assertNotNull(channelVideos.getLinks().getSelf());
	}

	@Then("^validate response attributes are returned as not null$")
	public void validate_response_attributes_are_returned_as_not_null()
			throws Throwable {
		Items[] chnlVideoItems = channelVideos.getItems();
		for (Items item : chnlVideoItems) {
			Assert.assertNotNull(item.getType());
			Assert.assertNotNull(item.getId());
			Assert.assertNotNull(item.getTitle());
			// Assert.assertNotNull(item.getShortDescription());
			Assert.assertNotNull(item.getLongDescription());
			Assert.assertNotNull(item.getLiveBroadcastTime());
			Assert.assertNotNull(item.getCreateTime());
			Assert.assertNotNull(item.getEpisode());
			Assert.assertNotNull(item.getDuration());
			Assert.assertNotNull(item.getParentalGuidance());
			Assert.assertNotNull(item.getOnDemandTimeBegin());
			Assert.assertNotNull(item.getOnDemandTimeEnd());
			Assert.assertNotNull(item.getLinks().getCellImage());
			Assert.assertNotNull(item.getLinks().getLogoImage());
			Assert.assertNotNull(item.getLinks().getUserVideoDetails());
			Assert.assertNotNull(item.getLinks().getTemplateImage());
			Assert.assertNotNull(item.getLinks().getSharelink());
			Assert.assertNotNull(item.getLinks().getChannel());
			Assert.assertNotNull(item.getLinks().getSelf());
			Assert.assertNotNull(item.getLinks().getPublisher());
			Assert.assertNotNull(item.getLinks().getDefaultImage());
			Assert.assertNotNull(item.getLinks().getChannelSubscriptionStatus());

		}
	}

	@Then("^validate for video duration where it should not be zero$")
	public void validate_for_video_duration_where_it_should_not_be_zero()
			throws Throwable {

		Items[] chnlVideoItems = channelVideos.getItems();
		for (Items item : chnlVideoItems) {
			Assert.assertNotNull(item.getDuration());
			Integer videoDuration = new Integer(item.getDuration());

			boolean duration = (videoDuration != 0);

			Assert.assertTrue(duration);

		}

	}

	@Then("^channelTitle and channelId should not be empty$")
	public void channeltitle_and_channelId_should_not_be_empty()
			throws Throwable {

		Items[] chnlVideoItems = channelVideos.getItems();
		for (Items item : chnlVideoItems) {
			Assert.assertNotNull(item.getChannelTitle());
			Assert.assertNotNull(item.getChannelId());

		}
	}

}
