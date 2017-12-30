package com.comcast.model.curatedfeatured;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CuratedFeatured {

	private String genre;

	private String curatedListType;

	private String totalItems;

	private Links links;

	private String totalVideos;

	private CuratedItems[] curatedItems;

	private String totalShows;

	private String totalChannels;

	private String totalBundles;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCuratedListType() {
		return curatedListType;
	}

	public void setCuratedListType(String curatedListType) {
		this.curatedListType = curatedListType;
	}

	public String getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}



	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public String getTotalVideos() {
		return totalVideos;
	}

	public void setTotalVideos(String totalVideos) {
		this.totalVideos = totalVideos;
	}

	public CuratedItems[] getCuratedItems() {
		return curatedItems;
	}

	public void setCuratedItems(CuratedItems[] curatedItems) {
		this.curatedItems = curatedItems;
	}

	public String getTotalShows() {
		return totalShows;
	}

	public void setTotalShows(String totalShows) {
		this.totalShows = totalShows;
	}

	public String getTotalChannels() {
		return totalChannels;
	}

	public void setTotalChannels(String totalChannels) {
		this.totalChannels = totalChannels;
	}

	public String getTotalBundles() {
		return totalBundles;
	}

	public void setTotalBundles(String totalBundles) {
		this.totalBundles = totalBundles;
	}

	@Override
	public String toString() {
		return "CuratedFeatured [genre = " + genre + ", curatedListType = "
				+ curatedListType + ", totalItems = " + totalItems
				+ ", links = " + links + ", totalVideos = " + totalVideos
				+ ", curatedItems = " + curatedItems + ", totalShows = "
				+ totalShows + ", totalChannels = " + totalChannels
				+ ", totalBundles = " + totalBundles + "]";
	}
}
