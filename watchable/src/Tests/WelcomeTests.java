package Tests;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.AssertMsgs;
import Utils.UIElements;
public class WelcomeTests extends BaseTest
{
	
	@Test (priority=1, enabled=true, groups = {"Welcome"})
	public void test_TC_VerifyWelcomeScreen() throws Exception
	{
		//Assert.assertTrue(welcome.titleWelcomeExist());
		//Assert.assertTrue(welcome.descWelcomeExist());
		Assert.assertTrue(welcome.btnSignUpExist());
		Assert.assertTrue(welcome.btnLoginExist());
		Assert.assertTrue(welcome.guestUserLinkExist());

		Reporter.log("test_TC_VerifyWelcomeScreen Passed", true);
	}
	
	@Test (priority=2, enabled=true, groups = {"Welcome"})
	
	public void test_TC_VerifySignUpButton() throws Exception
	
	{
		
		Assert.assertTrue(welcome.btnSignUpTappable());
		
		Assert.assertTrue(signUp.titleSignUpExist());

		Reporter.log("test_TC_VerifySignUpButton Passed", true);
	}
	
	@Test (priority=3, enabled=true, groups = {"Welcome"})
	public void test_TC_VerifyLoginButton() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Thread.sleep(5000);
	//	Assert.assertTrue(login.titleLoginExist());
				
		Reporter.log("test_TC_VerifyLoginButton Passed", true);
	}
	
	@Test (priority=4, enabled=true, groups = {"Welcome"})
	public void test_TC_VerifyGuestUserLink() throws Exception
	{
		Assert.assertTrue(welcome.guestUserLinkExist());
		
		Assert.assertTrue(welcome.linkGuestUserTappable());
		Reporter.log("test_TC_VerifyLoginButton Passed", true);
	}
	
	
	
	
}