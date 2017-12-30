package com.comcast.watchable.publishers;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;

import com.comcast.model.publishers.genre.channels.ChannelGenreForPublisher;
import com.comcast.model.publishers.genre.channels.Items;
import com.comcast.model.publishers.genre.channels.Links;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChannelsByGenreForPublisher extends AbstractSetup {
	
	HttpGetAPI get = null;
	CloseableHttpResponse channelsByGenreForPublisherResponse = null;
	

ChannelGenreForPublisher channelGenrePublisher = null;
ChannelVideos channelVideos=null;
	Links links = null;
	Items items = null;
	
	private CloseableHttpResponse getChannelsByGenreForPublisherResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();

		channelsByGenreForPublisherResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return channelsByGenreForPublisherResponse;
		
	}
	
	
	@Given("^method: GET /fmds/api/watchable/web/publishers/<publisherId>/channels$")
	public void method_GET_fmds_api_watchable_web_publishers_publisherId_channels() throws Throwable {
		
		
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CHANNELS_GENRE_FOR_PUBLISHER, getFabricPropterties());
		channelsByGenreForPublisherResponse = getChannelsByGenreForPublisherResponse(url); 
	}

	@When("^response is (\\d+) OK$")
	public void response_is_OK(int arg1) throws Throwable {
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CHANNELS_GENRE_FOR_PUBLISHER, getFabricPropterties());
		
		Assert.assertEquals(channelsByGenreForPublisherResponse.getStatusLine().getStatusCode(),				arg1);
	}

	@Then("^validate totalItems shouldn't be zero$")
	public void validate_totalItems_shouldn_t_be_zero() throws Throwable {
		
		ObjectMapper mapper = new ObjectMapper();
		channelGenrePublisher = mapper.readValue(channelsByGenreForPublisherResponse.getEntity()
				.getContent(), ChannelGenreForPublisher.class);
		Assert.assertNotNull(channelGenrePublisher.getTotalItems());
		Integer totalItems = new Integer(channelGenrePublisher.getTotalItems());

		boolean totalItem = totalItems > 0;
		Assert.assertTrue(totalItem);

		channelsByGenreForPublisherResponse.close();
		
		
	   
	}

	@Then("^verify publishers_genre_channels_all attribute under links$")
	public void verify_publishers_genre_channels_all_attribute_under_links() throws Throwable {
	    
		Assert.assertNotNull(channelGenrePublisher.getLinks().getPublishers_genre_channels_all()); 
	}


	@Then("^validate items$")
	public void validate_items() throws Throwable {
	   
		Assert.assertNotNull(channelGenrePublisher.getTotalItems());
		}
		
	

	@Then("^verify that type should be channel$")
	public void verify_that_type_should_be_channel() throws Throwable {
		
		Items[] chnlVideoItems = channelGenrePublisher.getItems();
		for (Items item : chnlVideoItems) {
			System.out.println("RESSSSSS"+item);
			
			System.out.println("AAAAAAAAAAAAAAAAAAAAAA"+item.getLinks().getLogoImage());
		Assert.assertNotNull(item.getType());
		Assert.assertNotNull(item.getId());
		Assert.assertNotNull(item.getTitle());
		Assert.assertNotNull(item.getDescription());

		Assert.assertNotNull(item.getParentalGuidance());
		Assert.assertNotNull(item.getNumOfVideos());
		Assert.assertNotNull(item.getLastUpdateTimestamp());
		
	
	
	}
	  
	}

	@Then("^validate that id shouldn't be null$")
	public void validate_that_id_shouldn_t_be_null() throws Throwable {
	  
	}

	@Then("^validate for description$")
	public void validate_for_description() throws Throwable {

	}

	@Then("^verify num of shows should not be null$")
	public void verify_num_of_shows_should_not_be_null() throws Throwable {
	   
	}

	@Then("^verify that video count should not be null$")
	public void verify_that_video_count_should_not_be_null() throws Throwable {
	
	}

	@Then("^verify for last Update Time stamp$")
	public void verify_for_last_Update_Time_stamp() throws Throwable {
	    
	}

	@Then("^verify for parentalGuidance$")
	public void verify_for_parentalGuidance() throws Throwable {
	
	}

	@Then("^validate items\\.links presence$")
	public void validate_items_links_presence() throws Throwable {
	
	}

	@Then("^validate items\\.links\\.logoImage$")
	public void validate_items_links_logoImage() throws Throwable {
		Items[] chnlVideoItems = channelGenrePublisher.getItems();
		for (Items item : chnlVideoItems) {
		Assert.assertNotNull(item.getLinks().getLogoImage());
		Assert.assertNotNull(item.getLinks().getTemplateImage());
		Assert.assertNotNull(item.getLinks().getLogoImage());
		System.out.println("AAAAAAAAAAAAAAAAAAAAAA"+item.getLinks().getSelf());

	}
	}

	@Then("^validate items\\.links\\.templateImage$")
	public void validate_items_links_templateImage() throws Throwable {
	    
	}
	


	@Then("^video count should not be null and greater than zero$")
	public void video_count_should_not_be_null_and_greater_than_zero() throws Throwable {
	   
	}

	@Then("^verify for parentalGuidance is present$")
	public void verify_for_parentalGuidance_is_present() throws Throwable {
	   
	}

	@Then("^validate items\\.links\\.paginateShowsAll$")
	public void validate_items_links_paginateShowsAll() throws Throwable {
	    
	}

	@Then("^validate items\\.links\\.sharelink$")
	public void validate_items_links_sharelink() throws Throwable {
	 
	}

	@Then("^validate items\\.links\\.channels-videos$")
	public void validate_items_links_channels_videos() throws Throwable {
	 
	}

	@Then("^validate items\\.links\\.subscription-status$")
	public void validate_items_links_subscription_status() throws Throwable {
	   
	}

	@Then("^validate items\\.links\\.paginateShowsTemplate$")
	public void validate_items_links_paginateShowsTemplate() throws Throwable {
	  
	}

	@Then("^validate items\\.links\\.channels-allvideos$")
	public void validate_items_links_channels_allvideos() throws Throwable {
	 
	}

	@Then("^validate items\\.links\\.genre$")
	public void validate_items_links_genre() throws Throwable {
	  
	}

	@Then("^validate items\\.links\\.self$")
	public void validate_items_links_self() throws Throwable {
	
	}

	@Then("^validate items\\.links\\.publisher$")
	public void validate_items_links_publisher() throws Throwable {
	  
	}

	@Then("^validate items\\.links\\.defaultImage$")
	public void validate_items_links_defaultImage() throws Throwable {
	   
	}

	@Then("^validate items\\.links\\.paginateShowsAndVideos$")
	public void validate_items_links_paginateShowsAndVideos() throws Throwable {
	  
	}

	@Then("^validate items\\.links\\.cell-image$")
	public void validate_items_links_cell_image() throws Throwable {
	   
	}

	@Then("^validate items\\.links\\.paginateShowsAndVideosTemplate$")
	public void validate_items_links_paginateShowsAndVideosTemplate() throws Throwable {
	  
	}

	
}
