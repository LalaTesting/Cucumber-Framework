package com.comcast.watchable.seasons;

import org.apache.http.client.methods.CloseableHttpResponse;

import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VideosUnderSeasons extends AbstractSetup
{
	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";

	HttpGetAPI get = null;
	CloseableHttpResponse SessonsChannelsResponse = null;
	CuratedList curatedlist = null;
	CuratedItems curatedItem = null;

	@Given("^method: GET http://fabricdemo.xidio.com/fmds/api/watchable/web/seasons/13253/videos$")
	public void cachecontrol_header_is_having_seconds(int arg1) throws Throwable {
		String url = getDataPropertyReader().geturl(FabricUtlKeys.Seasons_ID,
				getFabricPropterties());
	   
	}

	@When("^response is 200 OK$")
	public void validate_CuratedListType_is_PopularChannels() throws Throwable {
	    
	}

	
	}

