package comcast.test.followunfollow;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.ShowPage;

/**
 * 
 * @author karthik.ashoka 
 * Description: This test script verifies display of login pop-up when user tries to do follow functionality 
 * from show page without login.
 *Created on 28-November-2016 
 *Last updated on 28-November-2016
 * 
 */

public class VerifyFollowFromShowPageWithoutLogin extends BaseTest {

	static HomePage homePage;
	static ShowPage showPage;

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
	 * Verify shows are present in GET TO KNOW THE SHOW section in home page
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
	 * Click on any show image from get to know the show section.
	 */
	@Test(description = "Step 3: Click on any show image from get to know the show section.", priority = 3)
	public void Step03_ClickOnShowImage() throws Exception {

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
	@Test(description = "Step 4: Verify Follow button is present in show page.", priority = 4)
	public void Step04_VerfiyFollowButton() throws Exception {

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
	@Test(description = "Step 5: Click on follow button.", priority = 5)
	public void Step05_ClickOnFollowButton() throws Exception {

		// Click on follow button.

		showPage.clickOnFollowButton();

		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp.getProperty("loginForm_XPATH")))
						.isDisplayed(),
				"Login pop-up is not displayed after clicking on Follow button without login.");

		log.info("Login pop-up is displayed after clicking on Follow button without login.\n");
		Reporter.log("<p>Login pop-up is displayed after clicking on Follow button without login.");

	}

}
