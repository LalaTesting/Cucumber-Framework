package com.comcast.watchable.curated;

import org.apache.http.client.methods.CloseableHttpResponse;

import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
//import com.comcast.watchable.CuratedAPIs;

public class CuratedChannelsAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";

	HttpGetAPI get = null;
	CloseableHttpResponse curatedChannelsResponse = null;
	CuratedList curatedlist = null;
	CuratedItems curatedItem = null;

	private CloseableHttpResponse getCuratedChannelsResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		curatedChannelsResponse = get.getNonUsersHttpresponse(url,
				getSessionToken());
		return curatedChannelsResponse;
	}

	
	@Then("^cachecontrol header is having (\\d+) seconds$")
	public void cachecontrol_header_is_having_seconds(int arg1) throws Throwable {
	   
	}

	@Then("^validate CuratedListType is PopularChannels$")
	public void validate_CuratedListType_is_PopularChannels() throws Throwable {
	    
	}

	@Then("^verify genre is present$")
	public void verify_genre_is_present() throws Throwable {
	
	}

	@Then("^totalItems and totalChannels has same value$")
	public void totalitems_and_totalChannels_has_same_value() throws Throwable {
	
	}

	@Then("^Verify the curatedItem's type is curatedChannel$")
	public void verify_the_curatedItem_s_type_is_curatedChannel() throws Throwable {
	    
	}

	@Then("^Verify the curatedItem's title and curatedChannel title is same$")
	public void verify_the_curatedItem_s_title_and_curatedChannel_title_is_same() throws Throwable {
	    
	}

	@Then("^Verify the curatedChannel has some videos$")
	public void verify_the_curatedChannel_has_some_videos() throws Throwable {
	
	}

	
	
	
}
