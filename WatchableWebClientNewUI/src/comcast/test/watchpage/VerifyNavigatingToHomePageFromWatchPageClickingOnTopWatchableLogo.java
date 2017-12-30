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
 * Description: This test script verifies user is navigating back to home page from watch page by clicking on 
 * top watchable logo.
 * Created on 22-November-2016 
 * Last updated on 22-November-2016
 * 
 */

public class VerifyNavigatingToHomePageFromWatchPageClickingOnTopWatchableLogo extends BaseTest {

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
	 * Verify watchable logo is present in the header
	 */
	@Test(description = "Step 4: Verify watchable logo is present in the header.", priority = 4)
	public void Step04_VerfiyHeaderWatchableLogo() throws Exception {
		
		// Scroll down to make top menu items visible
		CustomFun.scrollDownFromTopOfPage(driver);

		// Verify watchable logo is present in the header

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPageHeaderWatchableLogo_XPATH")), driver),
				"Watchable logo is not present in the header of the page.");

		log.info("Watchable logo is present in the header of the page.\n");
		Reporter.log("<p>Watchable logo is present in the header of the page.");

	}

	/**
	 * Click on header watchable logo.
	 */
	@Test(description = "Step 5: Click on header watchable logo. ", priority = 5)
	public void Step05_ClickOnHeaderWatchableLogo() throws Exception {
		
		// Click on header watchable logo
		homePage = watchPage.clickOnHeaderWatchableLogo();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
