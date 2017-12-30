package com.comcast.model.genres;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import com.comcast.model.genres.Links;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Items {

private String id;

private String title;

private String totalItems;

private Links links;

private String totalVideos;

private String type;

private String totalShows;

private String totalChannels;

public String getId ()
{
return id;
}

public void setId (String id)
{
this.id = id;
}

public String getTitle ()
{
return title;
}

public void setTitle (String title)
{
this.title = title;
}

public String getTotalItems ()
{
return totalItems;
}

public void setTotalItems (String totalItems)
{
this.totalItems = totalItems;
}

public Links getLinks ()
{
return links;
}

public void setLinks (Links links)
{
this.links = links;
}

public String getTotalVideos ()
{
return totalVideos;
}

public void setTotalVideos (String totalVideos)
{
this.totalVideos = totalVideos;
}

public String getType ()
{
return type;
}

public void setType (String type)
{
this.type = type;
}

public String getTotalShows ()
{
return totalShows;
}

public void setTotalShows (String totalShows)
{
this.totalShows = totalShows;
}

public String getTotalChannels ()
{
return totalChannels;
}

public void setTotalChannels (String totalChannels)
{
this.totalChannels = totalChannels;
}

@Override
public String toString()
{
return "ClassPojo [id = "+id+", title = "+title+", totalItems = "+totalItems+", links = "+links+", totalVideos = "+totalVideos+", type = "+type+", totalShows = "+totalShows+", totalChannels = "+totalChannels+"]";
}
}



