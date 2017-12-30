package comcast.test.signup;

import static comcast.util.PropertyFileReader.ObjRepoProp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import comcast.common.asserts.Assertions;
import comcast.config.BaseTest;
import comcast.custom.CustomFun;
import comcast.pages.HomePage;
import comcast.pages.WatchPage;

/**
 * 
 * @author karthik.ashoka 
 * Description: This test script verifies the contents of sign up form
 * Created on 16-December-2016 
 * Last updated on 16-December-2016
 * 
 */

public class VerifySignUpFormContents extends BaseTest {
	
	
	static HomePage homePage;
	static WatchPage watchPage;
	
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
	 * Verify SIGN UP button is present in header.
	 */
	@Test(description = "Step 2: Verify SIGN UP button is present in header.", priority = 2)
	public void Step02_VerfiySignUpButton() throws Exception {
		
		//Verifying SIGN UP button
		Assertions.verifySignUpButton(driver);
		
	}
	
	/**
	 * Click on SIGN UP button.
	 */
	@Test(description = "Step 3: Click on SIGN UP button.", priority = 3)
	public void Step03_ClickOnSignUpButton() throws Exception {
		
		//Click on SignUp Button
		homePage.clickOnSignUpButton();
		
		//Verifying the SignUp poup form opened or not
		Assertions.verifySignUpFormOpened(driver);
	
	}
	
	/**
	 * Verify heading is present in Sign up form.
	 */
	@Test(description = "Step 4: Verify heading is present in Sign up form.", priority = 4)
	public void Step04_VerifyHeadingInSignUp() throws Exception {
		
		// Verify Heading is present in Sign up form.
		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp.getProperty("signUpFormHeading_XPATH")),driver),
				"Heading is not displaying in SIGN UP popup.");

		log.info("Heading is present in sign up form.\n");
		Reporter.log("<p>Heading is present in sign up form.");

		log.info("The heading displayed is: "+ driver.findElement(By.xpath(ObjRepoProp.getProperty("signUpFormHeading_XPATH"))).getText() + "\n");
		Reporter.log("<p>The heading displayed is: "+ driver.findElement(By.xpath(ObjRepoProp.getProperty("signUpFormHeading_XPATH"))).getText());
		
	}
	
	/**
	 * Verify close(X) button is present in Signup form.
	 */
	@Test(description = "Step 5: Verify close(X) button is present in Signup form.", priority = 5)
	public void Step05_VerifyCloseButtonInSignUpForm() throws Exception {
		
		// Verify close (X) button is present
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("signUpFormCloseButton_XPATH")),
						driver),
				"Close(X) button is not present in Signup form at right top corner.");

		log.info("Close(X) button is present in Signup form at right top corner.\n");
		Reporter.log("<p>Close(X) button is present in Signup form at right top corner.");
	}
	
	/**
	 * Verify user name text box is present in Signup form.
	 */
	@Test(description = "Step 6: Verify user name text box is present in Signup form.", priority = 6)
	public void Step06_VerifyUserNameTextBoxInSignUp() throws Exception {
		
		// Verify to user name text box in popup
		Assert.assertTrue(CustomFun.isElementPresent(By.id(ObjRepoProp
				.getProperty("signUpFormUserNameText_ID")), driver),
				"User name text box is not present in Signup form.");

		log.info("User name text box is present in Signup form.\n");
		Reporter.log("<p>User name text box is present in Signup form.");
	}
	
	/**
	 * Verify email text box is present in Signup form.
	 */
	@Test(description = "Step 7: Verify email text box is present in Signup form.", priority = 7)
	public void Step07_VerifyEmailTextBoxInSignUp() throws Exception {
		
		// Verify to email text box is present in Signup form.
		Assert.assertTrue(CustomFun.isElementPresent(By.id(ObjRepoProp
				.getProperty("signUpFormUserEmailText_ID")), driver),
				"Email text box is not present in Signup form.");

		log.info("Email text box is present in Signup form.\n");
		Reporter.log("<p>Email text box is present in Signup form.");
	}
	
	/**
	 * Verify password text box is present in Signup form.
	 */
	@Test(description = "Step 8: Verify password text box is present in Signup form.", priority = 8)
	public void Step08_VerifyPasswordTextBoxInSignUp() throws Exception {
		
		// Verify password text box is present in Signup form.
		Assert.assertTrue(CustomFun.isElementPresent(By.id(ObjRepoProp
				.getProperty("signUpFormPasswordText_ID")), driver),
				"Password text box is not present in Signup form.");

		log.info("Password text box is present in Signup form.\n");
		Reporter.log("<p>Password text box is present in Signup form.");
	}
	
	/**
	 * Verify term and condition check box is present in Signup form.
	 */
	@Test(description = "Step 9: Verify term and condition check box is present in Signup form.", priority = 9)
	public void Step09_VerifyTermAndConditionCheckBox() throws Exception {
		
		// Verify term and condition check box is present in Signup form.
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.id(ObjRepoProp
								.getProperty("signUpFormTermsConditionCheck_ID")),
						driver),
				"Term and condition check box is not present in Signup ");

		log.info("Term and condition check box is present in Signup .\n");
		Reporter.log("<p>Term and condition check box is present in Signup.");

		log.info("Term and condition check box is present in Signup form with the text : "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("signUpFormTermsConditionText_XPATH")))
						.getText() + "\n");
		Reporter.log("<p>Term and condition check box is present in Signup form with the text : "
				+ driver.findElement(
						By.xpath(ObjRepoProp
								.getProperty("signUpFormTermsConditionText_XPATH")))
						.getText());
		
	}
	
	/**
	 * Verify recaptcha selection option is present in Signup form.
	 */
	@Test(description = "Step 10: Verify recaptcha selection option is present in Signup form.", priority = 10)
	public void Step10_VerifyRecaptchaSelectOption() throws Exception {
		
		// Verifying recaptcha selection option is present in Signup form.
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("recaptchaHolder_XPATH")),
						driver),
				"Recaptcha selection option is not present in Signup form.");

		log.info("Recaptcha selection option is present in Signup form.\n");
		Reporter.log("<p>Recaptcha selection option is present in Signup form.");

	}
	
	/**
	 * Verify Get Watching! Button is present in Signup form.
	 */
	@Test(description = "Step 11: Verify Get Watching! Button is present in Signup form.", priority = 11)
	public void Step11_VerifyGetWatchingButton() throws Exception {
		
		// Verifying Get Watching! Button is present in Signup form.
		Assert.assertTrue(
				CustomFun.isElementPresent(
						By.xpath(ObjRepoProp
								.getProperty("signUpFormGetWatchingButton_XPATH")),
						driver),
				"Get Watching! Button is not present in Signup form.");

		log.info("Get Watching! Button is present in Signup form.\n");
		Reporter.log("<p>Get Watching! Button is present in Signup form.");

	}
}
