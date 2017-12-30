package comcast.test.showpage;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.ShowPage;

/**
 * 
 * @author karthik.ashoka 
 * Description: This test script verifies user is navigating back to home page from show page by clicking on home footer link 
 * Created on 14-October-2016 
 * Last updated on 14-October-2016
 * 
 */

public class VerifyNavigatingToHomePageFromShowPageClickingOnHomeFooterLink extends BaseTest {
	
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

		//Getting the attribute name of show name and assiging to variable showName
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
	 * Verify home link is present in the footer of the page.
	 */
	@Test(description = "Step 4: Verify home link is present in the footer of the page.", priority = 4)
	public void Step04_VerifyHomeLinkInFooterSection() throws Exception {
			
		//Verify Home link is present in the footer section of page		
		Assert.assertTrue(CustomFun.isElementPresent(
				By.xpath(ObjRepoProp.getProperty("homePageFooterHomeLink_XPATH")),
				driver), "Home Link is not present in the footer of the page.");

		
		log.info("Home link is present in the footer of the page.\n");
		Reporter.log("<p>Home link is present in the footer of the page.");
	}
	
	/**
	 * Click on home link. 
	 */
	@Test(description = "Step 5: Click on home link.", priority = 5)
	public void Step05_ClickOnHomeLink() throws Exception {
		
		//Clicking on Home Link present under footer section
		homePage = showPage.clickOnFooterSectionHomeLink();
		
		log.info("Successfully navigated to home page.\n");
		Reporter.log("<p>Successfully navigated to home page.");
		
	}

}
