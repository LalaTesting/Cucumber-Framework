package com.comcast.watchable.genres;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.curatedlists.CuratedItems;
import com.comcast.model.genres.Genres;
import com.comcast.model.genres.Items;
import com.comcast.model.genres.Links;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GenresAPI extends AbstractSetup {

	private static final String CACHE_CONTROL_HEADER_EXPECTED = "public,max-age=120";
	private final static String CACHE_CONTROL = "Cache-Control";
	static Logger log = Logger.getLogger(GenresAPI.class.getName());

	HttpGetAPI get = null;
	CloseableHttpResponse genresResponse = null;
	Genres genres = null;
	Items[] items = null;
	Links links = null;

	private CloseableHttpResponse getGenresResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();

		genresResponse = get.getNonUsersHttpresponse(url, getSessionToken());
		return genresResponse;
	}

	@Given("^method: GET /genres API$")
	public void method_GET_genres_API() throws Throwable {

		this.setUp();
		String url = getDataPropertyReader().geturl(FabricUtlKeys.GENRES,getFabricPropterties());
		genresResponse = getGenresResponse(url);

	}

	@Then("^Status code as (\\d+) OK$")
	public void status_code_as_OK(int arg1) throws Throwable {
		Assert.assertEquals(genresResponse.getStatusLine().getStatusCode(), 200);
		log.error("Status code is not " + arg1);
		

	}

	@Then("^validate totalItems attribute and its value is more than zero$")
	public void validate_totalItems_attribute_and_its_value_is_more_than_zero() throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		genres = mapper.readValue(genresResponse.getEntity().getContent(),Genres.class);
	
	
		Integer totalItems = new Integer(genres.getTotalItems());
		
		System.out.println("total Genres :  "+ totalItems);
		boolean totalItem = totalItems > 0;
		Assert.assertTrue(totalItem);
		log.assertLog(totalItem, "Genres totalItems is ZERO");
		

	}

	@Then("^validate Links attribute$")
	public void validate_Links_attribute() throws Throwable {

		Assert.assertNotNull(genres.getLinks());
	}

	@Then("^validate Links has self attribute$")
	public void validate_Links_has_self_attribute() throws Throwable {
		Assert.assertNotNull(genres.getLinks().getSelf());

	}

	@Then("^validate Items attribute$")
	public void validate_Items_attribute() throws Throwable {
		
		
		Assert.assertNotNull(genres.getItems());

	
		
	}

	@Then("^validate Items\\.totalChannels$")
	public void validate_Items_totalChannels() throws Throwable {
		Items[] items = genres.getItems();
		for (Items item : items) {
			Assert.assertNotNull(item.getTotalChannels());
		}
	}

	@Then("^validate Items\\.totalShows$")
	public void validate_Items_totalShows() throws Throwable {
		
		Items[] items = genres.getItems();
		for (Items item : items) {
			Assert.assertNotNull(item.getTotalShows());
		}

	}

	@Then("^validate Items\\.totalVideos$")
	public void validate_Items_totalVideos() throws Throwable {
		
		Items[] items = genres.getItems();
		for (Items item : items) {
			
	
			Assert.assertNotNull(item.getTotalVideos());
		}

	}

	@Then("^validate Items\\.totalItems$")
	public void validate_Items_totalItems() throws Throwable {
		
		Items[] items = genres.getItems();
		for (Items item : items) {
			
	
		
			Assert.assertNotNull(item.getTotalItems());
		}

	}

	@Then("^validate Items\\.type$")
	public void validate_Items_type() throws Throwable {

		Items[] items = genres.getItems();
		for (Items item : items) {
			Assert.assertNotNull(item.getType());
		}
	}

	@Then("^validate Items\\.title$")
	public void validate_Items_title() throws Throwable {


		Items[] items = genres.getItems();
		for (Items item : items) {
			Assert.assertNotNull(item.getTitle());
		}
	}

	@Then("^validate Items\\.id$")
	public void validate_Items_id() throws Throwable {
		
		
		Items[] items = genres.getItems();
		for (Items item : items) {
			Assert.assertNotNull(item.getId());
		}

	}

	@Then("^validate Items\\.links$")
	public void validate_Items_links() throws Throwable {
		Items[] items = genres.getItems();
		for (Items item : items) {
					Assert.assertNotNull(item.getLinks());
		}

	}

	@Then("^validate Items\\.links has self$")
	public void validate_Items_links_has_self() throws Throwable {
		
		Items[] items = genres.getItems();
		for (Items item : items) {
			Assert.assertNotNull(item.getLinks().getSelf());
			
		}
		}

	}


