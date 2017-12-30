package com.comcast.watchable;

public interface FabricUtlKeys
{
	public static final String SERVER = "server";
	public static final String CURATED_LISTS_API="curatedLists";
	public static final String SESSION_TOKEN="SessionToken";
	public static final String CURATED_FEATURED_API="curatedFeatured";
	public static final String AUTHENTICATE="authenticate";
	public static final String USER_CREATE="profile";
	public static final String BEARER_TOKEN="userAuthenticate";
	public static final String CURATED_CHANNELS_API="curatedChannels";
    public static final String CURATED_VIDEOS_API="curatedVideos";
    public static final String VIDEOS_ID_API="videos";
    public static final String VIDEOS_ID_PLAYBACKURI_API="playbackuri";
    public static final String VIDEOS_ID_PLAYLIST_API="playlist";
    public static final String VIDEOFORMAT_MP4="videoFormat=mp4";  
    public static final String CHANNELS_ID_API="channelsIdDetails";
    public static final String CHANNELS_GENRE_FOR_PUBLISHER="channelsByGenreForPublisher";
    public static final String CHANNEL_ID_VIDEOS_API="videos";
    public static final String CHANNEL_FOLLOW="follow";
    public static final String USERS_CHANNEL_FOLLOW="usersFollow";
    public static final String USERS_VIEWHISTORY="usersViewHistory";
    public static final String USERS_VIDEOS="usersVideos";
    public static final String VIDEO_PROGRESS="20";
    public static final String VIDEO_PROGRESS_ONE="30";
    public static final String VIDEOS_WITH_PAGINATION="videosWithPagination";
    public static final String CHANNELS_WITH_PAGINATION="channelsWithPagination";
    public static final String GENRES="genres";
    public static final String USER_PROFILE="usersProfile";
    public static final String PUBLISHER_ID="publisherId";
    public static final String USERNAME_LOOKUP="userNameLookUp";
    public static final String EMAIL_LOOKUP="emailLookup";
    public static final String Seasons_ID="13252";
    
    
    
    
    //HEADERS
    
    public static final String CONTENT_TYPE="Content-Type";
    public static final String TEXT_PLAIN="text/plain";
    public static final String ACCEPT_HEADER="Accept";
    public static final String APPLICATION_JSON="application/json";
    public static final String APPLICATION_XML="application/xml";
    public static final String APPLICATION_JSON_V4="application/vnd.fmds.v4+json";
    public static final String CONTENT_TYPE_BEARER_TOKEN="text/plain,application/json";
    
    
    
    
    //videos response KEYS -- videos/<videoID>
    
    public static final String VIDEO_RESPONSE_TYPE="type";
    public static final String VIDEO_RESPONSE_ID="id";
    public static final String VIDEO_RESPONSE_TITLE="title";
    public static final String VIDEO_RESPONSE_SHORTDESC="shortDescription";
    public static final String VIDEO_RESPONSE_LONGDESC="longDescription";
    public static final String VIDEO_RESPONSE_LIVEBROADCASTTIME="liveBroadcastTime";
    public static final String VIDEO_RESPONSE_CREATETIME="createTime";
    public static final String VIDEO_RESPONSE_CHANLTITLE="channelTitle";
    public static final String VIDEO_RESPONSE_EPISODE="episode";
    public static final String VIDEO_RESPONSE_DURATION="duration";
    public static final String VIDEO_RESPONSE_PARENTALGUIDE= "parentalGuidance";
    public static final String VIDEO_RESPONSE_CHANLID= "channelId";
    
    public static final String VIDEO_RESPONSE_TYPE_VALUE="Video";
    
    public static final String VIDEO_ID_NON_INTEGER="NOT_FOUND";
    
 	public static final String VIDEO_ID = "74877";
	public static final String VIDEO_ID_INVALID = "10";
	
	
 	public static final String CHANNEL_ID = "11639";
	public static final String CHANNEL_ID_INVALID = "10";
	public static final String CHANNEL_ID_NON_INTEGER="NOT_FOUND";
    
    //VideoPlaybackUri API response KEYS -- videos/>videoID>/playbackuri
    
    public static final String VIDEO_PLAYBACKURI_RESPONSE_TYPE="type";
    public static final String VIDEO_PLAYBACKURI_RESPONSE_="type";
    
    
    
    //VideoPlaylist API response KEYS -- videos/<videoID>/playlist
    
    
    public static final String VIDEO_PLAYLIST_RESPONSE_PAGENUM="pageNum";
    public static final String VIDEO_PLAYLIST_RESPONSE_PAGESIZE="pageSize";
    public static final String VIDEO_PLAYLIST_RESPONSE_totalItems="totalItems";
    public static final String VIDEO_PLAYLIST_RESPONSE_LINKS="links";
    public static final String VIDEO_PLAYLIST_RESPONSE_TYPE="type";
    public static final String VIDEO_PLAYLIST_RESPONSE_ID="id";
    public static final String VIDEO_PLAYLIST_RESPONSE_SHORTDESC="shortDescription";
    public static final String VIDEO_PLAYLIST_RESPONSE_LONGDESC="longDescription";
    public static final String VIDEO_PLAYLIST_RESPONSE_CHNLTITLE="channelTitle";
    public static final String VIDEO_PLAYLIST_RESPONSE_EPISODE="episode";
    public static final String VIDEO_PLAYLIST_RESPONSE_DURATION="duration";
    public static final String VIDEO_PLAYLIST_RESPONSE_CHNLID="channelId";
    public static final String VIDEO_PLAYLIST_RESPONSE_EXTERNALID="externalId";
    public static final String VIDEO_PLAYLIST_RESPONSE_PUBLISHTIME="publishTime";
    public static final String VIDEO_PLAYLIST_RESPONSE_LOGOIMAGE_URL="logo-image";
    public static final String VIDEO_PLAYLIST_RESPONSE_USERDETAILS_URL="userVideoDetails";
    public static final String VIDEO_PLAYLIST_RESPONSE_CHANNEL_URL="channel";
    public static final String VIDEO_PLAYLIST_RESPONSE_SELF_URL="self";
    public static final String VIDEO_PLAYLIST_RESPONSE_PUBLISHER_URL="publisher";
    public static final String VIDEO_PLAYLIST_RESPONSE_ITEMS="items";
    
    
    
    
    
    
    
    
    
    
    

}
