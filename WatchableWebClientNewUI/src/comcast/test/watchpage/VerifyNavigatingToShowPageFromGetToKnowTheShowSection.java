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
import comcast.pages.ShowPage;
import comcast.pages.WatchPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies navigation to show page from Get To Know 
 * The Show Section from watch page.
 * Created on 19-November-2016 
 * Last updated on 22-November-2016
 * 
 */

public class VerifyNavigatingToShowPageFromGetToKnowTheShowSection extends
		BaseTest {

	static HomePage homePage;
	static WatchPage watchPage;
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
	 * Verify videos are present in WHAT WE�RE WATCHING section
	 */
	@Test(description = "Step 2: Verify WHAT WE�RE WATCHING section is present in home page.", priority = 2)
	public void Step02_VerifyWhatWeAreWatchingSection() throws Exception {

		// Verify WHAT WE�RE WATCHING section

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
	 * Verify GET TO KNOW THE SHOW section
	 */
	@Test(description = "Step 4: Verify GET TO KNOW THE SHOW section is present in watch page.", priority = 4)
	public void Step04_VerifyGetToKnowTheShowSection() throws Exception {

		// Verify GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("watchPageVideoShowTitle_XPATH"))));
		Thread.sleep(2500);

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("watchPageGetToKnowTheShowSection_XPATH")),
						driver),
				"GET TO KNOW THE SHOW section is not present in watch page below the social sharing option.");

		log.info("GET TO KNOW THE SHOW section is present in watch page below the social sharing option.\n");
		Reporter.log("<p>GET TO KNOW THE SHOW section is present in watch page below the social sharing option.");

	}

	/**
	 * Click on first show image from get to know the show section.
	 */
	@Test(description = "Step 5: Click on first show image from get to know the show section.", priority = 5)
	public void Step05_ClickOnFirstShowImage() throws Exception {

		// Click on first show image from get to know the show section.
		showPage = watchPage.clickOnFirstShowLogo();

		log.info("Successfully navigate to show page.\n");
		Reporter.log("<p>Successfully navigate to show page.");

	}

}
