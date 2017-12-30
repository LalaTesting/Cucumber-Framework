package com.comcast.watchable.publishers;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.publishers.Links;
import com.comcast.model.publishers.Publishers;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PublisherById extends AbstractSetup {


	static Logger log = Logger.getLogger(PublisherById.class.getName());

	HttpGetAPI get = null;
	CloseableHttpResponse publisherByIdResponse = null;
	Publishers publishers = null;
	Links links = null;

	private CloseableHttpResponse getpublisherByIDResponse(String url) {

		HttpGetAPI get = new HttpGetAPI();
		publisherByIdResponse = get.getNonUsersHttpresponse(url,
				getSessionToken());
	return publisherByIdResponse;

	}

	@Given("^method: GET /fmds/api/watchable/web/publishers/<publisherId> and Verify response as (\\d+) OK$")
	public void method_GET_fmds_api_watchable_web_publishers_publisherId_and_Verify_response_as_OK(
			int arg1) throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(FabricUtlKeys.PUBLISHER_ID,
				getFabricPropterties());

		publisherByIdResponse = getpublisherByIDResponse(url);

		Assert.assertEquals(publisherByIdResponse.getStatusLine()
				.getStatusCode(), arg1);

	}

	@Then("^verify publisher id and its value$")
	public void verify_publisher_id_and_its_value() throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		publishers = mapper.readValue(publisherByIdResponse.getEntity()
				.getContent(), Publishers.class);
		publisherByIdResponse.close();
		
	

	}

	@Then("^validate for publisher's name$")
	public void validate_for_publisher_s_name() throws Throwable {
		Assert.assertNotNull(publishers.getName(),"Publisher Name is : " + publishers.getName());
		
		
		
		

	}

	@Then("^check for the description$")
	public void check_for_the_description() throws Throwable {
	Assert.assertNotNull(publishers.getDescription());
	}

	@Then("^validate for the count of channels$")
	public void validate_for_the_count_of_channels() throws Throwable {

	}

	@Then("^validate for count of shows$")
	public void validate_for_count_of_shows() throws Throwable {

	}

	@Then("^verify for number of videos from that publisher$")
	public void verify_for_number_of_videos_from_that_publisher()
			throws Throwable {

	}

	@Then("^validate last Updated Time stamp$")
	public void validate_last_Updated_Time_stamp() throws Throwable {

	}

	@Then("^verify the busniess ID$")
	public void verify_the_busniess_ID() throws Throwable {

	}

	@Then("^verify the links presence$")
	public void verify_the_links_presence() throws Throwable {

	}

	@Then("^verify  link has channel Page Template$")
	public void verify_link_has_channel_Page_Template() throws Throwable {

	}

	@Then("^validate link for the image Uri$")
	public void validate_link_for_the_image_Uri() throws Throwable {

	}

	@Then("^validate link forchannel Page$")
	public void validate_link_forchannel_Page() throws Throwable {

	}

	@Then("^verify for link for self$")
	public void verify_for_link_for_self() throws Throwable {

	}

	@Then("^verify links for genre channels$")
	public void verify_links_for_genre_channels() throws Throwable {

	}

}
