package com.comcast.watchable.users.profile;

import java.util.logging.Logger;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.users.profile.UserProfile;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GetUserProfile extends AbstractSetup {
	
	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(GetUserProfile.class.getName());
	
	CloseableHttpResponse userProfileResponse=null;
	UserProfile userProfile=null;
	
	private CloseableHttpResponse getUserProfileResponse(String url)
			throws Exception {

		HttpGetAPI get = new HttpGetAPI();
		userProfileResponse = get.getUserHttpResponse(url,
				getSessionToken(), getBearerToken());
		return userProfileResponse;

	}

	
	@Given("^method: GET users/profile$")
	public void method_GET_users_profile() throws Throwable {
		this.setUp();
		
		//
	    
	}

	@Then("^status should be (\\d+) OK$")
	public void status_should_be_OK(int arg1) throws Throwable {
		
		String url = getDataPropertyReader().geturl(FabricUtlKeys.USER_PROFILE, getFabricPropterties()) ;
		userProfileResponse =  getUserProfileResponse(url);
	//	CloseableHttpResponse response = getUserProfileResponse(url);
		StatusLine statusLine = userProfileResponse.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), arg1);
	  
	}

	@Then("^userId attribute shoul dnot be null$")
	public void userid_attribute_shoul_dnot_be_null() throws Throwable {
		ObjectMapper mapper =new ObjectMapper();
		userProfile=mapper.readValue(userProfileResponse.getEntity().getContent(),
				UserProfile.class);
	   
	}

	@Then("^validate userName$")
	public void validate_userName() throws Throwable {
		Assert.assertNotNull(userProfile.getMobileStatus());
	   
	}

	@Then("^validate email$")
	public void validate_email() throws Throwable {
		
		Assert.assertNotNull(userProfile.getEmail());
	   
	}

	@Then("^validate emailStatus$")
	public void validate_emailStatus() throws Throwable {
		Assert.assertNotNull(userProfile.getEmailStatus());
	   
	}

	@Then("^validate mobileStatus$")
	public void validate_mobileStatus() throws Throwable {
		Assert.assertNotNull(userProfile.getMobileStatus());
	  
	}

	@Then("^validate registrationDate$")
	public void validate_registrationDate() throws Throwable {
		Assert.assertNotNull(userProfile.getRegistrationDate());
	   
	}

}
