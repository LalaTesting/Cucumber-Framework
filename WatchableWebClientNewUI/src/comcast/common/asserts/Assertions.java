package comcast.common.asserts;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import comcast.custom.CustomFun;

public class Assertions {

	// For logging
	public static Logger log = Logger.getLogger(Assertions.class);

	/**
	 * This Method verifies show are present in get to know the show section in
	 * home page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyShowsPresent(WebDriver driver) throws Exception {

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
	 * This Method verifies provider name is displaying in show page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyProviderName(WebDriver driver) throws Exception {

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("showPagePublisherTitle_XPATH")), driver),
				"Provider name is not displaying in show page.");

		log.info("Provider name is displaying in show page\n");
		Reporter.log("<p>Provider name is displaying in show page");

		log.info("Provider name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPagePublisherTitle_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Provider name displayed is: "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("showPagePublisherTitle_XPATH")))
						.getText());

	}

	/**
	 * This Method verifies presence of browse shows menu among menu items in
	 * header home page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyBrowseShowsMenu(WebDriver driver) throws Exception {

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuBrowseShowsTitle_XPATH")),
				driver),
				"BROWSE SHOWS menu item is not present in header section");

		log.info("BROWSE SHOWS menu item is present in header section.\n");
		Reporter.log("<p>BROWSE SHOWS menu item is present in header section.");

	}
	
	
	/**
	 * This Method verifies presence of Today's Playlists menu among menu items in
	 * header home page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyTodaysPlaylistsMenu(WebDriver driver) throws Exception {

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuTodaysPlaylistsTitle_XPATH")),
				driver),
				"Today's Playlists menu item is not present in header section");

		log.info("Today's Playlists menu item is present in header section.\n");
		Reporter.log("<p>Today's Playlists menu item is present in header section.");

	}
	
	
	/**
	 * This Method verifies presence of My Shows menu among menu items in
	 * header home page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyMyShowstsMenu(WebDriver driver) throws Exception {

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageHamburgerMenuMyShowsTitle_XPATH")),
				driver),
				"My Shows menu item is not present in header section");

		log.info("My Shows menu item is present in header section.\n");
		Reporter.log("<p>My Shows menu item is present in header section.");

	}


	/**
	 * This Method verifies menu items are displayed after clicking on hamburger
	 * menu
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyMenuItemsDisplayed(WebDriver driver)
			throws Exception {

		String style = driver.findElement(
				By.xpath(ObjRepoProp.getProperty("headeMenuSection_XPATH")))
				.getAttribute("style");

		log.info("style: " + style);

		Assert.assertEquals(style, "display: block;",
				"Menu items are not displayed after clicking on the hamburger menu.");

		log.info("Menu items are displayed after clicking on the hamburger menu.\n");
		Reporter.log("<p>Menu items are displayed after clicking on the hamburger menu.");

	}
	
	
	/**
	 * This Method verifies videos are present in what we are watching section in
	 * home page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void verifyWhatWeAreWatchingSection(WebDriver driver) throws Exception {

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
	 * This Method verifies play lists section in home page * @param driver
	 * 
	 * @throws Exception
	 */
	public static void verifyPlaylistSection(WebDriver driver) throws Exception {

		// Verify play lists section

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePagePlaylistSection_XPATH")), driver),
				"Play list section is not present in home page.");

		log.info("Play list section is present in home page.\n");
		Reporter.log("<p>Play list section is present in home page.");

	}
	
	
	/**
	 * This Method verifies Sign Up button in home page
	 *  @param driver
	 * 
	 * @throws Exception
	 */
	public static void verifySignUpButton(WebDriver driver) throws Exception {

		// Verify Sign Up Button

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp
				.getProperty("homePageSignupButton_XPATH")), driver),
				"SIGN UP button is no present in header section of home page");

		log.info("SIGN UP button is present in header section of home page.\n");
		Reporter.log("<p>SIGN UP button is present in header section of home page.");
	}
	
	
	/**
	 * This Method verifies Sign Up form is opened
	 *  @param driver
	 * 
	 * @throws Exception
	 */
	public static void verifySignUpFormOpened(WebDriver driver) throws Exception {
		
	//Verify Sign up form
	Assert.assertTrue(driver.findElement(By.xpath(ObjRepoProp
			.getProperty("signUpForm_XPATH"))).isDisplayed(), "Sign Up pop-up is not opened");

	log.info("Successfully opened Sign Up pop-up.\n");
	Reporter.log("<p>Successfully opened Sign Up pop-up.");
	}
	

}
