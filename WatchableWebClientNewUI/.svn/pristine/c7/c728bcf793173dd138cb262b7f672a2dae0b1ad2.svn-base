package comcast.test.showpage;

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
 * Description: This test script verify the contents of show page 
 *Created on 07-October-2016 
 *Last updated on 10-October-2016
 * 
 */

public class VerifyShowPageContents extends BaseTest {
	
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

		//Assigning the show title to string variable showName
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
	 * Verify header text is present in show page.
	 */
	@Test(description = "Step 4: Verify header text is present in show page.", priority = 4)
	public void Step04_VerfiyHeaderTextForShowPage() throws Exception {
		
		//Verifying the Header Text displaying for Show Page
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("showPageShowHeadingText_XPATH")), driver),
						"Header text not present in show page.");
		
		log.info("Header text is present in show page. \n");
		Reporter.log("<p>Header text is present in show page.");
		
		//Assigning header text value to variable headerText
		String headerText = driver.findElement(By.xpath(ObjRepoProp.getProperty("showPageShowHeadingText_XPATH"))).getText();
		log.info("The header present in Show page is: " + headerText + "\n");
		Reporter.log("<p>The header present Sin how page is: " + headerText);
		
	}
	
	
	/**
	 * Verify Show logo is present in show page.
	 */
	@Test(description = "Step 5: Verify Show logo is present in show page.", priority = 5)
	public void Step05_VerfiyShowLogoInShowPage() throws Exception {
		
		//Verifying the Show logo displaying in Show Page or not
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
								.getProperty("showPageShowLogo_XPATH")), driver),
								"Show logo not present in show page.");
		
		log.info("Show logo is present in show page. \n");
		Reporter.log("<p>Show logo is present in show page.");
	}
	
	
	/**
	 * Verify show name is displaying in show page.
	 */
	@Test(description = "Step 6: Verify show name is displaying in show page.", priority = 6)
	public void Step06_VerfiyShowNameInShowPage() throws Exception {
		
		//Verifying the Show Name displaying in Show Page or not
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
										.getProperty("showPageShowTitle_XPATH")), driver),
										"Show name is not displaying in show page.");
				
		log.info("Show name is displaying in show page. \n");
		Reporter.log("<p>Show name is displaying in show page.");
		
		//Getting the showname text and assiging to variable showName
		String showName = driver.findElement(By.xpath(ObjRepoProp.getProperty("showPageShowTitle_XPATH"))).getText();
		
		log.info("The show name displayed is:" + showName +  "\n");
		Reporter.log("<p>The show name displayed is:" + showName);
				
	}
		
	/**
	 * Verify publisher name is displaying in show page.
	 */
	@Test(description = "Step 7: Verify publisher name is displaying in show page..", priority = 7)
	public void Step07_VerfiyPublisherNameInShowPage() throws Exception {
		
		//Verifying the Publisher Name displaying in Show Page or not
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
							.getProperty("showPagePublisherTitle_XPATH")), driver),
										"Publisher name is not displaying in show page.");
						
		log.info("Publisher name is displaying in show page. \n");
		Reporter.log("<p>Publisher name is displaying in show page.");
		
		//Getting the Publisher name text and assiging to variable showName
		String publisherName = driver.findElement(By.xpath(ObjRepoProp.getProperty("showPagePublisherTitle_XPATH"))).getText();
		
		log.info("The publisher name displayed is:" + publisherName +  "\n");
		Reporter.log("<p>The publisher name displayed is:" + publisherName);
		
	}
		
	/**
	 * Verify Show description is displaying in show page.
	 */
	@Test(description = "Step 8: Verify Show description is displaying in show page.", priority = 8)
	public void Step08_VerfiyShowDescriptionInShowPage() throws Exception {
	
		//Verifying the Show description displaying in Show Page or not
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
							.getProperty("showPageShowDescription_XPATH")), driver),
							"Show description not displaying in show page..");
						
		log.info("Show description is displaying in show page.\n");
		Reporter.log("<p>Show description is displaying in show page.");
		
		//Getting the Publisher name text and assiging to variable showDescription
		String showDescription = driver.findElement(By.xpath(ObjRepoProp.getProperty("showPageShowDescription_XPATH"))).getText();
		
		log.info("The Show description displayed is:" + showDescription +  "\n");
		Reporter.log("<p>The Show description displayed is:" + showDescription);
				
		
	}
	
	
	/**
	 * Verify video count is displaying in show page.
	 */
	@Test(description = "Step 9: Verify video count is displaying in show page.", priority = 9)
	public void Step09_VerfiyVideoCountInShowPage() throws Exception {
		
		//Getting whole sentence with Video count value
		String showInfo = driver.findElement(By.cssSelector(ObjRepoProp.getProperty("showPageVideoCountValue_CSS"))).getText();
		
		//Getting only videoCount and assigning to videoCount variable
		int videoCount = Integer.parseInt(showInfo.replaceAll("\\D", ""));
		
		Assert.assertTrue(videoCount > 0,
				"Video count is not displaying in show page.");
		
		log.info("Video count is displaying in show page.\n");
		
		Reporter.log("<p>Video count is displaying in show page.");
				
		log.info("The video count displayed is:" + videoCount +  "\n");
		
		Reporter.log("<p>The video count displayed is:" + videoCount);
	}
	
	
	/**
	 * Verify Follow button is present in show page.
	 */
	@Test(description = "Step 10: Verify Follow button is present in show page.", priority = 10)
	public void Step10_VerfiyFollowButton() throws Exception {
		
	//Verify Follow button is present in show page.
	Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
									.getProperty("showPageFollowButton_XPATH")), driver),
									"Follow button is not present in show page.");
								
	log.info("Follow button is present in show page.\n");
	Reporter.log("<p>Follow button is present in show page.");
		
	}
	
	
	/**
	 * Verify Title is displaying for video section in show page.
	 */
	@Test(description = "Step 11: Verify Title is displaying for video section in show page.", priority = 11)
	public void Step11_VerfiyTitleForVideoSection() throws Exception {
		
	//Verify Title is displaying for video section in show page.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
											.getProperty("showPageTitleForVideoSection_XPATH")), driver),
											"Title is not displaying for video section in show page.");
		log.info("Title is displaying for video section in show page..\n");
		Reporter.log("<p>Title is displaying for video section in show page.");
		
		//Getting title and assiging to variable videoTitle
		String videoTitle = driver.findElement(By.xpath(ObjRepoProp.getProperty("showPageTitleForVideoSection_XPATH"))).getText();
		log.info("The title displayed is:" + videoTitle + "\n" );
		Reporter.log("<p>The title displayed is:"  + videoTitle);
		
	}
	
	
	/**
	 * Verify videos are present in video section in show page
	 */
	@Test(description = "Step 12: Verify videos are present in video section in show page", priority = 12)
	public void Step12_VerfiyVideosArePresent() throws Exception {

		//Verify number of videos are displaying.
		int videoCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("showPageVideoCount_XPATH")))
				.size();
		
		Assert.assertTrue(videoCount > 0,
				"Video are not present in video section in show page.");

		log.info("Video are present in video section in show page.\n");
		Reporter.log("<p>Video are present in video section in show page.");
		
	}
}
