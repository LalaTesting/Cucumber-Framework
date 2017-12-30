package com.comcast.model.curatedlists;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CuratedItems {

	private String genre;

    private String id;

    private String title;

    private String totalVideoDuration;

    private String description;

    private Links links;

    private String totalVideos;
    
    private String type;
    
    private Channel channel; 
 
    private Video video;

    public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}



		public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGenre ()
    {
        return genre;
    }

    public void setGenre (String genre)
    {
        this.genre = genre;
    }

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

    public String getTotalVideoDuration ()
    {
        return totalVideoDuration;
    }

    public void setTotalVideoDuration (String totalVideoDuration)
    {
        this.totalVideoDuration = totalVideoDuration;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
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

		public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "CuratedItems [genre=" + genre + ", id=" + id + ", title="
				+ title + ", totalVideoDuration=" + totalVideoDuration
				+ ", description=" + description + ", links=" + links
				+ ", totalVideos=" + totalVideos + ", type=" + type
				+ ", channel=" + channel + ", video=" + video + "]";
	}

	

    
}
