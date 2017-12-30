package com.comcast.watchable.users.videos;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import com.comcast.model.users.videos.details.UsersVideoDetails;
import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpGetAPI;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GETUsersVideos extends AbstractSetup {

	UsersVideoDetails usersVideoDetail = null;
	CloseableHttpResponse usersVideoIdDetailsResponse = null;

	private CloseableHttpResponse getusersVideoIdDetailsResponse(String url)
			throws Exception {

		HttpGetAPI get = new HttpGetAPI();
		usersVideoIdDetailsResponse = get.getUserHttpResponse(url,
				getSessionToken(), getBearerToken());
		return usersVideoIdDetailsResponse;

	}

	@Given("^method: GET users videos id api$")
	public void method_GET_users_videos_id_api() throws Throwable {
		this.setUp();

		String url = getDataPropertyReader().geturl(FabricUtlKeys.USERS_VIDEOS,
				getFabricPropterties())
				+ "/" + AbstractSetup.getVideoList().get(0);

		CloseableHttpResponse response = getusersVideoIdDetailsResponse(url);
		StatusLine statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), 200);

		ObjectMapper mapper = new ObjectMapper();
		usersVideoDetail = mapper.readValue(response.getEntity().getContent(),
				UsersVideoDetails.class);
		// Assert.assertNotNull(usersVideoDetail.getType());

		// System.out.println("XXXXXXXXXXX"+usersVideoDetail);
		usersVideoIdDetailsResponse.close();

		response.close();

	}

	@Then("^validate type videoId position postionSeconds duration links playbackItems$")
	public void validate_type_videoId_position_postionSeconds_duration_links_playbackItems()
			throws Throwable {

		ObjectMapper mapper = new ObjectMapper();
		usersVideoDetail = mapper.readValue(usersVideoIdDetailsResponse
				.getEntity().getContent(), UsersVideoDetails.class);
		// Assert.assertNotNull(usersVideoDetail.getType());

		// System.out.println("XXXXXXXXXXX"+usersVideoDetail);
		usersVideoIdDetailsResponse.close();

	}

	@Then("^validate type$")
	public void validate_type() throws Throwable {
		// Assert.assertNotNull(usersVideoDetail.getType());
		Assert.assertNotNull(usersVideoDetail.getVideoId());
		// Assert.assertNotNull(usersVideoDetail.getPosition());
		// Assert.assertNotNull(usersVideoDetail.getPositionSeconds());
		// Assert.assertNotNull(usersVideoDetail.getDuration());
		Assert.assertNotNull(usersVideoDetail.getLinks());

	}

	@Then("^validate the videoId$")
	public void validate_the_videoId() throws Throwable {

	}

	@Then("^validate the video position$")
	public void validate_the_video_position() throws Throwable {

	}

	@Then("^verify the positionSeconds$")
	public void verify_the_positionSeconds() throws Throwable {

	}

	@Then("^validate the duration$")
	public void validate_the_duration() throws Throwable {

	}

	@Then("^validate links has flagAsset like attributes$")
	public void validate_links_has_flagAsset_like_attributes() throws Throwable {

	}

	@Then("^verify for links and playbackItems$")
	public void verify_for_links_and_playbackItems() throws Throwable {
		Assert.assertNotNull(usersVideoDetail.getLinks().getFlagAsset());
		Assert.assertNotNull(usersVideoDetail.getLinks().getLike());
	}

}
