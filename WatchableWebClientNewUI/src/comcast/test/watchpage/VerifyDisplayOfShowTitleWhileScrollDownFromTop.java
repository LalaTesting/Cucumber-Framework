package comcast.test.watchpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
 * Description: This test script verifies the display of show title in header while scrolling down from top of the page. 
 * Created on 22-November-2016 
 * Last updated on 22-November-2016
 * 
 */

public class VerifyDisplayOfShowTitleWhileScrollDownFromTop extends BaseTest {

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
	 * Scroll down from the top of the page.
	 */
	@Test(description = "Step 4: Scroll down from the top of the page.", priority = 4)
	public void Step04_ScrollDownFromTopOfPage() throws Exception {

		// Scroll down from the top of the page.
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(2500);

		// Verify show title is displaying

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("watchPagePLaylistShowTitle_XPATH")), driver),
				"Show title is displayed next to the hamburger menu.");

		log.info("Show title is displayed next to the hamburger menu.\n");
		Reporter.log("<p>Show title is displayed next to the hamburger menu.");

		log.info("Show title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPagePLaylistShowTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Show title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("watchPagePLaylistShowTitle_XPATH")))
						.getText());
	}

}
