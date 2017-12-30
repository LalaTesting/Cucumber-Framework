package com.comcast.model.curatedfeatured;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

	 private String self;
	 private String imageUri;
	 @JsonProperty("logo-image")
	 private String logoImage;
	 private String userVideoDetails;
	 @JsonProperty("template-image")
	 private String templateImage;
	 private String sharelink;
	 private String channel;
	 private String publisher;
	 @JsonProperty("default-image")
	 private String defaultImage;
	 @JsonProperty("cell-image")
	 private String cellImage;
	 @JsonProperty("channel-subscription-status")
	 private String channelSubscriptionStatus;

	    public String getSelf ()
	    {
	        return self;
	    }

	    public void setSelf (String self)
	    {
	        this.self = self;
	    }
	    public String getImageUri ()
	    {
	        return imageUri;
	    }

	    public void setImageUri (String imageUri)
	    {
	        this.imageUri = imageUri;
	    }
	    

	    public String getLogoImage() {
			return logoImage;
		}

		public void setLogoImage(String logoImage) {
			this.logoImage = logoImage;
		}

		public String getUserVideoDetails() {
			return userVideoDetails;
		}

		public void setUserVideoDetails(String userVideoDetails) {
			this.userVideoDetails = userVideoDetails;
		}

		public String getTemplateImage() {
			return templateImage;
		}

		public void setTemplateImage(String templateImage) {
			this.templateImage = templateImage;
		}

		public String getSharelink() {
			return sharelink;
		}

		public void setSharelink(String sharelink) {
			this.sharelink = sharelink;
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

		@Override
		public String toString() {
			return "Links [self=" + self + ", imageUri=" + imageUri
					+ ", logoImage=" + logoImage + ", userVideoDetails="
					+ userVideoDetails + ", templateImage=" + templateImage
					+ ", sharelink=" + sharelink + ", channel=" + channel
					+ ", publisher=" + publisher + ", defaultImage="
					+ defaultImage + ", cellImage=" + cellImage
					+ ", channelSubscriptionStatus="
					+ channelSubscriptionStatus + "]";
		}

		
	}
