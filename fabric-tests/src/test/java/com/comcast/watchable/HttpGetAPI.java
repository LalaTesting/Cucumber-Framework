package com.comcast.watchable;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;



public class HttpGetAPI {
	
	
	
	public CloseableHttpResponse getNonUsersHttpresponse(String url, String sessionToken)
	
	{
		
	HttpGet get =new HttpGet(url);
	
	get.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
	
	get.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
	//get.setHeader("Accept","application/json");
	
	get.setHeader("SessionToken",sessionToken);

	CloseableHttpClient httpclient = HttpClients.createDefault();
	
	CloseableHttpResponse response=null;
	
	try
	{
	
		System.out.println("Executing request : " + get.getRequestLine());
        response = httpclient.execute(get);
		
	}
	catch(Exception e)
	{
		System.out.println("Error in HttpGetAPI Class"+e);
	}
	
		
	
	return response;
	
	}
	
	public CloseableHttpResponse getUserHttpResponse(String url, String sessionToken, String bearerToken)
	{
	HttpGet get =new HttpGet(url);
	
	get.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
	get.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
	get.setHeader("SessionToken",sessionToken);
	get.setHeader("Authorization",bearerToken);
	
	CloseableHttpClient httpclient = HttpClients.createDefault();
	
	CloseableHttpResponse response=null;
	try{
	
		System.out.println("Executing request : " + get.getRequestLine());
        response = httpclient.execute(get);
		
	}catch(Exception e)
	{
		System.out.println("Error in HttpGetAPI Class"+e);
	}
	
		
	
	return response;
	
	}
	
	
}
	


