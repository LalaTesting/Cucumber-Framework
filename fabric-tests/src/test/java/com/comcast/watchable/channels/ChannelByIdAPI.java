package com.comcast.watchable.channels;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.introspect.BasicClassIntrospector.GetterMethodFilter;
import org.testng.Assert;

import com.comcast.model.curatedlists.Channel;
import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.model.curatedlists.Links;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ChannelByIdAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";

	HttpGetAPI get = null;
	CloseableHttpResponse channelsIdResponse = null;
	CuratedList curatedlist = null;
	CuratedItems curatedItem = null;

	Channel channel = null;
	Links links = null;

	private CloseableHttpResponse getChannelsByIdResponse(String url)
	{

		HttpGetAPI get = new HttpGetAPI();

		channelsIdResponse = get
				.getNonUsersHttpresponse(url, getSessionToken());
		return channelsIdResponse;
	}

	@Given("^method: GET /fmds/api/watchable/web/channels/<channelId> and Verify response as (\\d+) OK$")
	public void method_GET_fmds_api_watchable_web_channels_channelId_and_Verify_response_as_OK(int arg1) throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CHANNELS_ID_API, getFabricPropterties())+ "/" + AbstractSetup.getChannelList().get(0);
		channelsIdResponse = getChannelsByIdResponse(url);
		Assert.assertEquals(channelsIdResponse.getStatusLine().getStatusCode(),
				arg1);

	}

	@Then("^validate the channelsId API has type$")
	public void validate_the_channelsId_API_has_type() throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		channel = mapper.readValue(channelsIdResponse.getEntity().getContent(),
				Channel.class);
		Assert.assertNotNull(channel.getType());
		channelsIdResponse.close();

	}

	@Then("^verify for channelId$")
	public void verify_for_channelId() throws Throwable {

		Assert.assertNotNull(channel.getId());

	}

	@Then("^verify for channel title$")
	public void verify_for_channel_title() throws Throwable {
		Assert.assertNotNull(channel.getTitle());
	}

	@Then("^verify for the description$")
	public void verify_for_the_description() throws Throwable {
		Assert.assertNotNull(channel.getDescription());

	}

	@Then("^verify for the numOfShows parameter$")
	public void verify_for_the_numOfShows_parameter() throws Throwable {
		Assert.assertNotNull(channel.getNumOfShows());
	}

	@Then("^verify for numOfVideos attribute is present and has equal to or more than one item$")
	public void verify_for_numOfVideos_attribute_is_present_and_has_equal_to_or_more_than_one_item()
			throws Throwable {
		Assert.assertNotNull(channel.getNumOfVideos());
	}

	@Then("^verify the attribute lastUpdateTimestamp$")
	public void verify_the_attribute_lastUpdateTimestamp() throws Throwable {
		Assert.assertNotNull(channel.getLastUpdateTimestamp());

	}

	@Then("^verify for the parentalGuidance attribute$")
	public void verify_for_the_parentalGuidance_attribute() throws Throwable {
		Assert.assertNotNull(channel.getParentalGuidance());

	}

	@Then("^verify for Links presence$")
	public void verify_for_Links_presence() throws Throwable {

		Assert.assertNotNull(channel.getLinks());

	}

	@Then("^validate Links has logo-image$")
	public void validate_Links_has_logo_image() throws Throwable {

		Assert.assertNotNull(channel.getLinks().getLogoImage());
		// System.out.println("dMVBBBBBBBBBBB" +
		// channel.getLinks().getLogoImage());

	}

	@Then("^validate Links has paginateShowsAll attribute$")
	public void validate_Links_has_paginateShowsAll_attribute()
			throws Throwable {
        System.out.println("SSSSSSSSSSSS"+channel.getLinks().getPaginateShowsAll());
		Assert.assertNotNull(channel.getLinks().getPaginateShowsAll());

	}

	@Then("^validate Links has template-image$")
	public void validate_Links_has_template_image() throws Throwable {
		
		 System.out.println("XXXXXXXXXXXXXXXXXXXX"+channel.getLinks().getTemplateImage());
		Assert.assertNotNull(channel.getLinks().getTemplateImage());
		
	}

	@Then("^validate Links has sharelink$")
	public void validate_Links_has_sharelink() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getSharelink());

	}

	@Then("^validate Links has channels-videos atribute$")
	public void validate_Links_has_channels_videos_atribute() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getChannelVideos());

	}

	@Then("^validate Links has subscription-status$")
	public void validate_Links_has_subscription_status() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getSubscriptionStatus());

	}

	@Then("^validate Links has paginateShowsTemplate$")
	public void validate_Links_has_paginateShowsTemplate() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getPaginateShowsTemplate());

	}

	@Then("^validate Links has channels-allvideos$")
	public void validate_Links_has_channels_allvideos() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getChannelsAllVideos());

	}

	@Then("^validate Links has genre$")
	public void validate_Links_has_genre() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getGenre());

	}

	@Then("^validate Links has publisher$")
	public void validate_Links_has_publisher() throws Throwable {

		Assert.assertNotNull(channel.getLinks().getPublisher());

	}

	@Then("^validate Links has default-image$")
	public void validate_Links_has_default_image() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getDefaultImage());

	}

	@Then("^validate Links has pagnateShowsAndVideos$")
	public void validate_Links_has_pagnateShowsAndVideos() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getPaginateShowsAndVideos());

	}

	@Then("^validate Links has cell-image$")
	public void validate_Links_has_cell_image() throws Throwable {
		Assert.assertNotNull(channel.getLinks().getCellImage());

	}

	@Then("^validate Links has paginateShowsAndVideosTemplate$")
	public void validate_Links_has_paginateShowsAndVideosTemplate()
			throws Throwable {
		Assert.assertNotNull(channel.getLinks()
				.getPaginateShowsAndVideosTemplate());

	}

	/*
	 * Verification of channelId api for invalid channelID
	 */

	@Given("^methog GET channels/(\\d+)$")
	public void methog_GET_channels(int arg1) throws Throwable {

		// String url = reader.geturl(FabricUtlKeys.CHANNELS_ID_API, props)+
		// "/"+ FabricUtlKeys.CHANNEL_ID_INVALID;

	}

	@Then("^verify the status code$")
	public void verify_the_status_code() throws Throwable {

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CHANNELS_ID_API, getFabricPropterties())
				+ "/" + FabricUtlKeys.CHANNEL_ID_INVALID;

		channelsIdResponse = getChannelsByIdResponse(url);

		Assert.assertEquals(channelsIdResponse.getStatusLine().getStatusCode(),
				404);
	}

	/*
	 * Scenario Three : Verify the ChannelsById API by giving alphanumeric id.
	 * 
	 * @throws Throwable
	 */

	@Given("^method: GET channels/ABCDE@ API$")
	public void method_GET_channels_ABCDE_API() throws Throwable {

		// String url = reader.geturl(FabricUtlKeys.CHANNELS_ID_API, props)+ "/"
		// + FabricUtlKeys.CHANNEL_ID_NON_INTEGER;

	}

	@Then("^validate the status code for alphanumeric channel id$")
	public void validate_the_status_code_for_alphanumeric_channel_id()
			throws Throwable {
		String url = getDataPropertyReader().geturl(FabricUtlKeys.CHANNELS_ID_API, getFabricPropterties()) + "/"
				+ FabricUtlKeys.CHANNEL_ID_NON_INTEGER;

		channelsIdResponse = getChannelsByIdResponse(url);
		// System.out.println(" Status CODE :: "+getChannelsByIdResponse(url).getStatusLine()
		// .getStatusCode());
		Assert.assertEquals(channelsIdResponse.getStatusLine().getStatusCode(),
				400);
	}

}
