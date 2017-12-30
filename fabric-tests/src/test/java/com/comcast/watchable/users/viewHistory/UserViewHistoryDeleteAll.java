package com.comcast.watchable.users.viewHistory;

import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;

import com.comcast.watchable.AbstractSetup;
import com.comcast.watchable.FabricUtlKeys;
import com.comcast.watchable.HttpDeleteAPI;

import cucumber.api.java.en.Given;

public class UserViewHistoryDeleteAll extends AbstractSetup {

	private CloseableHttpResponse deleteViewHistoryResponse(String url)
			throws Exception {
		HttpDeleteAPI delete = new HttpDeleteAPI();
		CloseableHttpResponse deleteViewHistory = delete
				.deleteUserHttpResponse(url, getSessionToken(),
						getBearerToken());
		return deleteViewHistory;
	}

	@Given("^method: DELETE UsersViewHistory api$")
	public void method_DELETE_UsersViewHistory_api() throws Throwable {
		this.setUp();
		String url = getDataPropertyReader().geturl(
				FabricUtlKeys.USERS_VIEWHISTORY, getFabricPropterties())
				+ "/" + FabricUtlKeys.VIDEOS_ID_API;

		CloseableHttpResponse response = deleteViewHistoryResponse(url);
		StatusLine statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine.getStatusCode(), 204);

		response.close();

	}

}
