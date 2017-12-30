package com.comcast.model.curatedlists;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CuratedList {

	private String totalItems;

    private Links links;
    
    private String genre;
    
    private String title;
    private String description;
    private String totalChannels;
    private String curatedListType;
    
    private String totalVideos;
    private String totalShows;
    private String totalBundles;
    

    public String getTotalVideos() {
		return totalVideos;
	}

	public void setTotalVideos(String totalVideos) {
		this.totalVideos = totalVideos;
	}

	public String getTotalShows() {
		return totalShows;
	}

	public void setTotalShows(String totalShows) {
		this.totalShows = totalShows;
	}

	public String getTotalBundles() {
		return totalBundles;
	}

	public void setTotalBundles(String totalBundles) {
		this.totalBundles = totalBundles;
	}

	public String getTotalChannels() {
		return totalChannels;
	}

	public void setTotalChannels(String totalChannels) {
		this.totalChannels = totalChannels;
	}

	public String getCuratedListType() {
		return curatedListType;
	}

	public void setCuratedListType(String curatedListType) {
		this.curatedListType = curatedListType;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private CuratedItems[] curatedItems;

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

    public CuratedItems[] getCuratedItems ()
    {
        return curatedItems;
    }

  
	public void setCuratedItems(CuratedItems[] curatedItems) {
		this.curatedItems = curatedItems;
	}

	@Override
	public String toString() {
		return "CuratedList [totalItems=" + totalItems + ", links=" + links
				+ ", genre=" + genre + ", title=" + title + ", description="
				+ description + ", totalChannels=" + totalChannels
				+ ", curatedListType=" + curatedListType + ", totalVideos="
				+ totalVideos + ", totalShows=" + totalShows
				+ ", totalBundles=" + totalBundles + ", curatedItems="
				+ Arrays.toString(curatedItems) + "]";
	}





}
