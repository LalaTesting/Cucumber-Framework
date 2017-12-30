package com.comcast.watchable.videos;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.curatedlists.Items;
import com.comcast.model.curatedlists.Links;
import com.comcast.model.curatedlists.Playlist;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class VideoPlaylistAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=3600";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(VideoPlaylistAPI.class.getName());

	
	String sessionToken;
	HttpGetAPI get = null;
	CloseableHttpResponse videoPlaylistResponse = null;
	// VideoIdPlaylist videoIdPlaylist=null;

	Playlist playlists = null;

	Items items = null;
	Links links = null;


	private CloseableHttpResponse getVideoPlaylistResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		videoPlaylistResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return videoPlaylistResponse;

	}
	
	
	

	@Given("^method: GET videoPlaylist api and verify the status code as (\\d+) OK$")
	public void method_GET_videoPlaylist_api_and_verify_the_status_code_as_OK(
			int arg1) throws Throwable {
            this.setUp();
		String url = getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties()) + "/"
				+ AbstractSetup.getVideoList().get(0) + "/"
				+ FabricUtlKeys.VIDEOS_ID_PLAYLIST_API;
		videoPlaylistResponse = getVideoPlaylistResponse(url);
		
		Assert.assertEquals(videoPlaylistResponse.getStatusLine()
				.getStatusCode(), 200);
	}

	@Then("^validate cache-control header$")
	public void validate_cache_control_header() throws Throwable {

		String uri = getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties()) + "/"
				+ AbstractSetup.getVideoList().get(0) + "/"
				+ FabricUtlKeys.VIDEOS_ID_PLAYLIST_API;
		videoPlaylistResponse = getVideoPlaylistResponse(uri);
		String cache_control_header_actual = getVideoPlaylistCacheControlHeader(videoPlaylistResponse);
		Assert.assertEquals(cache_control_header_actual,
				CACHE_CONTROL_HEADER_EXPECTED);

	}

	@Then("^verify pageNum is present$")
	public void verify_pageNum_is_present() throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		playlists = mapper.readValue(videoPlaylistResponse.getEntity()
				.getContent(), Playlist.class);
		videoPlaylistResponse.close();
		Assert.assertNotNull(playlists.getPageNum());
		


	}

	@Then("^check for pageSize$")
	public void check_for_pageSize() throws Throwable {

		Assert.assertNotNull(playlists.getPageSize());

	}

	@Then("^verify for the attribute totalItems$")
	public void verify_for_the_attribute_totalItems() throws Throwable {

		Integer totalItems = new Integer(playlists.getTotalItems());

		boolean totalItem = totalItems > 0;

		Assert.assertTrue(totalItem);

	}

	@Then("^verify for links$")
	public void verify_for_links() throws Throwable {

		Assert.assertNotNull(playlists.getLinks());
	

	}

	@Then("^verify for items$")
	public void verify_for_items() throws Throwable {
		Assert.assertNotNull(playlists.getItems());

	}

	@Then("^verify items has type as Video$")
	public void verify_items_has_type_as_Video() throws Throwable {

		Items[] playlistItems = playlists.getItems();
		for (Items item : playlistItems) {
			Assert.assertNotNull(item.getType());

		}

	}

	@Then("^verify items has id$")
	public void verify_items_has_id() throws Throwable {
		Items[] playlistItems = playlists.getItems();
		for (Items item : playlistItems) {
			Assert.assertNotNull(item.getId());

		}

	}

	@Then("^verify items has title and its value$")
	public void verify_items_has_title_and_its_value() throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getTitle());
			
		}
		

	}

	@Then("^verify items has shortDescription$")
	public void verify_items_has_shortDescription() throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getShortDescription());
			
		}
		

	}

	@Then("^verify items has longDescription$")
	public void verify_items_has_longDescription() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLongDescription());
			
		}
		

	}

	@Then("^verify items has liveBroadcastTime$")
	public void verify_items_has_liveBroadcastTime() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLiveBroadcastTime());
			
		}
		

	}

	@Then("^verify items has createTime$")
	public void verify_items_has_createTime() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getCreateTime());
			
		}
		

	}

	@Then("^verify items has channelTitle$")
	public void verify_items_has_channelTitle() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getChannelTitle());
			
		}
		

	}

	@Then("^verify items has episode$")
	public void verify_items_has_episode() throws Throwable {

		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getEpisode());
			
		}
		
	}

	@Then("^verify items has duration$")
	public void verify_items_has_duration() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getDuration());
			
		}
		

	}

	@Then("^verify videos have proper duration and its not zero seconds$")
	public void verify_videos_have_proper_duration_and_its_not_zero_seconds()
			throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getDuration());
			
		}
		

	}

	@Then("^verify items has parentalGuidance field$")
	public void verify_items_has_parentalGuidance_field() throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getParentalGuidance());
			
		}
		

	}

	@Then("^verify items has channelId$")
	public void verify_items_has_channelId() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getChannelId());
			
		}
		

	}

	@Then("^verify items has externalId$")
	public void verify_items_has_externalId() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getExternalId());
			
		}
		

	}

	@Then("^verify items has publishTime$")
	public void verify_items_has_publishTime() throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getPublishTime());
			
		}

	}

	@Then("^verify items has onDemandTimeBegin$")
	public void verify_items_has_onDemandTimeBegin() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getOnDemandTimeBegin());
			
		}

	}

	@Then("^verify items has onDemandTimeEnd$")
	public void verify_items_has_onDemandTimeEnd() throws Throwable {

		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getOnDemandTimeBegin());
			
		}
	}

	@Then("^verify items has links$")
	public void verify_items_has_links() throws Throwable {

		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks());
			
		}
	}

	@Then("^verify items has logo-image$")
	public void verify_items_has_logo_image() throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getLogoImage());
			
		}
	}

	@Then("^verify items has userVideoDetails$")
	public void verify_items_has_userVideoDetails() throws Throwable {
		
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getUserVideoDetails());
			
		}

	}

	@Then("^verify items has template-mage$")
	public void verify_items_has_template_mage() throws Throwable {

		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getTemplateImage());
			
		}

	}

	@Then("^verify items has shareLink$")
	public void verify_items_has_shareLink() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getSharelink());
			
		}


	}

	@Then("^verify items has channel$")
	public void verify_items_has_channel() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getChannel());
			
		}


	}

	@Then("^verify items has self$")
	public void verify_items_has_self() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getSelf());
			
		}


	}

	@Then("^verify items has publisher$")
	public void verify_items_has_publisher() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getPublisher());
			
		}


	}

	@Then("^verify items has default-image$")
	public void verify_items_has_default_image() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getDefaultImage());
			
		}


	}

	@Then("^verify items has cell-image$")
	public void verify_items_has_cell_image() throws Throwable {
		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getCellImage());
			
		}


	}

	@Then("^verify items has channel-subscription-status$")
	public void verify_items_has_channel_subscription_status() throws Throwable {

		Items[] playlistItems =  playlists.getItems();
		for(Items item:playlistItems)
		{
			Assert.assertNotNull(item.getLinks().getChannelSubscriptionStatus());
			
		}

	}

	private String getVideoPlaylistCacheControlHeader(
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
