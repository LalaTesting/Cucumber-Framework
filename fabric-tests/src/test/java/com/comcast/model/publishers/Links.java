package com.comcast.model.publishers;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links

{
private String imageUri;

private String self;

private String channelPageTemplate;

private String channelPage;

private String genres_channels;

public String getImageUri ()
{
    return imageUri;
}

public void setImageUri (String imageUri)
{
    this.imageUri = imageUri;
}

public String getSelf ()
{
    return self;
}

public void setSelf (String self)
{
    this.self = self;
}

public String getChannelPageTemplate ()
{
    return channelPageTemplate;
}

public void setChannelPageTemplate (String channelPageTemplate)
{
    this.channelPageTemplate = channelPageTemplate;
}

public String getChannelPage ()
{
    return channelPage;
}

public void setChannelPage (String channelPage)
{
    this.channelPage = channelPage;
}

public String getGenres_channels ()
{
    return genres_channels;
}

public void setGenres_channels (String genres_channels)
{
    this.genres_channels = genres_channels;
}

@Override
public String toString()
{
    return "ClassPojo [imageUri = "+imageUri+", self = "+self+", channelPageTemplate = "+channelPageTemplate+", channelPage = "+channelPage+", genres_channels = "+genres_channels+"]";
}
}
		
		