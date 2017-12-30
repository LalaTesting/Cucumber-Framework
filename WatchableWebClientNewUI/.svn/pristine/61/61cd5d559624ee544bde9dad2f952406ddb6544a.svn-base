package comcast.test.myshowspage;

import static comcast.util.PropertyFileReader.ObjRepoProp;
import static comcast.util.PropertyFileReader.TextProp;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.pages.HomePage;
import comcast.pages.MyShowsPage;
import comcast.pages.WatchPage;


/**
 * 
 * @author Karthik.ashoka 
 * Description: This test script verifies navigating to watch shows from my shows page when there are followed shows by clicking on first video title.
 * Created on 14-November-2016 
 * Last updated on 15-November-2016
 * 
 */

public class VerifyNavigatingToWatchPageFromMyshowsPageWhenFollowedShowsFromVideo extends BaseTest {
	
	static HomePage homePage;
	static MyShowsPage myShowsPage;
	static WatchPage watchPage;
	boolean showTitlePresent = false;
	
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
	public void Step02_LoginToApplicationWithValidCredential() throws Exception {
		
		//Assgingin email and password value from TextProperty and assiging to variables
		String email = TextProp.getProperty("email");
		String pass = TextProp.getProperty("password");

		//Login to application with valid credentials
		homePage.loginToWebClient(email, pass);
		
	}
	
	/**
	 * Click on the hamburger menu.
	 */
	@Test(description = "Step 3: Click on the hamburger menu.", priority = 3)
	public void Step03_ClickOnHamburgerMenu() throws Exception {

		// Clicking on HamburgerMenu
		homePage.clickOnHamburgerMenu();
		
		//Verifying the Menu items are displaying or not
		Assertions.verifyMenuItemsDisplayed(driver);

	}
	
	/**
	 * Verify MY SHOWS menu item present in header section.
	 */
	@Test(description = "Step 4: Verify MY SHOWS menu item present in header section.", priority = 4)
	public void Step04_VerifyMyShowsMenuInHeaderSection() throws Exception {
		
		//Verifying My Show menu are displaying or not
		Assertions.verifyMyShowstsMenu(driver);
		
	}
	
	/**
	 * Click on MY SHOWS  menu item
	 */
	@Test(description = "Step 5: Click on MY SHOWS  menu item.", priority = 5)
	public void Step05_ClickOnMyShowsMenu() throws Exception {
		
		//Clicking on My Shows Menu
		myShowsPage = homePage.clickOnMyShowsMenu();
		
		log.info("Successfully navigate to My Shows page. \n");
		Reporter.log("<p>Successfully navigate to My Shows page.");
		
	}
	
	/**
	 * Verify videos are present under followed shows name heading.
	 */
	@Test(description = "Step 6: Verify videos are present under followed shows name heading.", priority = 6)
	public void Step06_VerifyVideosUnderFirstFollowedShows() throws Exception {
		
	// Verify followed shows name title is displaying
		int showCount = driver.findElements(
				By.xpath(ObjRepoProp.getProperty("myShowsPageShowTitle_XPATH")))
				.size();
		if (showCount > 0) {
			showTitlePresent = true;
			log.info("Videos are present under followed shows name heading.\n");
			Reporter.log("<p>Videos are present under followed shows name heading.");
		}
	
		else {
			log.info("Videos are not present under followed shows name heading.\n");
			Reporter.log("<p>Videos are not present under followed shows name heading.");
		}
	
	}
	
	/**
	 * Click on video title from first video (If videos present).
	 */
	@Test(description = "Step 7: Click on video title from first video (If videos present).", priority = 7)
	public void Step07_ClickOnTitleOfFirstVideo() throws Exception {
	
		
		if (showTitlePresent == true)
		{
			//Getting video title text
			String videoTitle = driver.findElement(
					By.xpath(ObjRepoProp
							.getProperty("myShowsPageFirstVideoTitleOfFirstFollowedShows_XPATH"))).getText();
			
			//Clicking on First Video title from My Shows page
			watchPage = myShowsPage.clickOnFirstVideoTitle();
			
			log.info("Successfully Clicked on the First Video Title: " + videoTitle  + "\n");
			Reporter.log("<p>Successfully Clicked on the First Video Title:  " + videoTitle);

			log.info("Successfully navigate to watch page.\n");
			Reporter.log("<p>Successfully navigate to watch page.");
		}
		
				
	}
	
}
