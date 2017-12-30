package com.comcast.model.videos.playbackuri;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class PlaybackItems {
	
	   private String logUri;

	    private String bitRate;

	    private String uri;

	    private String mediaFormat;

	    public String getLogUri ()
	    {
	        return logUri;
	    }

	    public void setLogUri (String logUri)
	    {
	        this.logUri = logUri;
	    }

	    public String getBitRate ()
	    {
	        return bitRate;
	    }

	    public void setBitRate (String bitRate)
	    {
	        this.bitRate = bitRate;
	    }

	    public String getUri ()
	    {
	        return uri;
	    }

	    public void setUri (String uri)
	    {
	        this.uri = uri;
	    }

	    public String getMediaFormat ()
	    {
	        return mediaFormat;
	    }

	    public void setMediaFormat (String mediaFormat)
	    {
	        this.mediaFormat = mediaFormat;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [logUri = "+logUri+", bitRate = "+bitRate+", uri = "+uri+", mediaFormat = "+mediaFormat+"]";
	    }

}
