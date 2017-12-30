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
 * Description: This test script verifies the content of download badges section in home page. 
 *Created on 30-September-2016 
 *Last updated on 30-September-2016
 * 
 */

public class VerifyDownloadBadgesSectionContent extends BaseTest {

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
	 * Verify Download badges are present in footer.
	 */
	@Test(description = "Step 2: Verify Download badges are present in footer.", priority = 2)
	public void Step02_VerifyDownloadBadgesInFooter() throws Exception {

		// Move to Footer section

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("homePageFooterSection_XPATH"))));

		// Verify Download badges in footer
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterSection_XPATH")), driver),
				"Down load badges are not present in footer below the WATCHABLE logo.");

		log.info("Down load badges are present in footer below the WATCHABLE logo.\n");
		Reporter.log("<p>Down load badges are present in footer below the WATCHABLE logo.");

	}

	/**
	 * Verify App Store icon
	 */
	@Test(description = "Step 03: Verify App Store icon is present in download badges section.", priority = 3)
	public void Step03_VerifyAppStoreIcon() throws Exception {

		// Verify App Store icon

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageDownloadBadgeAppStoreImg_XPATH")),
						driver),
				"App Store icon is not present in download badges section.");

		log.info("App Store icon is present in download badges section.\n");
		Reporter.log("<p>App Store icon is present in download badges section");

	}

	/**
	 * Verify Google play icon
	 */
	@Test(description = "Step 04: Verify Google play icon is present in download badges section.", priority = 4)
	public void Step04_VerifyGoogleplayIcon() throws Exception {

		// Verify Google play icon

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageDownloadBadgeGooglePlayImg_XPATH")),
				driver),
				"Google play icon is not present in download badges section.");

		log.info("Google play icon is present in download badges section.\n");
		Reporter.log("<p>Google play icon is present in download badges section");

	}

	/**
	 * Verify Xfinity icon
	 */
	@Test(description = "Step 05: Verify Xfinity  icon is present in download badges section.", priority = 5)
	public void Step05_VerifyGoogleplayIcon() throws Exception {

		// Verify Xfinity icon

		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageDownloadBadgeXfinityImg_XPATH")),
						driver),
				"Xfinity icon is not present in download badges section.");

		log.info("Xfinity icon is present in download badges section.\n");
		Reporter.log("<p>Xfinity icon is present in download badges section");

	}

}
