package com.comcast.watchable;

import java.util.Properties;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.codehaus.jackson.map.ObjectMapper;

import com.comcast.watchable.users.profile.UserAuthentication;
import com.comcast.watchable.users.profile.UserCreation_common;

public class HttpPostAPI {

	private static Properties props = new DataFileReader().getProperties();

	public CloseableHttpResponse getSessionTokenResponse(String url) {
		HttpPost post = new HttpPost(url);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		post.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
		post.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
		//post.setHeader("Accept","application/json");
		CloseableHttpResponse response = null;
		try
		{

			StringEntity entity = new StringEntity(
					props.getProperty("SecretKey"));
			post.setEntity(entity);
			System.out.println("Executing request : " + post.getRequestLine());
			response = httpclient.execute(post);
			httpclient.close();

		} catch (Exception e) {
			System.out.println("Error in HttpPostAPI Class" + e);
		}

		return response;

	}
	
	
	public CloseableHttpResponse postChannelFollow(String url, String sessionToken, String bearerToken) {
		HttpPost post = new HttpPost(url);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		post.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
		post.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
		post.setHeader("SessionToken", sessionToken);
		post.setHeader("Authorization",bearerToken);
		CloseableHttpResponse response = null;
		try {

			
			System.out.println("Executing request : " + post.getRequestLine());
			response = httpclient.execute(post);
			httpclient.close();

		} catch (Exception e) {
			System.out.println("Error in HttpPostAPI Class" + e);
		}

		return response;

	}
	
	

	
	
	
	
	public static CloseableHttpResponse createUser(String url,
			String sessionToken, UserCreation_common user) {

		HttpPost post = new HttpPost(url);
		CloseableHttpClient httpclient = HttpClients.createDefault();
	
		
		post.setHeader(FabricUtlKeys.CONTENT_TYPE, FabricUtlKeys.CONTENT_TYPE_BEARER_TOKEN);
		post.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
		post.setHeader("SessionToken", sessionToken);
		CloseableHttpResponse response = null;
		System.out.println(sessionToken);
		try {

			ObjectMapper mapper = new ObjectMapper();
			String data = mapper.writeValueAsString(user);
			StringEntity entity = new StringEntity(data,
					ContentType.APPLICATION_JSON);
			post.setEntity(entity);
			System.out.println("Executing request : " + post.getRequestLine());
			response = httpclient.execute(post);
			httpclient.close();

		} catch (Exception e) {
			System.out.println("Error in HttpPostAPI Class" + e);
		}

		return response;

	}

	public static CloseableHttpResponse getBearerToken(String url,
			String sessionToken, UserAuthentication authUser) {

		HttpPost post = new HttpPost(url);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		post.setHeader(FabricUtlKeys.CONTENT_TYPE, FabricUtlKeys.CONTENT_TYPE_BEARER_TOKEN);
		post.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
		post.setHeader("SessionToken", sessionToken);
		CloseableHttpResponse response = null;
		//System.out.println(sessionToken);
		try {

			ObjectMapper mapper = new ObjectMapper();
			String data = mapper.writeValueAsString(authUser);
			StringEntity entity = new StringEntity(data,ContentType.APPLICATION_JSON);
			post.setEntity(entity);
			System.out.println("Executing request : " + post.getRequestLine());
			response = httpclient.execute(post);
			httpclient.close();

		} catch (Exception e) {
			System.out.println("Error in HttpPostAPI Class" + e);
		}

		return response;

	}

	public CloseableHttpResponse getBearerTokenResponse(String url) {
		HttpPost post = new HttpPost(url);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		post.setHeader(FabricUtlKeys.CONTENT_TYPE, FabricUtlKeys.CONTENT_TYPE_BEARER_TOKEN);
		post.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
		CloseableHttpResponse response = null;
		try {

			StringEntity entity = new StringEntity(
					props.getProperty("SecretKey"));
			post.setEntity(entity);
			System.out.println("Executing request : " + post.getRequestLine());
			response = httpclient.execute(post);
			httpclient.close();

		} catch (Exception e) {
			System.out.println("Error in HttpPostAPI Class" + e);
		}

		return response;

	}

}
