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
 * Description: This test script verifies the content of stay connected section in home page. 
 *Created on 04-October-2016 
 *Last updated on 04-October-2016
 * 
 */

public class VerifyStayConnectedSectionContent extends BaseTest {

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
	 * Verify STAY CONNECTED section
	 */
	@Test(description = "Step 02: Verify STAY CONNECTED section is present in home page.", priority = 02)
	public void Step02_VerifyStayConnectedSection() throws Exception {

		// Move to STAY CONNECTED section

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("homePageStayConnectedSection_XPATH"))));

		// Verify STAY CONNECTED section
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageStayConnectedSection_XPATH")), driver),
				"STAY CONNECTED section is not present in home page");

		log.info("STAY CONNECTED is present in home page below the EXPLORE NOW button.\n");
		Reporter.log("<p>STAY CONNECTED is present in home page below the EXPLORE NOW button.");

	}

	/**
	 * Verify STAY CONNECTED section heading
	 */
	@Test(description = "Step 03: Verify heading is displaying for STAY CONNECTED section.", priority = 03)
	public void Step03_VerifyStayConnectedSectionHeading() throws Exception {

		// Verify STAY CONNECTED section heading

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageStayConnectedTitle_XPATH")), driver),
				"The heading is not displaying for stays connected section");

		log.info("The heading is displaying for stays connected section and the heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageStayConnectedTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The heading is displaying for stays connected section and the heading displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageStayConnectedTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify STAY CONNECTED section sub title
	 */
	@Test(description = "Step 04: Verify sub title is displaying for STAY CONNECTED section.", priority = 04)
	public void Step04_VerifyStayConnectedSectionSubTitle() throws Exception {

		// Verify STAY CONNECTED section sub title

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageStayConnectedSubTitle_XPATH")), driver),
				"The sub title is not displaying for stays connected section");

		log.info("The sub title is displaying for stays connected section and the sub title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageStayConnectedSubTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>The sub title is displaying for stays connected section and the sub title displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageStayConnectedSubTitle_XPATH")))
						.getText());

	}

	/**
	 * Verify popular instagram images are displaying in STAY CONNECTED section
	 */
	@Test(description = "Step 05: Verify popular instagram images are displaying in stay connected section.", priority = 05)
	public void Step05_VerifyPopularInstagramImagesDisplaying()
			throws Exception {

		// Verify popular instagram images are displaying in STAY CONNECTED
		// section

		int instagramImagesCount = 0;
		int instagramImgCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("homePageStayConnectedInstagramImg_XPATH")))
				.size();

		for (int i = 1; i <= instagramImgCount; i++) {

			if (driver
					.findElement(
							By.xpath(ObjRepoProp
									.getProperty("homePageStayConnectedInstagramImgPartOne_XPATH")
									+ i
									+ ObjRepoProp
											.getProperty("homePageStayConnectedInstagramImgPartTwo_XPATH")))
					.isDisplayed()) {

				instagramImagesCount = instagramImagesCount + 1;
			}

		}

		Assert.assertTrue(instagramImagesCount > 0,
				"Popular instagram images are not displaying in STAY CONNECTED section");

		log.info("Popular instagram images are displaying in STAY CONNECTED section and the total number of images present are: "
				+ instagramImagesCount + "\n");
		Reporter.log("<p>Popular instagram images are displaying in STAY CONNECTED section and the total number of images present are: "
				+ instagramImagesCount);

	}

}
