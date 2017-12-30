package com.comcast.model.users.videos.details;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {
	
	private String like;
	 @JsonProperty("flag-asset")
    private String flagAsset;

    public String getLike ()
    {
        return like;
    }

    public void setLike (String like)
    {
        this.like = like;
    }

	public String getFlagAsset() {
		return flagAsset;
	}

	public void setFlagAsset(String flagAsset) {
		this.flagAsset = flagAsset;
	}

	@Override
	public String toString() {
		return "Links [like=" + like + ", flagAsset=" + flagAsset + "]";
	}

   

}
