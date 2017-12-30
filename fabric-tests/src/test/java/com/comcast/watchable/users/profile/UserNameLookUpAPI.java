package com.comcast.watchable.users.profile;

import java.util.logging.Logger;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;

import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserNameLookUpAPI extends AbstractSetup {

	static Logger log = Logger.getLogger(UserNameLookUpAPI.class.getName());

	CloseableHttpResponse userNameLookUpResponse = null;

	// UserProfile userProfile=null;

	private CloseableHttpResponse getUserNameLookUpResponse(String url)
			throws Exception {

		HttpGetAPI get = new HttpGetAPI();
		userNameLookUpResponse = get.getUserHttpResponse(url,
				getSessionToken(), getBearerToken());
		return userNameLookUpResponse;

	}

	@Given("^method: GET users/profile/usernames/<username>$")
	public void method_GET_users_profile_usernames_username() throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERNAME_LOOKUP, getFabricPropterties())
				+ AbstractSetup.getUser().getUserName();

	}
	
	
	
	@When("^Http method gets exected$")
	public void http_method_gets_exected() throws Throwable {
		System.out
				.println("fmds/api/watchable/<platform>/users/profiles/usernames/<username> is executed");

	}

	@Then("^status code should be (\\d+) No Content$")
	public void status_code_should_be_No_Content(int arg1) throws Throwable {

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERNAME_LOOKUP, getFabricPropterties())
				+ AbstractSetup.getUser().getUserName();
		userNameLookUpResponse = getUserNameLookUpResponse(url);
		StatusLine statusLine = userNameLookUpResponse.getStatusLine();
		//Assert.assertEquals(statusLine.getStatusCode(), arg1);
		//arg1.getTableConverter();
	}

}
