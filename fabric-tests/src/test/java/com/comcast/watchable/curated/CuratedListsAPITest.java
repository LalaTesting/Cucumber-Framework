package com.comcast.watchable.curated;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.curatedlists.CuratedList;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CuratedListsAPITest extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(CuratedListsAPITest.class.getName());

	HttpGetAPI get = null;
	CloseableHttpResponse curatedListResponse = null;
	CloseableHttpResponse curatedListsIdResponse = null;

	CuratedList curatedLists = null;

	private CloseableHttpResponse getCuratedListsResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		curatedListResponse = get.getNonUsersHttpresponse(url,
				getSessionToken());
		return curatedListResponse;
	}

	@Given("^method: GET CuratedListsAPI and validate status as (\\d+) OK$")
	public void getCuratedListsStatus(int arg1) throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CURATED_LISTS_API, getFabricPropterties());
		CloseableHttpResponse response = getCuratedListsResponse(url);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);

	}

	@Then("^validate curatedlists has items$")
	public void validate_curatedlists_has_items() throws Throwable
	{

		HttpEntity entity = curatedListResponse.getEntity();
		ObjectMapper mapper = new ObjectMapper();
		curatedLists = mapper.readValue(entity.getContent(), CuratedList.class);
		Integer totalItems = new Integer(curatedLists.getTotalItems());

	//	System.out.println("MMMMMMMm" + curatedLists);

		boolean totalItem = totalItems > 0;

		Assert.assertTrue(totalItem);

	}

	@Then("^validate curatedItems has ID$")
	public void validate_curatedItems_has_ID() throws Throwable {

		CuratedItems[] curatedItems = curatedLists.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) 
		{
			Assert.assertNotNull(curatedItem.getId());

		}

	}

	@Then("^genre of curatedlists and curatedlists/ID is same$")
	public void getGenreForCuratedItemsAndId() throws Throwable {

		CuratedItems[] curatedItems = curatedLists.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {
			String curatedListsId = curatedItem.getId();
			CuratedList curatedListsIdresponse = getCuratedListsIdResponse(curatedListsId);

			Assert.assertEquals(curatedItem.getGenre(),
					curatedListsIdresponse.getGenre());

		}

	}

	private CuratedList getCuratedListsIdResponse(String curatedListsId)
			throws JsonParseException, JsonMappingException,
			UnsupportedOperationException, IOException {
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CURATED_LISTS_API, getFabricPropterties());
		url = url + "/" + curatedListsId;
		curatedListsIdResponse = getCuratedListsResponse(url);
		ObjectMapper mapper = new ObjectMapper();
		CuratedList curatedLists = mapper.readValue(curatedListsIdResponse
				.getEntity().getContent(), CuratedList.class);
		curatedListsIdResponse.close();

		return curatedLists;

	}

	@Then("^validate totalVideos attribute is not ZERO and it contains some videos$")
	public void validateTotalVideosIsNotZero() throws Throwable {

		CuratedItems[] curatedItems = curatedLists.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			String videoId = curatedItem.getId();

			String videos = curatedItem.getTotalVideos();

			int totalVideos = Integer.parseInt(videos);

			if (totalVideos <= 0) {
				log.info("Video " + videoId + " has 0 duration");
				Assert.assertTrue(false, "Video has zero duration : " + videoId);

			}

		}

	}

	@Then("^validate totalVideoDuration attribute is not ZERO$")
	public void validate_totalVideoDuration_attribute_is_not_ZERO()
			throws Throwable {
		CuratedItems[] curatedItems = curatedLists.getCuratedItems();
		for (CuratedItems curatedItem : curatedItems) {

			String totalVideoDuration = curatedItem.getTotalVideoDuration();

		}

	}

	@Then("^CacheControl Header is set to (\\d+) seconds$")
	public void cache_Control_header_is_set_to_seconds(int arg1)
			throws Throwable {

		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.CURATED_LISTS_API, getFabricPropterties());

		CloseableHttpResponse curatedListsResponse = getCuratedListsResponse(url);

		String cache_control_header_actual = getCuratedCacheControlHeader(curatedListsResponse);

		Assert.assertEquals(cache_control_header_actual,
				CACHE_CONTROL_HEADER_EXPECTED);

	}

	private String getCuratedCacheControlHeader(CloseableHttpResponse response) {

		Header[] headers = response.getHeaders(CACHE_CONTROL);

		for (Header header : headers) {

			if (header.getName().equals(CACHE_CONTROL)) {
				return header.getValue();
			}

		}

		return null;

	}

}
