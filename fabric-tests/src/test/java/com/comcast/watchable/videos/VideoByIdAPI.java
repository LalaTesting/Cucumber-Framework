package com.comcast.watchable.videos;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;
import com.comcast.model.curatedfeatured.CuratedFeatured;
import com.comcast.model.curatedfeatured.Links;
import com.comcast.model.curatedfeatured.Video;
import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.model.curatedlists.Items;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VideoByIdAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=3600";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(VideoByIdAPI.class.getName());

	CloseableHttpResponse videoByIdResponse = null;
	CuratedList curatedlist = null;
	CuratedItems curatedItem = null;
	Video video = null;
	Links links = null;
	CuratedFeatured curatedFeatured = null;

	private CloseableHttpResponse getVideosByIDResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		videoByIdResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return videoByIdResponse;

	}

	@Given("^method: GET videosbyId api$")
	public void getVideosByIdAPI() throws Throwable {
		this.setUp();

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties())
				+ "/" + AbstractSetup.getVideoList().get(0);

		videoByIdResponse = getVideosByIDResponse(url);
		// System.out.println("MMMMMMM" + videoByIdResponse);
	}

	@Then("^verify the status code as (\\d+) OK$")
	public void verify_the_status_code_as_OK(int arg1) throws Throwable {

		/*
		 * String url =
		 * getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_ID_API,
		 * getFabricPropterties())+ "/" + FabricUtlKeys.VIDEO_ID;
		 */
		/* videoByIdResponse = getVideosByIDResponse(url); */
		/*
		 * Assert.assertEquals(videoByIdResponse.getStatusLine()
		 * .getStatusCode(), 200);
		 */

	}

	@Then("^validate cache-control header is (\\d+) seconds$")
	public void validate_cache_control_header_is_seconds(int arg1)
			throws Throwable {

		String cache_control_header_actual = getVideosByIdCacheControlHeader(videoByIdResponse);
		Assert.assertEquals(cache_control_header_actual,
				CACHE_CONTROL_HEADER_EXPECTED);

	}

	@Then("^validate type is Video$")
	public void validate_type_is_Video() throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		video = mapper.readValue(videoByIdResponse.getEntity().getContent(),
				Video.class);
		videoByIdResponse.close();
		Assert.assertNotNull(video.getType());
		log.info("type is " + video.getType());
		// System.out.println("type is " + video.getType());

		videoByIdResponse.close();

	}

	@Then("^verify for id and its value$")
	public void verify_for_id_and_its_value() throws Throwable {

		Assert.assertNotNull(video.getId());
		log.info("id is " + video.getId());

	}

	@Then("^verify shortDescription$")
	public void verify_shortDescription() throws Throwable {

		Assert.assertNotNull(video.getShortDescription());

	}

	@Then("^verify longDescription$")
	public void verify_longDescription() throws Throwable {
		Assert.assertNotNull(video.getLongDescription());

	}

	@Then("^verify liveBroadcastTime and its value$")
	public void verify_liveBroadcastTime_and_its_value() throws Throwable {
		Assert.assertNotNull(video.getLiveBroadcastTime());
	}

	@Then("^verify createTime attribute is present$")
	public void verify_createTime_attribute_is_present() throws Throwable {
		Assert.assertNotNull(video.getCreateTime());

	}

	@Then("^verify the ChannelTitle$")
	public void verify_the_ChannelTitle() throws Throwable {
		Assert.assertNotNull(video.getChannelTitle());

	}

	@Then("^verify episode attribute is there$")
	public void verify_episode_attribute_is_there() throws Throwable {
		Assert.assertNotNull(video.getEpisode());

	}

	@Then("^verify for the presence of duration$")
	public void verify_for_the_presence_of_duration() throws Throwable {
		Assert.assertNotNull(video.getDuration());

	}

	@Then("^verify the parental guidance$")
	public void verify_the_parental_guidance() throws Throwable {
		Assert.assertNotNull(video.getParentalGuidance());

	}

	@Then("^verify the channelId$")
	public void verify_the_channelId() throws Throwable {
		Assert.assertNotNull(video.getChannelId());

	}

	@Then("^check the publishTime$")
	public void check_the_publishTime() throws Throwable {
		Assert.assertNotNull(video.getPublishTime());

	}

	@Then("^verify links$")
	public void verify_links() throws Throwable {
		Assert.assertNotNull(video.getLinks());
	}

	@Then("^verify links has userVideoDetails$")
	public void verify_links_has_userVideoDetails() throws Throwable {

		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getUserVideoDetails());
	}

	@Then("^verify links has templateImage$")
	public void verify_links_has_templateImage() throws Throwable {

		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getTemplateImage());

	}

	@Then("^verify links has sharelink$")
	public void verify_links_has_sharelink() throws Throwable {

		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getSharelink());

	}

	@Then("^verify links has channel$")
	public void verify_links_has_channel() throws Throwable {

		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getChannel());

	}

	@Then("^verify links has self$")
	public void verify_links_has_self() throws Throwable {
		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getSelf());

	}

	@Then("^verify links has publisher$")
	public void verify_links_has_publisher() throws Throwable {

		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getPublisher());

	}

	@Then("^verify links has defaultImage$")
	public void verify_links_has_defaultImage() throws Throwable {
		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getSharelink());
		// System.out.println(" default image == "+linksItems.getSharelink());

	}

	@Then("^verify links has cellImage$")
	public void verify_links_has_cellImage() throws Throwable {
		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getCellImage());
		// System.out.println("cellImage==== "+ linksItems.getCellImage());

	}

	@Then("^verify links has channelSubscriptionStatus link$")
	public void verify_links_has_channelSubscriptionStatus_link()
			throws Throwable {
		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getChannelSubscriptionStatus());

	}

	@Then("^verify for the presence of playbackItems$")
	public void verify_for_the_presence_of_playbackItems() throws Throwable {
		Assert.assertNotNull(video.getPlaybackItems());
	}

	@Then("^verify links has logoImage$")
	public void verify_links_has_logoImage() throws Throwable {

		// System.out.println("CCCCCCCCCCCC"+video.getLinks());
		// Links linksitems=video.getLinks();
		// System.out.println("SSSSSSSSSSSSS"+linksitems.getImageUri());

		Links linksItems = video.getLinks();
		Assert.assertNotNull(linksItems.getLogoImage());
	}

	/**
	 * Scenario Two : Verify the VideosById API by giving invalid Video ID as
	 * non-integer value.
	 * 
	 * @throws Throwable
	 */

	@Given("^method: GET Videos API$")
	public void method_GET_Videos_API() throws Throwable {
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties())
				+ "/" + FabricUtlKeys.VIDEO_ID_NON_INTEGER;

	}

	@Then("^verify the status code as (\\d+) Not Found$")
	public void verify_the_status_code_as_Not_Found(int arg1) throws Throwable {
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties())
				+ "/" + FabricUtlKeys.VIDEO_ID_NON_INTEGER;

		videoByIdResponse = getVideosByIDResponse(url);
		Assert.assertEquals(videoByIdResponse.getStatusLine().getStatusCode(),
				400);
	}

	/*
	 * Scenario Three : Verify the VideosById API by giving invalid Video ID as
	 * 10.
	 * 
	 * @throws Throwable
	 */

	@Given("^methog GET videos/(\\d+)$")
	public void methog_GET_videos(int arg1) throws Throwable {
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties())
				+ "/" + FabricUtlKeys.VIDEO_ID_NON_INTEGER;

	}

	@Then("^verify status code as (\\d+) BADREQUEST$")
	public void verify_status_code_as_BADREQUEST(int arg1) throws Throwable {

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties())
				+ "/" + FabricUtlKeys.VIDEO_ID_INVALID;

		videoByIdResponse = getVideosByIDResponse(url);
		System.out.println(" Status CODE :: "
				+ videoByIdResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(videoByIdResponse.getStatusLine().getStatusCode(),
				404);
	}

	private String getVideosByIdCacheControlHeader(
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
