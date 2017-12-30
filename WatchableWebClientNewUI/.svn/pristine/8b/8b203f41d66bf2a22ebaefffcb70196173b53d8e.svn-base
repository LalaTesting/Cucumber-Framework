package comcast.test.homepage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.pages.HomePage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies page title is displaying for home page and the title displayed. 
 * Created on 29-September-2016 
 * Last updated on 29-September-2016
 * 
 */

public class VerifyHomePageTitle extends BaseTest {

	static HomePage homePage;

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
	 * Verify home page title.
	 */
	@Test(description = "Step 2: Verify title is displaying for home page.", priority = 2)
	public void Step02_VerifyHomePageTitle() throws Exception {

		// Verify home page title.

		String pageTitle = driver.getTitle();

		Assert.assertNotNull(pageTitle,
				"Page title is not present for home page");

		log.info("Page title is present for home page.\n");
		Reporter.log("<p>Page title is present for home page");

		log.info("Home Page title displayed is: " + pageTitle + " \n");
		Reporter.log("<p>Home Page title displayed is: " + pageTitle);

	}

}
