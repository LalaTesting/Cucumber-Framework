package comcast.test.followunfollow;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;
import comcast.pages.ShowPage;

/**
 * 
 * @author karthik.ashoka 
 * Description: This test script verifies follow functionality from show page after login. 
 * from show page without login.
 *Created on 29-November-2016 
 *Last updated on 29-November-2016
 * 
 */

public class VerifyFollowFromShowPageAfterLogin extends BaseTest {

	static HomePage homePage;
	static ShowPage showPage;
	static MyShowsPage myShowsPage;
	String showPageShowName = "";

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
	 * Login to the application with valid credentials.
	 */
	@Test(description = "Step 2: Login to the application with valid credentials.", priority = 2)
	public void Step02_LoginToApplicationWithValidCredentials()
			throws Exception {

		// Login to application with valid credentials

		String email = TextProp.getProperty("email");
		String pass = TextProp.getProperty("password");

		homePage.loginToWebClient(email, pass);

	}

	/**
	 * Verify shows are present in GET TO KNOW THE SHOW section in home page
	 */
	@Test(description = "Step 3: Verify shows are present in GET TO KNOW THE SHOW section in home page.", priority = 3)
	public void Step03_VerifyShowsPresentInGetToKnowTheShowSection()
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
	 * Click on any show image from get to know the show section.
	 */
	@Test(description = "Step 4: Click on any show image from get to know the show section.", priority = 4)
	public void Step04_ClickOnShowImage() throws Exception {

		// Assigning the show title to string variable showName
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
	 * Verify Follow button is present in show page.
	 */
	@Test(description = "Step 5: Verify Follow button is present in show page.", priority = 5)
	public void Step05_VerfiyFollowButton() throws Exception {

		// Getting Show name from show page
		showPageShowName = driver.findElement(
				By.xpath(ObjRepoProp.getProperty("showPageShowTitle_XPATH")))
				.getText();
		// Verify Follow button is present in show page.
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("showPageFollowButton_XPATH")), driver),
				"Follow button is not present in show page.");

		log.info("Follow button is present in show page.\n");
		Reporter.log("<p>Follow button is present in show page.");

	}

	/**
	 * Click on follow button.
	 */
	@Test(description = "Step 6: Click on follow button.", priority = 6)
	public void Step06_ClickOnFollowButton() throws Exception {

		// Click on follow button.
		showPage.clickOnFollowButton();

		log.info("User successfully followed the show.\n");
		Reporter.log("<p>User successfully followed the show.");

		// Verify label on follow button changed to Following from Follow.

		String followingTxt = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFollowButton_XPATH")))
				.getText();

		Assert.assertEquals(followingTxt,
				TextProp.getProperty("followingText"),
				"The label on follow button is not changed to Following from Follow.");

		log.info("The label on follow button is changed to Following from Follow.\n");
		Reporter.log("<p>The label on follow button is  to Following from Follow.");

	}

	/**
	 * Mouse over the Following button.
	 */
	@Test(description = "Step 7: Mouse over the Following button.", priority = 7)
	public void Step07_MouseOverFollowingButton() throws Exception {

		// Mouse over the Following button.

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp.getProperty("showPageFollowButton_XPATH"))));
		Thread.sleep(2000);

		// Verify label on following button changed to Unfollow on mouse over.

		String unFollowTxt = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPageFollowButton_XPATH")))
				.getText();

		Assert.assertEquals(unFollowTxt, TextProp.getProperty("unfollowText"),
				"On mouse over the label of the button not changed to Unfollow");

		log.info("On mouse over the label of the button changed to Unfollow.\n");
		Reporter.log("<p>On mouse over the label of the button changed to Unfollow.");
	}

	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 8: Click on the hamburger menu.", priority = 8)
	public void Step08_ClickOnHamburgerMenu() throws Exception {

		// Click on the hamburger menu.
		showPage.clickOnHamburgerMenu();

		// Verify menu items are displayed
		Assertions.verifyMenuItemsDisplayed(driver);

	}

	/**
	 * Click on MY SHOWS menu item
	 */
	@Test(description = "Step 9: Click on MY SHOWS  menu item.", priority = 9)
	public void Step09_ClickOnMyShowsMenu() throws Exception {

		// Click on MY SHOWS menu item
		myShowsPage = showPage.clickOnMyShowsMenu();

		log.info("Successfully navigate to my shows page.\n");
		Reporter.log("<p>Successfully navigate to my shows page.");

	}

	/**
	 * Verify the followed show name is displaying in My Shows Page
	 */
	@Test(description = "Step 10: Verify the followed show name is displaying in My Shows Page", priority = 10)
	public void Step10_VerifyFollowedShowName() throws Exception {

		String myWatchPageShowsName = "";

		// Getting count of followed shows from my show page
		int followedShowsNameCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("myShowsPageShowTitle_XPATH")))
				.size();

		if (followedShowsNameCount > 0) {

			for (int i = 0; i < followedShowsNameCount; i++) {

				// Verifying followed show is present in my watch page
				if (driver
						.findElement(
								By.xpath(ObjRepoProp
										.getProperty("myShowsPageShowTitlePartOne_XPATH")
										+ i
										+ ObjRepoProp
												.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
						.isDisplayed()) {
					// Getting the nameof the followed show from my shows page
					myWatchPageShowsName = driver
							.findElement(
									By.xpath(ObjRepoProp
											.getProperty("myShowsPageShowTitlePartOne_XPATH")
											+ i
											+ ObjRepoProp
													.getProperty("myShowsPageShowTitlePartTwo_XPATH")))
							.getText();
					Assert.assertEquals(showPageShowName.toUpperCase(),
							myWatchPageShowsName.toUpperCase(),
							"The followed show name is not displaying as rows heading in my shows page.");

					log.info("The followed show name is displaying as rows heading in my shows page.\n");
					Reporter.log("<p>The followed show name is displaying as rows heading in my shows page.");
					break;

				}
				
				else{
					log.info("The followed show name is not displaying as rows heading in my shows page.\n");
					Reporter.log("<p>The followed show name is not displaying as rows heading in my shows page.");
				}
			}

		}

	}
}
