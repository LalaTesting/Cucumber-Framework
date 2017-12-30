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
 * Description: This test script verifies user is navigating back to home page from show page by clicking on bottom watchable logo. 
 * Created on 13-October-2016 
 * Last updated on 13-October-2016
 * 
 */

public class VerifyNavigatingToHomePageFromShowPageClickingOnBottomWatchableLogo extends BaseTest {

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
	public void Step03_ClickOnShowImage() throws Exception {

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
	 * Verify watchable logo is present in the bottom
	 */
	@Test(description = "Step 4: Verify watchable logo is present in the bottom of the page.", priority = 4)
	public void Step04_VerfiyBottomWatchableLogo() throws Exception {

		//Verify watchable logo is present in the bottom		
		
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("homePageFooterWatchableLogo_XPATH")),
				driver), "Watchable logo is not present in the bottom of the page.");

		
		log.info("Watchable logo is present in the bottom of the page.\n");
		Reporter.log("<p>Watchable logo is present in the bottom of the page.");

	}

	/**
	 * Click on bottom watchable logo. 
	 */
	@Test(description = "Step 5: Click on bottom watchable logo. ", priority = 5)
	public void Step05_ClickOnBottomWatchableLogo() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		
		// Click on bottom watchable logo
		homePage = showPage.clickOnBottomWatchableLogo();

		
		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
