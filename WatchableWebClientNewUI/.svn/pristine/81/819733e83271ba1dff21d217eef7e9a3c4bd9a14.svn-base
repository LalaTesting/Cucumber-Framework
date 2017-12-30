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

public class ProviderPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	// Play lists Constructor
	public ProviderPage(WebDriver driver) {

		this.driver = driver;

		// Check that we're on the right in provider Page.

		if (!(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("providerPageType_XPATH")),
				driver))) {

			throw new IllegalStateException(
					"This is not the Web clint Provider page");
		}
	}

	By firstShowLogo = By.xpath(ObjRepoProp
			.getProperty("providerPageFirstShowLogo_XPATH"));
	By logoutMenu = By.xpath(ObjRepoProp.getProperty("logoutMenu_XPATH"));
	By footerSectionHomeLink = By.xpath(ObjRepoProp
			.getProperty("homePageFooterHomeLink_XPATH"));
	By footerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("homePageFooterWatchableLogo_XPATH"));
	By headerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("showPageHeaderWatchableLogo_XPATH"));

	/*
	 * *************************************************************************
	 * Provider Page Functions
	 * *************************************************************************
	 */

	/**
	 * This function clicks on First show image from provider page section
	 * 
	 * @return: ShowPage object
	 */
	public ShowPage clickOnFirstShowLogo() throws Exception {

		// Click on First show logo

		GUIFunctions.clickElement(driver, firstShowLogo, "First Show Logo");
		Thread.sleep(5000);

		return new ShowPage(driver);

	}

	/**
	 * This function clicks on home link from footer section
	 * 
	 * @return: HomePage object
	 */

	public HomePage clickOnFooterHomeLink() throws Exception {

		// clicking on footer section Home Link
		GUIFunctions.clickElement(driver, footerSectionHomeLink,
				"Fotter Home Link");
		Thread.sleep(5000);
		return new HomePage(driver);

	}

	/**
	 * This function clicks on bottom watchable logo
	 * 
	 * @return: WatchPage object
	 */
	public HomePage clickOnBottomWatchableLogo() throws Exception {
		
		// Click on bottom watchable logo
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
		GUIFunctions.clickElement(driver, headerWatchableLogo, "Header Watchable Logo");
		
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

}
