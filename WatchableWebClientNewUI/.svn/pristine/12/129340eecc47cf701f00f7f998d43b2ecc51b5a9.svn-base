package comcast.test.showpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.ShowPage;

/**
 * 
 * @author Manoj.Paragen 
 * Description: This test script verifies logout from show page user is navigating back to home page. 
 * Created on 14-October-2016 
 * Last updated on 14-October-2016
 * 
 */

public class VerifyLogoutFromShowPageNavigatingToHomePage extends BaseTest {

	static HomePage homePage;
	static ShowPage showPage;
	

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
	 * Click on logout from user menu  
	 */
	@Test(description = "Step 5: Click on logout from user menu . ", priority = 5)
	public void Step05_ClickOnLogoutFromShowPage() throws Exception {

		// Playlist page object instance creation
		// playlistPage = new PlaylistPage(driver);
		
				// Click on logout from show Page
		homePage = showPage.clickOnLogoutMenu();

		
		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");

	}

}
