package com.comcast.watchable.videos;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;
import com.comcast.model.curatedlists.*;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VideosWithPagination extends AbstractSetup{

	
	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=3600";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(VideoByIdAPI.class.getName());

	
	HttpGetAPI get = null;
	CloseableHttpResponse videosWithPaginationResponse = null;
	ChannelVideos channelVideos = null;
	
	Links links = null;
	Items items = null;




	public ChannelVideos getChannelVideos() {
		return channelVideos;
	}


	public void setChannelVideos(ChannelVideos channelVideos) {
		this.channelVideos = channelVideos;
	}


	private CloseableHttpResponse getVideosWithPaginationResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		videosWithPaginationResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return videosWithPaginationResponse;
		
		
	}
	
	
	@Given("^method: GET VideosWithPagination api$")
	public void method_GET_VideosWithPagination_api() throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_WITH_PAGINATION,getFabricPropterties());
		videosWithPaginationResponse =  getVideosWithPaginationResponse(url);
		
	
	   
	}

	@Then("^Validate for totalItems attribute$")
	public void validate_for_totalItems_attribute() throws Throwable {
		
ObjectMapper mapper = new ObjectMapper();
channelVideos = mapper.readValue(videosWithPaginationResponse.getEntity()
				.getContent(), 	ChannelVideos.class);
		
		System.out.println("total Number of Videos : "+	channelVideos.getTotalItems());
	    
	}
	




@Then("^validate Items and its attributes$")
public void validate_Items_and_its_attributes() throws Throwable {
		
		
		Items[] videoItems = channelVideos.getItems();
		for (Items item : videoItems) {
			//Assert.assertNotNull(item.getType());
			
			Assert.assertNotNull(item.getType());
			Assert.assertNotNull(item.getId());
			
	    
	}

	
	
	
	
	
}
}