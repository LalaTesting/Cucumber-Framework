package comcast.pages;

import static comcast.util.PropertyFileReader.ObjRepoProp;
//import static comcast.util.PropertyFileReader.TextProp;








import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comcast.custom.CustomFun;
//import comcast.uiFunctions.GUIFunctions;
import comcast.uiFunctions.GUIFunctions;

public class BrowseShowsPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());

	// Play lists Constructor
	public BrowseShowsPage(WebDriver driver) {

		this.driver = driver;

		// Check that we're on the right in Browse shows Page.

		if (!(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("browseShowsPageType_XPATH")),
				driver))) {

			throw new IllegalStateException(
					"This is not the Web clint Browse Shows Page");
		}
	}

	By firstShowImage = By.xpath(ObjRepoProp
			.getProperty("browseShowsPageFirstShowImage_XPATH"));
	By headerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("showPageHeaderWatchableLogo_XPATH"));
	By footerWatchableLogo = By.xpath(ObjRepoProp
			.getProperty("homePageFooterWatchableLogo_XPATH"));
	By footerHomeLink = By.xpath(ObjRepoProp
			.getProperty("homePageFooterHomeLink_XPATH"));
	By logoutMenu = By.xpath(ObjRepoProp.getProperty("logoutMenu_XPATH"));
	By moreShowsLink = By.xpath(ObjRepoProp
			.getProperty("browseShowsPageFirstMoreShowsRowLink_XPATH"));

	/**
	 * This function clicks on first shows image from browse show page genre
	 * section  
	 * 
	 * @return: shows object
	 */
	public ShowPage clickOnBrowseShowsMenu() throws Exception {

		// Click on first shows image

		GUIFunctions.clickElement(driver, firstShowImage, "Shows Image");
		Thread.sleep(5000);

		return new ShowPage(driver);

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
	 * This function clicks on bottom watchable logo
	 * 
	 * @return: Home Page object
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
		for (int i = 1; i <= 15; i++) {
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
	 * This function scroll down through shows section
	 * 
	 * @return: BrowseShowsPage object
	 */
	
	public BrowseShowsPage scrollDownThroughShowSection() throws Exception {

		// Scroll down in shows section
		for (int i = 1; i <= 10; i++) {
			CustomFun.mouseOverElement(driver, driver.findElement(By
					.xpath(ObjRepoProp
							.getProperty("homePageFooterHomeLink_XPATH"))));
			Thread.sleep(1000);
		}
		return new BrowseShowsPage(driver);

	}
	
	/**
	 * This function clicks on More Shows Link
	 * 
	 * @return: BrowseShows object
	 */
	
	public BrowseShowsPage clickOnMoreShowsLink() throws Exception {
		
		 //Getting the More shows link from all genres
		int moreShowsLinkCount = driver.findElements(
						By.xpath(ObjRepoProp.getProperty("browseShowsPageMoreShowsValueLink_XPATH")))
				.size();
		
		for(int i=0 ; i<=moreShowsLinkCount; i++)
		{
			//Restricting to the value 2
			if(i == 2)
			{	
				// Click on More Shows link
				GUIFunctions.clickElement(driver, moreShowsLink, "More Shows");
				Thread.sleep(5000);
				break;
			}
		}
		
		return new BrowseShowsPage(driver);

	}
	
	/**
	 * This function for scrolling for genre section
	 * @return BrowseShows object
	 */
	
	public BrowseShowsPage scrollToGenreSection() throws Exception {
		
			((JavascriptExecutor) driver).executeScript(
					"window.scrollBy(0,400)", "");
			Thread.sleep(1000);
			
		
		return new BrowseShowsPage(driver);
	}
	
}
