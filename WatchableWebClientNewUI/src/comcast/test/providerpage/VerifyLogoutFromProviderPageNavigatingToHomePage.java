package comcast.test.providerpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
import org.openqa.selenium.By;
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
 * Description: This test script verifies logout from provider page user is navigating back to home page. 
 * Created on 20-October-2016 
 * Last updated on 20-October-2016
 * 
 */

public class VerifyLogoutFromProviderPageNavigatingToHomePage extends BaseTest {

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
	 * Verify shows are present in GET TO KNOW THE SHOW section
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
	 * Click on first show image
	 */
	@Test(description = "Step 4: Click on any show image from get to know the show section.", priority = 4)
	public void Step04_ClickOnShowImage() throws Exception {

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
	@Test(description = "Step 5: Verify provider name is displaying in show page.", priority = 5)
	public void Step05_VerifyProviderName() throws Exception {

		// Verify provider name

		Assertions.verifyProviderName(driver);

	}

	/**
	 * Click on Provider name.
	 */
	@Test(description = "Step 6: Click on Provider name.", priority = 6)
	public void Step06_ClickOnProviderName() throws Exception {

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
	 * Click on logout from user menu
	 */
	@Test(description = "Step 7: Click on logout from user menu . ", priority = 7)
	public void Step07_ClickOnLogoutFromProviderPage() throws Exception {

		// Click on logout from provider Page
		homePage = providerPage.clickOnLogoutMenu();

		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
