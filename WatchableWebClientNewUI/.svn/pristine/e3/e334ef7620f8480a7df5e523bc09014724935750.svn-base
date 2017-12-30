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

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies page title is displaying for show page and the title displayed. 
 * Created on 13-October-2016 
 * Last updated on 13-October-2016
 * 
 */

public class VerifyShowPageTitle extends BaseTest {

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
	 * Verify show page title.
	 */
	@Test(description = "Step 4: Verify title is displaying for show page.", priority = 4)
	public void Step04_VerifyShowPageTitle() throws Exception {

		// Verify show page title.

		String pageTitle = driver.getTitle();

		Assert.assertNotNull(pageTitle,
				"Page title is not present for show page");

		log.info("Page title is present for show page.\n");
		Reporter.log("<p>Page title is present for show page");

		log.info("Show Page title displayed is: " + pageTitle + " \n");
		Reporter.log("<p>Show Page title displayed is: " + pageTitle);

	}


	}
