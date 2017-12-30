package comcast.test.showpage;

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
 * Description: This test script verifies the navigation to show page from what we are watching section. 
 * Created on 14-October-2016 
 * Last updated on 14-October-2016
 * 
 */

public class VerifyNavigationToShowPageFromWhatWeAreWatchingSection extends
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
	 * Verify videos are present in WHAT WE’RE WATCHING
	 */
	@Test(description = "Step 2: Verify videos are present in WHAT WE’RE WATCHING section in home page.", priority = 2)
	public void Step02_VerifyVideosPresentInWhatWeAreWatchingSection()
			throws Exception {

		// Move to WHAT WE’RE WATCHING section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageWhatWeAreWatchingSection_XPATH"))));
		Thread.sleep(2500);

		// Verify videos are present in WHAT WE’RE WATCHING section in home page
		int videoCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePageVideoLogoImage_XPATH"))).size();

		Assert.assertTrue(videoCount > 0,
				"Videos are not present in WHAT WE’RE WATCHING section");

		log.info("Videos are present in WHAT WE’RE WATCHING section in home page.\n");
		Reporter.log("<p>Videos are present in WHAT WE’RE WATCHING section in home page.");

	}

	/**
	 * Click on first show title
	 */
	@Test(description = "Step 3: Click on first show title from what we are watching section.", priority = 3)
	public void Step03_ClickOnShowTitle() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);
		
		// Move to show title

				CustomFun
						.mouseOverElement(
								driver,
								driver.findElement(By.xpath(ObjRepoProp
										.getProperty("homePageFirstVideoShowTitle_XPATH"))));


		String showName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("homePageFirstVideoShowTitle_XPATH")))
				.getText();

		// Click on first show show title
		showPage = homePage.clickOnFirstShowTitle();

		log.info("Successfully Clicked on the Show: " + showName + "\n");
		Reporter.log("<p>Successfully Clicked on the Show: " + showName);

		log.info("Successfully navigated to Show page.\n");
		Reporter.log("<p>Successfully navigated to Show page.");

	}

}
