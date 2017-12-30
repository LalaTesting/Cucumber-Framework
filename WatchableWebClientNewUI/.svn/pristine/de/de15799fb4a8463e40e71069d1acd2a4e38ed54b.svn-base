package comcast.test.homepage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: test script verifies the presence of pagination and its functionality in playlist carousel. 
 *Created on 30-September-2016 
 *Last updated on 03-October-2016
 * 
 */

public class VerifyPaginationInCarousel extends BaseTest {

	static HomePage homePage;

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
	 * Verify play lists section
	 */
	@Test(description = "Step 2: Verify Play list section is present in home page.", priority = 2)
	public void Step02_VerifyPlaylistSection() throws Exception {

		// Verify play lists section

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePagePlaylistSection_XPATH")), driver),
				"Play list section is not present in home page.");

		log.info("Play list section is present in home page.\n");
		Reporter.log("<p>Play list section is present in home page.");

	}

	/**
	 * Verify Pagination is present
	 */
	@Test(description = "Step 3: Verify Pagination is present in playlist carousel.", priority = 3)
	public void Step03_VerifyPaginationPresentInPlaylistCarousel()
			throws Exception {

		// Verify Pagination is present

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("playlistCarouselPagination_XPATH")), driver),
				"Pagination is not present in playlist carousel.");

		log.info("Pagination is present in playlist carousel.\n");
		Reporter.log("<p>Pagination is present in playlist carousel.");

	}

	/**
	 * Verify pages present in playlist carousel
	 */
	@Test(description = "Step 4: Verify pages present in playlist carousel.", priority = 4)
	public void Step04_VerifyPagesPresentInPlaylistCarousel() throws Exception {

		// Verify pages present in playlist carousel

		int pageCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("playlistCarouselPages_XPATH")))
				.size();

		Assert.assertTrue(pageCount > 0,
				"Pages are not present in playlist carousel.");

		log.info("Pages are present playlist carousel.\n");
		Reporter.log("<p>Pages are present in playlist carousel.");

		log.info("Total number of Pages present in playlist carousel: "
				+ pageCount + "\n");
		Reporter.log("<p>Total number of Pages present in playlist carousel: "
				+ pageCount);

	}

	/**
	 * Click on any next page number.
	 */
	@Test(description = "Step 5: Click on any next page number.", priority = 5)
	public void Step05_ClickNextPageFromPlaylistCarousel() throws Exception {

		String currentPageBeforeNavigation = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("playlistCarouselActivePage_XPATH")))
				.getText();

		// Click on any next page number.
		homePage.clickOnNexPageIconFromPlaylistCarousel();

		String currentPageAfterNavigation = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("playlistCarouselActivePage_XPATH")))
				.getText();

		Assert.assertNotEquals(
				currentPageAfterNavigation,
				currentPageBeforeNavigation,
				"Failed to navigate to next page after click on next page icon from playlist carousel.");

		log.info("Successfully navigate to next page after click on next page icon from playlist carousel.\n");
		Reporter.log("<p>Successfully navigate to next page after click on next page icon from playlist carousel.");

		log.info("Page number before clicking on next page icon: "
				+ currentPageBeforeNavigation + "\n");
		Reporter.log("<p>TPage number before clicking on next page icon: "
				+ currentPageBeforeNavigation);

		log.info("Page number after clicking on next page icon: "
				+ currentPageAfterNavigation + "\n");
		Reporter.log("<p>TPage after before clicking on next page icon: "
				+ currentPageAfterNavigation);

	}

	/**
	 * Click on any previous page number.
	 */
	@Test(description = "Step 6: Click on any previous  page number.", priority = 6)
	public void Step06_ClickPreviousPageFromPlaylistCarousel() throws Exception {

		String currentPageBeforeNavigation = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("playlistCarouselActivePage_XPATH")))
				.getText();

		// Click on any previous page number.
		homePage.clickOnPreviousPageIconFromPlaylistCarousel();

		String currentPageAfterNavigation = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("playlistCarouselActivePage_XPATH")))
				.getText();

		Assert.assertNotEquals(
				currentPageAfterNavigation,
				currentPageBeforeNavigation,
				"Failed to navigate to previous page after click on previous page icon from playlist carousel.");

		log.info("Successfully navigate to previous page after click on previous page icon from playlist carousel.\n");
		Reporter.log("<p>Successfully navigate to previous page after click on previous page icon from playlist carousel.");

		log.info("Page number before clicking on previous page icon: "
				+ currentPageBeforeNavigation + "\n");
		Reporter.log("<p>TPage number before clicking on previous page icon: "
				+ currentPageBeforeNavigation);

		log.info("Page number after clicking on previous page icon: "
				+ currentPageAfterNavigation + "\n");
		Reporter.log("<p>TPage after before clicking on previous page icon: "
				+ currentPageAfterNavigation);

	}

}
