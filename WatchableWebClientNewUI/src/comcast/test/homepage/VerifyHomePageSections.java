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
 * Description: This test script verify the main contents of home page sections 
 *Created on 06-September-2016 
 *Last updated on 20-September-2016
 * 
 */

public class VerifyHomePageSections extends BaseTest {

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
	 * Verify header section
	 */
	@Test(description = "Step 2: Verify header section is present in home page", priority = 2)
	public void Step02_VerifyHeaderSection() throws Exception {

		// Verify header section

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHeaderSection_XPATH")), driver),
				"Header section is not present in home page.");

		log.info("Header section is present in home page.\n");
		Reporter.log("<p>Header section is present in home page.");

	}

	/**
	 * Verify play lists section
	 */
	@Test(description = "Step 3: Verify Play list section is present in home page.", priority = 3)
	public void Step03_VerifyPlaylistSection() throws Exception {

		// Verify play lists section

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePagePlaylistSection_XPATH")), driver),
				"Play list section is not present in home page.");

		log.info("Play list section is present in home page.\n");
		Reporter.log("<p>Play list section is present in home page.");

	}

	/**
	 * Verify play lists present in play lists section
	 */
	@Test(description = "Step 4: Verify playlists are present in playlist section in home page.", priority = 4)
	public void Step04_VerifyPlaylistPresent() throws Exception {

		// Verify play lists present in play lists section

		int playlistCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePagePlaylistLogoImage_XPATH")))
				.size();

		Assert.assertTrue(playlistCount > 0,
				"Play list are not present in playlists section in home page");

		log.info("Play list are present in playlists section in home page.\n");
		Reporter.log("<p>Play list are present in playlists section in home page.");

		log.info("Total count of Play list present in home page: "
				+ playlistCount + ".\n");
		Reporter.log("<p>Total count of Play list present in home page: "
				+ playlistCount + ".");

	}

	/**
	 * Verify WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 5: Verify WHAT WE’RE WATCHING section is present in home page.", priority = 5)
	public void Step05_VerifyWhatWeAreWatchingSection() throws Exception {

		// Move to WHAT WE’RE WATCHING section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageWhatWeAreWatchingSection_XPATH"))));

		// Verify WHAT WE’RE WATCHING section

		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageWhatWeAreWatchingSection_XPATH")),
						driver),
				"WHAT WE’RE WATCHING section is not present in home page.");

		log.info("WHAT WE’RE WATCHING section is present in home page.\n");
		Reporter.log("<p>WHAT WE’RE WATCHING section is present in home page.");

	}

	/**
	 * Verify videos are present in WHAT WE’RE WATCHING section
	 */
	@Test(description = "Step 6: Verify videos are present in WHAT WE’RE WATCHING section in home page.", priority = 6)
	public void Step06_VerifyVideoPresentInWhatWeAreWatchingSection()
			throws Exception {

		// Verify video present in WHAT WE’RE WATCHING section

		int videoCount = driver.findElements(
				By.xpath(ObjRepoProp
						.getProperty("homePageVideoLogoImage_XPATH"))).size();

		Assert.assertTrue(videoCount > 0,
				"Videos are not present in WHAT WE’RE WATCHING section");

		log.info("Videos are present in WHAT WE’RE WATCHING section in home page.\n");
		Reporter.log("<p>Videos are present in WHAT WE’RE WATCHING section in home page.");

		log.info("Total count of Videos present in WHAT WE’RE WATCHING section in home page: "
				+ videoCount + ".\n");
		Reporter.log("<p>Total count of Videos in WHAT WE’RE WATCHING section in home page: "
				+ videoCount + ".");

	}

	/**
	 * Verify Watch Today’s Playlist button
	 */
	@Test(description = "Step 7: Verify Watch Today’s Playlist button is present in home.", priority = 7)
	public void Step07_VerifyWatchTodaysPlaylistButton() throws Exception {

		// Move to Watch Today’s Playlist button

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageWatchTodaysPlaylistsButton_XPATH"))));

		// Verify Watch Today’s Playlist button
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageWatchTodaysPlaylistsButton_XPATH")),
				driver),
				"Watch Today’s Playlist button is not present in home page");

		log.info("Watch Today’s Playlist button is present in home page below the WHAT WE’RE WATCHING section.\n");
		Reporter.log("<p>Watch Today’s Playlist button is present in home page below the WHAT WE’RE WATCHING section.");

	}

	/**
	 * Verify GET TO KNOW THE SHOW section
	 */
	@Test(description = "Step 8: Verify GET TO KNOW THE SHOW section is present in home page.", priority = 8)
	public void Step08_VerifyGetToKnowTheShowSection() throws Exception {

		// Move to GET TO KNOW THE SHOW section

		CustomFun
				.mouseOverElement(
						driver,
						driver.findElement(By.xpath(ObjRepoProp
								.getProperty("homePageGetToKnowTheShowSection_XPATH"))));

		// Verify WHAT WE’RE WATCHING section
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageGetToKnowTheShowSection_XPATH")),
						driver),
				"GET TO KNOW THE SHOW section is not present in home page");

		log.info("GET TO KNOW THE SHOW section is present in home page.\n");
		Reporter.log("<p>GET TO KNOW THE SHOW section is present in home page.");

	}

	/**
	 * Verify shows are present in GET TO KNOW THE SHOW section
	 */
	@Test(description = "Step 9: Verify shows are present in GET TO KNOW THE SHOW section in home page.", priority = 9)
	public void Step09_VerifyShowsPresentInGetToKnowTheShowSection()
			throws Exception {

		// Verify shows are present in GET TO KNOW THE SHOW section

		int showCount = driver
				.findElements(
						By.xpath(ObjRepoProp
								.getProperty("homePageShowLogoImage_XPATH")))
				.size();

		Assert.assertTrue(showCount > 0,
				"Shows are not present in GET TO KNOW THE SHOW section");

		log.info("Shows are present in GET TO KNOW THE SHOW section\n");
		Reporter.log("<p>Shows are present in GET TO KNOW THE SHOW section");

	}

	/**
	 * Verify EXPLORE NOW button
	 */
	@Test(description = "Step 10: Verify EXPLORE NOW button is present in home.", priority = 10)
	public void Step10_VerifyExploreNowButton() throws Exception {

		// Move toEXPLORE NOW button

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("homePageExploreNowButton_XPATH"))));

		// Verify EXPLORE NOW button
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageExploreNowButton_XPATH")), driver),
				"EXPLORE NOW button is not present in home page");

		log.info("EXPLORE NOW button is present in home page below the GET TO KNOW THE SHOW section.\n");
		Reporter.log("<p>EXPLORE NOW button is present in home page below the GET TO KNOW THE SHOW section.");

	}

	/**
	 * Verify STAY CONNECTED section
	 */
	@Test(description = "Step 11: Verify STAY CONNECTED section is present in home page.", priority = 11)
	public void Step11_VerifyStayConnectedSection() throws Exception {

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
	 * Verify social sharing options
	 */
	@Test(description = "Step 12: Verify social sharing options are present in home page.", priority = 12)
	public void Step12_VerifySocialSharingOptions() throws Exception {

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
	 * Verify WATCHABLE logo is present in footer.
	 */
	@Test(description = "Step 13: Verify WATCHABLE log is present in footer.", priority = 13)
	public void Step13_VerifyWatchableLogoInFooter() throws Exception {

		// Move to Footer section

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("homePageFooterSection_XPATH"))));

		// Verify Watchable logo in footer 
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterWatchableLogo_XPATH")), driver),
				"WATCHABLE logo is not present in footer");

		log.info("WATCHABLE logo is present in footer below the social sharing options.\n");
		Reporter.log("<p>WATCHABLE logo is present in footer below the social sharing options.");

	}

	/**
	 * Verify Download badges are present in footer.
	 */
	@Test(description = "Step 14: Verify Download badges are present in footer.", priority = 14)
	public void Step14_VerifyDownloadBadgesInFooter() throws Exception {

		// Move to Footer section

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("homePageFooterSection_XPATH"))));

		// Verify Download badges in footer
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterSection_XPATH")), driver),
				"Down load badges are not present in footer below the WATCHABLE logo.");

		log.info("Down load badges are present in footer below the WATCHABLE logo.\n");
		Reporter.log("<p>Down load badges are present in footer below the WATCHABLE logo.");

	}

	/**
	 * Verify footer link sections
	 */
	@Test(description = "Step 15: Verify footer link sections.", priority = 15)
	public void Step15_VerifyFooterSection() throws Exception {

		// Move to Footer section

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("homePageFooterSection_XPATH"))));

		// Verify footer link sections
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageDownloadBadge_XPATH")), driver),
				"Footer link section is not present in home page");

		log.info("Footer link section is present in home page.\n");
		Reporter.log("<p>Footer link section is present in home page.");

	}

	/**
	 * Verify the links present in footer link sections.
	 */
	@Test(description = "Step 16: Verify footer link sections.", priority = 16)
	public void Step16_VerifyFooterLinks() throws Exception {

		// Move to Footer section

		CustomFun
				.mouseOverElement(driver, driver.findElement(By
						.xpath(ObjRepoProp
								.getProperty("homePageFooterSection_XPATH"))));

		// Verify Home link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHomeLink_XPATH")), driver),
				"Home link not present in footer section.");

		log.info("Home link present in footer section.\n");
		Reporter.log("<p>Home link present in footer section.");

		// Verify Learn More link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterLearnMoreLink_XPATH")), driver),
				"Learn More link not present in footer section.");

		log.info("Learn More link present in footer section.\n");
		Reporter.log("<p>Learn More link present in footer section.");

		// Verify Help link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterHelpLink_XPATH")), driver),
				"Help link not present in footer section.");

		log.info("Help link present in footer section.\n");
		Reporter.log("<p>Help link present in footer section.");

		// Verify Contact Us link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterContactUsLink_XPATH")), driver),
				"Contact Us link not present in footer section.");

		log.info("Contact Us link present in footer section.\n");
		Reporter.log("<p>Contact Us link present in footer section.");

		// Verify Privacy Policy link
		Assert.assertTrue(
				CustomFun.isElementPresent(By.xpath(ObjRepoProp
						.getProperty("homePageFooterPrivacyPolicyLink_XPATH")),
						driver),
				"Privacy Policy link not present in footer section.");

		log.info("Privacy Policy link present in footer section.\n");
		Reporter.log("<p>Privacy Policy link present in footer section.");

		// Verify Terms Of Service link
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("homePageFooterTermsOfServiceLink_XPATH")),
						driver),
				"Terms Of Service link not present in footer section.");

		log.info("Terms Of Service link present in footer section.\n");
		Reporter.log("<p>Terms Of Service link present in footer section.");

		// Verify AdChoices link
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterAdChoicesLink_XPATH")), driver),
				"AdChoices link not present in footer section.");

		log.info("AdChoices link present in footer section.\n");
		Reporter.log("<p>TAdChoices link present in footer section.");

	}

	/**
	 * Verify copy right text
	 */
	@Test(description = "Step 17: Verify copy right text present in footer.", priority = 17)
	public void Step17_VerifyFooterCopyRightText() throws Exception {

		// Move to Copyright Text

		CustomFun.mouseOverElement(driver, driver.findElement(By
				.xpath(ObjRepoProp
						.getProperty("homePageFooterCopyrightText_XPATH"))));

		// Verify Copyright Text
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageFooterCopyrightText_XPATH")), driver),
				"Copy right text in not present at the bottom of the home page");

		log.info("Copy right text is present at the bottom of the home page with the content"
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFooterCopyrightText_XPATH")))
						.getText() + " \n");
		Reporter.log("<p>Copy right text is present at the bottom of the home page with the content "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("homePageFooterCopyrightText_XPATH")))
						.getText());

	}
	
}
