package comcast.pages;

import static comcast.util.PropertyFileReader.ObjRepoProp;
//import static comcast.util.PropertyFileReader.TextProp;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comcast.custom.CustomFun;
//import comcast.uiFunctions.GUIFunctions;
import comcast.uiFunctions.GUIFunctions;

public class WatchPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	// Play lists Constructor
	public WatchPage(WebDriver driver) {

		this.driver = driver;

		// Check that we're on the right in Watch Page.

		if (!(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("watchPageType_XPATH")),
				driver))) {

			throw new IllegalStateException(
					"This is not the Web clint Watch page");
		}
	}

	By watchTodaysPlaylistsButton = By.xpath(ObjRepoProp
			.getProperty("watchPageWatchTodaysPlaylistsButton_XPATH"));
	By headerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("watchPageHeaderWatchableLogo_XPATH"));
	By footerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("homePageFooterWatchableLogo_XPATH"));
	By footerHomeLink = By.xpath(ObjRepoProp
			.getProperty("homePageFooterHomeLink_XPATH"));
	By logoutMenu = By.xpath(ObjRepoProp.getProperty("logoutMenu_XPATH"));
	By firstShowLogo = By.xpath(ObjRepoProp
			.getProperty("watchPageFirstShowLogo_XPATH"));
	By videoShowTitle = By.xpath(ObjRepoProp
			.getProperty("watchPageVideoShowTitle_XPATH"));
	By videoScrollDown = By.xpath(ObjRepoProp
			.getProperty("watchPageUpNextVideoSectionScrollDown_XPATH"));
	By vidoControlerPauseIcon = By.xpath(ObjRepoProp
			.getProperty("vidoControlerPauseIcon_XPATH"));
	By videoOverlayShowImg = By.xpath(ObjRepoProp
			.getProperty("watchPageVideoOverlayShowImg_XPATH"));
	By videoPlayer = By.id(ObjRepoProp.getProperty("videoPlayer_ID"));
	By vidoControlerPlayIcon = By.xpath(ObjRepoProp
			.getProperty("vidoControlerPlayIcon_XPATH"));
	By vidoControlerFullScreeIcon = By.xpath(ObjRepoProp
			.getProperty("vidoControlerFullScreeIcon_XPATH"));
	By vidoControlerSmallScreeIcon = By.xpath(ObjRepoProp
			.getProperty("vidoControlerSmallScreeIcon_XPATH"));
	By moreInfoIcon = By
			.xpath(ObjRepoProp
					.getProperty("watchPageUpNextVidoSectionShowPlaylistMoreInfoIcon_XPATH"));
	By drawerHandleIcon = By.id(ObjRepoProp
			.getProperty("watchPageUpNextVideoSectionDrawerHandle_ID"));
	By videoDescriptionExpandIcon = By.xpath(ObjRepoProp
			.getProperty("watchPageVideoDescriptionExpandIcon_XPATH"));
	By followButton = By.xpath(ObjRepoProp
			.getProperty("watchPageFollowButton_XPATH"));
	By hamburgerMenuIcon = By.xpath(ObjRepoProp
			.getProperty("hamburgerMenuIcon_XPATH"));
	By myShowsTitle = By.xpath(ObjRepoProp
			.getProperty("homePageHamburgerMenuMyShowsTitle_XPATH"));
	By videoMetadadaFollowButton = By.xpath(ObjRepoProp
			.getProperty("watchPageFollowButton_XPATH"));
	By videoOverlayFollowButton = By.xpath(ObjRepoProp
			.getProperty("watchPageVideoOverlayFollowButton_XPATH"));
	By shareButton = By.xpath(ObjRepoProp
			.getProperty("watchPageShareButton_XPATH"));
	By emailIcon = By.xpath(ObjRepoProp
			.getProperty("socialSharingPopupEmailIcon_XPATH"));
	By twitterIcon = By.xpath(ObjRepoProp
			.getProperty("socialSharingPopupTwitterIcon_XPATH"));
	By faceBookIcon = By.xpath(ObjRepoProp
			.getProperty("socialSharingPopupFacebookIcon_XPATH"));
	By upNextVidoSectionVideoCount = By.xpath(ObjRepoProp
			.getProperty("watchPageUpNextVidoSectionVideoCount_XPATH"));
	By watchPageEmailIcon = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailIcon_XPATH"));
	By playlistPopUpCloseButton = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailPlaylistPopUpCloseButton_XPATH"));
	By videoPopUpCloseButton = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailVideoPopUpCloseButton_XPATH"));
	By playlistPopUpSendButton = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailPlaylistPopUpSendButton_XPATH"));
	By videoPopUpSendButton = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailVideoPopUpSendButton_XPATH"));
	By emailPlaylistPopUpToEmail = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailPlaylistPopUpToEmail_XPATH"));
	By emailVideoPopUpToEmail = By.xpath(ObjRepoProp
			.getProperty("watchPageEmailVideoPopUpToEmail_XPATH"));
	By watchPageFacebookIcon = By.xpath(ObjRepoProp
			.getProperty("watchPageFacebookIcon_XPATH"));
	By watchPageTwitterIcon = By.xpath(ObjRepoProp
			.getProperty("watchPageTwitterIcon_XPATH"));

	/*
	 * *************************************************************************
	 * 
	 * Watch Page Functions 
	 * 
	 * *************************************************************************
	 */

	/**
	 * This function clicks on Watch Todays Playlists button
	 * 
	 * @return: PlaylistPage object
	 */
	public PlaylistPage clickOnWatchTodaysPlaylistButton() throws Exception {

		// Click on WatchTodays Playlists button
		GUIFunctions.clickElement(driver, watchTodaysPlaylistsButton,
				"Watch Todays Playlists Button");
		Thread.sleep(5000);

		return new PlaylistPage(driver);

	}

	/**
	 * This function click on top watchable logo
	 * 
	 * @return: HomePage object
	 */
	public HomePage clickOnHeaderWatchableLogo() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		// Click on top watchable logo
		Thread.sleep(3000);
		GUIFunctions.clickElement(driver, headerWatchableLogo,
				"Header Watchable Logo");

		Thread.sleep(5000);
		return new HomePage(driver);

	}

	/**
	 * This function clicks on bottom watchable logo
	 * 
	 * @return: Home Page object
	 */
	public HomePage clickOnBottomWatchableLogo() throws Exception {

		// Click on bottom watchable logo
		for (int i = 1; i <= 5; i++) {
			CustomFun
					.mouseOverElement(
							driver,
							driver.findElement(By.xpath(ObjRepoProp
									.getProperty("homePageFooterWatchableLogo_XPATH"))));
		}
		Thread.sleep(3000);

		// Click on bottom watchable logo
		GUIFunctions.clickElement(driver, footerWatchableLogo,
				"Footer Watchable Logo");
		Thread.sleep(5000);

		return new HomePage(driver);

	}

	/**
	 * This function clicks on footer home link
	 * 
	 * @return: Home Page object
	 */
	public HomePage clickOnFooterHomeLink() throws Exception {

		// Click on bottom watchable logo
		for (int i = 1; i <= 5; i++) {
			CustomFun.mouseOverElement(driver, driver.findElement(By
					.xpath(ObjRepoProp
							.getProperty("homePageFooterHomeLink_XPATH"))));
		}
		Thread.sleep(3000);

		// Click on Footer home link
		GUIFunctions.clickElement(driver, footerHomeLink, "Foter Home Link");
		Thread.sleep(5000);

		return new HomePage(driver);

	}

	/**
	 * This function clicks on logout
	 * 
	 * @return: HomePage object
	 */
	public HomePage clickOnLogoutMenu() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		// Click on logout

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("watchPageDownArrow_XPATH"))));
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("watchPageDownArrow_XPATH"))));

		GUIFunctions.mouseOverElementAndClick(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("watchPageDownArrow_XPATH"))),
				"Down Arrow");
		Thread.sleep(2500);

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By.xpath(ObjRepoProp
						.getProperty("logoutMenu_XPATH"))));

		GUIFunctions.clickElement(driver, logoutMenu, "Logout");
		Thread.sleep(5000);

		return new HomePage(driver);

	}

	/**
	 * This function clicks on First show image from get to know the show
	 * section
	 * 
	 * @return: showPage object
	 */
	public ShowPage clickOnFirstShowLogo() throws Exception {

		GUIFunctions.clickElement(driver, firstShowLogo, "First Show Logo");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}

	/**
	 * This function clicks on First show image from video metadata section *
	 * 
	 * @return: showPage object
	 */
	public ShowPage clickOnShowTitle() throws Exception {

		GUIFunctions.clickElement(driver, videoShowTitle, "Video Show Title");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}

	/**
	 * This function used to scroll down under up-next video section
	 */
	public WatchPage scrollDownInUpNextVideoSection() throws Exception {

		GUIFunctions.clickElement(driver, videoScrollDown, "Scroll Down Bar");

		Thread.sleep(5000);
		for (int i = 0; i < 10; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2500);
		}

		return new WatchPage(driver);
	}

	/**
	 * This function clicks on pause button from video controls *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnPauseButton() throws Exception {

		GUIFunctions.clickElement(driver, vidoControlerPauseIcon, "Pause Icon");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on play button from video controls *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnPlayButton() throws Exception {

		GUIFunctions.clickElement(driver, vidoControlerPlayIcon, "Play Icon");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on show logo fm video overlay *
	 * 
	 * @return: WatchPage object
	 */
	public ShowPage clickOnShowLogoFromVideoOverlay() throws Exception {

		GUIFunctions.clickElement(driver, videoOverlayShowImg, "Show Logo");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}

	/**
	 * This function clicks on maximise button from video controller *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnMaximiseButtonFromVideoCntroler() throws Exception {

		GUIFunctions.clickElement(driver, vidoControlerFullScreeIcon,
				"Full Scree Icon");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on mimimise button from video controller *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnMimimiseButtonFromVideoCntroler() throws Exception {

		GUIFunctions.clickElement(driver, vidoControlerSmallScreeIcon,
				"Small Screen Icon");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on video player *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnVideoPlayer() throws Exception {

		GUIFunctions.clickElement(driver, videoPlayer, "Video Player");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on More info icon from up-next section from watch
	 * page *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnMoreInfoIcon() throws Exception {

		// clicks on More info icon
		GUIFunctions.clickElement(driver, moreInfoIcon, "More Info Icon");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on handle icon from up-next video drawer section. *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnHandleIcon() throws Exception {

		// Click on handle icon.
		GUIFunctions.clickElement(driver, drawerHandleIcon, "Handle Icon");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on expand icon of description. *
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnVideoDescriptionExpandIcon() throws Exception {

		// Mouse hover on Video description icon
		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageVideoDescriptionExpandIcon_XPATH"))));

		Thread.sleep(1000);

		// click on description expand icon
		GUIFunctions.clickElement(driver, videoDescriptionExpandIcon,
				"vide decription expan icon");

		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function click on Follow button.
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFollowButton() throws Exception {

		// Mouse hover on Video description icon
		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("watchPageFollowButton_XPATH"))));

		Thread.sleep(1000);

		// click on description expand icon
		GUIFunctions.clickElement(driver, followButton, "Follow Button");

		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function click on hamburger menu
	 * 
	 * @return: Home Page object
	 */
	public WatchPage clickOnHamburgerMenu() throws Exception {

		// Click on hamburger menu
		GUIFunctions.clickElement(driver, hamburgerMenuIcon, "Hamburger Menu");

		Thread.sleep(2500);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on my shows menu
	 * 
	 * @return: MyShowsPage object
	 */
	public MyShowsPage clickOnMyShowsMenu() throws Exception {

		// Click on my shows menu

		GUIFunctions.clickElement(driver, myShowsTitle, "My Shows Menu");
		Thread.sleep(5000);

		return new MyShowsPage(driver);

	}

	/**
	 * This function click on Follow button from video metadata section
	 * 
	 * @return: ShowPage object
	 */
	public WatchPage clickOnVideoMetadataFollowButton() throws Exception {

		// Click on Follow button
		GUIFunctions.clickElement(driver, videoMetadadaFollowButton,
				"Follow Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function click on Follow button from video overlay
	 * 
	 * @return: ShowPage object
	 */
	public WatchPage clickOnVideoOverlayFollowButton() throws Exception {

		// Click on Follow button
		GUIFunctions.clickElement(driver, videoOverlayFollowButton,
				"Follow Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function mouse hover and click on upnext video section
	 * 
	 * @return
	 * @throws Exception
	 */

	public WatchPage mouseOverOnUpNextVideoSection() throws Exception {
		GUIFunctions.mouseOverElementAndClick(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("watchPageUpNextVidoSection_XPATH"))),
				"Mouse Over On UpNext Video Section");
		Thread.sleep(25000);
		return new WatchPage(driver);
	}

	/**
	 * This function Click on share button
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnShareButton() throws Exception {

		// Click on share button
		GUIFunctions.clickElement(driver, shareButton, "Share Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function Click on email icon from social sharing pop up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnEmailIcon() throws Exception {

		// Click on email icon
		GUIFunctions.clickElement(driver, emailIcon, "Email Icom");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function Click on email icon from video metadata section
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnVideoMetadataEmailIcon() throws Exception {

		// Click on email icon
		GUIFunctions.clickElement(driver, watchPageEmailIcon, "Email Icom");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function Click on close button from playlists/show sharing pop-up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnCloseButtonFromPlaylistSharingPopup()
			throws Exception {

		// Click on close button
		GUIFunctions.clickElement(driver, playlistPopUpCloseButton,
				"Close Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function Click on close button from Video sharing pop-up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnCloseButtonFromzVideoSharingPopup()
			throws Exception {

		// Click on close button
		GUIFunctions
				.clickElement(driver, videoPopUpCloseButton, "Close Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function used to scroll down under up-next video section onmly once
	 */
	public WatchPage singleScrollDownInUpNextVideoSection() throws Exception {

		GUIFunctions.clickElement(driver, upNextVidoSectionVideoCount,
				"Video Count");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		return new WatchPage(driver);
	}

	/**
	 * This function Click on Send button from playlists/show sharing pop-up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnPlaylistShowSharingSendButton() throws Exception {

		// Click on send button
		GUIFunctions.clickElement(driver, playlistPopUpSendButton,
				"Send Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function Click on twitter icon from social sharing pop up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnTwitterIcon() throws Exception {

		// Click on email icon
		GUIFunctions.clickElement(driver, twitterIcon, "Twitter Icon");

		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function Click on Facebook icon from social sharing pop up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFaceBookIcon() throws Exception {

		// Click on Facebook icon
		GUIFunctions.clickElement(driver, faceBookIcon, "FaceBook Icon");

		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function Click on Facebook icon from watch page
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnWatchPageFaceBookIcon() throws Exception {

		// Click on Facebook icon
		GUIFunctions.clickElement(driver, watchPageFacebookIcon,
				"FaceBook Icon");

		Thread.sleep(5000);

		return new WatchPage(driver);

	}
	
	/**
	 * This function Click on Twitter icon from watch page
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnWatchPageTwitterIcon() throws Exception {

		// Click on Twitter icon
		GUIFunctions.clickElement(driver, watchPageTwitterIcon,
				"Twitter Icon");

		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function Click on Send button from video sharing pop-up
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnVideoSharingSendButton() throws Exception {

		// Click on send button
		GUIFunctions.clickElement(driver, videoPopUpSendButton, "Send Button");

		Thread.sleep(5000);
		return new WatchPage(driver);

	}

	/**
	 * This function enter to email address in playlist/show sharing pop-up
	 * 
	 * @return
	 * 
	 * @return: WatchPage object
	 */
	public void enterToEmailInPlaylistShowSharingPopup(String email)
			throws Exception {

		// Entering email
		GUIFunctions.typeTxtboxValue(driver, emailPlaylistPopUpToEmail, email);
		Thread.sleep(3000);

	}

	/**
	 * This function remove default message from message text area from
	 * playlist/show shaing popup
	 * 
	 * @return
	 * 
	 * @return: WatchPage object
	 */
	public void removeDefaultMessageFromPlaylistShowSharingPopup()
			throws Exception {

		// Remove default message
		driver.findElement(
				By.id(ObjRepoProp
						.getProperty("watchPageEmailPlaylistPopUpMessage_ID")))
				.clear();

		Thread.sleep(3000);

	}

	/**
	 * This function remove default message from message text area from video
	 * sharing popup
	 * 
	 * @return
	 * 
	 * @return: WatchPage object
	 */
	public void removeDefaultMessageFromVideoSharingPopup() throws Exception {

		// Remove default message
		driver.findElement(
				By.id(ObjRepoProp
						.getProperty("watchPageEmailVideoPopUpMessage_ID")))
				.clear();

		Thread.sleep(3000);

	}

	/**
	 * This function enter to email address in video sharing pop-up
	 * 
	 * @return
	 * 
	 * @return: WatchPage object
	 */
	public void enterToEmailInVideoSharingPopup(String email) throws Exception {

		// Entering email
		GUIFunctions.typeTxtboxValue(driver, emailVideoPopUpToEmail, email);
		Thread.sleep(5000);

	}

}
