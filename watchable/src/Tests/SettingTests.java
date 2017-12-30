package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class SettingTests extends BaseTest{

	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	void loginSettingPage() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		//	Assert.assertTrue(login.titleLoginExist());
			Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_Settings, testData.VALID_OLDPWD_Settings));
			Thread.sleep(2000);
			Assert.assertTrue(login.lnkLoginTap());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
			
		//	List<WebElement> weekObjectList = driver.findElements(By.xpath("//android.widget.ListView[1]/android.widget.RelativeLayout"));
		//	weekObjectList.get(1).click();
		
		//	List<WebElement> allItems = driver.findElements(By.className("android.widget.RelativeLayout")); 
			//allItems.get(5).click();
		//	driver.findElementsByXPath("//*[@class='android.widget.TextView' and @name='Settings']");
	       
		String str=		driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).getText();
	        System.out.println(str);
			Assert.assertTrue(setting.titleSettingTappable());
	}
	
	
	
	@Test (priority=1, enabled=true, groups = {"Setting"})
	public void test_TC_Setting() throws Exception
	{
		       loginSettingPage();
		
		
		//	Assert.assertTrue(setting.lblSettingsExist());
			Assert.assertTrue(setting.lblSupportExist());
			Assert.assertTrue(setting.lblAccountExist());
			genFunc.scrollDown1(driver);
			genFunc.scrollDown1(driver);
			Thread.sleep(3000);
			Assert.assertTrue(setting.btnLogoutExist()); 
			
			Reporter.log("test_TC_Setting()", true);
	}
	
	@Test (priority=2, enabled=true, groups = {"Setting"})
	public void test_TC_VerifySettingsScreenFields() throws Exception
	{
		loginSettingPage();
		Assert.assertTrue(setting.lblSupportExist());
		Assert.assertTrue(setting.lblAccountExist());
		Assert.assertTrue(setting.usernamelblValueExist());
		Assert.assertTrue(setting.emaillblValueExist());
		Assert.assertTrue(setting.changePasswordExist());
		Assert.assertTrue(setting.termsOfServiceExist());
		Assert.assertTrue(setting.privacyPolicyExist());
		Assert.assertTrue(setting.feedBackExist());
		Assert.assertTrue(setting.adChoiceExist());
		Assert.assertTrue(setting.versionlblValueExist());
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Thread.sleep(3000);
		Assert.assertTrue(setting.btnLogoutExist());
		
		Reporter.log("test_TC_VerifySettingsScreenFields", true);
		}
	
	@Test (priority=3, enabled=true, groups = {"Setting"})
	public void test_TC_VerifyAccountSectionfromSettingscreen() throws Exception
	{
	
		loginSettingPage();
		Assert.assertTrue(setting.lblAccountExist());
		Assert.assertTrue(setting.usernamelblValueExist());
		Assert.assertTrue(setting.emaillblValueExist());
		Assert.assertTrue(setting.changePasswordExist());
		
		Assert.assertTrue(setting.usernamelblTappable());
		
		Assert.assertTrue(setting.backIcnSettingsExist());
		Assert.assertTrue(setting.backIcnSettingsTappable());
		
		Assert.assertTrue(setting.emaillblTappable());
		
		Assert.assertTrue(setting.icnBackTappable());
		
		
		Assert.assertTrue(setting.changePasswordTappable());
		
	
		Assert.assertTrue(signUp.iconBackClick());
		Reporter.log("test_TC_VerifyAccountSectionfromSettingscreen", true);
	}
	

	@Test (priority=4, enabled=true, groups = {"Setting"})
	public void test_TC_VerifyUserNameLinkTappableAndNavigateToUserNameScreen() throws Exception
	{
	
		loginSettingPage();
		Assert.assertTrue(setting.lblAccountExist());
		Assert.assertTrue(setting.usernamelblValueExist());
		Assert.assertTrue(setting.usernamelblTappable());
		Assert.assertTrue(setting.userNameFieldExist());
		Assert.assertTrue(setting.userNameFieldTappable());
		Reporter.log("test_TC_VerifyUserNameLinkTappableAndNavigateToUserNameScreen", true);
}
	@Test (priority=5, enabled=true, groups = {"Setting"})
	public void test_TC_VerifyUserNameScreenField() throws Exception
	{
	
		loginSettingPage();
		Assert.assertTrue(setting.lblAccountExist());
		Assert.assertTrue(setting.usernamelblValueExist());
		Assert.assertTrue(setting.usernamelblTappable());
		Assert.assertTrue(setting.userNameFieldExist());
		Assert.assertTrue(setting.userNameFieldTappable());
		
		Assert.assertTrue(setting.lnkSaveExist());
		Assert.assertTrue(setting.userNamelblExist());
		Reporter.log(" test_TC_VerifyUserNameScreenField", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Setting"})
	public void test_TC_VerifycancelButtonFunctionality() throws Exception
	{
		loginSettingPage();
		Assert.assertTrue(setting.lblAccountExist());
		Assert.assertTrue(setting.usernamelblValueExist());
		Assert.assertTrue(setting.usernamelblTappable());
		Assert.assertTrue(setting.userNameFieldExist());
		
		Assert.assertTrue(setting.backIcnSettingsExist());
		Assert.assertTrue(setting.backIcnSettingsTappable());
		Reporter.log(" test_TC_VerifycancelButtonFunctionality", true);
	}
	
	@Test (priority=7, enabled=true,dataProvider="Valid Data", groups = {"Setting"})
	public void test_TC_VerifyUserNameTextFieldValidation(String sData) throws Exception
	{
		loginSettingPage();
		Assert.assertTrue(setting.lblAccountExist());
		Assert.assertTrue(setting.usernamelblValueExist());
		Assert.assertTrue(setting.usernamelblTappable());
		Assert.assertTrue(setting.userNameFieldExist());
	
		Assert.assertTrue(setting.cleardDataUserName(sData));
		
		Reporter.log("VerifyUserNameTextFieldValidation", true);
		}
	
	
	
	
	 @DataProvider(name = "Valid Data")
	 public static Object[][] validData() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][]
	        { 
	        	//{ testData.VALID_LOGIN_UN_2 }, 
	        	{ testData.VALID_LOGIN_UN_1 }
	        };
	 }


	 @Test (priority=8, enabled=true,dataProvider="InValid Data", groups = {"Setting"})
		public void test_TC_VerifyUserNameTextFieldWithInvalidDataValidation(String sData) throws Exception
		{
		 loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.usernamelblValueExist());
			Assert.assertTrue(setting.usernamelblTappable());
			Assert.assertTrue(setting.userNameFieldExist());
		
			Assert.assertTrue(setting.cleardDataUserName(sData));
			
			Assert.assertTrue(setting.enterInValidDataUserNameTxtField());
			Reporter.log("test_TC_VerifyUserNameTextFieldWithInvalidDataValidation", true);
}
	 @DataProvider(name = "InValid Data")
	 public static Object[][] InvalidData() 
	 {
		 TestData testData = new TestData();
		 
	        return new Object[][]
	        { 
	        	//{ testData.VALID_LOGIN_UN_2 }, 
	        	{ testData.INVALID_LOGIN_UN_2 }
	        };
	 }
	 
	 @Test (priority=9, enabled=true, dataProvider="Valid Data",groups = {"Setting"})
		public void test_TC_VerifyUserNameTextFieldWithvalidDataValidation(String sData) throws Exception
		{
		 loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.usernamelblValueExist());
			Assert.assertTrue(setting.usernamelblTappable());
			Assert.assertTrue(setting.userNameFieldExist());
			Assert.assertTrue(setting.cleardDataUserName(sData));
			
			Assert.assertTrue(setting.enterValidDataInTxtBxForgotPassword(testData.VALID_LOGIN_UN_4));
		
			Reporter.log("test_TC_VerifyUserNameTextFieldWithvalidDataValidation", true);
	}
	 
	 
	 @Test (priority=10, enabled=true,dataProvider="Valid Data", groups = {"Setting"})
		public void test_TC_VerifyUserNameTextFieldWithSameUserName(String sData) throws Exception
		{
		 loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.usernamelblValueExist());
			Assert.assertTrue(setting.usernamelblTappable());
			Assert.assertTrue(setting.userNameFieldExist());
			Assert.assertTrue(setting.cleardDataUserName(sData));
			Assert.assertTrue(setting.enterValidDataInTxtBxForgotPassword(testData.VALID_LOGIN_UN_1));
			
			
			Reporter.log("test_TC_VerifyUserNameTextFieldWithSameUserName", true);
		}
	 
	 @Test (priority=11, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyEmailLinkTappableAndNavigatesToEmailScreen() throws Exception
		{
	 
	 
		    loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			
			Assert.assertTrue(setting.emaillblValueExist());
			Assert.assertTrue(setting.emaillblTappable());
		
			Reporter.log("VerifyEmailLinkTappableAndNavigatesToEmailScreen", true);
	 }
	
	 @Test (priority=12, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyEmailScreenFields() throws Exception
		{
		    loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			
			
			Assert.assertTrue(setting.emaillblValueExist());
			Assert.assertTrue(setting.emaillblTappable());
			Assert.assertTrue(setting.emaillblExist());
			Assert.assertTrue(setting.lnkSaveExist());
			
			Assert.assertTrue(setting.icnBackExist());
			
			
			Assert.assertTrue(setting.emailfieldExist());
			
			
			Reporter.log(" test_TC_VerifyEmailScreenFields", true);
			
			}
	 
	 
	 @Test (priority=13, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyEmailScreenWithExistingEmail() throws Exception
		{
	 
		    loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.emaillblValueExist());
			Assert.assertTrue(setting.emaillblTappable());
			Assert.assertTrue(setting.emaillblExist());
			Assert.assertTrue(setting.lnkSaveExist());
			
			Assert.assertTrue(setting.icnBackExist());
			Assert.assertTrue(setting.emailfieldExist());
			
			Assert.assertTrue(setting.emailfieldTappable());
		
			Reporter.log("test_TC_VerifyEmailScreenWithExistingEmail", true);
		
}
	 @Test (priority=14, enabled=true,dataProvider="InValid Data", groups = {"Setting"})
		public void test_TC_VerifyEmailTextValidationWithInValidData(String sData) throws Exception
		{

		    loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.emaillblValueExist());
			Assert.assertTrue(setting.emaillblTappable());
			Assert.assertTrue(setting.emaillblExist());
			Assert.assertTrue(setting.lnkSaveExist());
			
			Assert.assertTrue(setting.icnBackExist());
			Assert.assertTrue(setting.emailfieldExist());
			Assert.assertTrue(setting.emailfieldTappable());
			Assert.assertTrue(setting.cleardDataEmailName(sData));//cleardDataemailName(String sData)
			Assert.assertTrue(setting.enterInValidEmailDataInTxtBxEmail(testData.INVALID_EMAIL_3));
			
			Reporter.log("test_TC_VerifyEmailTextValidationWithInValidData", true);
	}
	 @Test (priority=15, enabled=true,dataProvider="InValid Data", groups = {"Setting"})
		public void test_TC_VerifyEmailTextValidationWithValidData(String sData) throws Exception
		{
		 loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.emaillblValueExist());
			Assert.assertTrue(setting.emaillblTappable());
			Assert.assertTrue(setting.emaillblExist());
			Assert.assertTrue(setting.lnkSaveExist());
			
			Assert.assertTrue(setting.icnBackExist());
			Assert.assertTrue(setting.emailfieldExist());
			Assert.assertTrue(setting.emailfieldTappable());
			Assert.assertTrue(setting.cleardDataEmailName(sData));//cleardDataemailName(String sData)
			Assert.assertTrue(setting.enterInValidEmailDataInTxtBxEmail(testData.VALID_EMAIL_1));
			
			Reporter.log("VerifyEmailTextValidationWithValidData", true);
}
	 
	 
	 
	 @Test (priority=16, enabled=true,dataProvider="InValid Data", groups = {"Setting"})
		public void test_TC_VerifyEmailTextValidationWithSameData(String sData) throws Exception
		{
		    loginSettingPage();
			Assert.assertTrue(setting.lblAccountExist());
			Assert.assertTrue(setting.emaillblValueExist());
			Assert.assertTrue(setting.emaillblTappable());
			Assert.assertTrue(setting.emaillblExist());
			Assert.assertTrue(setting.lnkSaveExist());
			
			Assert.assertTrue(setting.icnBackExist());
			Assert.assertTrue(setting.emailfieldExist());
			Assert.assertTrue(setting.emailfieldTappable());
			Assert.assertTrue(setting.cleardDataEmailName(sData));//cleardDataemailName(String sData)
			Assert.assertTrue(setting.enterInValidEmailDataInTxtBxEmail(testData.VALID_LOGIN_EMAIL_1 ));
	 
			Reporter.log("test_TC_VerifyEmailTextValidationWithSameData", true);
}
	 
	 @Test (priority=17, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyChangePasswordLinkTappable() throws Exception
		{


		    loginSettingPage();
		    Assert.assertTrue(setting.lblAccountExist());
		    Assert.assertTrue(setting.changePasswordExist());
		    Assert.assertTrue(setting.changePasswordTappable());
		    Assert.assertTrue(setting.changePasswordlblExist());
            Assert.assertTrue(setting.lnkSaveExist());
		//	Assert.assertTrue(setting.icnBackExist());
		    Assert.assertTrue(setting.oldPasswordlblExist());
		    Assert.assertTrue(setting.newPasswordlblExist());
		    Assert.assertTrue(setting.confirmNewPasswordlblExist());
		    Assert.assertTrue(setting.oldPasswordlblTapppable());
		    Assert.assertTrue(setting.newPasswordlblTapppable());
		    Assert.assertTrue(setting.confirmNewPasswordlblTapppable());
		    
		    Reporter.log("test_TC_VerifyChangePasswordLinkTappable", true);
		    
		}
	 
	 @Test (priority=18, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyChangePasswordNavigationField() throws Exception
		{
		    loginSettingPage();
		    Assert.assertTrue(setting.lblAccountExist());
		    Assert.assertTrue(setting.changePasswordExist());
		    Assert.assertTrue(setting.changePasswordTappable());
		    Assert.assertTrue(setting.changePasswordlblExist());
            Assert.assertTrue(setting.lnkSaveExist());
		//	Assert.assertTrue(setting.icnBackExist());
		    Assert.assertTrue(setting.oldPasswordlblExist());
		    Assert.assertTrue(setting.newPasswordlblExist());
		    Assert.assertTrue(setting.confirmNewPasswordlblExist());
		    Assert.assertTrue(setting.oldPasswordlblTapppable());
		    Assert.assertTrue(setting.newPasswordlblTapppable());
		    Assert.assertTrue(setting.confirmNewPasswordlblTapppable());
		  
		    Reporter.log("test_TC_VerifyChangePasswordNavigationField", true);
		    }
	 
	 
	
	 @Test (priority=19, enabled=true, groups = {"Setting"})
		public void test_TC_VerifySupportScreenSectionFromSettingScreen() throws Exception
		{

		 loginSettingPage();
		 Assert.assertTrue(setting.lblSupportExist());
		 Assert.assertTrue(setting.termsOfServiceExist());
		 Assert.assertTrue(setting.privacyPolicyExist());
		 Assert.assertTrue(setting.feedBackExist());
		 Assert.assertTrue(setting.adChoiceExist());
		 Assert.assertTrue(setting.versionlblValueExist());
		
		 Reporter.log("test_TC_VerifySupportScreenSectionFromSettingScreen", true);
		}



	 @Test (priority=20, enabled=true, groups = {"Setting"})
		public void test_TC_VerifySupportScreenSectionNavigation() throws Exception
		{

		 loginSettingPage();
		 Assert.assertTrue(setting.lblSupportExist());
		 Assert.assertTrue(setting.termsOfServiceExist());
		 Assert.assertTrue(setting.termsOfServiceTappable());
		 Assert.assertTrue(signUp.iconBackClick());
		
		 
		 Assert.assertTrue(setting.privacyPolicyExist());
		 Assert.assertTrue(setting.privacyPolicyTappable());
		 Assert.assertTrue(signUp.iconBackClick());
		
	//	 Assert.assertTrue(setting.feedBackExist());
	//	 Assert.assertTrue(signUp.iconBackClick());
		
		 Assert.assertTrue(setting.adChoiceExist());
		 Assert.assertTrue(setting.adChoiceTappable());
		 Assert.assertTrue(signUp.iconBackClick());
		
		 Assert.assertTrue(setting.versionlblValueExist());
		
		 Reporter.log("test_TC_VerifySupportScreenSectionNavigation", true);
		}


	 @Test (priority=21, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyLogoutFromSettingScreen() throws Exception
		{

		 loginSettingPage();
		 Thread.sleep(3000);
		 genFunc.scrollDown(driver);
		 genFunc.scrollDown(driver);
		 Thread.sleep(3000);
		 Assert.assertTrue(setting.btnLogoutExist());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutNoBtnTappable());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutYesBtnTappable());
		
		 //welcomeScreen
		 Assert.assertTrue(welcome.btnSignUpExist());
	     Assert.assertTrue(welcome.btnLoginExist());
		 Assert.assertTrue(welcome.guestUserLinkExist());
		 
		 Reporter.log("test_TC_VerifyLogoutFromSettingScreen", true);
		}
	 
	 @Test (priority=22, enabled=true, groups = {"Setting"})
		public void test_TC_VerifyCopyRightMsg() throws Exception
		{
		 loginSettingPage();
		 Thread.sleep(3000);
		 genFunc.scrollDown(driver);
		 genFunc.scrollDown(driver);
		 Thread.sleep(3000);
		 Assert.assertTrue(setting.copyRightExist());
		 
		 Reporter.log("test_TC_VerifyCopyRightMsg", true);
	 
	 
	 
	 
		}
	 @Test (priority=23, enabled=true,dataProvider="Valid Data", groups = {"Setting"})
		public void test_TC_VerifyChangePasswordvalidateField(String sData) throws Exception
		{
		 loginSettingPage();
		    Assert.assertTrue(setting.lblAccountExist());
		    Assert.assertTrue(setting.changePasswordExist());
		    Assert.assertTrue(setting.changePasswordTappable());
		//    Assert.assertTrue(setting.oldPasswordlblTapppable());
		    Assert.assertTrue(setting.enterOldPassword(testData.VALID_OLDPWD_Settings));
		    Assert.assertTrue(setting.enterNewPassword(testData.VALID_NEW_PASSWORD));
		    Assert.assertTrue(setting.enterConfirmNewPassword(testData.VALID_NEW_CONFIRMPASSWORD));
		    Assert.assertTrue(setting.lnkSaveTappable());
		    Assert.assertTrue(setting.okBtnTappable());
		    Assert.assertTrue(signUp.iconBackClick());
		
		
		    Reporter.log("test_TC_VerifyChangePasswordvalidateField", true);
		
		}
	 
}
