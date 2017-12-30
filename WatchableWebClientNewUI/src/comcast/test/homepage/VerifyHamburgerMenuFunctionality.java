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
 * Description: This test script verifies the functionality of the hamburger menu by clicking on it. 
 * Created on 28-September-2016 
 * Last updated on 28-September-2016
 * 
 */

public class VerifyHamburgerMenuFunctionality extends BaseTest {

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
	 * Verify hamburger menu
	 */
	@Test(description = "Step 2: Verify hamburger menu is present in home page.", priority = 2)
	public void Step02_VerifyHamburgerMenu() throws Exception {

		// Verify hamburger menu

		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("hamburgerMenuIcon_XPATH")),
				driver),
				"Hamburger menu is not present at the left top corner of home page.");

		log.info("Hamburger menu is present at the left top corner of home page.\n");
		Reporter.log("<p>Hamburger menu is present at the left top corner of home page.");

	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 3: Click on the hamburger menu.", priority = 3)
	public void Step03_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		homePage.clickOnHamburgerMenu();

		// Verify menu items are displayed

		String style = driver.findElement(
				By.xpath(ObjRepoProp.getProperty("headeMenuSection_XPATH")))
				.getAttribute("style");

		log.info("style: " + style);

		Assert.assertEquals(style, "display: block;",
				"Menu items are not displayed after clicking on the hamburger menu.");

		log.info("Menu items are displayed after clicking on the hamburger menu.\n");
		Reporter.log("<p>Menu items are displayed after clicking on the hamburger menu.");

		// Verify hamburger menu changed to close (X) icon.

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("hamburgerMenuIconOpen_XPATH")), driver),
				"Hamburger menu not changed to close (X) icon on clicking on it.");

		log.info("Hamburger menu changed to close (X) icon on clicking on it.\n");
		Reporter.log("<p>Hamburger menu changed to close (X) icon on clicking on it.");

	}

	/**
	 * Click on the hamburger menu close Icon.
	 */
	@Test(description = "Step 4: Click on the close (X) icon.", priority = 4)
	public void Step04_ClickOnHamburgerMenuCloseIcon() throws Exception {

		// Click on the hamburger menu close Icon..
		homePage.clickOnHamburgerMenuCloseIcon();

		// Verify menu items are hidden

		String style = driver.findElement(
				By.xpath(ObjRepoProp.getProperty("headeMenuSection_XPATH")))
				.getAttribute("style");

		log.info("style: " + style);

		Assert.assertEquals(style, "display: none;",
				"Menu items are not hidden after clicking on the hamburger menu close icon.");

		log.info("Menu items are hidden after clicking on the hamburger menu close icon.\n");
		Reporter.log("<p>Menu items are hidden after clicking on the hamburger menu close icon.");

		// Verify close (X) icon changed to hamburger menu.

		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("hamburgerMenuIcon_XPATH")),
				driver),
				"Close (X) icon changed to hamburger menu on clicking on it.");

		log.info("Close (X) icon changed to hamburger menu on clicking on it.\n");
		Reporter.log("<p>Close (X) icon changed to hamburger menu on clicking on it.");

	}

}
