package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies the header watchable logo is not clickable when user is in home page. 
 *Created on 30-September-2016 
 *Last updated on 30-September-2016
 * 
 */

public class VerifyHeaderWatchableLogoNotClickableFromHomePage extends BaseTest {

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
	 * Verify watchable logo
	 */
	@Test(description = "Step 2: Verify watchable logo is present in the header.", priority = 2)
	public void Step02_VerifyWatchableLogo() throws Exception {

		// Verify WATCHABLE Logo
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHeaderWatchableLogo_XPATH")), driver),
				"WATCHABLE Logo is not present in header section.");

		log.info("WATCHABLE Logo is present in header section.\n");
		Reporter.log("<p>WATCHABLE Logo is present in header section.");

	}

	/**
	 * Verify header watchable logo is not clickable
	 */
	@Test(description = "Step 3: Verify header watchable logo is not clickable from home page.", priority = 3)
	public void Step03_VerifyWatchableLogoNotClickable() throws Exception {

		// Verify header watchable logo is not clickable
		boolean match = false;
		
		CustomFun.isElementClickable(driver.findElement(By.xpath(ObjRepoProp
				.getProperty("homePageHeaderWatchableLogo_XPATH"))),
				"Watchable Logo", false);
		log.info(match);
		
		Assert.assertFalse(match,
				"The header WATCHABLE logo is clickable in Home Page");

		log.info("Watchable logo from header is not clickable from home page.\n");
		Reporter.log("<p>Watchable logo from header is not clickable from home page.");

	}

}