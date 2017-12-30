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
 * @author karthik.ashoka 
 * Description: This test script verifies the contents of the show section in provider detail page.
 *Created on 20-October-2016 
 *Last updated on 20-October-2016
 * 
 */

public class VerifyShowSection extends BaseTest {

	static HomePage homePage;
	static ShowPage showPage;
	static ProviderPage providerPage;

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
	 * Verify provider name is displaying in show page.
	 */
	@Test(description = "Step 4: Verify provider name is displaying in show page.", priority = 4)
	public void Step04_VerifyProviderNameInShowPage() throws Exception {

		// Verifying the Provider name
		Assertions.verifyProviderName(driver);
	}

	/**
	 * Click on Provider name.
	 */
	@Test(description = "Step 5: Click on Provider name.", priority = 5)
	public void Step05_ClickOnProviderName() throws Exception {

		// Getting publisher name and assigning to variable providerName
		String providerName = driver.findElement(
				By.xpath(ObjRepoProp
						.getProperty("showPagePublisherTitle_XPATH")))
				.getText();

		// click on Provider/publisher name
		providerPage = showPage.clickOnPublisherTitle();

		log.info("Successfully Clicked on the Provider Name: " + providerName
				+ "\n");
		Reporter.log("<p>Successfully Clicked on the Provider Name: "
				+ providerName);

		log.info("Successfully navigate to Provider page.\n");
		Reporter.log("<p>Successfully navigate to Provider page.");

	}

	/**
	 * Verify Title is displaying for show section in Provider page.
	 */
	@Test(description = "Step 6: Verify Title is displaying for show section in Provider page.", priority = 6)
	public void Step06_VerifyShowTitleInProviderPage() throws Exception {

		// Verifying Show Title displaying or not
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("providerPageShowTitle_XPATH")), driver),
				"Title is not displaying for show section in Provider page.");

		log.info("Title is displaying for show section in Provider page.\n");
		Reporter.log("<p>Title is displaying for show section in Provider page.");

		// Getting Show title from Provider page and assigning to variable
		// showTitle
		String showTitle = driver
				.findElement(
						By.xpath(ObjRepoProp
								.getProperty("providerPageShowTitle_XPATH")))
				.getText();
		log.info("The title displayed is: " + showTitle + "\n");
		Reporter.log("<p>The title displayed is:" + showTitle);

	}

	/**
	 * Verify show are present in show section in Provider page
	 */
	@Test(description = "Step 7: Verify show are present in show section in Provider page.", priority = 7)
	public void Step07_VerifyShowsArePresentInProviderPage() throws Exception {
		// Getting Show image and assigning to variable showCount
		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("providerPageShowLogo_XPATH")))
				.size();

		// Verifying showCount is greater than 0
		Assert.assertTrue(showCount > 0,
				"Shows are not present in show section in Provider page.");

		log.info("Shows are present in show section in Provider page.\n");
		Reporter.log("<p>Shows are present in show section in Provider page.");

		// Assigning the Zero value to variable showImageCount
		int showImageCount = 0;

		for (int i = 1; i <= showCount; i++) {

			// Validating show images are displaying or not
			if (driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("providerPageShowImagePartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("providerPageShowImagePartTwo_XPATH")))
					.isDisplayed()) {
				// Incrementing the showImageCount value
				showImageCount = showImageCount + 1;

			}
		}

		log.info("Number of shows present in show section is : "
				+ showImageCount + "\n");
		Reporter.log("<p>Number of shows present in show section is : "
				+ showImageCount);

	}

	/**
	 * Verify names are displaying on shows in show section in Provider page
	 */
	@Test(description = "Step 8: Verify names are displaying on shows in show section in Provider page.", priority = 8)
	public void Step08_VerifyNamesOnShowImage() throws Exception {
		// Creating global variable showName
		String showName = "";

		// Getting show image count and assigning to variable showCount
		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("providerPageShowLogo_XPATH")))
				.size();

		// Validating showCount greater than zero
		if (showCount > 0) {
			log.info("Show name is displaying on show Image and following names displayed are : \n");
			Reporter.log("<p>Show name is displaying on show Image and following names displayed are : ");
		}

		// Loop starts to get showname
		for (int i = 1; i <= showCount; i++) {

			// Validating show images are displaying or not
			if (driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("providerPageShowImagePartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("providerPageShowImagePartTwo_XPATH")))
					.isDisplayed()) {
				// Getting the attribute values of Images
				showName = driver
						.findElement(
								By.xpath(ObjRepoProp
										.getProperty("providerPageShowImagePartOne_XPATH")
										+ i
										+ ObjRepoProp
												.getProperty("providerPageShowImagePartTwo_XPATH")))
						.getAttribute("alt");

				// Printing the show name values
				log.info(showName + "\n");
				Reporter.log("<p>" + showName);
			}

		}

	}

	/**
	 * Verify show logos are clickable in show section in Provider page.
	 */
	@Test(description = "Step 9: Verify show logos are clickable in show section in Provider page.", priority = 9)
	public void Step09_VerifyShowLogoAreClickable() throws Exception {
		// Verifying the Show logos are clickable
		Assert.assertTrue(
				driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("providerPageFirstShowImage_XPATH")))
						.isEnabled(),
				"Show logos are not clickable in show section in Provider page.");

		log.info("Show logos are clickable in show section in Provider page.\n");
		Reporter.log("<p>Show logos are clickable in show section in Provider page.");

	}
	
}

