package comcast.test.watchpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies user is navigating back to home page from watch page by clicking on footer home link.
 * Created on 22-November-2016 
 * Last updated on 22-November-2016
 * 
 */

public class VerifyNavigatingToHomePageFromWatchPageClickingOnFooterHomeLink extends BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
	

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
	 * Verify videos are present in WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 2: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 2)
	public void Step02_VerifyWhatWeAreWatchingSection() throws Exception {

		// Verify WHAT WE’RE WATCHING section

		Assertions.verifyWhatWeAreWatchingSection(driver);

	}

	/**
	 * Click on first video Title
	 */
	@Test(description = "Step 3: Click on first video Title from what we are watching section.", priority = 3)
	public void Step03_ClickOnFirstVideoTitle() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		// Click on first video Title
		watchPage = homePage.clickOnFirstVideoTitle();

		log.info("Successfully Clicked on the Video Title: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Successfully Clicked on the Video Title: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFirstVideoTitle_XPATH")))
						.getText());

		log.info("Successfully navigated to Watch page.\n");
		Reporter.log("<p>Successfully navigated to Watch page.");

	}

	/**
	 * Verify home link is present in the footer
	 */
	@Test(description = "Step 4: Verify home link is present in the footer of the page.", priority = 4)
	public void Step04_VerfiyFooterHomeLink() throws Exception {

		// Move to footer home link
		CustomFun.mouseOverElement(driver,
				driver.findElement(By.xpath(ObjRepoProp
						.getProperty("homePageFooterHomeLink_XPATH"))));
		Thread.sleep(1000);

		// Verify home link is present in the footer

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHomeLink_XPATH")), driver),
				"Home link is notpresent in the footer of the page.");

		log.info("Home link is present in the footer of the page.\n");
		Reporter.log("<p>Home link is present in the footer of the page.");

	}

	/**
	 * Click on footer home link.
	 */
	@Test(description = "Step 5: Click on home link from footer. ", priority = 5)
	public void Step05_ClickOnFooterHomeLink() throws Exception {

		// Click on footer home link
		homePage = watchPage.clickOnFooterHomeLink();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
