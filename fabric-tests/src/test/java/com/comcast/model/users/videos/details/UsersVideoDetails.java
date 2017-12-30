package com.comcast.model.users.videos.details;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersVideoDetails {


private String position;

private String duration;

private String videoId;

private Links links;

private String[] playbackItems;

private String type;

private String positionSeconds;

public String getPosition ()
{
return position;
}

public void setPosition (String position)
{
this.position = position;
}

public String getDuration ()
{
return duration;
}

public void setDuration (String duration)
{
this.duration = duration;
}

public String getVideoId ()
{
return videoId;
}

public void setVideoId (String videoId)
{
this.videoId = videoId;
}

public Links getLinks ()
{
return links;
}

public void setLinks (Links links)
{
this.links = links;
}

public String[] getPlaybackItems ()
{
return playbackItems;
}

public void setPlaybackItems (String[] playbackItems)
{
this.playbackItems = playbackItems;
}

public String getType ()
{
return type;
}

public void setType (String type)
{
this.type = type;
}

public String getPositionSeconds ()
{
return positionSeconds;
}

public void setPositionSeconds (String positionSeconds)
{
this.positionSeconds = positionSeconds;
}

@Override
public String toString()
{
return "UsersVideoDetails [position = "+position+", duration = "+duration+", videoId = "+videoId+", links = "+links+", playbackItems = "+playbackItems+", type = "+type+", positionSeconds = "+positionSeconds+"]";
}

}