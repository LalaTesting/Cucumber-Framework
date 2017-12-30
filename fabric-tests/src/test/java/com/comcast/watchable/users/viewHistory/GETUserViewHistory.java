package com.comcast.watchable.users.viewHistory;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;

import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;
import com.comcast.watchable.HttpPutAPI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GETUserViewHistory extends AbstractSetup {


	@Given("^method: GET UsersViewHistory api$")
	public void method_GET_UsersViewHistory_api() throws Throwable {
		this.setUp();

	}

	@When("^Put Viewhistory api gets executed$")
	public void put_Viewhistory_api_gets_executed() throws Throwable {
		String url1 = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_VIDEOS, getFabricPropterties())
				+ "/"
				+ AbstractSetup.getVideoList().get(0)
				+ "/"
				+ FabricUtlKeys.VIDEO_PROGRESS;
		String url2 = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_VIDEOS, getFabricPropterties())
				+ "/"
				+ AbstractSetup.getVideoList().get(1)
				+ "/"
				+ FabricUtlKeys.VIDEO_PROGRESS;
		HttpPutAPI put = new HttpPutAPI();
		CloseableHttpResponse putVideoProgress = put.UserPutResponse(url1,
				getSessionToken(), getBearerToken());
		CloseableHttpResponse putVideoProgress1 = put.UserPutResponse(url2,
				getSessionToken(), getBearerToken());
		putVideoProgress.close();
		putVideoProgress1.close();
	}

	@Then("^GET viewhistory status code should be (\\d+) OK$")
	public void get_viewhistory_status_code_should_be_OK(int arg1)
			throws Throwable {

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_VIEWHISTORY, getFabricPropterties())
				+ "/" + FabricUtlKeys.VIDEOS_ID_API;

		HttpGetAPI get = new HttpGetAPI();
		CloseableHttpResponse viewHistoryGetResponse = get.getUserHttpResponse(
				url, getSessionToken(), getBearerToken());
		StatusLine statusLine = viewHistoryGetResponse.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), 200);

		viewHistoryGetResponse.close();

	}
}