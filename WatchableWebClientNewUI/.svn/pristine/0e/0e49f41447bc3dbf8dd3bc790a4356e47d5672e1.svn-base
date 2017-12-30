package comcast.test.homepage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;

/**
 * 
 * @author Karthik.ashoka
 * Description: This test script verifies the home page header section content after clicking on hamburger menu after login. 
 *Created on 30-September-2016 
 *Last updated on 3-October-2016
 * 
 */

public class VerifyHeaderContentClickingOnHamburgerMenuAfterLogin extends
		BaseTest {

	static HomePage homePage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

		// Navigates to Watchable application URL
		homePage = HomePage.navigateToWatchableHomePage(driver, baseUrl);

		log.info("Successfully navigated to Watchable Home page\n");
		Reporter.log("<p>Successfully navigated to Watchable Home page");

	}

	/**
	 * Login to the application with valid credentials.
	 */

	@Test(description = "Step 2: Login to the application with valid credentials.", priority = 2)
	public void Step02_loginToWebClient() throws Exception {

		// To Mouse Hover on Login Button
		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("homePageLoginButton_XPATH"))));

		// User to click on LoginButton
		homePage.clickOnLoginButton();

		// Passing email and password value
		String email = TextProp.getProperty("email");
		String password = TextProp.getProperty("password");

		// Entering Valid Credentials
		homePage.enterEmailPassword(email, password);

		// Clicking on Login button under Login Form
		homePage.clickOnLoginFormLoginButton();

		Thread.sleep(5000);

	}

	/**
	 * Verify hamburger menu is present in home page.
	 */

	@Test(description = "Step 3: Verify hamburger menu is present in home page.", priority = 3)
	public void Step03_VerfiyHamburgerMenu() throws Exception {

		// Verifying Hamburger Menu present at the left top corner of home page.
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("hamburgerMenuIcon_XPATH")),
				driver),
				"Hamburger menu not present at the left top corner of home page.");

		log.info("Hamburger menu is present at the left top corner of home page. \n");
		Reporter.log("<p>Hamburger menu is present at the left top corner of home page..</p>");

	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 4: Click on the hamburger menu.", priority = 4)
	public void Step04_clickOnHamburgerMenu() throws Exception {

		// Clicking on HamburgerMenu
		homePage.clickOnHamburgerMenu();

		// Verifying the Menu Items under Hamburger Menu
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("headeMenuSection_XPATH")),
				driver),
				"The menu items are  not displayed under Hamburger Menu.");

		log.info("The menu items are displayed.\n");
		Reporter.log("<p>The menu items are displayed.</p>");

		// Verifying The hamburger menu changed to close (X) icon.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("hamburgerMenuIconOpen_XPATH")), driver),
				"The hamburger menu not changed to close (X) icon.");

		log.info("The hamburger menu changed to close (X) icon.\n");
		Reporter.log("<p>The hamburger menu changed to close (X) icon.</p>");

	}

	/**
	 * Verify the items Present in header section.
	 */
	@Test(description = "Step 5: Verify the items Present in header section..", priority = 5)
	public void Step05_VerifyItemsInHeaderSection() throws Exception {

		// Verifying for Home Title
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuHomeTitle_ID")), driver),
				"Home Title  is not present in home page under Hamburger Menu");

		// Verifying for Browse Shows Title
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuBrowseShowsTitle_XPATH")),
				driver),
				"Browse Shows Title  is not present in home page under Hamburger Menu");

		// Verifying for TODAYS'S PLAYLISTS Title
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageHamburgerMenuTodaysPlaylistsTitle_XPATH")),
						driver),
				"TODAYS'S PLAYLISTS is not present in home page under Hamburger Menu");

		// Verifying for My Shows Title
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuMyShowsTitle_XPATH")),
				driver),
				"My Shows is not present in home page under Hamburger Menu");

		// Verifying Application displaying email value
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuUserName_XPATH")), driver),
				"Application not displaying email value under Hamburger Menu");

		// Verifying the down arrow mark
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("homePageArrowIcon_XPATH")),
				driver),
				"Application not displaying down arro icon beside to Login user name");

		// Verifying for search icon in header section of HomePage
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageSearchButton_XPATH")), driver),
				"Search Icon  is not present in home page under Hamburger Menu");

		log.info("Header displayed with following items:\n"
				+ "1. Home Title \n"
				+ "2. BROWSE SHOWS Title \n"
				+ "3. TODAYS'S PLAYLISTS Title \n"
				+ "4. MY  SHOWS Title \n"
				+ "5. Left top corner logged in user name display as  "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageHamburgerMenuUserName_XPATH")))
						.getText()
				+ "  and beside to it down arrow tool menu \n"
				+ "6. Search icon at the last.\n");

		Reporter.log("Header displayed with following items:\n"
				+ "1. Home Title \n"
				+ "2. BROWSE SHOWS Title \n"
				+ "3. TODAYS'S PLAYLISTS Title \n"
				+ "4. MY  SHOWS Title \n"
				+ "5. Left top corner logged in user name display as  "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageHamburgerMenuUserName_XPATH")))
						.getText()
				+ "  and beside to it down arrow tool menu \n"
				+ "6. Search icon at the last.\n");

	}

}
