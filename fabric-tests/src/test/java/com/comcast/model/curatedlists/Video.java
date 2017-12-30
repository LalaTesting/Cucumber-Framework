package com.comcast.model.curatedlists;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {
	
	    private String createTime;

	    private String episode;

	    private String publishTime;

	    private String channelId;

	    private String liveBroadcastTime;

	    private String channelTitle;

	    private Links links;

	    private String onDemandTimeBegin;

	    private String type;

	    private String externalId;

	    private String id;

	    private String parentalGuidance;

	    private String title;

	    private String duration;

	    private String season;

	    private String shortDescription;

	    private String expireDate;

	    private String onDemandTimeEnd;

	    private String longDescription;

	    private String externalAdvertizerId;

	    private String[] playbackItems;

	    public String getCreateTime ()
	    {
	        return createTime;
	    }

	    public void setCreateTime (String createTime)
	    {
	        this.createTime = createTime;
	    }

	    public String getEpisode ()
	    {
	        return episode;
	    }

	    public void setEpisode (String episode)
	    {
	        this.episode = episode;
	    }

	    public String getPublishTime ()
	    {
	        return publishTime;
	    }

	    public void setPublishTime (String publishTime)
	    {
	        this.publishTime = publishTime;
	    }

	    public String getChannelId ()
	    {
	        return channelId;
	    }

	    public void setChannelId (String channelId)
	    {
	        this.channelId = channelId;
	    }

	    public String getLiveBroadcastTime ()
	    {
	        return liveBroadcastTime;
	    }

	    public void setLiveBroadcastTime (String liveBroadcastTime)
	    {
	        this.liveBroadcastTime = liveBroadcastTime;
	    }

	    public String getChannelTitle ()
	    {
	        return channelTitle;
	    }

	    public void setChannelTitle (String channelTitle)
	    {
	        this.channelTitle = channelTitle;
	    }

	    public Links getLinks ()
	    {
	        return links;
	    }

	    public void setLinks (Links links)
	    {
	        this.links = links;
	    }

	    public String getOnDemandTimeBegin ()
	    {
	        return onDemandTimeBegin;
	    }

	    public void setOnDemandTimeBegin (String onDemandTimeBegin)
	    {
	        this.onDemandTimeBegin = onDemandTimeBegin;
	    }

	    public String getType ()
	    {
	        return type;
	    }

	    public void setType (String type)
	    {
	        this.type = type;
	    }

	    public String getExternalId ()
	    {
	        return externalId;
	    }

	    public void setExternalId (String externalId)
	    {
	        this.externalId = externalId;
	    }

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

	    public String getTitle ()
	    {
	        return title;
	    }

	    public void setTitle (String title)
	    {
	        this.title = title;
	    }

	    public String getDuration ()
	    {
	        return duration;
	    }

	    public void setDuration (String duration)
	    {
	        this.duration = duration;
	    }

	    public String getSeason ()
	    {
	        return season;
	    }

	    public void setSeason (String season)
	    {
	        this.season = season;
	    }

	    public String getShortDescription ()
	    {
	        return shortDescription;
	    }

	    public void setShortDescription (String shortDescription)
	    {
	        this.shortDescription = shortDescription;
	    }

	    public String getExpireDate ()
	    {
	        return expireDate;
	    }

	    public void setExpireDate (String expireDate)
	    {
	        this.expireDate = expireDate;
	    }

	    public String getOnDemandTimeEnd ()
	    {
	        return onDemandTimeEnd;
	    }

	    public void setOnDemandTimeEnd (String onDemandTimeEnd)
	    {
	        this.onDemandTimeEnd = onDemandTimeEnd;
	    }

	    public String getLongDescription ()
	    {
	        return longDescription;
	    }

	    public void setLongDescription (String longDescription)
	    {
	        this.longDescription = longDescription;
	    }

	    public String getExternalAdvertizerId ()
	    {
	        return externalAdvertizerId;
	    }

	    public void setExternalAdvertizerId (String externalAdvertizerId)
	    {
	        this.externalAdvertizerId = externalAdvertizerId;
	    }

	    public String[] getPlaybackItems ()
	    {
	        return playbackItems;
	    }

	    public void setPlaybackItems (String[] playbackItems)
	    {
	        this.playbackItems = playbackItems;
	    }

	    @Override
	    public String toString()
	    {
	        return "Video [createTime = "+createTime+", episode = "+episode+", publishTime = "+publishTime+", channelId = "+channelId+", liveBroadcastTime = "+liveBroadcastTime+", channelTitle = "+channelTitle+", links = "+links+", onDemandTimeBegin = "+onDemandTimeBegin+", type = "+type+", externalId = "+externalId+", id = "+id+", parentalGuidance = "+parentalGuidance+", title = "+title+", duration = "+duration+", season = "+season+", shortDescription = "+shortDescription+", expireDate = "+expireDate+", onDemandTimeEnd = "+onDemandTimeEnd+", longDescription = "+longDescription+", externalAdvertizerId = "+externalAdvertizerId+", playbackItems = "+playbackItems+"]";
	    }

}
