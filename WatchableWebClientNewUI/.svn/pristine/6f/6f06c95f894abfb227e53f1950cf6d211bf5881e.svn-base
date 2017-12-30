package comcast.pages;

import static comcast.util.PropertyFileReader.ObjRepoProp;



//import static comcast.util.PropertyFileReader.TextProp;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import comcast.custom.CustomFun;
//import comcast.uiFunctions.GUIFunctions;
import comcast.uiFunctions.GUIFunctions;

public class MyShowsPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	// Play lists Constructor
	public MyShowsPage(WebDriver driver) {

		this.driver = driver;

		// Check that we're on the right in my shows Page.

		if (!(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("myShowsPageType_XPATH")),
				driver))) {

			throw new IllegalStateException(
					"This is not the Web clint My Shows page");
		}
	}

	By headerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("showPageHeaderWatchableLogo_XPATH"));
	By footerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("homePageFooterWatchableLogo_XPATH"));
	By footerHomeLink = By.xpath(ObjRepoProp
			.getProperty("homePageFooterHomeLink_XPATH"));
	By firstVideoTitle = By
			.xpath(ObjRepoProp
					.getProperty("myShowsPageFirstVideoTitleOfFirstFollowedShows_XPATH"));
	By logoutMenu = By.xpath(ObjRepoProp.getProperty("logoutMenu_XPATH"));
	By hereLink = By.xpath(ObjRepoProp.getProperty("myShowsPageHereLink_XPATH"));
	By getToKnowTheShowSectionFirstShowImg = By
			.xpath(ObjRepoProp
					.getProperty("myShowsPageGetToKnowTheShowSectionFirstShowImg_XPATH"));
	By firstShowTitle = By
			.xpath(ObjRepoProp
					.getProperty("myShowsPageFirstShowTitle_XPATH"));
	By followedFirstVideoShowTitle = By
			.xpath(ObjRepoProp
					.getProperty("myShowsPageFollowedFirstVideoShowTitle_XPATH"));
	

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
	 * This function clicks on First video title
	 * 
	 * @return: Watch Page object
	 */

	public WatchPage clickOnFirstVideoTitle() throws Exception
	{
		//Click on first video title
		
		GUIFunctions.clickElement(driver, firstVideoTitle,
				"First Video Title");
		Thread.sleep(5000);
			
		return new WatchPage(driver);
		
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
	 * This function clicks on click on here link from My Shows page Where there
	 * is no followed shows to navigate to browse shows page
	 * 
	 * @return: browse shows object
	 */
	public BrowseShowsPage clickOnHereLink() throws Exception {

		// Click on here link

		GUIFunctions.clickElement(driver, hereLink, "Here Link");
		Thread.sleep(5000);

		return new BrowseShowsPage(driver);
	}


	/**
	 * This function clicks on First show image from get to know the show
	 * section from my shows page
	 * 
	 * @return: showPage object
	 */
	public ShowPage clickOnFirstShowLogo() throws Exception {

		// Click on First show logo
		GUIFunctions.clickElement(driver, getToKnowTheShowSectionFirstShowImg,
				"First Show Image");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}
	
	
	/**
	 * This function clicks on First show name title 
	 * section from my shows page
	 * 
	 * @return: showPage object
	 */
	public ShowPage clickOnFirstShowNameTitle() throws Exception {

		// Click on First show name title
		GUIFunctions.clickElement(driver, firstShowTitle,
				"First Show Name Title");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}
	
	/**
	 * This function clicks on First show name title 
	 * section from my shows page
	 * 
	 * @return: showPage object
	 */
	public ShowPage clickOnFirstVideoShowTitle() throws Exception {

		// Click on First show name title
		GUIFunctions.clickElement(driver, followedFirstVideoShowTitle,
				"First Video Show Title");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}
}
