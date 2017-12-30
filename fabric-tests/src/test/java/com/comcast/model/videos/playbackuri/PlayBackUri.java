package com.comcast.model.videos.playbackuri;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.comcast.model.curatedlists.Links;
@JsonIgnoreProperties(ignoreUnknown = true)

public class PlayBackUri {
	

private String logData;

private Links links;

private PlaybackItems[] playbackItems;

private String type;

public String getLogData ()
{
return logData;
}

public void setLogData (String logData)
{
this.logData = logData;
}


public Links getLinks() {
	return links;
}

public void setLinks(Links links) {
	this.links = links;
}

public PlaybackItems[] getPlaybackItems ()
{
return playbackItems;
}

public void setPlaybackItems (PlaybackItems[] playbackItems)
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

@Override
public String toString() {
	return "PlayBackUri [logData=" + logData + ", links=" + links
			+ ", playbackItems=" + Arrays.toString(playbackItems) + ", type="
			+ type + "]";
}


}
	
	