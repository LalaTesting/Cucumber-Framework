package com.comcast.watchable.users.channels;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;
import com.comcast.model.curatedlists.Items;
import com.comcast.model.curatedlists.Links;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpDeleteAPI;
import com.comcast.watchable.HttpGetAPI;
import com.comcast.watchable.HttpPostAPI;
import com.comcast.watchable.videos.VideoByIdAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ChannelsUnFollow extends AbstractSetup {
	
	CloseableHttpResponse channelFollow =null;
	CloseableHttpResponse channelsFollowed =null;
	CloseableHttpResponse channelUnFollow =null;
	ChannelVideos channelVideos = null;
	Links links = null;
	Items items = null;
	
	static Logger log = Logger.getLogger(ChannelsUnFollow.class.getName());

	private CloseableHttpResponse postChannelFollowresponse(String url) {

		HttpPostAPI post = new HttpPostAPI();
		 channelFollow = post.postChannelFollow(url,
				getSessionToken(), getBearerToken());
		return channelFollow;
	}

	private CloseableHttpResponse getChannelFollowresponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		 channelsFollowed = get.getUserHttpResponse(url,
				getSessionToken(), getBearerToken());
		return channelsFollowed;
	}
	private CloseableHttpResponse deleteChannelFollowresponse(String url)
			throws Exception {
		HttpDeleteAPI delete = new HttpDeleteAPI();
		channelUnFollow = delete.deleteUserHttpResponse(
				url, getSessionToken(), getBearerToken());
		return channelUnFollow;
	}
	
	
	
	// Scenario: Post UsersChannelsFollow API
	
	@Given("^method: POST channels/channelId/follow Follow Channel API$")
	public void method_POST_channels_channelId_follow_Follow_Channel_API() throws Throwable {
this.setUp();
		//POST Channel/channelId/Follow API	
		
	}
	
	
	@Then("^Verify response as (\\d+) No Content$")
	public void verify_response_as_No_Content(int arg1) throws Throwable {
		
			String url = getDataPropertyReader().geturl(
					FabricUtlKeys.USERS_CHANNEL_FOLLOW, getFabricPropterties())
					+ "/" + AbstractSetup.getChannelList().get(0) + "/" + "follow";

			CloseableHttpResponse response = postChannelFollowresponse(url);
			StatusLine statusLine = response.getStatusLine();
			Assert.assertEquals(statusLine.getStatusCode(), arg1);

			response.close();
		}
	

@Then("^channel is followed$")
public void channel_is_followed() throws Throwable {
	
/*	
	System.out.println("Channel Followed : "+ url);
	Assert.assertSame(url, "Channel Followed");*/
    
}


	
//Scenario: Check if User Followed a Channel

	@Given("^method: GET channels/channelId/follow - FollowAPI$")
	public void method_GET_channels_channelId_follow_FollowAPI() throws Throwable {
		//GET users/Channels/ChannelID/Follow
		
		

	    
	}

	@Then("^status should be (\\d+) No Content$")
	public void status_should_be_No_Content(int arg1) throws Throwable {
		

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_CHANNEL_FOLLOW, getFabricPropterties())
				+ "/" + AbstractSetup.getChannelList().get(0) + "/" + "follow";

		CloseableHttpResponse response = getChannelFollowresponse(url);
		StatusLine statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), arg1);

		
	   
	}

	
	
	
	
	//GET users/channels/follow - Scenario: User's all followed channels API
	
	
	@Given("^method: GET users/channels/follow - FollowAPI$")
	public void method_GET_users_channels_follow_FollowAPI() throws Throwable {
		//GET users/channels/follow
	
	}
	
	@Then("^verify followed Channels for the user$")
	public void verify_followed_Channels_for_the_user() throws Throwable {
				

		}
	
	
	@Then("^response code is (\\d+) OK$")
	public void response_code_is_OK(int arg1) throws Throwable {
		String channelFollowed = getDataPropertyReader().geturl(
					FabricUtlKeys.USERS_CHANNEL_FOLLOW, getFabricPropterties())
					+ "/" + "follow";

			CloseableHttpResponse response = getChannelFollowresponse(channelFollowed);
			StatusLine statusLine = response.getStatusLine();
			Assert.assertEquals(statusLine.getStatusCode(), 200);
		}

	
	
	
	@Then("^followed channel is available here$")
	public void followed_channel_is_available_here() throws Throwable {
		
		
		
	}

	
	
	
	

@Then("^totalItems is greater than zero$")
public void totalitems_is_greater_than_zero() throws Throwable {
	
	ObjectMapper mapper = new ObjectMapper();
	channelVideos = mapper.readValue(channelsFollowed.getEntity()
			.getContent(), ChannelVideos.class);
	Assert.assertNotNull(channelVideos.getTotalItems());
	Integer totalItems = new Integer(channelVideos.getTotalItems());

	boolean totalItem = totalItems > 0;

	Assert.assertTrue(totalItem);
	channelsFollowed.close();

	}

@Then("^links has its self url$")
public void links_has_its_self_url() throws Throwable {
	
	Assert.assertNotNull(channelVideos.getLinks().getSelf());
   
}

@Then("^items array has channel$")
public void items_array_has_channel() throws Throwable {
	Items[] followedChannelItems = channelVideos.getItems();
	for (Items item : followedChannelItems) {
		String type="Channel";
		
		Assert.assertNotNull(item.getType());
		Assert.assertEquals(item.getType(), type);
		
		Assert.assertNotNull(item.getId());
		Assert.assertEquals( AbstractSetup.getChannelList().get(0),new Integer(item.getId()), "Followed channel is available");
		
		Assert.assertNotNull(item.getTitle());
		
		
			
	
	
	}
}
    
@Then("^items array has id$")
public void items_array_has_id() throws Throwable {
	
    
}

@Then("^items has title$")
public void items_has_title() throws Throwable {
    
}

@Then("^verify numOfVideos is greater than zero$")
public void verify_numOfVideos_is_greater_than_zero() throws Throwable {
	
	Items[] followedChannelItems = channelVideos.getItems();
	for (Items item : followedChannelItems) {
		
		Integer numOfVideos= new Integer(item.getNumOfVideos());

		boolean videos = numOfVideos > 0;

		Assert.assertTrue(videos);
		
		
	}

}

	// Scenario: User Unfollow's Channel API
	
	@Given("^method: DELETE channels/channlID/follow UnFollowAPI$")
	public void method_DELETE_channels_channlID_follow_UnFollowAPI() throws Throwable {
		//DELETE channels/channelId/follow
	    
	}
	


@Then("^UnFollowAPI and status code as (\\d+)$")
public void unfollowapi_and_status_code_as(int arg1) throws Throwable {
	String url = getDataPropertyReader().geturl(
			FabricUtlKeys.USERS_CHANNEL_FOLLOW, getFabricPropterties())
			+ "/" + FabricUtlKeys.CHANNEL_ID + "/" + "follow";

	CloseableHttpResponse response = deleteChannelFollowresponse(url);
	StatusLine statusLine = response.getStatusLine();
	Assert.assertEquals(statusLine.getStatusCode(), arg1);

	response.close();
	
	
}

}
