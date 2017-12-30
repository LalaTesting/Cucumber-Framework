package com.comcast.model.channel.videos;

import com.comcast.model.curatedlists.Items;
import com.comcast.model.curatedlists.Links;

public class ChannelVideos
{
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
        return "ClassPojo [items = "+items+", totalItems = "+totalItems+", links = "+links+"]";
    }

}
