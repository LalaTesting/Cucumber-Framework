package com.comcast.model.publishers.genre.channels;

public class ChannelGenreForPublisher {
	

private Items[] items;

private String totalItems;

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
return "ChannelGenreForPublisher [items = "+items+", totalItems = "+totalItems+", links = "+links+"]";
}



}
