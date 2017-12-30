package com.comcast.watchable.channels;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;
import com.comcast.model.curatedlists.Items;
import com.comcast.model.curatedlists.Links;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;
import com.comcast.watchable.videos.VideoByIdAPI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ChannelsWithPagination extends AbstractSetup{
	

	static Logger log = Logger.getLogger(ChannelsWithPagination.class.getName());

	
	HttpGetAPI get = null;
	CloseableHttpResponse channelsWithPaginationResponse = null;
	ChannelVideos channelVideos = null;
	
	Links links = null;
	Items items = null;


	
	
	public ChannelVideos getChannelVideos() {
		return channelVideos;
	}



	public void setChannelVideos(ChannelVideos channelVideos) {
		this.channelVideos = channelVideos;
	}



	private CloseableHttpResponse getChannelsWithPaginationResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		channelsWithPaginationResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return channelsWithPaginationResponse;
		
		
	}
	
	
	
	@Given("^method: GET ChannelsWithPagination api$")
	public void method_GET_ChannelsWithPagination_api() throws Throwable {
		
		
		this.setUp();
		String url = getDataPropertyReader().geturl(FabricUtlKeys.CHANNELS_WITH_PAGINATION,getFabricPropterties());
		channelsWithPaginationResponse =  getChannelsWithPaginationResponse(url);
		
		
	
	}

	
	@Then("^verify totalItems attribute$")
	public void verify_totalItems_attribute() throws Throwable {
		

		ObjectMapper mapper = new ObjectMapper();
		channelVideos = mapper.readValue(channelsWithPaginationResponse.getEntity()
						.getContent(), 	ChannelVideos.class);
					
				System.out.println("total Number of Channels : "+	channelVideos.getTotalItems());
	
	 
	}



@Then("^verify items attribute$")
public void verify_items_attribute() throws Throwable {
	
	
	Items[] channelItems = channelVideos.getItems();
	for (Items item : channelItems) {
		//Assert.assertNotNull(item.getType());
		System.out.println("First Channel in List "+item.getTitle());
		
		Assert.assertNotNull(channelVideos.getItems());
	
 
}

}
}
