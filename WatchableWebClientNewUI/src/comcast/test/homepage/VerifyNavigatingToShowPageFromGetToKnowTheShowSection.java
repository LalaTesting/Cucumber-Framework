package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.ShowPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verify Navigating to show page from get to know the show section from home page 
 *Created on 27-September-2016 
 *Last updated on 27-September-2016
 * 
 */

public class VerifyNavigatingToShowPageFromGetToKnowTheShowSection extends
		BaseTest {

	static HomePage homePage;
	static ShowPage showPage;

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
	 * Verify GET TO KNOW THE SHOW section
	 */
	@Test(description = "Step 2: Verify GET TO KNOW THE SHOW section is present in home page.", priority = 2)
	public void Step02_VerifyGetToKnowTheShowSection() throws Exception {

		// Move to GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageGetToKnowTheShowSection_XPATH"))));

		// Verify WHAT WE’RE WATCHING section
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageGetToKnowTheShowSection_XPATH")),
						driver),
				"GET TO KNOW THE SHOW section is not present in home page");

		log.info("GET TO KNOW THE SHOW section is present in home page.\n");
		Reporter.log("<p>GET TO KNOW THE SHOW section is present in home page.");

	}

	/**
	 * Verify shows are present in GET TO KNOW THE SHOW section
	 */
	@Test(description = "Step 3: Verify shows are present in GET TO KNOW THE SHOW section in home page.", priority = 3)
	public void Step03_VerifyShowsPresentInGetToKnowTheShowSection()
			throws Exception {

		// Verify shows are present in GET TO KNOW THE SHOW section

		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("homePageShowLogoImage_XPATH")))
				.size();

		Assert.assertTrue(showCount > 0,
				"Shows are not present in GET TO KNOW THE SHOW section");

		log.info("Shows are present in GET TO KNOW THE SHOW section\n");
		Reporter.log("<p>Shows are present in GET TO KNOW THE SHOW section");

	}

	/**
	 * Click on first show image
	 */
	@Test(description = "Step 4: Click on any show image from get to know the show section.", priority = 4)
	public void Step04_ClickOnShowImage() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Move to GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageGetToKnowTheShowSection_XPATH"))));

		String showName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("homePageFirstShowTitle_XPATH")))
				.getAttribute("alt");

		// Click on first show image
		showPage = homePage.clickOnFirstShowLogo();

		log.info("Successfully Clicked on the Show: " + showName + "\n");
		Reporter.log("<p>Successfully Clicked on the Show: " + showName);

		log.info("Successfully navigated to Show page.\n");
		Reporter.log("<p>Successfully navigated to Show page.");

	}
}
