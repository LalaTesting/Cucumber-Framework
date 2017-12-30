package com.comcast.model.publishers.genre.channels;

public class Items {

private String id;

private String parentalGuidance;

private String numOfShows;

private String title;

private String description;

private String lastUpdateTimestamp;

private String numOfVideos;

private String longDescription;

private Links links;

private String type;

public String getId ()
{
 return id;
}

public void setId (String id)
{
 this.id = id;
}

public String getParentalGuidance ()
{
 return parentalGuidance;
}

public void setParentalGuidance (String parentalGuidance)
{
 this.parentalGuidance = parentalGuidance;
}

public String getNumOfShows ()
{
 return numOfShows;
}

public void setNumOfShows (String numOfShows)
{
 this.numOfShows = numOfShows;
}

public String getTitle ()
{
 return title;
}

public void setTitle (String title)
{
 this.title = title;
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

public String getNumOfVideos ()
{
 return numOfVideos;
}

public void setNumOfVideos (String numOfVideos)
{
 this.numOfVideos = numOfVideos;
}

public String getLongDescription ()
{
 return longDescription;
}

public void setLongDescription (String longDescription)
{
 this.longDescription = longDescription;
}

public Links getLinks ()
{
 return links;
}

public void setLinks (Links links)
{
 this.links = links;
}

public String getType ()
{
 return type;
}

public void setType (String type)
{
 this.type = type;
}

@Override
public String toString()
{
 return "Items [id = "+id+", parentalGuidance = "+parentalGuidance+", numOfShows = "+numOfShows+", title = "+title+", description = "+description+", lastUpdateTimestamp = "+lastUpdateTimestamp+", numOfVideos = "+numOfVideos+", longDescription = "+longDescription+", links = "+links+", type = "+type+"]";
}
}
		


