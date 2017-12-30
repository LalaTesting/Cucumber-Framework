package com.comcast.model.curatedlists;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

	private String self;
	private String imageUri;
	private String sharelink;
	@JsonProperty("logo-image")
	private String logoImage;
	private String userVideoDetails;
	@JsonProperty("template-image")
	private String templateImage;
	private String channel;
	private String publisher;
	@JsonProperty("default-image")
	private String defaultImage;
	@JsonProperty("cell-image")
	private String cellImage;
	@JsonProperty("channel-subscription-status")
	private String channelSubscriptionStatus;

	private String genre;
	@JsonProperty("channels-allvideos")
	private String channelsAllVideos;
	@JsonProperty("channels-videos")
	private String channelVideos;

	private String paginateShowsAndVideosTemplate;

	private String paginateShowsAll;

	private String paginateShowsAndVideos;

	private String paginateShowsTemplate;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getChannelsAllVideos() {
		return channelsAllVideos;
	}

	public void setChannelsAllVideos(String channelsAllVideos) {
		this.channelsAllVideos = channelsAllVideos;
	}

	public String getChannelVideos() {
		return channelVideos;
	}

	public void setChannelVideos(String channelVideos) {
		this.channelVideos = channelVideos;
	}

	public String getPaginateShowsAndVideosTemplate() {
		return paginateShowsAndVideosTemplate;
	}

	public void setPaginateShowsAndVideosTemplate(
			String paginateShowsAndVideosTemplate) {
		this.paginateShowsAndVideosTemplate = paginateShowsAndVideosTemplate;
	}

	public String getPaginateShowsAll() {
		return paginateShowsAll;
	}

	public void setPaginateShowsAll(String paginateShowsAll) {
		this.paginateShowsAll = paginateShowsAll;
	}

	public String getPaginateShowsAndVideos() {
		return paginateShowsAndVideos;
	}

	public void setPaginateShowsAndVideos(String paginateShowsAndVideos) {
		this.paginateShowsAndVideos = paginateShowsAndVideos;
	}

	public String getPaginateShowsTemplate() {
		return paginateShowsTemplate;
	}

	public void setPaginateShowsTemplate(String paginateShowsTemplate) {
		this.paginateShowsTemplate = paginateShowsTemplate;
	}

	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	@JsonProperty("subscription-status")
	private String subscriptionStatus;

	public String getTemplateImage() {
		return templateImage;
	}

	public void setTemplateImage(String templateImage) {
		this.templateImage = templateImage;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDefaultImage() {
		return defaultImage;
	}

	public void setDefaultImage(String defaultImage) {
		this.defaultImage = defaultImage;
	}

	public String getCellImage() {
		return cellImage;
	}

	public void setCellImage(String cellImage) {
		this.cellImage = cellImage;
	}

	public String getChannelSubscriptionStatus() {
		return channelSubscriptionStatus;
	}

	public void setChannelSubscriptionStatus(String channelSubscriptionStatus) {
		this.channelSubscriptionStatus = channelSubscriptionStatus;
	}

	public String getUserVideoDetails() {
		return userVideoDetails;
	}

	public void setUserVideoDetails(String userVideoDetails) {
		this.userVideoDetails = userVideoDetails;
	}

	public String getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	public String getSharelink() {
		return sharelink;
	}

	public void setSharelink(String sharelink) {
		this.sharelink = sharelink;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		return "Links [self=" + self + ", imageUri=" + imageUri
				+ ", sharelink=" + sharelink + ", logoImage=" + logoImage
				+ ", userVideoDetails=" + userVideoDetails + ", templateImage="
				+ templateImage + ", channel=" + channel + ", publisher="
				+ publisher + ", defaultImage=" + defaultImage + ", cellImage="
				+ cellImage + ", channelSubscriptionStatus="
				+ channelSubscriptionStatus + ", genre=" + genre
				+ ", channelsAllVideos=" + channelsAllVideos
				+ ", channelVideos=" + channelVideos
				+ ", paginateShowsAndVideosTemplate="
				+ paginateShowsAndVideosTemplate + ", paginateShowsAll="
				+ paginateShowsAll + ", paginateShowsAndVideos="
				+ paginateShowsAndVideos + ", paginateShowsTemplate="
				+ paginateShowsTemplate + ", subscriptionStatus="
				+ subscriptionStatus + "]";
	}



}
