package com.comcast.watchable;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpPutAPI {
	
	
	public CloseableHttpResponse UserPutResponse(String url, String sessionToken, String bearerToken)
	{
		
	HttpPut put =new HttpPut(url);	

	put.setHeader(FabricUtlKeys.CONTENT_TYPE,FabricUtlKeys.TEXT_PLAIN);
	put.setHeader(FabricUtlKeys.ACCEPT_HEADER, FabricUtlKeys.APPLICATION_JSON_V4);
	put.setHeader("SessionToken",sessionToken);
	put.setHeader("Authorization",bearerToken);
	
	//put.setHeader("Accept","application/vnd.fmds.v3+json");
	
	CloseableHttpClient httpclient = HttpClients.createDefault();
	
	CloseableHttpResponse response=null;
	try{
	
		System.out.println("Executing request : " + put.getRequestLine());
        response = httpclient.execute(put);
      
		
	}catch(Exception e)
	{
		System.out.println("Error in HttpPut Class"+e); 
	}
	
			
	return response;
	
	}
	

}
