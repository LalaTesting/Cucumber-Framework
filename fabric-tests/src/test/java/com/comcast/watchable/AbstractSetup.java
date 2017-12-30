package com.comcast.watchable;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.testng.Assert;

import com.comcast.model.channel.videos.ChannelVideos;
import com.comcast.model.curatedlists.Items;
import com.comcast.watchable.channels.ChannelsWithPagination;
import com.comcast.watchable.users.profile.UserAuthentication;
import com.comcast.watchable.users.profile.UserCreation_common;
import com.comcast.watchable.videos.VideosWithPagination;

public class AbstractSetup {

	private static HttpPostAPI post = null;
	
	private static CloseableHttpResponse response = null; 
	
	private static DataFileReader dataPropertyReader = new DataFileReader();
	
	private static Properties fabricPropterties = dataPropertyReader.getProperties();
	
	private static String sessionToken;
	
	private static UserCreation_common user;
	
	private static String bearerToken;
	
	static Logger log = Logger.getLogger(AbstractSetup.class.getName());
	
	private static List<Integer> videoList = getVideoIdFromPagination();
	
	private static List<Integer> channelList=getChannelIDFromPagination();



	public static List<Integer> getChannelList()
	{
		return channelList;
	}

	public static void setChannelList(List<Integer> channelList) 
	{
		AbstractSetup.channelList = channelList;
	}

	public static List<Integer> getVideoList() 
	{
		return videoList;
	}

	public static void setVideoList(List<Integer> videoList)
	{
		AbstractSetup.videoList = videoList;
	}

	public void setUp() throws Exception {

		if (sessionToken == null) 
		{
			post = new HttpPostAPI();
			
			String url = dataPropertyReader.geturl(FabricUtlKeys.AUTHENTICATE,fabricPropterties);
			
			response = post.getSessionTokenResponse(url);
			
			StatusLine status = response.getStatusLine();

			Assert.assertEquals(204, status.getStatusCode());
			Header[] header = response.getHeaders(FabricUtlKeys.SESSION_TOKEN);
			sessionToken = header[0].toString();
			Assert.assertNotNull(header[0]);
			String[] tokens = sessionToken.split(":");
			sessionToken = tokens[1];
			response.close();
			
			// create user and generate Bearer token
			user = new UserCreation_common();
			createUser(user);
			bearerToken = getBearerToken(user);

		}
	}

	public void createUser(UserCreation_common user) throws Exception 
	{

	//	public String createUser(UserCreation_common user) throws Exception {

		String url = dataPropertyReader.geturl(FabricUtlKeys.USER_CREATE,
				fabricPropterties);
		CloseableHttpResponse response = HttpPostAPI.createUser(url,
				getSessionToken(), user);
		StatusLine statusLine = response.getStatusLine();
		statusLine.getStatusCode();

		// System.out.println("401 Reason : " );
		System.out.println("USER : " + user.getEmail());
		
		if (statusLine.getStatusCode() != 204) {
			throw new RuntimeException("userCreation is failed");
		}

		response.close();
		//return user.getEmail();

	}

	public String getBearerToken(UserCreation_common user) throws Exception {
		UserAuthentication authUser = convertUserToAuthUser(user);

		String auth = null;
		String url = dataPropertyReader.geturl(FabricUtlKeys.BEARER_TOKEN,
				fabricPropterties);
		CloseableHttpResponse response = HttpPostAPI.getBearerToken(url,
				getSessionToken(), authUser);
		StatusLine statusLine = response.getStatusLine();
		statusLine.getStatusCode();

		if (statusLine.getStatusCode() != 200) {
			throw new RuntimeException("Bearer token Creation is failed");
		}

		Header[] headers = response.getHeaders("Authorization");

		if (headers != null && headers.length > 0) {
			auth = headers[0].getValue();
		}
		System.out.println("USER CREDS :" + authUser.getUsername());

		response.close();

		return auth;

	}

	private UserAuthentication convertUserToAuthUser(UserCreation_common user) {
		UserAuthentication authUser = new UserAuthentication();
		authUser.setUsername(user.getEmail());
		authUser.setPassword(user.getPassword());

		return authUser;
	}

	public static UserCreation_common getUser() {
		return user;

	}

	public static String getBearerToken() {
		return bearerToken;
	}

	public static DataFileReader getDataPropertyReader() {
		return dataPropertyReader;
	}

	public static Properties getFabricPropterties() {
		return fabricPropterties;
	}

	public static String getSessionToken() {
		return sessionToken;
	}

	/*
	 * private static String getStringFromInputStream(InputStream is) {
	 * 
	 * BufferedReader br = null; StringBuilder sb = new StringBuilder();
	 * 
	 * String line = null; try {
	 * 
	 * br = new BufferedReader(new InputStreamReader(is)); while ((line =
	 * br.readLine()) != null) { sb.append(line); }
	 * 
	 * } catch (IOException e) { e.printStackTrace(); } finally { if (br !=
	 * null) { try { br.close(); } catch (IOException e) { e.printStackTrace();
	 * } } }return line; }
	 */

	private static List<Integer> getVideoIdFromPagination() 
	{
		List<Integer> videoList=new ArrayList<Integer>();
		try{
			VideosWithPagination vidoePage = new VideosWithPagination();
			vidoePage.method_GET_VideosWithPagination_api();
			vidoePage.validate_for_totalItems_attribute();
			ChannelVideos videos = vidoePage.getChannelVideos();

			Items[] items = videos.getItems();
			for(int i=0; i<items.length;i++)
			{
				
				if(items[i].getId() !=null)
				{
					
					
					videoList.add(new Integer(items[i].getId()));
					
					if(i == 5)
					{
						break;
					}

					
				}

			}
		}catch(Throwable t)
			{
				log.error("Error in getting VideoID");
			}

			return videoList;

		}

	
	
	private static List<Integer> getChannelIDFromPagination() 
	{
		List<Integer> channelList=new ArrayList<Integer>();
		try{
			ChannelsWithPagination channelPage = new ChannelsWithPagination();
			channelPage.method_GET_ChannelsWithPagination_api();
			channelPage.verify_totalItems_attribute();;
			ChannelVideos channels = channelPage.getChannelVideos();

			Items[] items = channels.getItems();
			for(int i=0; i<items.length;i++)
			{
				
				if(items[i].getId() !=null)
				{
					
					
					channelList.add(new Integer(items[i].getId()));
					
					if(i == 5)
					{
						break;
					}

					
				}

			}
		}catch(Throwable t)
			{
				log.error("Error in getting Channel-ID");
			}

			return channelList;

		}

	
	
	
}
