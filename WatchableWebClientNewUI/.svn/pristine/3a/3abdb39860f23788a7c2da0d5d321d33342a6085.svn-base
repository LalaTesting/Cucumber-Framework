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
 * @author Manoj.Paragen 
 * Description: This test script verifies the contents of browse show page. 
 * Created on 02-November-2016 
 * Last updated on 03-November-2016
 * 
 */

public class VerifyBrowseShowsPageContents extends BaseTest {

	static HomePage homePage;
	static BrowseShowsPage browseShowsPage;

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
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 2: Click on the hamburger menu.", priority = 2)
	public void Step02_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		homePage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);
	}

	/**
	 * Verify BROWSE SHOWS menu.
	 */
	@Test(description = "Step 3: Verify BROWSE SHOWS menu item present in header section.", priority = 3)
	public void Step03_VerifyBrowseShowsMenu() throws Exception {

		// Verify presence of BROWSE SHOWS menu.
		Assertions.verifyBrowseShowsMenu(driver);
	}

	/**
	 * Click on browse shows menu item
	 */
	@Test(description = "Step 4: Click on browse shows menu item.", priority = 4)
	public void Step04_ClickOnbrowseShowsMenu() throws Exception {

		// Click on browse shows menu.
		browseShowsPage = homePage.clickOnBrowseShowsMenu();

		log.info("Successfully navigated to Browse Shows page.\n");
		Reporter.log("<p>Successfully navigated to Browse Shows page.");

	}

	/**
	 * Verify browse shows page heading
	 */
	@Test(description = "Step 5: Verify the page heading is present in browse shows page.", priority = 5)
	public void Step05_VerifyBrowseShowsPageHeading() throws Exception {

		// Verify browse shows page heading

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("browseShowsPageHeading_XPATH")), driver),
				"Page heading is not present in browse show page.");

		log.info("Page heading is present in browse show page.\n");
		Reporter.log("<p>Page heading is present in browse show page.");

		log.info("The Page heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("browseShowsPageHeading_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The Page heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("browseShowsPageHeading_XPATH")))
						.getText());
	}

	/**
	 * Verify Genre categories are present
	 */
	@Test(description = "Step 6: Verify Genre categories are present in browse shows page.", priority = 6)
	public void Step06_VerifyGenreCategoryPresent() throws Exception {

		// Scroll down through shows section to load more shows

		browseShowsPage.scrollDownThroughShowSection();

		int genreCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("browseShowsPageGenreTitle_XPATH")))
				.size();

		Assert.assertTrue(genreCount > 0,
				"Genre categories are not present in browse shows page.");

		log.info("Genre categories are present in browse shows page.\n");
		Reporter.log("<p>Genre categories are present in browse shows page.");

		log.info("Following Genre categories are present in browse shows page.\n");
		Reporter.log("<p>Following Genre categories are present in browse shows page.");

		// Printing Genre name
		for (int i = 1; i < genreCount; i++) {

			log.info(driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("browseShowsPageGenreTitlePartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("browseShowsPageGenreTitlePartTwo_XPATH")))
					.getText()
					+ "\n");
			Reporter.log("<p>"
					+ driver.findElement(
							By.xpath(ObjRepoProp
									.getProperty("browseShowsPageGenreTitlePartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("browseShowsPageGenreTitlePartTwo_XPATH")))
							.getText());

		}

	}

	/**
	 * Verify shows are present
	 */
	@Test(description = "Step 7: Verify shows are present under genre.", priority = 7)
	public void Step07_VerifyShowsPresentUnderGenre() throws Exception {

		// Getting Show count
		int showCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("browseShowsPageShowImage_XPATH"))).size();

		log.info("Show Count: " + showCount);

		Assert.assertTrue(showCount > 0,
				"Sows are not present under genre in browse shows page.");

		log.info("Sows are present under genre in browse shows page.\n");
		Reporter.log("<p>Sows are present under genre in browse shows page.");

	}

	/**
	 * Verify MORE Shows link is present under
	 */
	@Test(description = "Step 8: Verify MORE Shows link is present under each genre when there are more shows.", priority = 8)
	public void Step08_VerifyMoreShowsLinkPresent() throws Exception {

		// Getting MORE Shows link count
		int moreShowsLinkCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("browseShowsPageGenreMoreShowsLink_XPATH")))
				.size();

		log.info("More Shows Link Count: " + moreShowsLinkCount);

		Assert.assertTrue(moreShowsLinkCount > 0,
				"MORE SHOWS link is not present under genre when there are more shows.");

		log.info("MORE SHOWS link is present under genre when there are more shows.\n");
		Reporter.log("<p>MORE SHOWS link is present under genre when there are more shows.");

	}

}
