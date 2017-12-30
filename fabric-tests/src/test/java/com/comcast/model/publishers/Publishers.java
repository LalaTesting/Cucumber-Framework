package com.comcast.model.publishers;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Publishers {
	
	
    
private String id;

private String numOfShows;

private String numOfChannels;

private String description;

private String lastUpdateTimestamp;

private String name;

private String numOfVideos;

private Links links;

private String businessId;

public String getId ()
{
return id;
}

public void setId (String id)
{
this.id = id;
}

public String getNumOfShows ()
{
return numOfShows;
}

public void setNumOfShows (String numOfShows)
{
this.numOfShows = numOfShows;
}

public String getNumOfChannels ()
{
return numOfChannels;
}

public void setNumOfChannels (String numOfChannels)
{
this.numOfChannels = numOfChannels;
}

public String getDescription ()
{
return description;
}

public void setDescription (String description)
{
this.description = description;
}

public String getLastUpdateTimestamp ()
{
return lastUpdateTimestamp;
}

public void setLastUpdateTimestamp (String lastUpdateTimestamp)
{
this.lastUpdateTimestamp = lastUpdateTimestamp;
}

public String getName ()
{
return name;
}

public void setName (String name)
{
this.name = name;
}

public String getNumOfVideos ()
{
return numOfVideos;
}

public void setNumOfVideos (String numOfVideos)
{
this.numOfVideos = numOfVideos;
}

public Links getLinks ()
{
return links;
}

public void setLinks (Links links)
{
this.links = links;
}

public String getBusinessId ()
{
return businessId;
}

public void setBusinessId (String businessId)
{
this.businessId = businessId;
}

@Override
public String toString()
{
return "Publishers [id = "+id+", numOfShows = "+numOfShows+", numOfChannels = "+numOfChannels+", description = "+description+", lastUpdateTimestamp = "+lastUpdateTimestamp+", name = "+name+", numOfVideos = "+numOfVideos+", links = "+links+", businessId = "+businessId+"]";
}
}
	
	

