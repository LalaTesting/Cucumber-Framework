package com.comcast.watchable.videos;

import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.curatedfeatured.CuratedFeatured;
import com.comcast.model.videos.playbackuri.PlayBackUri;
import com.comcast.model.videos.playbackuri.PlaybackItems;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class VideoPlayBackUriAPI extends AbstractSetup {


	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=3600";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(VideoByIdAPI.class.getName());
	

	
	String sessionToken;
	HttpGetAPI get = null;
	CloseableHttpResponse videoPlayBackUriResponse = null;
	
	PlayBackUri playbackuri =null;
	PlaybackItems playbackitems =null;
	CuratedFeatured curatedFeatured = null;


	private CloseableHttpResponse getVideoPlayBackUriResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		videoPlayBackUriResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return videoPlayBackUriResponse;
		
		
	}
	
	
	
	

@Given("^HTTP request headers$")
public void http_request_headers(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
this.setUp();
String url = getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties()) + "/" +AbstractSetup.getVideoList().get(0)+ "/"
		+ FabricUtlKeys.VIDEOS_ID_PLAYBACKURI_API+"?"+ FabricUtlKeys.VIDEOFORMAT_MP4;
HttpGet get =new HttpGet(url);
get.setHeader("Accept","application/json");
List<Map<String,String>> data=arg1.asMaps(String.class,String.class);
//System.out.println("Fruit Name is --"+data.get(0).get("FruitName")+" and the color is-- "+data.get(0).get("FruitColor"));

}



@When("^HTTP GET method is executed$")
public void http_GET_method_is_executed() throws Throwable {
	String url = getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties()) + "/" +AbstractSetup.getVideoList().get(0)+ "/"
			+ FabricUtlKeys.VIDEOS_ID_PLAYBACKURI_API+"?"+ FabricUtlKeys.VIDEOFORMAT_MP4;
	System.out.println("HTTP Method : "+url);

}

@Then("^status code should be (\\d+) OK$")
public void status_code_should_be_OK(int arg1) throws Throwable {
  
	String url = getDataPropertyReader().geturl(FabricUtlKeys.VIDEOS_ID_API, getFabricPropterties()) + "/" +AbstractSetup.getVideoList().get(0)+ "/"
			+ FabricUtlKeys.VIDEOS_ID_PLAYBACKURI_API+"?"+ FabricUtlKeys.VIDEOFORMAT_MP4;
	videoPlayBackUriResponse =  getVideoPlayBackUriResponse(url);
}

@Then("^type attribute is video$")
public void type_attribute_is_video(DataTable arg1) throws Throwable {
	
	ObjectMapper mapper = new ObjectMapper();
	playbackuri = mapper.readValue(videoPlayBackUriResponse.getEntity()
			.getContent(), PlayBackUri.class);
	arg1.getGherkinRows();
	videoPlayBackUriResponse.close();
	Assert.assertNotNull(playbackuri.getType());
    
}

@Then("^attribute logData should not be null$")
public void attribute_logData_should_not_be_null() throws Throwable {
	
	Assert.assertNotNull(playbackuri.getLogData());
    
}

@Then("^links attribute should be there$")
public void links_attribute_should_be_there() throws Throwable {
	Assert.assertNotNull(playbackuri.getLinks());
}

@Then("^playbackItems is present$")
public void playbackitems_is_present() throws Throwable {
	Assert.assertNotNull(playbackuri.getPlaybackItems());
}

@Then("^playbackItems had uri attribute$")
public void playbackitems_had_uri_attribute() throws Throwable {

	PlaybackItems[] playbackItems = playbackuri.getPlaybackItems();
	for (PlaybackItems item : playbackItems)
	{
		Assert.assertNotNull(item.getUri());
		
		
		
	}
}

@Then("^playbackItems has mediaFormat as mp(\\d+)$")
public void playbackitems_has_mediaFormat_as_mp(int arg1, DataTable arg2) throws Throwable {
	
	PlaybackItems[] playbackItems = playbackuri.getPlaybackItems();
	arg2.getTableConverter();
	for (PlaybackItems item : playbackItems)
	{
		Assert.assertNotNull(item.getMediaFormat());
		
	}

}

@Then("^playbackItems has bitrate$")
public void playbackitems_has_bitrate(DataTable arg1) throws Throwable {
	PlaybackItems[] playbackItems = playbackuri.getPlaybackItems();
	arg1.getGherkinRows();
	for (PlaybackItems item : playbackItems)
	{
		Assert.assertNotNull(item.getBitRate());
	}
    
}


@Then("^playbackItems has logUri$")
public void playbackitems_has_logUri() throws Throwable {

	PlaybackItems[] playbackItems = playbackuri.getPlaybackItems();
	for (PlaybackItems item : playbackItems)
	{
		Assert.assertNotNull(item.getLogUri());
	}
}
	
	
		}
