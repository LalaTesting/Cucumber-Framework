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
 * @author Karthik.ashoka Description: This test script verifies shows are
 *         present in Get to know the show section in home page. 
 *         Created on 30-September-2016 
 *         Last updated on 04-October-2016
 * 
 */

public class VerifyPopularShowsAreDisplayed extends BaseTest {

	static HomePage homePage;

	/**
	 * Open the browser, Enter the Watchable URL
	 */
	@Test(description = "Step 1: Open the browser, Enter the Watchable URL", priority = 1)
	public void Step01_NavigeteToURL() throws Exception {

		// Navigates to Watchable application URL
		homePage = HomePage.navigateToWatchableHomePage(driver, baseUrl);

		log.info("Successfully navigated to Watchable web client Home page.\n");
		Reporter.log("<p>Successfully navigated to Watchable web client Home page.</p>");

	}

	/**
	 * Verify GET TO KNOW THE SHOW section is present in home page.
	 */
	@Test(description = "Step 2: Verify GET TO KNOW THE SHOW section is present in home page.", priority = 2)
	public void Step02_VerifyGetToKnowTheShowSection() throws Exception {

		// Mouse Hover on GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageGetToKnowTheShowSection_XPATH"))));

		// Verify GET TO KNOW THE SHOW section present or not
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageGetToKnowTheShowSection_XPATH")),
						driver),
				"GET TO KNOW THE SHOW section is not present in home page");

		log.info("GET TO KNOW THE SHOW section is present in home page.\n");
		Reporter.log("<p>GET TO KNOW THE SHOW section is present in home page.");

	}

	/**
	 * Verify heading is displaying for GET TO KNOW THE SHOW section.
	 */
	@Test(description = "Step 3: Verify heading is displaying for GET TO KNOW THE SHOW section.", priority = 3)
	public void Step03_VerifyHeadingOfGetToKnowTheShowSection()
			throws Exception {

		// Verifying GET TO KNOW THE SHOW section Heading
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageShowSectionTitle_XPATH")), driver),
				"Heading is not displaying for GET TO KNOW THE SHOW section.");

		log.info("The heading  is displaying for GET TO KNOW THE SHOW section and the heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageShowSectionTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The heading  is displaying for GET TO KNOW THE SHOW section and the heading displayed is:  "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageShowSectionTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify shows are present in GET TO KNOW THE SHOW section in home page.
	 */
	@Test(description = "Step 4: Verify shows are present in GET TO KNOW THE SHOW section in home page.", priority = 4)
	public void Step04_VerifyShowsInGetToKnowTheShowSection() throws Exception {

		// Verifying the Shows are displaying under GET TO KNOW THE SHOW section
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageShowLogoImage_XPATH")), driver),
				"Shows are not present in GET TO KNOW THE SHOW section.");

		log.info("Shows are  present in GET TO KNOW THE SHOW section\n");
		Reporter.log("<p>Shows are  present in GET TO KNOW THE SHOW section<p>.");

		// Checking the count of Show images
		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("homePageShowLogoImage_XPATH")))
				.size();

		// Assigning the Zero value to variable showImageCount
		int showImageCount = 0;

		for (int i = 1; i <= showCount; i++) {

			// Validating show images are displaying or not
			if (driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("homePageShowLogoPartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("homePageShowLogoPartTwo_XPATH")))
					.isDisplayed()) {
				// Incrementing the showImageCount value
				showImageCount = showImageCount + 1;

			}
		}

		log.info(showImageCount
				+ " shows are present in GET TO KNOW THE SHOW section.\n");
		Reporter.log("<p>" + showImageCount
				+ " shows are present in GET TO KNOW THE SHOW section");

	}

	/**
	 * Verify show name is displaying on shows in get to know the show section.
	 */
	@Test(description = "Step 5: Verify show name is displaying on shows in get to know the show section.", priority = 5)
	public void Step05_VerifyShowsNameDisplayOnShowImage() throws Exception {

		String showName = "";
		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("homePageShowLogoImage_XPATH")))
				.size();

		if (showCount > 0) {
			log.info("Show name is displaying on show logo on and the name displayed are\n");
			Reporter.log("<p>Show name is displaying on show logo on and the name displayed are");
		}

		for (int i = 1; i <= showCount; i++) {

			// Validating show images are displaying or not
			if (driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("homePageShowLogoPartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("homePageShowLogoPartTwo_XPATH")))
					.isDisplayed()) {
				// Getting the attribute values of Images
				showName = driver
						.findElement(
								By.xpath(ObjRepoProp
										.getProperty("homePageShowLogoPartOne_XPATH")
										+ i
										+ ObjRepoProp
												.getProperty("homePageShowLogoPartTwo_XPATH")))
						.getAttribute("alt");

				// Printing the show name values
				log.info(showName + "\n");
				Reporter.log("<p>" + showName);
			}

		}

	}
}
