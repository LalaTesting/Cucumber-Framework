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
 * Description: This test script verifies the content of social sharing section in home page. 
 *Created on 29-September-2016 
 *Last updated on 29-September-2016
 * 
 */

public class VerifySocialSharingSectionContent extends BaseTest {

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
	 * Verify social sharing options
	 */
	@Test(description = "Step 2: Verify social sharing options are present in home page.", priority = 2)
	public void Step02_VerifySocialSharingOptions() throws Exception {

		// Move to social sharing options

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("homePageSoocialSharingSection_XPATH"))));

		// Verify social sharing options
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageSoocialSharingSection_XPATH")), driver),
				"Social sharing options is not present in home page");

		log.info("Social sharing options are present in home page below the STAY CONNECTED section.\n");
		Reporter.log("<p>Social sharing options are present in home page below the STAY CONNECTED section.");

	}

	/**
	 * Verify Instagram icon
	 */
	@Test(description = "Step 03: Verify Instagram icon is present in social sharing section.", priority = 03)
	public void Step03_VerifyInstagramIcon() throws Exception {

		// Verify Instagram icon

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageInstagramIcon_XPATH")), driver),
				"Instagram icon is not present in social sharing section.");

		log.info("Instagram icon is present in social sharing section with the label '"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageInstagramLabel_XPATH")))
						.getText() + "'.\n");
		Reporter.log("<p>Instagram icon is present in social sharing section with the label '"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageInstagramLabel_XPATH")))
						.getText());

	}

	/**
	 * Verify Facebook icon
	 */
	@Test(description = "Step 04: Verify Facebook icon is present in social sharing section.", priority = 05)
	public void Step04_VerifyFacebookIcon() throws Exception {

		// Verify Facebook icon

		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageFaceboobIcon_XPATH")), driver),
				"Facebook icon is not present in social sharing section.");

		log.info("Facebook icon is present in social sharing section with the label '"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFaceboobLabel_XPATH")))
						.getText() + "'.\n");
		Reporter.log("<p>Facebook icon is present in social sharing section with the label '"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFaceboobLabel_XPATH")))
						.getText());

	}

	/**
	 * Verify Twitter icon
	 */
	@Test(description = "Step 05: Verify Twitter icon is present in social sharing section.", priority = 05)
	public void Step05_VerifyTwitterIcon() throws Exception {

		// Verify Twitter icon

		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("homePageTwitterIcon_XPATH")),
				driver),
				"Twitter icon is not present in social sharing section.");

		log.info("Twitter icon is present in social sharing section with the label '"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageTwitterLabel_XPATH")))
						.getText() + "'.\n");
		Reporter.log("<p>Twitter icon is present in social sharing section with the label '"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageTwitterLabel_XPATH")))
						.getText());

	}

}
