package comcast.test.showpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.ShowPage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verify navigating to watch page from show page. 
 * Created on 13-October-2016 
 * Last updated on 13-October-2016
 * 
 */

public class VerifyNavigatingWatchPageFromShowPage extends BaseTest {

	static HomePage homePage;
	static ShowPage showPage;
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
	 * Verify shows are present in GET TO KNOW THE SHOW section
	 */
	@Test(description = "Step 2: Verify shows are present in GET TO KNOW THE SHOW section in home page.", priority = 2)
	public void Step02_VerifyShowsPresentInGetToKnowTheShowSection()
			throws Exception {

		// Move to GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageGetToKnowTheShowSection_XPATH"))));

		// Verify shows are present in GET TO KNOW THE SHOW section
		Assertions.verifyShowsPresent(driver);
	}

	/**
	 * Click on first show image
	 */
	@Test(description = "Step 3: Click on any show image from get to know the show section.", priority = 3)
	public void Step04_ClickOnShowImage() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

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

	/**
	 * Verify videos are present in video section in show page
	 */
	@Test(description = "Step 4: Verify videos are present in video section in show page", priority = 4)
	public void Step04_VerfiyVideosArePresent() throws Exception {

		// Move to video section

		CustomFun.mouseOverElement(driver,
				driver.findElement(By.xpath(ObjRepoProp
						.getProperty("showPageFirstVideoTitle_XPATH"))));

		// Verify number of videos are displaying.
		int videoCount = driver.findElements(
				By.xpath(ObjRepoProp.getProperty("showPageVideoCount_XPATH")))
				.size();

		log.info("videoCount: " + videoCount);

		Assert.assertTrue(videoCount > 0,
				"Video are not present in video section in show page.");

		log.info("Video are present in video section in show page.\n");
		Reporter.log("<p>Video are present in video section in show page.</p>");

	}

	/**
	 * Click on first video title
	 */
	@Test(description = "Step 5: Click on video title of first video from video section.", priority = 5)
	public void Step05_ClickOnFirstVideoTitle() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		String firstVideoTitle = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("showPageFirstVideoTitle_XPATH")))
				.getText();

		// Click on first video title
		watchPage = showPage.clickOnFirstVideoTitle();

		log.info("Successfully Clicked on the first video title: "
				+ firstVideoTitle + "\n");
		Reporter.log("<p>Successfully Clicked on the first video title name: "
				+ firstVideoTitle);

		log.info("Successfully navigated to watch page.\n");
		Reporter.log("<p>Successfully navigated to watch page.");

	}

}
