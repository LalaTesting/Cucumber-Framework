package comcast.pages;

import static comcast.util.PropertyFileReader.ObjRepoProp;

//import static comcast.util.PropertyFileReader.TextProp;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comcast.custom.CustomFun;
import comcast.uiFunctions.GUIFunctions;


public class PlaylistPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	// Play lists Constructor
	public PlaylistPage(WebDriver driver) {
		
		this.driver = driver;
		
		// Check that we're on the right in Play lists Page.

		if (!(CustomFun
				.isElementPresent(
						By.xpath(ObjRepoProp.getProperty("playlistPageType_XPATH")),
						driver))) {

			throw new IllegalStateException("This is not the Web clint Play lists page");
		}
	}
	
	
	By headerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("showPageHeaderWatchableLogo_XPATH"));
	By footerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("homePageFooterWatchableLogo_XPATH"));
	By footerHomeLink = By.xpath(ObjRepoProp
			.getProperty("homePageFooterHomeLink_XPATH"));
	By logoutMenu = By.xpath(ObjRepoProp.getProperty("logoutMenu_XPATH"));
	By firstplayIcon = By.xpath(ObjRepoProp
			.getProperty("playlistsPageFirstPlaylistPlayIcon_XPATH"));
	By firstPlaylistName = By.xpath(ObjRepoProp
			.getProperty("playlistsPageFirstPlaylistName_XPATH"));
	By firstPlaylistGenreTitle = By.xpath(ObjRepoProp
			.getProperty("playlistsPageFirstPlaylistGenreTitle_XPATH"));
	By firstPlaylistDecription = By.xpath(ObjRepoProp
			.getProperty("playlistsPageFirstPlaylistDecription_XPATH"));
	By firstPlaylistLogo = By.xpath(ObjRepoProp
			.getProperty("playlistsPageFirstPlaylistLogo_XPATH"));


	/**
	 * This function click on top watchable logo
	 * 
	 * @return: HomePage object 
	 */
	public HomePage clickOnHeaderWatchableLogo() throws Exception {

		// Click on top watchable logo
		Thread.sleep(3000);
		GUIFunctions.clickElement(driver, headerWatchableLogo,
				"Header Watchable Logo");

		Thread.sleep(5000);
		return new HomePage(driver);

	}
	
	/**
	 * This function for scrolling upto footer section for palylist page
	 * @return playlist object
	 */

	public PlaylistPage scrollUpToFooterSection() throws Exception {
		
		// Scroll down in shows section
				for (int i = 1; i <= 10; i++) {
					CustomFun.mouseOverElement(driver, driver.findElement(By
							.xpath(ObjRepoProp
									.getProperty("playlistsPageFooterSection_XPATH"))));
					Thread.sleep(1000);
				}
				return new PlaylistPage(driver);
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
			CustomFun
					.mouseOverElement(
							driver,
							driver.findElement(By.xpath(ObjRepoProp
									.getProperty("homePageFooterHomeLink_XPATH"))));
		}
		Thread.sleep(3000);


		// Click on Footer home link
		GUIFunctions.clickElement(driver, footerHomeLink,
				"Foter Home Link");
		Thread.sleep(5000);

		return new HomePage(driver);

	}
	
	
	/**
	 * This function clicks on logout
	 * 
	 * @return: HomePage object
	 */
	public HomePage clickOnLogoutMenu() throws Exception {

		// Click on logout

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("showPageDownArrow_XPATH"))));
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("showPageDownArrow_XPATH"))));

		GUIFunctions.mouseOverElementAndClick(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("showPageDownArrow_XPATH"))),
				"Down Arrow");
		Thread.sleep(3000);

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By.xpath(ObjRepoProp
						.getProperty("logoutMenu_XPATH"))));

		GUIFunctions.clickElement(driver, logoutMenu, "Logout");
		Thread.sleep(5000);

		return new HomePage(driver);

	}


	/**
	 * This function clicks on Play icon from first play-list all play-lists
	 * page.
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFirstPlaylistPlayIcon() throws Exception {

		// Mouse over the first playlist image
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("playlistsPageFirstPlaylistLogo_XPATH"))));
		Thread.sleep(2000);

		// Click on Play icon
		GUIFunctions.clickElement(driver, firstplayIcon, "Playlist Play Icon");
		Thread.sleep(25000);

		return new WatchPage(driver);

	}
	
	
	/**
	 * This function clicks on Play list name from first play-list all play-lists
	 * page. 
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFirstPlaylistName() throws Exception {

		// Click on Playlist name
		GUIFunctions.clickElement(driver, firstPlaylistName, "Playlist Name");
		Thread.sleep(25000);

		return new WatchPage(driver);

	}

	
	/**
	 * This function clicks on Play list genre title from first play-list all play-lists
	 * page. 
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFirstPlaylistGenreTitle() throws Exception {

		// Click on Playlist genre title
		GUIFunctions.clickElement(driver, firstPlaylistGenreTitle, "Playlist Genre");
		Thread.sleep(25000);

		return new WatchPage(driver);

	}
	
	
	/**
	 * This function clicks on Play list description from first play-list all play-lists
	 * page. 
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFirstPlaylistDescription() throws Exception {
				
		// Click on Playlist description
		GUIFunctions.clickElement(driver, firstPlaylistDecription, "Playlist Description");
		Thread.sleep(25000);

		return new WatchPage(driver);

	}
	
	/**
	 * This function clicks on Play list image from first play-list all play-lists
	 * page. 
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFirstPlaylistImage() throws Exception {
				
		// Click on Playlist image
		GUIFunctions.clickElement(driver, firstPlaylistLogo, "Playlist Image");
		Thread.sleep(25000);

		return new WatchPage(driver);

	}



}
