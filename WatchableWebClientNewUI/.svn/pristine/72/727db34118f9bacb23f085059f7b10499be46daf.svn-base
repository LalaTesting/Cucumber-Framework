	package comcast.test.browseshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.BrowseShowsPage;
import comcast.pages.HomePage;

/**
 * 
 * @author Karthik.ashoka 
 * Description: This test script verifies the functionality of more shows link present below the each show row in
 *         browse shows page 
 * Created on 28-October-2016 
 * Last updated on 3-November-2016
 * 
 */

public class VerifyMoreShowsLinkFunctionality extends BaseTest {

	static HomePage homePage;
	static BrowseShowsPage browseShowsPage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

		// Navigates to Watchable application URL
		homePage = HomePage.navigateToWatchableHomePage(driver, baseUrl);

		log.info("Successfully navigated to Watchable Home page\n");
		Reporter.log("<p>Successfully navigated to Watchable Home page");

	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 2: Click on the hamburger menu.", priority = 2)
	public void Step02_clickOnHamburgerMenu() throws Exception {

		// Clicking on HamburgerMenu
		homePage.clickOnHamburgerMenu();

		// Verifying the Menu Items under Hamburger Menu
		Assertions.verifyMenuItemsDisplayed(driver);
	}

	/**
	 * Verify BROWSE SHOWS menu item present in header section.
	 */
	@Test(description = "Step 3: Verify BROWSE SHOWS menu item present in header section.", priority = 3)
	public void Step03_VerifyBrowseShowsMenu() throws Exception {
		// Verify presence of BROWSE SHOWS menu.
		Assertions.verifyBrowseShowsMenu(driver);

	}

	/**
	 * Click on browse shows menu item
	 */
	@Test(description = "Step 4: Click on browse shows menu item", priority = 4)
	public void Step04_ClickOnBrowseShowMenu() throws Exception {
		// Click on BrowseShows Title from header section
		browseShowsPage = homePage.clickOnBrowseShowsMenu();

		log.info("Successfully navigated to Browse Shows page.\n");
		Reporter.log("<p>Successfully navigated to Browse Shows page.");

	}

	/**
	 * Verify MORE SHOWS link is present in brows shows page below the show row
	 * when there are more shows.
	 */
	@Test(description = "Step 5: Verify MORE SHOWS link is present in brows shows page below the show row when there are more shows", priority = 5)
	public void Step05_VerfiyMoreShowsLink() throws Exception {

		// Getting the Shows images count and assign to showImageCount variable
		int showImageCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("browseShowsPageFirstShowsRowImage_XPATH")))
				.size();

		// Validating if showImageCount value greater than 3 then More Shows
		// Link should display
		if (showImageCount > 3) {

			// Verifying the More Shows Link is displaying for more shows
			Assert.assertTrue(
					CustomFun.isElementPresent(
							By.xpath(ObjRepoProp
									.getProperty("browseShowsPageFirstMoreShowsRowLink_XPATH")),
							driver),
					"More shows link is not present in browse shows page");

			log.info(" More shows link is present in browse shows page\n");
			Reporter.log("<p> More shows link is present in browse shows page.");
		}
	}

	/**
	 * Click on MORE SHOWS link from second show row.
	 */
	@Test(description = "Step 6: Click on MORE SHOWS link from second show row", priority = 6)
	public void Step06_ClickOnMoreShowsLink() throws Exception {

		// Getting the value More Shows value
		String moreShowValue = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("browseShowsPageFirstMoreShowsRowLink_XPATH")))
				.getText();

		// Verifying the More Shows Link is displaying for more shows
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("browseShowsPageFirstMoreShowsRowLink_XPATH")),
				driver), "More shows link is not present in browse shows page");

		log.info(moreShowValue
				+ " : link is present in browse shows page of Second Row \n");
		Reporter.log(moreShowValue
				+ "<p> : link is present in browse shows page of Second Row.");

		// Adding scroll down page function

		browseShowsPage.scrollToGenreSection();

		// Clicking on More shows link from Second Row
		browseShowsPage.clickOnMoreShowsLink();

		// Verifying the More Shows link after More Shows loaded.
		Assert.assertFalse(!CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("browseShowsPageFirstMoreShowsRowLink_XPATH")),
				driver), "More shows are not loaded (Displayed)");
		log.info("More shows are loaded (Displayed).\n");
		Reporter.log("<p>More shows are loaded (Displayed).");

	}

}
