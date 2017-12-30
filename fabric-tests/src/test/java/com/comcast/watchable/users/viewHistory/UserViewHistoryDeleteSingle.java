package com.comcast.watchable.users.viewHistory;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;

import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpDeleteAPI;
import com.comcast.watchable.HttpGetAPI;
import com.comcast.watchable.HttpPutAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserViewHistoryDeleteSingle extends AbstractSetup{

	
	private CloseableHttpResponse videoProgressResponse(String url) throws Exception
	{
			
		HttpPutAPI put = new HttpPutAPI();
		CloseableHttpResponse putVideoProgress= put.UserPutResponse(url, getSessionToken(), getBearerToken());
		return putVideoProgress;
	
	}
	
	//Scenario One : PUT progress api
	
	@Given("^method: videoProgress API$")
	public  void  method_videoProgress_API() throws Throwable {
		this.setUp();
	  
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_VIDEOS, getFabricPropterties())	+ "/" + AbstractSetup.getVideoList().get(0)+"/" + FabricUtlKeys.VIDEO_PROGRESS;

		CloseableHttpResponse response = videoProgressResponse(url);
		StatusLine statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), 204);
		
		response.close();
		
	}
	
	
	
	private CloseableHttpResponse deleteViewHistorySingleVideoResponse(String url) throws Exception
	{
		HttpDeleteAPI delete = new HttpDeleteAPI();
		CloseableHttpResponse deleteViewHistorySingle = delete
				.deleteUserHttpResponse(url, getSessionToken(),
						getBearerToken());
		return deleteViewHistorySingle;
}
	
	
	//Scenario Two: Delete viewhistory of single video.
	
	@Given("^method: DELETE single video from User's view history api$")
	public void method_DELETE_single_video_from_User_s_view_history_api() throws Throwable {
		
		
	    
	}

	@Then("^verify the status code as (\\d+)$")
	public void verify_the_status_code_as(int arg1) throws Throwable {
		
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_VIEWHISTORY, getFabricPropterties()) + "/"+ FabricUtlKeys.VIDEOS_ID_API
				+ "/" + AbstractSetup.getVideoList().get(0);

		CloseableHttpResponse response = deleteViewHistorySingleVideoResponse(url);
		StatusLine statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), 204);

		response.close();
	   
	}
	
	
	
	public void videoProgress() throws Throwable
	{
		UserViewHistoryDeleteSingle viewHistory = new UserViewHistoryDeleteSingle();
		
		viewHistory.method_videoProgress_API();
		System.out.println("VideoProgress Event API is executed again");
		}

	
	
	private CloseableHttpResponse getViewHistoryVideoResponse(String url) throws Exception
	{
		HttpGetAPI get = new HttpGetAPI();
		CloseableHttpResponse getViewHistory = get.getUserHttpResponse(url, getSessionToken(),
						getBearerToken());
		return getViewHistory;
}
	
	
	//Scenario Three: Get ViewHisotry after deleteion of viewhistroy
	
@Given("^method: GET user's viewHistory api$")
public void method_GET_user_s_viewHistory_api() throws Throwable {
	
	String url = getDataPropertyReader().geturl(
			FabricUtlKeys.USERS_VIEWHISTORY, getFabricPropterties())
			+ "/" + FabricUtlKeys.VIDEOS_ID_API;

	CloseableHttpResponse response = getViewHistoryVideoResponse(url);
	StatusLine statusLine = response.getStatusLine();
	Assert.assertEquals(statusLine.getStatusCode(), 404);

	
	
	response.close();
	
   
}

//Scenario Four: Video Progress event to keep one video in viewhistory always

public void videoProgressKeepAlive() throws Exception{
String url = getDataPropertyReader().geturl(
		FabricUtlKeys.USERS_VIDEOS, getFabricPropterties())	+ "/" + AbstractSetup.getVideoList().get(1)+"/" + AbstractSetup.getVideoList().get(1);
CloseableHttpResponse response = videoProgressResponse(url);
}
	}
	



