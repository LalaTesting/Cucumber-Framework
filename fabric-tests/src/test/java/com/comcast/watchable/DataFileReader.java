package com.comcast.watchable;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataFileReader {

	public static void main(String[] args)
	{
		DataFileReader reader = new DataFileReader();

		reader.getProperties();
	}

	public Properties getProperties() 
	
	
	{
		Properties prop = new Properties();
		InputStream input = null;

		String environment = "productionFabric";

		if (System.getProperty("server") != null
				&& System.getProperty("server").length() > 0)

		{
			environment = System.getProperty("server");
		}

		try {
			String preFix = "com" + File.separator + "comcast" + File.separator
					+ "config" + File.separator;
			String filename = preFix + environment + "-config.properties";
			input = getClass().getClassLoader().getResourceAsStream(filename);

			prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop;

	}

	public String geturl(String URI, Properties props) {
		String tenantId = "watchable";
		String appId = "web";
		if (System.getProperty("tenantId") != null
				&& System.getProperty("tenantId").length() > 0)

		{
			tenantId = System.getProperty("tenantId");
		}

		if (System.getProperty("appId") != null
				&& System.getProperty("appId").length() > 0)

		{
			appId = System.getProperty("appId");
		}

		String url = props.getProperty(FabricUtlKeys.SERVER) + tenantId + "/"
				+ appId + props.getProperty(URI);
		return url;
	}

}
