package com.comcast.model.genres;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Genres
{
private String totalItems;

private Items[] items;

private Links links;

public Items[] getItems ()
{
return items;
}

public void setItems (Items[] items)
{
this.items = items;
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

@Override
public String toString()
{
return "ClassPojo [items = "+items+", totalItems = "+totalItems+", links = "+links+"]";
}
}
	