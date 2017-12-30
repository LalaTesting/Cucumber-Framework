package comcast.test.providerpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.ProviderPage;
import comcast.pages.ShowPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies clicking on any (first) show image from 
 * show section of provider page navigating to show detail page.
 * Created on 19-October-2016 
 * Last updated on 19-October-2016
 * 
 */

public class VerifyingClickOnShowNavigatingToShowPage extends BaseTest {

	static HomePage homePage;
	static ShowPage showPage;
	static ProviderPage providerPage;

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
	 * Verify provider name
	 */
	@Test(description = "Step 4: Verify provider name is displaying in show page.", priority = 4)
	public void Step04_VerifyProviderName() throws Exception {

		// Verify provider name

		Assertions.verifyProviderName(driver);

	}

	/**
	 * Click on Provider name.
	 */
	@Test(description = "Step 5: Click on Provider name.", priority = 5)
	public void Step05_ClickOnProviderName() throws Exception {

		String providerName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("showPagePublisherTitle_XPATH")))
				.getText();

		// Click on Provider name
		providerPage = showPage.clickOnPublisherTitle();

		log.info("Successfully Clicked on the Provider name: " + providerName
				+ "\n");
		Reporter.log("<p>Successfully Clicked on the Provider name: "
				+ providerName);

		log.info("Successfully navigated to Provider page.\n");
		Reporter.log("<p>Successfully navigated to Provider page.");

	}

	/**
	 * Verify show are present in show section
	 */
	@Test(description = "Step 6: Verify show are present in show section in Provider page.", priority = 6)
	public void Step06_VerifyShowPresentInShowSection() throws Exception {

		// Move to show section

		CustomFun.mouseOverElement(driver,
				driver.findElement(By.xpath(ObjRepoProp
						.getProperty("providerPageShowSection_XPATH"))));
		Thread.sleep(2500);

		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("providerPageShowLogo_XPATH")))
				.size();

		Assert.assertTrue(showCount > 0,
				"Shows are not present in show section in Provider page.");

		log.info("Shows are not present in show section in Provider page.\n");
		Reporter.log("<p>Shows are not present in show section in Provider page.");

	}

	/**
	 * Click on first show image
	 */
	@Test(description = "Step 7: Click on first show image from show section in Provider page.", priority = 7)
	public void Step07_ClickOnFirstShowImage() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);

		String showName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("providerPageFirstShowLogo_XPATH")))
				.getAttribute("alt");

		// Click on first show image
		showPage = providerPage.clickOnFirstShowLogo();

		log.info("Successfully Clicked on the Show: " + showName + "\n");
		Reporter.log("<p>Successfully Clicked on the Show: " + showName);

		log.info("Successfully navigated to Show page.\n");
		Reporter.log("<p>Successfully navigated to Show page.");

	}

}
