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

public class ShowPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	// Play lists Constructor
	public ShowPage(WebDriver driver) {

		this.driver = driver;

		// Check that we're on the right in show Page.

		if (!(CustomFun
				.isElementPresent(
						By.xpath(ObjRepoProp.getProperty("showPageType_XPATH")),
						driver))) {

			throw new IllegalStateException(
					"This is not the Web clint Show page");
		}
	}

	By publisherTitle = By.xpath(ObjRepoProp
			.getProperty("showPagePublisherTitle_XPATH"));
	By firstVideoTitle = By.xpath(ObjRepoProp
			.getProperty("showPageFirstVideoTitle_XPATH"));
	By footerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("homePageFooterWatchableLogo_XPATH"));
	By headerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("showPageHeaderWatchableLogo_XPATH"));
	By footerSectionHomeLink = By.xpath(ObjRepoProp
			.getProperty("homePageFooterHomeLink_XPATH"));
	By logoutMenu = By.xpath(ObjRepoProp.getProperty("logoutMenu_XPATH"));
	By followButton = By.xpath(ObjRepoProp
			.getProperty("showPageFollowButton_XPATH"));
	By hamburgerMenuIcon = By.xpath(ObjRepoProp
			.getProperty("hamburgerMenuIcon_XPATH"));
	By myShowsTitle = By.xpath(ObjRepoProp
			.getProperty("homePageHamburgerMenuMyShowsTitle_XPATH"));

	/**
	 * This function clicks on Publisher Title
	 * 
	 * @return: WatchPage object
	 */
	public ProviderPage clickOnPublisherTitle() throws Exception {

		// Click on Publisher Title
		Thread.sleep(3000);
		GUIFunctions.clickElement(driver, publisherTitle, "Publisher Title");
		Thread.sleep(5000);

		return new ProviderPage(driver);

	}

	/**
	 * This function clicks on first video Title from show page
	 * 
	 * @return: WatchPage object
	 */
	public WatchPage clickOnFirstVideoTitle() throws Exception {

		// Click on first video Title
		Thread.sleep(3000);
		GUIFunctions.clickElement(driver, firstVideoTitle, "Video Title");
		Thread.sleep(5000);

		return new WatchPage(driver);

	}

	/**
	 * This function clicks on bottom watchable logo
	 * 
	 * @return: HomePage object
	 */
	public HomePage clickOnBottomWatchableLogo() throws Exception {

		// Click on bottom watchable logo
		for (int i = 1; i <= 15; i++) {
			CustomFun
					.mouseOverElement(
							driver,
							driver.findElement(By.xpath(ObjRepoProp
									.getProperty("homePageFooterWatchableLogo_XPATH"))));
		}
		Thread.sleep(3000);
		GUIFunctions.clickElement(driver, footerWatchableLogo,
				"Foter Watchable Logo");
		Thread.sleep(5000);

		return new HomePage(driver);

	}

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
	 * This function click on Footer Section Home Link
	 * 
	 * @return: HomePage object
	 */

	public HomePage clickOnFooterSectionHomeLink() throws Exception {

		// clicking on footer section Home Link
		for (int i = 1; i <= 15; i++) {
			CustomFun.mouseOverElement(driver, driver.findElement(By
					.xpath(ObjRepoProp
							.getProperty("homePageFooterHomeLink_XPATH"))));
		}
		Thread.sleep(4000);
		GUIFunctions.clickElement(driver, footerSectionHomeLink,
				"Fotter Section Home Link");
		Thread.sleep(5000);
		return new HomePage(driver);

	}

	public ShowPage scrollDownThroughVideoSection() throws Exception {

		// Scroll down in video section
		for (int i = 1; i <= 20; i++) {
			CustomFun.mouseOverElement(driver, driver.findElement(By
					.xpath(ObjRepoProp
							.getProperty("homePageFooterHomeLink_XPATH"))));
			Thread.sleep(1000);
		}
		return new ShowPage(driver);

	}

	/**
	 * This function clicks on logout
	 * 
	 * @return: WatchPage object
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
	 * This function click on Follow button
	 * 
	 * @return: ShowPage object
	 */
	public ShowPage clickOnFollowButton() throws Exception {

		// Click on Follow button
		GUIFunctions.clickElement(driver, followButton, "Follow Button");

		Thread.sleep(5000);
		return new ShowPage(driver);

	}
	
	
	/**
	 * This function click on hamburger menu
	 * 
	 * @return: Home Page object
	 */
	public ShowPage clickOnHamburgerMenu() throws Exception {

		// Click on hamburger menu
		GUIFunctions.clickElement(driver, hamburgerMenuIcon, "Hamburger Menu");

		Thread.sleep(2500);

		return new ShowPage(driver);

	}
	
	
	/**
	 * This function clicks on my shows menu 
	 * 
	 * @return: MyShowsPage object
	 */
	public MyShowsPage clickOnMyShowsMenu() throws Exception {

		// Click on my shows menu

		GUIFunctions.clickElement(driver, myShowsTitle,
				"My Shows Menu");
		Thread.sleep(5000);

		return new MyShowsPage(driver);

}


}
