package Utils;



public class UIElements{
	
	//SLIDER MENU
	public static String CLASS_ICN_SLIDER = "android.widget.ImageButton";
	public static String XPATH_LBL_PLAYLIST = "//android.widget.TextView[1]";
	public static String XPATH_LBL_BROWSE = "//android.widget.TextView[@text='Browse Shows']";
    public static String XPATH_LBL_MYSHOWS = "//android.widget.TextView[@text='My Shows']";
	public static String XPATH_LBL_SETTINGS = "//android.widget.TextView[@text='Settings']";
	public static String XPATH_LBL_HISTORY = "//android.widget.TextView[@text='History']";
	
	//NewSliderUiElement
	public static String XPATH_LBL_BROWSE1="//android.widget.RelativeLayout[1]";
	public static String XPATH_LBL_MYSHOWS1 = "//android.widget.RelativeLayout[2]";
	public static String XPATH_LBL_SETTINGS1 = "//android.widget.RelativeLayout[3]";
	public static String XPATH_LBL_HISTORY1 = "//android.widget.RelativeLayout[4]";
		
	
	//WELCOME SCREEN
	//public static String ID_LOGO_WATCHABLE = "com.comcast.watchablephone:id/ImageViewlogo";
	//public static String ID_BTN_SIGNUP = "com.comcast.watchablephone:id/Button_signup";
	//public String ID_BTN_LOGIN = "com.comcast.watchablephone:id/Button_login";
	public static String ID_BTN_SIGNUP = "com.comcast.watchablephone:id/Button_signup";
	public String ID_BTN_LOGIN = "com.comcast.watchablephone:id/Button_login";
	
	public static String ID_BTN_TRYWITHOUTANACCOUNT="com.comcast.watchablephone:id/TextView_trywithoutanaccount";
	public static String ID_LBL_WATCHABLE="com.comcast.watchablephone:id/ImageViewlogo";
	public static String ID_LBL_VIDEOWITHOUTLIMITS="com.comcast.watchablephone:id/fragment_placeholder";
	
	//SIGN UP SCREEN
	public static String ID_LBL_SIGNUP = "com.comcast.watchablephone:id/sign_up";
	public static String ID_ICN_BACK = "com.comcast.watchablephone:id/back_icon";
	public static String ID_LNK_DONE = "com.comcast.watchablephone:id/done_text";
	public static String ID_TXTBX_USERNAME = "com.comcast.watchablephone:id/editText_username";
	public static String ID_TXTBX_EMAIL = "com.comcast.watchablephone:id/editText_email";
	public static String ID_TXTBX_PASSWORD = "com.comcast.watchablephone:id/editText_password";
	public static String ID_TXT_FOOTERMSG = "com.comcast.watchablephone:id/terms_text";
	public static String ID_ERR_USERNAME = "com.comcast.watchablephone:id/textView_usernameError";
	public static String ID_ERR_EMAIL = "com.comcast.watchablephone:id/textView_emailError";
	public static String ID_ERR_PASSWORD = "com.comcast.watchablephone:id/pass_error";
	public static String ID_CHK_USERNAME = "com.comcast.watchablephone:id/user_check";
	public static String ID_CHK_EMAIL = "com.comcast.watchablephone:id/textView_emailError";
	public static String ID_CHK_PASSWORD = "com.comcast.watchablephone:id/pass_check";
	//SIGN UP SCREEN 1
	public static String ID_TXT_USERNAME = "com.comcast.watchablephone:id/editText_username";
	public static String ID_BTN_SIGUP = "com.comcast.watchablephone:id/Button_signup";
	public static String ID_EMAIL = "com.comcast.watchablephone:id/editText_email";
	public static String ID_PASSWORD = "com.comcast.watchablephone:id/editText_password";
	public static String ID_USERNAME = "com.comcast.watchablephone:id/editText_username";
	public static String ID_ERR_PASSW = "com.comcast.watchablephone:id/textView_passwordError";
	public static String IDTXT_PRIVACYPOLICY="com.comcast.watchablephone:id/textView_privacypolicy";
	public static String IDTXT_SERVICEPOLICY="com.comcast.watchablephone:id/textView_termsofservice1";
	public static String ID_CHECK_BOX="com.comcast.watchablephone:id/checkBox_privacypolicy_termsandconditions";
	
	//LOGIN SCREEN
	public static String ID_LBL_WELCOMEBACK = "com.comcast.watchablephone:id/textView_heading";
//	public static String ID_LNK_LOGIN_INACTIVE = "com.comcast.watchablephone:id/done_text_inactive";
//	public static String ID_LNK_LOGIN_ACTIVE = "com.comcast.watchablephone:id/done_text";
	public static String ID_TXTBX_LGNUSERNAME = "com.comcast.watchablephone:id/editText_username_email";
	public static String ID_TXTBX_LGNPASSWORD = "com.comcast.watchablephone:id/editText_password";
	public static String ID_LNK_FORGOTPASSWORD = "com.comcast.watchablephone:id/textView_forgot_pass";
	public static String ID_LBL_LOGIN_ERROR = "com.comcast.watchablephone:id/textView_errortext";
	public static String ID_BTN_LOGINPAGE="com.comcast.watchablephone:id/Button_login";
	
	//FORGOT PASSWORD
	public static String XPATH_LBL_FORGOTPASSWORD = "com.comcast.watchablephone:id/textView_heading";
	//public static String ID_DESC_FORGOTPASSWORD = "com.comcast.watchablephone:id/enter_email_text";
	public static String ID_TXTBX_USERNAMEEMAIL = "com.comcast.watchablephone:id/editText_username_email";
	public static String ID_BTN_SENDPASSWORD = "com.comcast.watchablephone:id/Button_forgotpassword";
	public static String ID_LNK_CANCEL="com.comcast.watchablephone:id/textViewError_cancel";
	public static String ID_ERR_FRGTPWDACCNOTFOUND="com.comcast.watchablephone:id/textView_errortext";
	public static String ID_ERR_CLOSEERROR="com.comcast.watchablephone:id/RelativeLayout_closeerrorLayout";
	public static String ID_ERRTXT_FORGOTPWDNOTFOUND="com.comcast.watchablephone:id/textView_errortext";
	
	public static String ID_BTN_CLOSERLAYOUT="com.comcast.watchablephone:id/RelativeLayout_closeerrorLayout";
	
	//CONFIRM FORGOT PASSWORD
/*	public static String ID_TXT_CONFIRMMAIL = "com.comcast.watchablephone:id/forgot_pass_text";
	public static String ID_TXT_CONFIRMMAILDESC = "com.comcast.watchablephone:id/enter_email_text";
	public static String ID_BTN_FRGTPWDLOGIN = "com.comcast.watchablephone:id/login_text";
	public static String ID_ERR_FRGTPWDACCNOTFOUND = "com.comcast.watchablephone:id/user_error";  */
	
	public static String ID_BTN_CONFIRMMAIL="com.comcast.watchablephone:id/Button_okcheck";
	public static String ID_TXT_CHECK_YOUR_EMAIL="com.comcast.watchablephone:id/textView_checkyouremail";
	public static String ID_TXT_INSTRUCTIONmSG="com.comcast.watchablephone:id/textView_sendinstructions";
	public static String ID_TXT_SHOWPASSWORDCONFIRMATION="com.comcast.watchablephone:id/textView_yourpasswordtomail";
	
	//forgotpassword error
	public static String ID_LBL_FORGOT_ERROR="com.comcast.watchablephone:id/textView_errortext";
	
	//SLIDER
	public static String ID_MENU_SLIDER = "com.comcast.watchablephone:id/title";
	
	
	//PLAYLIST
	public static String ID_LBL_PLAYLIST = "com.comcast.watchablephone:id/TextView_heading";
	public static String ID_POPUP_ICON = "com.comcast.watchablephone:id/imageView";
	public static String ID_POPUP_CONFIRMEMAIL = "com.comcast.watchablephone:id/email_popup";
	//public static String ID_POPUP_VIEWMORE = "com.comcast.watchablephone:id/imageView2";
	
	public static String ID_IMG_THUMBNAIL = "com.comcast.watchablephone:id/imageView_thumbnail_gradient";
	
	public static String ID_LBL_GENRETXT = "com.comcast.watchablephone:id/genre_text";
	public static String ID_LBL_PLAYLISTTITLE = "com.comcast.watchablephone:id/TextView_showTitle";
	public static String ID_LBL_PLAYLISTDESC = "com.comcast.watchablephone:id/TextView_showDesc";
	
	public static String ID_BTN_VIEWMORE = "com.comcast.watchablephone:id/view_more_text";
	
	//PLAYLIST DETAILS
	public static String ID_ICN_PLAY_PLAYLISTDETAIL = "com.comcast.watchablephone:id/ImageView_playIconId";
	public static String ID_LBL_GENRE_PLAYLISTDETAIL = "com.comcast.watchablephone:id/TextView_genreTextId";
	public static String ID_LBL_PLAYLISTNAME_PLAYLISTDETAIL = "com.comcast.watchablephone:id/TextView_playListItemTitleId";
	public static String ID_LBL_PLAYLISTDESC_PLAYLISTDETAIL = "com.comcast.watchablephone:id/TextView_playListItemDescId";
	public static String ID_LBL_PLAYLISTDURATION_PLAYLISTDETAIL = "com.comcast.watchablephone:id/TextView_playListNoId";
	public static String ID_LBL_PLAYLISTTHUMBNAIL_PLAYLISTDETAIL = "com.comcast.watchablephone:id/RelativeLayout_playListDetailsCenterId";
	public static String ID_ICN_SHARE_PLAYLISTDETAIL = "com.comcast.watchablephone:id/ImageView_playListTopShareId";														
	public static String ID_ICN_BACK_PLAYLISTDETAIL = "com.comcast.watchablephone:id/BackButton_playListBackIconId";
	
	public static String ID_IMG_SHOWLOGONAME = "com.comcast.watchablephone:id/ImageView_playListPublisherLogoId";
	public static String ID_ICN_FOLLOW = "com.comcast.watchablephone:id/ImageView_playListFollowIconId";
	public static String ID_LNK_FOLLOW = "com.comcast.watchablephone:id/TextView_playListFollowTextId";
	public static String ID_TXT_EPISODEDESC = "com.comcast.watchablephone:id/TextView_playListTitleId";											   	
	public static String ID_IMG_EPISODE = "com.comcast.watchablephone:id/ImageView_playListImageId";
	

	
	//PLAYER INLINE
	public static String ID_INLINEPLAYER = "com.comcast.watchablephone:id/commonVideoViewParentId";
	public static String ID_STATUSBAR = "com.comcast.watchablephone:id/RelativeLayout_playListDetailsTopId";
	public static String ID_TXT_VIDEODURATION = "com.comcast.watchablephone:id/TextView_duration";
	public static String ID_CTLR_INLINESEEKBAR = "com.comcast.watchablephone:id/seek_bar";
	public static String ID_TXT_INLINESTARTTIME = "com.comcast.watchablephone:id/current_time";
	public static String ID_TXT_INLINEENDTIME = "com.comcast.watchablephone:id/end_time";
	public static String ID_ICN_PLAYERINFO = "com.comcast.watchablephone:id/ImageView_playListInfoIconId";
	public static String ID_ICN_PLAYERFULLSCREEN = "com.comcast.watchablephone:id/ImageView_fullScreenId";
	public static String ID_ICN_PLAYERSHARE ="com.comcast.watchablephone:id/ImageView_topShareId";
	public static String ID_ICN_PLAYERPLAY ="com.comcast.watchablephone:id/play";
	public static String ID_ICN_PLAYERREWIND ="com.comcast.watchablephone:id/rewind";
	
	//PLAYER PORTRAIT
	public static String ID_ICN_PORTRAITPLAYCLOSE = "com.comcast.watchablephone:id/ImageView_playListInfoIconId";
	public static String ID_TXT_PORTRAITSTARTTIME = "android:id/time_current";
	public static String ID_TXT_PORTRAITENDTIME = "android:id/time";
	public static String ID_TXT_PORTRAITDESCTITLE = "com.comcast.watchablephone:id/TextView_commonVideoDescHeaderId";
	
	//GENRE
	public static String ID_ICN_SEARCH = "com.comcast.watchablephone:id/action_search";
	public static String ID_TXT_GENRES = "com.comcast.watchablephone:id/genre_text";
	public static String ID_IMG_GENRES = "com.comcast.watchablephone:id/genre_image";
	public static String XPATH_TXT_GENRES = "//android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout/android.widget.TextView";
	public static String ID_TXTBX_SEARCH = "com.comcast.watchablephone:id/search_src_text";
	public static String ID_ICN_SEARCHSCRN = "com.comcast.watchablephone:id/search_mag_icon";
	
	
	//GENRE DETAILS
	public static String ID_TXT_GENRETITLE = "com.comcast.watchablephone:id/genre_main_title";
	public static String ID_TXT_GENREDETAILIMG = "com.comcast.watchablephone:id/genre_main_img";
	public static String ID_TXT_GENRESHOWIMG = "com.comcast.watchablephone:id/genre_details_list_img";
	public static String ID_TXT_GENRESHOWNAME = "com.comcast.watchablephone:id/TextViewTitle";
	public static String ID_TXT_GENRESHOWDESC = "com.comcast.watchablephone:id/TextViewDescp";
	public static String ID_ICN_GENRESHOWFOLLOW = "com.comcast.watchablephone:id/follow_img";
	public static String ID_TXT_GENRESHOWFOLLOW = "com.comcast.watchablephone:id/follow_text";
	public static String ID_TXT_GENRETITLESTATUSBAR = "com.comcast.watchablephone:id/browse_text";
	
	
	//MY SHOWS
/*	public static String ID_ICN_SETTINGS = "com.comcast.watchablephone:id/settings_icon";
	public static String ID_LBL_MYSHOWS = "com.comcast.watchablephone:id/browse_text";
	public static String ID_ICN_HISTORY = "com.comcast.watchablephone:id/history_icon";*/
	public static String ID_IMG_SUBSCRIBEDSHOW = "com.comcast.watchablephone:id/my_shows_list_img";
	public static String ID_IMG_SUBSCRIBEDSHOWPLAY = "com.comcast.watchablephone:id/play_icon";
	public static String ID_IMG_SUBSCRIBEDSHOWNAME = "com.comcast.watchablephone:id/TextViewTitle";
	public static String ID_IMG_SUBSCRIBEDSHOWDESC = "com.comcast.watchablephone:id/TextViewDescp";
	
	//SHOW DETAILS
	public static String ID_IMG_SHOWLOGO = "com.comcast.watchablephone:id/ImageView_playListItemTitleIconId";
	public static String ID_STATUSBAR_SHOWNAME = "com.comcast.watchablephone:id/TextView_myShowsTitleId";
	public static String ID_TXT_NOVIDEOSUBSCRIBED = "com.comcast.watchablephone:id/noShows";
	public static String ID_ICN_BACK_SHOWDETAIL="com.comcast.watchablephone:id/BackButton_myShowsBackIconId";
	public static String ID_ICN_FOLLOW_SHOWDETAIL = "com.comcast.watchablephone:id/ImageView_myShowsTopSubscribeId";
	public static String ID_COVERIMGIMAGE_SHOWDETAIL="com.comcast.watchablephone:id/layout_header_image";
	public static String ID_TXT_GENRENAME="com.comcast.watchablephone:id/TextView_genreTextId";
	
	public static String ID_TXT_SHOWDESC="com.comcast.watchablephone:id/TextView_playListItemDescId";
	public static String ID_TXT_MORElINK="com.comcast.watchablephone:id/TextView_playListMoreTextId";
	public static String ID_ICN_SHOWFOLLOWED="com.comcast.watchablephone:id/ImageView_myShowsTopSubscribeId";
	public static String ID_LBL_PLAYLISTTHUMBNAIL_SHOWDETAIL="com.comcast.watchablephone:id/RelativeLayout_playListDetailsCenterId";
	public static String ID_INLINEPLAYER_SHOWDETAIL="com.comcast.watchablephone:id/RelativeLayout_playListImageParrentId";
	public static String ID_TXT_SHOWTITLE="com.comcast.watchablephone:id/TextView_myShowsTitleId";
	
	//GenreToShowDetail
	public static String ID_ICN_FOLLOW_GENRESHOWDETAIL="com.comcast.watchablephone:id/ImageView_playListTopFollowId";
	public static String ID_TXT_SHOWTITLEGENRE="com.comcast.watchablephone:id/TextView_playListTitleId";
	public static String ID_ICN_SHOWFOLLOWEDGENRE="com.comcast.watchablephone:id/ImageView_playListTopFollowId";
	public static String ID_ICN_SHOWFOLLOWGENRE="com.comcast.watchablephone:id/ImageView_playListTopFollowId";
	
	//SETTINGS 
	//VIEW MORE TOAST
	public static String ID_ICN_STNGBACK = "com.comcast.watchablephone:id/textView_cancel";
	public static String ID_ICN_STNGEMAIL = "com.comcast.watchablephone:id/EditText_emaildata";//change
	public static String ID_ICN_STNGSAVE = "com.comcast.watchablephone:id/textView_save";
	
	public static String ID_TXT_STNGMSG = "com.comcast.watchablephone:id/textView_confirmemail";
	public static String ID_BTN_RSNDCONF = "com.comcast.watchablephone:id/Button_resendconfirmation";
	public static String ID_POPUP_CONFMSG = "com.comcast.watchablephone:id/password_confirm_msg";
	public static String ID_BTN_CONFOK = "com.comcast.watchablephone:id/text_ok";//change
	public static String ID_LBL_USERNAME="com.comcast.watchablephone:id/textView_heading";
	public static String ID_LBL_EMAIL="com.comcast.watchablephone:id/textView_heading";
	
	
	
	//Settings Menu
	public static String XPATH_LBL_SETTNG="//android.widget.TextView[@TEXT='Settings']";
	public static String ID_TXT_ACCOUNT="com.comcast.watchablephone:id/textView_account";
	public static String ID_TXT_SUPPORT="com.comcast.watchablephone:id/textView_support";
	public static String ID_BTN_LOGOUT="com.comcast.watchablephone:id/button_signout";
	//ACCOUNT
	public static String ID_TXT_USERNAMESTNG="com.comcast.watchablephone:id/textView_username";
	public static String ID_TXT_USERVALUE="com.comcast.watchablephone:id/textView_usernamevalue";
	public static String ID_TXT_EMAILSTNG="com.comcast.watchablephone:id/textView_email";
	public static String ID_TXT_EMAILVALUE="com.comcast.watchablephone:id/textView_emailvalue";
	public static String ID_TXT_CHANGEPWD="com.comcast.watchablephone:id/textView_changepassword";
	public static String ID_ICN_RIGHTARROW="com.comcast.watchablephone:id/ImageView_username_rightarrow";
	//SUPPORT
	public static String ID_TXT_TERMSOFSERVICE="com.comcast.watchablephone:id/textView_termsofservice";
	public static String ID_TXT_PRIVACYPOLICY="com.comcast.watchablephone:id/textView_privacypolicy";
	public static String ID_TXT_FEEDBACK="com.comcast.watchablephone:id/textView_feedback";
	public static String ID_TXT_ADCHOICES="com.comcast.watchablephone:id/textView_adchoices";
	public static String ID_TXT_VERSION="com.comcast.watchablephone:id/textView_version";
	public static String ID_TXT_VERSIONNUMBER="com.comcast.watchablephone:id/textView_versionnumber";
	public static String ID_TXT_COPYRIGHTS="com.comcast.watchablephone:id/textView_copyrights";
	
	//UserNameField
	public static String ID_ICN_BACKICNUSERNAME="com.comcast.watchablephone:id/backButton_cancel";
	public static String ID_TXT_USERNAMEHEADING="com.comcast.watchablephone:id/textView_heading";
	public static String ID_TXT_USERNAMEDATA="com.comcast.watchablephone:id/EditText_usernamedata";
	public static String ID_ICN_SAVE="com.comcast.watchablephone:id/textView_save";
	
	//EMAILfIELD
	public static String ID_TXTBX_EmailData = "com.comcast.watchablephone:id/EditText_emaildata";
	
	//passwordfield
	public static String ID_TXT_CHANGEPASSWORD="com.comcast.watchablephone:id/textView_changepassword";
	public static String ID_TXT_OLDPASSWORD="com.comcast.watchablephone:id/EditText_oldpassword";
	public static String ID_TXT_NEWPASSWORD="com.comcast.watchablephone:id/EditText_newpassword";
	public static String ID_TXT_CONFIRMNEWPASSWORD="com.comcast.watchablephone:id/EditText_confirmpassword";
	
	public static String ID_TXT_PASSWORDCONFIRMMSG="com.comcast.watchablephone:id/password_confirm_msg";
	public static String ID_BTN_OKBTN="com.comcast.watchablephone:id/text_ok";
	
    
	//LogoutSettingScreen
	public static String ID_TXT_LOGOUTCONFIRMMSG="com.comcast.watchablephone:id/logout_confirm_msg";
	public static String ID_TXT_LOGOUTYES="com.comcast.watchablephone:id/text_yes";
	public static String ID_TXT_LOGOUTNO="com.comcast.watchablephone:id/text_no";
	
	
	
	
	
	//SHARE
	public static String ID_ICN_SHARE = "android:id/text1";
	public static String ID_TXT_EMAILID = "com.google.android.gm:id/to";
	public static String ID_ICN_EMAILSEND = "com.google.android.gm:id/send";
	
	//SEARCH
	public static String ID_SEARCHRESULTS = "com.comcast.watchablephone:id/search_videos_layout";
	public static String XPATH_SHOWS_SEARCHSECTION = "//android.widget.TextView[@text='SHOWS']";
	public static String XPATH_VIDEOS_SEARCHSECTION = "//android.widget.TextView[@text='VIDEOS']";
	public static String ID_NOSEARCHFOUND = "com.comcast.watchablephone:id/no_result";
	public static String ID_SHOW_NAME_RESULT = "com.comcast.watchablephone:id/search_show_text";
	public static String ID_VIDEO_SHOWNAME_RESULT = "com.comcast.watchablephone:id/search_video_text";
	public static String ID_VIDEO_DESCRESULT = "com.comcast.watchablephone:id/search_item_desc_text";
	public static String ID_LNK_SEARCH_CANCEL = "com.comcast.watchablephone:id/cancelText";
	public static String ID_LNK_SEARCH_CLEAR = "com.comcast.watchablephone:id/search_close_btn";
	public static String ID_VIDEO_IMGRESULT = "com.comcast.watchablephone:id/search_item_img";
	
	//PROVIDER
	public static String ID_LBL_PROVIDERNAME = "com.comcast.watchablephone:id/publisher_title";
	public static String ID_IMG_SHOW = "com.comcast.watchablephone:id/pub_channel_img";
	public static String ID_TITLE_SHOWNAME = "com.comcast.watchablephone:id/channel_title";
	public static String ID_SHOWDESC = "com.comcast.watchablephone:id/channel_description";	
	public static String ID_PROVIDER_SHOWLOGO = "com.comcast.watchablephone:id/layout_header_image";
	
	//public static String ID_PROVIDER_SHOWLOGO = "com.comcast.watchablephone:id/playListCoverArt";

//GUESTUSER
	
	
	public static String ID_TXT_WATCHABLEDESCRIPTION="com.comcast.watchablephone:id/textView_watchableoverlayText";
	public static String ID_TXT_DISCOVER="com.comcast.watchablephone:id/textViewdiscover";
	public static String ID_ICN_DISCOVER="com.comcast.watchablephone:id/imageViewdiscover";
	public static String ID_TXT_DISCOVERDESC="com.comcast.watchablephone:id/textViewdiscoveroverlaytext";
	public static String ID_TXT_BROWSERSHOWS="com.comcast.watchablephone:id/textViewbrowseshows";
	public static String ID_ICN_BROWSERSHOWS="com.comcast.watchablephone:id/imageViewbrowseshows";
	public static String ID_TXT_BROWSERSHOWSDESC="com.comcast.watchablephone:id/textViewbrowseshowsoverlaytext";
	public static String ID_TXT_PERSONALIZE="com.comcast.watchablephone:id/textViewpersonalize";
	public static String ID_ICN_PERSONALIZE="com.comcast.watchablephone:id/imageViewpersonalize";
	public static String ID_TXT_PERSONALIZEDESC="com.comcast.watchablephone:id/textViewpersonalizeoverlaytext";
	public static String ID_BTN_DIVEIN="com.comcast.watchablephone:id/TextViewdivein";
	
	
	
	//SignUpOverlayForGuestUser
	public static String ID_TXT_WELCOME="com.comcast.watchablephone:id/textView_watchablewelcometext";
	public static String ID_TXT_SIGNUPINFO="com.comcast.watchablephone:id/textView_signuptext";
	public static String ID_BTN_SIGNUPOVERLAY="com.comcast.watchablephone:id/TextViewsign_up";
	public static String ID_BTN_LOGINACCOUNT="com.comcast.watchablephone:id/textview_logintoyouraccount";
	
	
	//Historypage
	public static String ID_BTN_BULKDELETE="com.comcast.watchablephone:id/action_delete";
	public static String ID_VOD_IMG="com.comcast.watchablephone:id/viewHist_item_img";
	public static String SH_LOGO="com.comcast.watchablephone:id/view_hist_item_logo";
	public static String VOD_DESC="com.comcast.watchablephone:id/view_hist_item_desc_text";
	public static String CLEARTEXT="com.comcast.watchablephone:id/clearAllText";
	public static String ID_SINGLE_DELETE="com.comcast.watchablephone:id/viewHist_delete_img";
	public static String ID_UNDO="com.comcast.watchablephone:id/txt_undo";
	public static String AD_ICON="com.comcast.watchablephone:id/adTextView";
	public static String AD_PROGRESS="com.comcast.watchablephone:id/adProgressLayout";
	public static String AD_SEEK_BAR="com.comcast.watchablephone:id/adSeekbar";
	public static String XPATH_MULTI_BUTTON ="//android.widget.ImageButton";
	public static String ID_NEXT_VIDE ="com.comcast.watchablephone:id/ImageView_playListImageId";
	
	
	//NoShowsFollow
	
	public static String ID_BTN_ShowsToFollow="com.comcast.watchablephone:id/Button_findshow";
	
	//ViewMore
	public static String ID_TXT_EMAILVIEWMORE="com.comcast.watchablephone:id/textView_heading";
	
	
}
