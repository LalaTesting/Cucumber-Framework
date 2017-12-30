package com.comcast.model.curatedfeatured;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CuratedItems {

	private String title;

    private Links links;

    private String type;

    private Video video;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
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

    public Video getVideo ()
    {
        return video;
    }

    public void setVideo (Video video)
    {
        this.video = video;
    }

    @Override
    public String toString()
    {
        return "CuratedItems [title = "+title+", links = "+links+", type = "+type+", video = "+video+"]";
    }
}
