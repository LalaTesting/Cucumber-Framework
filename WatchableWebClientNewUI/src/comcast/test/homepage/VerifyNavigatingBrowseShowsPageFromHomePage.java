package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;


/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigating to Browse Shows page from home page by clicking on EXPLORE NOW button 
 *Created on 23-September-2016 
 *Last updated on 23-September-2016
 * 
 */

public class VerifyNavigatingBrowseShowsPageFromHomePage extends BaseTest {

	static HomePage homePage;
	static BrowseShowsPage browseShowsPage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

		// Home page object instance creation
		// homePage = new HomePage(driver);

		// Navigates to Watchable application URL
		homePage = HomePage.navigateToWatchableHomePage(driver, baseUrl);

		log.info("Successfully navigated to Watchable Home page\n");
		Reporter.log("<p>Successfully navigated to Watchable Home page");

	}

	/**
	 * Verify EXPLORE NOW button
	 */
	@Test(description = "Step 2: Verify EXPLORE NOW button is present in home.", priority = 2)
	public void Step02_VerifyExploreNowButton() throws Exception {

		// Move to Explore Now button

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageExploreNowButton_XPATH"))));

		// Verify Watch Today’s Playlist button
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageExploreNowButton_XPATH")),
				driver),
				"Explore Now button is not present in home page");

		log.info("EXPLORE NOW button is present in home page below the GET TO KNOW THE SHOW section.\n");
		Reporter.log("<p>EXPLORE NOW button is present in home page below the GET TO KNOW THE SHOW section.");

	}

	/**
	 * Click on EXPLORE NOW button.
	 */
	@Test(description = "Step 3: Click on EXPLORE NOW button..", priority = 3)
	public void Step03_ClickOnExploreNowButton() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on Watch Today’s Playlist button.
		browseShowsPage = homePage.clickOnExploreNowButton();
		
		log.info("Successfully navigated to Browse Shows page.\n");
		Reporter.log("<p>Successfully navigated to Browse Shows page.");

	}
}
