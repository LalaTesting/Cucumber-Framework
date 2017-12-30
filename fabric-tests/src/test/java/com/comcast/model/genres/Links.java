package com.comcast.model.genres;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

	 private String self;

	    public String getSelf ()
	    {
	        return self;
	    }

	    public void setSelf (String self)
	    {
	        this.self = self;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [self = "+self+"]";
	    }
}
