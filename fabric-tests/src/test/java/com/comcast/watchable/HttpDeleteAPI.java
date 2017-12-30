package com.comcast.watchable;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpDeleteAPI {
	
	public CloseableHttpResponse deleteHttpResponse(String url, String sessionToken)
	{
		
		HttpDelete delete = new HttpDelete(url);
		delete.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
		delete.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
		//delete.setHeader("Accept","application/json");
	delete.setHeader("SessionToken",sessionToken);

	CloseableHttpClient httpclient = HttpClients.createDefault();
	
	CloseableHttpResponse response=null;
	try{
	
		System.out.println("Executing request : " + delete.getRequestLine());
        response = httpclient.execute(delete);
		
	}catch(Exception e)
	{
		System.out.println("Error in HttpDeleteAPI Class"+e);
	}
	
		
	
	return response;
	
	}
	
	
	
	
	
	public CloseableHttpResponse deleteUserHttpResponse(String url, String sessionToken, String bearerToken)
	{
	HttpDelete delete =new HttpDelete(url);

	delete.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
	delete.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
	delete.setHeader("SessionToken",sessionToken);
    delete.setHeader("Authorization",bearerToken);
	
	CloseableHttpClient httpclient = HttpClients.createDefault();
	
	CloseableHttpResponse response=null;
	try{
	
		System.out.println("Executing request : " + delete.getRequestLine());
        response = httpclient.execute(delete);
      
		
	}catch(Exception e)
	{
		System.out.println("Error in HttpDeleteAPI Class"+e);
	}
	
		
	
	return response;
	
	}
	

}
