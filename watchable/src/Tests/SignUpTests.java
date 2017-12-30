package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.TestData;

public class SignUpTests extends BaseTest{
	
	
	
	@Test (priority=1, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifySignUpScreen() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(signUp.txtEmailExist());
		Assert.assertTrue(signUp.txtPassword());
		Assert.assertTrue(signUp.signUpButtonExist());
		Assert.assertTrue(signUp.footerTxtExist());

		Reporter.log("test_TC_VerifySignUpScreen Passed", true);
	}

	@Test (priority=2, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyBackButtonFunctionality() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(signUp.iconBackClick());
		//Assert.assertTrue(welcome.titleWelcomeExist());
		Assert.assertTrue(welcome.btnLoginExist());
		
		Reporter.log("test_TC_VerifyBackButtonFunctionality Passed", true);
	}
	
	@Test (priority=3, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyUsernameTextField() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Reporter.log("test_TC_VerifyUsernameTextField Passed", true);
	}
	
	@Test (priority=4, enabled=true, dataProvider="Invalid Credentials", groups = {"SignUp"})
	public void test_TC_VerifyUsernameWithInvalidData(String sUsername) throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxUsernameInvalid(sUsername));
		
		Reporter.log("test_TC_VerifyUsernameWithInvalidData Passed", true);
	}
	
	 @DataProvider(name = "Invalid Credentials")
	 public static Object[][] invalidCredentials() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.INVALID_USERNAME_1 }, 
	        	{ testData.INVALID_USERNAME_2 }, 
	        	{ testData.INVALID_USERNAME_3 }
	        };
	 }
	 
	@Test (priority=5, enabled=true, dataProvider="Valid Credentials", groups = {"SignUp"})
	public void test_TC_VerifyUsernameWithValidData(String sUsername) throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxUsernameValid(sUsername));
		 
		Reporter.log("test_TC_VerifyUsernameWithValidData Passed", true);
	}
	
	 @DataProvider(name = "Valid Credentials")
	 public static Object[][] validCredentials() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.VALID_USERNAME_1 }, 
	        	{ testData.VALID_USERNAME_2 }, 
	        	{ testData.VALID_USERNAME_3 }
	        };
	 }
	 
	@Test (priority=6, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyEmailTextField() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxEmailWatermark());
		
		Reporter.log("test_TC_VerifyEmailTextField Passed", true);
	}
	
	@Test (priority=7, enabled=true, dataProvider="Invalid Email", groups = {"SignUp"})
	public void test_TC_VerifyEmailWithInvalidData(String sEmail) throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxEmailInvalid(sEmail));
		
		
		Reporter.log("test_TC_VerifyEmailWithInvalidData Passed", true);
	}
	
	 @DataProvider(name = "Invalid Email")
	 public static Object[][] invalidEmail() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.INVALID_EMAIL_1 }, 
	        	{ testData.INVALID_EMAIL_2 }, 
	        	{ testData.INVALID_EMAIL_3 }
	        };
	 }
	
	@Test (priority=8, enabled=true, dataProvider="Valid Email", groups = {"SignUp"})
	public void test_TC_VerifyEmailWithValidData(String sEmail) throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxEmailValid(sEmail));
		 
		Reporter.log("test_TC_VerifyEmailWithValidData Passed", true);
	}
	
	 @DataProvider(name = "Valid Email")
	 public static Object[][] validEmail() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.VALID_EMAIL_1 }, 
	        	{ testData.VALID_EMAIL_2 }, 
	        	{ testData.VALID_EMAIL_3 }
	        };
	 }
	
	 @Test (priority=9, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyEmailAlreadyExists() throws Exception
	{
			Assert.assertTrue(welcome.btnSignUpTappable());
			Assert.assertTrue(signUp.titleSignUpExist());
			Assert.assertTrue(signUp.txtbxEmailAlreadyExists());
			 
			Reporter.log("test_TC_VerifyEmailAlreadyExists Passed", true);
	}
	 
	@Test (priority=10, enabled=true, groups = {"SignUp"})
 	public void test_TC_VerifyPasswordTextField() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxPasswordWatermark());
		
		Reporter.log("test_TC_VerifyPasswordTextField Passed", true);
	}
		
	@Test (priority=11, enabled=true, dataProvider="Invalid Password", groups = {"SignUp"})
	public void test_TC_VerifyPasswordLessThanSixCharacters(String sPassword) throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxPasswordInvalid(sPassword));
		
		Reporter.log("test_TC_VerifyPasswordLessThanSixCharacters Passed", true);
	}
	
	 @DataProvider(name = "Invalid Password")
	 public static Object[][] invalidPassword() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.INVALID_PASSWORD_1 }, 
	        	{ testData.INVALID_PASSWORD_2 }, 
	        	{ testData.INVALID_PASSWORD_3 }
	        };
	 }
	
	@Test (priority=12, enabled=true, dataProvider="Valid Password", groups = {"SignUp"})
	public void test_TC_VerifyPasswordWithValidData(String sPassword) throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxPasswordValid(sPassword));
		 
		Reporter.log("test_TC_VerifyPasswordWithValidData Passed", true);
	}
	
	 @DataProvider(name = "Valid Password")
	 public static Object[][] validPassword() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][] 
	        { 
	        	{ testData.VALID_PASSWORD_1 }, 
	        	{ testData.VALID_PASSWORD_2 }, 
	        	{ testData.VALID_PASSWORD_3 }	        	
	        };
	 }
	 
	@Test (priority=13, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyFooterMessage() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtbxFooterExists());
		 
		Reporter.log("test_TC_VerifyFooterMessage Passed", true);
	}
	
	@Test (priority=14, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyPrivacyPolicyLink() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp. txtPrivacyLinks());
		 
		Reporter.log("test_TC_VerifyPrivacyPolicyLink Passed", true);
	}
	
	@Test (priority=15, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyTermsOfServiceLink() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.txtServiceLinks());
		 
		Reporter.log("test_TC_VerifyTermsOfServiceLink Passed", true);
	}
	
	@Test (priority=16, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyTapBackWhenErrorOccured() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.icnBackTapOnError());
		//Assert.assertTrue(welcome.titleWelcomeExist());
		Assert.assertTrue(welcome.btnLoginExist());
		 
		Reporter.log("test_TC_VerifyTapBackWhenErrorOccured Passed", true);
	}	
	
	//Commenting the code as it is not recommended to execute sign up every time
	//as we do not want to create more number of dummy users.  
	
	@Test (priority=17, enabled=true, groups = {"SignUp"})
	public void test_TC_VerifyCompleteRegistrationOnTapOfDoneButton() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.SignUpRegistration());
		Assert.assertTrue(signUp.hideKeyBoard());
		Assert.assertTrue(signUp.selectCheckBox());
		Assert.assertTrue(signUp.signUpButtonTap());
		Assert.assertTrue(signUp.divInTap());
	}
	
}
