package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.TestData;

public class LoginTests extends BaseTest {
	
	ApplicationData appData = new ApplicationData();
	
	@Test (priority=1, enabled=true, groups = {"Log In"})
	public void test_TC_VerifyLoginScreen() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		//Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(login.linkLogInExist());
		Assert.assertTrue(login.txtbxUsernameExist());
		Assert.assertTrue(login.txtbxPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());

		Reporter.log("test_TC_VerifyLoginScreen Passed", true);
	}

	@Test (priority=2, enabled=true, dataProvider="Valid Username", groups = {"Log In"})
	public void test_TC_VerifyLoginWithValidUsernamePassword(String sUsername, String sPassword) throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(sUsername, sPassword));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(login.lnkLoginTap());
		//Thread.sleep(appData.SLEEP_TIME);
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(playList.titlePlaylistExist());
		
		Reporter.log("test_TC_VerifyLoginWithValidUsernamePassword Passed", true);
	}
	
	 @DataProvider(name = "Valid Username")
	 public static Object[][] validUsername() 
	 {
		    TestData testData = new TestData();
	        return new Object[][] 
	        { 
	        	{ testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1 }, 
	//       	{ testData.VALID_LOGIN_UN_2, testData.VALID_LOGIN_PWD_2 }, 
	   //   	{ testData.VALID_LOGIN_UN_3, testData.VALID_LOGIN_PWD_3 }
	        };
	 }
	 
	@Test (priority=3, enabled=true, dataProvider="Valid Email", groups = {"Log In"})
	public void test_TC_VerifyLoginWithValidEmailPassword(String sEmail, String sPassword) throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(sEmail, sPassword));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(login.lnkLoginTap());
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(playList.titlePlaylistExist());
		 
		Reporter.log("test_TC_VerifyLoginWithValidEmailPassword Passed", true);
	}
	
	 @DataProvider(name = "Valid Email")
	 public static Object[][] validEmail() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.VALID_LOGIN_EMAIL_1, testData.VALID_LOGIN_PWD_2 }, 
	     //   	{ testData.VALID_LOGIN_EMAIL_2, testData.VALID_LOGIN_PWD_3 }/*, 
	      //  	{ testData.VALID_LOGIN_UN_3, testData.VALID_LOGIN_PWD }*/
	        };
	 }
	 
	@Test (priority=4, enabled=true, dataProvider="Invalid Credentials", groups = {"Log In"})
	public void test_TC_VerifyLoginWithInvalidCredentials(String sUsernameOREmail, String sPassword) throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(sUsernameOREmail, sPassword));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(login.lnkLoginTap());
		Assert.assertTrue(login.lblLoginErr());
		 
		Reporter.log("test_TC_VerifyLoginWithInvalidCredentials Passed", true);
	}
	
	 @DataProvider(name = "Invalid Credentials")
	 public static Object[][] invalidCredentials() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.VALID_LOGIN_UN_1, testData.INVALID_LOGIN_PWD }, 
	        	{ testData.INVALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1 }, 
	        	{ testData.VALID_LOGIN_EMAIL_1, testData.INVALID_LOGIN_PWD }
	        };
	 }
	 
	@Test (priority=5, enabled=true, groups = {"Log In"})
	public void test_TC_VerifyLoginWithBlankCredentials() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials("", ""));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(login.lnkLoginTap());
		//Assert.assertTrue(login.lblLoginErr());
		 
		Reporter.log("test_TC_VerifyLoginWithBlankCredentials Passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Log In"})
	public void test_TC_VerifyForgotPasswordScreenDetails() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
//		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordClick());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(login.titleNdescForgotPasswordExist());		
		Assert.assertTrue(login.txtBxForgotPasswordExist());
		Assert.assertTrue(login.btnSendPwdResetExist());
		
		Reporter.log("test_TC_VerifyForgotPasswordScreenDetails Passed", true);
	}
	
	@Test (priority=7, enabled=true, dataProvider="Valid Data", groups = {"Log In"})
	public void test_TC_VerifyForgotPasswordScreenWithValidUsernameEmail(String sData) throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordClick());
		Assert.assertTrue(login.titleNdescForgotPasswordExist());
		Assert.assertTrue(login.enterValidDataInTxtBxForgotPassword(sData));
		
	//	Assert.assertTrue(login.btnSendPwdResetClick());
		
		Assert.assertTrue(login.confirmFrgtPwdExist());
		
		//Assert.assertTrue(login.confirmFrgtPwdTappable());
		
	//	driver.findElement(By.id("com.comcast.watchablephone:id/Button_okcheck")).click();
		Reporter.log("test_TC_VerifyForgotPasswordScreenWithValidUsernameEmail Passed", true);
	}
	
	 @DataProvider(name = "Valid Data")
	 public static Object[][] validData() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][]
	        { 
	        	//{ testData.VALID_LOGIN_UN_2 }, 
	        	{ testData.VALID_LOGIN_EMAIL_1 }
	        };
	 }
	 
	@Test (priority=8, enabled=true, dataProvider="Invalid Data", groups = {"Log In"})
	public void test_TC_VerifyForgotPasswordScreenWithInvalidUsernameEmail(String sData) throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordClick());
		Assert.assertTrue(login.titleNdescForgotPasswordExist());
		Assert.assertTrue(login.enterInvalidDataInTxtBxForgotPassword(sData));
		Assert.assertTrue(login.btnSendPwdResetClick());
		Assert.assertTrue(login.lblForgotErr());
		//Assert.assertTrue(login.confirmFrgtPwdExist());
		
		Reporter.log("test_TC_VerifyForgotPasswordScreenWithInvalidUsernameEmail Passed", true);
	}
	
	 @DataProvider(name = "Invalid Data")
	 public static Object[][] invalidData() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][]
	        { 
	          { testData.INVALID_LOGIN_UN_1 }, 
	      //    { testData.INVALID_LOGIN_UN_2}
	      //  	{ testData.VALID_LOGIN_EMAIL_2 }
	        	
	        };
	 }
	 
	@Test (priority=9, enabled=true, groups = {"Log In"})
	public void test_TC_VerifyForgotPasswordNavigateToLogin() throws Exception
	{
		TestData testData = new TestData();
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordClick());
		Assert.assertTrue(login.titleNdescForgotPasswordExist());
		Assert.assertTrue(login.enterValidDataInTxtBxForgotPassword(testData.VALID_LOGIN_EMAIL_1));
		
		Assert.assertTrue(login.btnLoginFrgtPwdClick());
	//	Assert.assertTrue(login.btnSendPwdResetClick());
	//	Assert.assertTrue(login.confirmFrgtPwdExist());
		//Assert.assertTrue(login.btnLoginFrgtPwdClick());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.icnBackClick());
		Assert.assertTrue(login.titleLoginExist());
		
		Reporter.log("test_TC_VerifyForgotPasswordNavigateToLogin Passed", true);
	}
	
	@Test (priority=10, enabled=true, groups = {"Log In"})
	public void test_TC_VerifyNavigateToHomeScreen() throws Exception
	{
		TestData testData = new TestData();
		Assert.assertTrue(welcome.btnLoginTappable());
//		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordClick());
		Assert.assertTrue(login.titleNdescForgotPasswordExist());
		Assert.assertTrue(login.enterValidDataInTxtBxForgotPassword(testData.VALID_LOGIN_EMAIL_1));
	
		Thread.sleep(2000);
		Assert.assertTrue(login.btnLoginFrgtPwdClick());
		Thread.sleep(3000);
		Assert.assertTrue(login.icnBackClick());
	//	Assert.assertTrue(welcome.titleWelcomeExist());
		
		Reporter.log("test_TC_VerifyNavigateToHomeScreen Passed", true);
	}
	
	@Test (priority=11, enabled=true, dataProvider="Invalid Data", groups = {"Log In"})
	public void test_TC_VerifyForgotPasswordScreenClearErrorMsg(String sData) throws Exception
	{
		
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.lnkForgotPasswordExist());
		Assert.assertTrue(login.lnkForgotPasswordClick());
		Assert.assertTrue(login.titleNdescForgotPasswordExist());
	//	Assert.assertTrue(login.btnSendPwdResetClick());
	//	Assert.assertTrue(login.confirmFrgtPwdExist());
		Assert.assertTrue(login.enterInvalidDataInTxtBxForgotPassword(sData));
		Assert.assertTrue(login.lblForgotErr());
		Thread.sleep(3000);
		Assert.assertTrue(login.closeErrorClick());
		Assert.assertTrue(login.clearInvalidDataInTxtBxForgotPassword());
		
		Assert.assertTrue(login.icnBackClick());
		
		Reporter.log("test_TC_VerifyForgotPasswordScreenClearErrorMsg Passed", true);
		
		
	}
	
	@Test (priority=12, enabled=true, groups = {"Log In"})
	public void test_TC_VerifyTapBackWhenErrorOccured() throws Exception
	{
		TestData testData = new TestData();
		
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.INVALID_LOGIN_PWD));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(login.lnkLoginTap());
		Assert.assertTrue(login.lblLoginErr());
		Assert.assertTrue(signUp.iconBackClick());
	//	Assert.assertTrue(welcome.titleWelcomeExist());
		Assert.assertTrue(welcome.btnSignUpExist());
		Assert.assertTrue(welcome.btnLoginExist());
		Assert.assertTrue(welcome.guestUserLinkExist());
		Reporter.log("test_TC_VerifyTapBackWhenErrorOccured Passed", true);
	}
	

}
