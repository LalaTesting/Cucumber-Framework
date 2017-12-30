package com.comcast.watchable.users.profile;

import java.util.logging.Logger;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;

import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailLookUpAPI extends AbstractSetup {

	static Logger log = Logger.getLogger(EmailLookUpAPI.class.getName());

	CloseableHttpResponse emailLookUpUpResponse = null;

	private CloseableHttpResponse getEmailLookUpResponse(String url)
			throws Exception {

		HttpGetAPI get = new HttpGetAPI();
		emailLookUpUpResponse = get.getUserHttpResponse(url, getSessionToken(),
				getBearerToken());
		return emailLookUpUpResponse;

	}

	@Given("^method: GET users/profiles/email/<email>$")
	public void method_GET_users_profile_email_email() throws Throwable {
    this.setUp();
	
	
	}

	@When("^Http Get Method is executed$")
	public void http_Get_Method_is_executed() throws Throwable {
		System.out
				.println("fmds/api/watchable/<platform>/users/profiles/email/<emailId> is executed");

	}

	@Then("^(\\d+) No Content status should come$")
	public void no_Content_status_should_come(int arg1) throws Throwable {

		String url = getDataPropertyReader().geturl(FabricUtlKeys.EMAIL_LOOKUP,
				getFabricPropterties())
				+ AbstractSetup.getUser().getEmail();
		System.out.println("XXXXXXX" + url);
		emailLookUpUpResponse = getEmailLookUpResponse(url);

		StatusLine statusLine = emailLookUpUpResponse.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), arg1);

	}
}
