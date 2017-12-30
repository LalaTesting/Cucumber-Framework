package Pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.ErrorMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class SettingPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	ErrorMsgs errData = new ErrorMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement lblSetting, lblSave, lblEmail, lblMsg;
	WebElement icnBack;
	WebElement txtEmailId;
	WebElement btnRsndConf, btnPopUpConfOK, popupConf;
	WebElement lblAccount,lblSetting1,lblSupport,btnLogout,usernamelbl,usernamevalue,emaillbl,emailvalue,chngPwdLbl,termsOfService;
	WebElement privacyPolicy,newPasswordlbl,feedBack,confirmNewPasswordlbl,oldPasswordlbl,passwordlbl,emailfield,emaillblsettng,adChoice,version,versionValue,copyRight,userNameField,backIcnSettings,userNamelbl ;
	WebElement logoutConfirmTxt,confirmMessage,logoutYesBtn,logoutNoBtn, okBtn;
	
	public SettingPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean titleSettingExist()
	{
		lblSetting = driver.findElement(By.xpath(XPATH_LBL_SETTINGS));
		if(lblSetting.isDisplayed() && lblSetting.getText().equals(appData.SETTINGS))
			return true;
		else return false;
	}
	
	public Boolean titleSettingTappable()
	{
		lblSetting = driver.findElement(By.xpath(XPATH_LBL_SETTINGS));
		if(lblSetting.isDisplayed() && lblSetting.getText().equals(appData.SETTINGS))
		{
			genFunc.elemClick(lblSetting);
			return true;
		}
		else return false;
	}
	
	
	public Boolean lblEmailExist()
	{
		lblEmail = driver.findElement(By.id(ID_ICN_STNGEMAIL));
		if(lblEmail.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean lnkSaveExist()
	{
		lblSave = driver.findElement(By.id(ID_ICN_STNGSAVE));
		if(lblSave.isDisplayed() && lblSave.getText().equals(appData.SAVE))
			return true;
		else return false;
	}
	public Boolean lnkSaveTappable()
	{
		lblSave = driver.findElement(By.id(ID_ICN_STNGSAVE));
		if(lblSave.isDisplayed() && lblSave.getText().equals(appData.SAVE))
		{
			
			genFunc.elemClick(lblSave);
			return true;
		}
			
		else return false;
	}
	
	
	public Boolean icnBackExist()
	{
		icnBack = driver.findElement(By.id(ID_ICN_STNGBACK));
		if(icnBack.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean icnBackTappable()
	{
		icnBack = driver.findElement(By.id(ID_ICN_STNGBACK));
		if(icnBack.isDisplayed())
		{
			genFunc.elemClick(icnBack);
			return true;
		}
			
		else return false;
	}
	
	public Boolean txtEmailExist()
	{
		txtEmailId = driver.findElement(By.id(ID_TXTBX_EmailData));
		if(txtEmailId.isDisplayed() && txtEmailId.getText().equals(appData.SIGNUP_EMAIL))
			return true;
		else return false;
	}
	
	public Boolean lblMessageExist()
	{
		lblMsg = driver.findElement(By.id(ID_TXT_STNGMSG));
		if(lblMsg.isDisplayed() && lblMsg.getText().equals(appData.MESSAGE))
			return true;
		else return false;
	}
	
	public Boolean btnRsndConfExist()
	{
		btnRsndConf = driver.findElement(By.id(ID_BTN_RSNDCONF));
		if(btnRsndConf.isDisplayed() && btnRsndConf.getText().equals(appData.RSNDCNFM))
			return true;
		else return false;
	}
	
	public Boolean btnRsndConfClick()
	{
		btnRsndConf = driver.findElement(By.id(ID_BTN_RSNDCONF));
		if(btnRsndConf.isDisplayed() && btnRsndConf.getText().equals(appData.RSNDCNFM))
		{
			genFunc.elemClick(btnRsndConf);
			return true;
		}
		else return false;
	}
	
	public Boolean btnRsndConfOKClick()
	{
		popupConf = driver.findElement(By.id(ID_POPUP_CONFMSG));
		if(popupConf.isDisplayed() && popupConf.getText().equals(appData.RSNDCNFMMSG))
		{
			btnPopUpConfOK = driver.findElement(By.id(ID_BTN_CONFOK));
			genFunc.elemClick(btnPopUpConfOK);
			return true;
		}
		else return false;
	}
	
	
	public Boolean lblSettingsExist()
	{
		lblSetting1 = driver.findElement(By.id(XPATH_LBL_SETTNG));
		if(lblSetting1.isDisplayed() && lblSetting1.getText().equals(appData.SETTNGS))
			return true;
		else return false;
	}
	
	public Boolean lblAccountExist()
	{
		lblAccount = driver.findElement(By.id(ID_TXT_ACCOUNT));
		if(lblAccount.isDisplayed() && lblAccount.getText().equals(appData.Account))
			return true;
		else return false;
	}

	public Boolean lblSupportExist()
	{
		lblSupport = driver.findElement(By.id(ID_TXT_SUPPORT));
		if(lblSupport.isDisplayed() && lblSupport.getText().equals(appData.Support))
			return true;
		else return false;
	}
	public Boolean btnLogoutExist()
	{
		btnLogout = driver.findElement(By.id(ID_BTN_LOGOUT));
		if(btnLogout.isDisplayed() && btnLogout.getText().equals(appData.Logout))
			return true;
		else return false;
	}
	public Boolean usernamelblValueExist()
	{
		usernamelbl = driver.findElement(By.id(ID_TXT_USERNAMESTNG));
		usernamevalue=driver.findElement(By.id(ID_TXT_USERVALUE));
		if(usernamelbl.isDisplayed() && usernamelbl.getText().equals(appData.userlbl) && usernamevalue.isDisplayed() && usernamevalue.getText().equals(appData.USERVALUESTTNGEXIST))
			return true;
		else return false;
	}
	
	
	
	public Boolean emaillblValueExist()
	{
		emaillbl = driver.findElement(By.id(ID_TXT_EMAILSTNG));
		emailvalue=driver.findElement(By.id(ID_TXT_EMAILVALUE));
		if(emaillbl.isDisplayed() && emaillbl.getText().equals(appData.EMAILLBL) && emailvalue.isDisplayed() && emailvalue.getText().equals(appData.EMAILVALUESTTNGEXIST))
			return true;
		else return false;
	}
	
	public Boolean changePasswordExist()
	{
		chngPwdLbl = driver.findElement(By.id(ID_TXT_CHANGEPWD));
		if(chngPwdLbl.isDisplayed() && chngPwdLbl.getText().equals(appData.CHANGEPWD))
			return true;
		else return false;
	}
	
	public Boolean termsOfServiceExist()
	{
		termsOfService = driver.findElement(By.id(ID_TXT_TERMSOFSERVICE));
		if(termsOfService.isDisplayed() && termsOfService.getText().equals(appData.TermsOfservices))
			return true;
		else return false;
	}
	
	public Boolean privacyPolicyExist()
	{
		privacyPolicy = driver.findElement(By.id(ID_TXT_PRIVACYPOLICY));
		if(privacyPolicy.isDisplayed() && privacyPolicy.getText().equals(appData.PrivacyPolicy))
			return true;
		else return false;
	}
	public Boolean feedBackExist()
	{
		feedBack = driver.findElement(By.id(ID_TXT_FEEDBACK));
		if(feedBack.isDisplayed() && feedBack.getText().equals(appData.FEEDBACK))
			return true;
		else return false;
	}
	public Boolean adChoiceExist()
	{
		adChoice= driver.findElement(By.id(ID_TXT_ADCHOICES));
		if(adChoice.isDisplayed() && adChoice.getText().equals(appData.ADCHOICES))
			return true;
		else return false;
	}
	
	public Boolean versionlblValueExist()
	{
		version= driver.findElement(By.id(ID_TXT_VERSION));
		versionValue=driver.findElement(By.id(ID_TXT_VERSIONNUMBER));
		if(version.isDisplayed() && version.getText().equals(appData.VERSION) && versionValue.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean copyRightExist()
	{
  	copyRight= driver.findElement(By.id(ID_TXT_COPYRIGHTS));
		if(copyRight.isDisplayed())
			return true;
		else return false;
		
		
		
	}
	
	public Boolean usernamelblTappable()
	{
		usernamelbl = driver.findElement(By.id(ID_TXT_USERNAMESTNG));
	
		if(usernamelbl.isDisplayed() && usernamelbl.getText().equals(appData.userlbl) && usernamevalue.isDisplayed() && usernamevalue.getText().equals(appData.userValueSettingxist))
		{
		
			genFunc.elemClick(usernamelbl);
			return true;
		}
		else return false;
	}
	
	
	
	public Boolean emaillblTappable()
	{
		emaillbl = driver.findElement(By.id(ID_TXT_EMAILSTNG));
		
		if(emaillbl.isDisplayed() && emaillbl.getText().equals(appData.EMAILLBL) && emailvalue.isDisplayed() && emailvalue.getText().equals(appData.EMAILVALUESTTNGEXIST))
		{
			
			
			genFunc.elemClick(emaillbl);
			return true;
		}
			
		else return false;
	}
	
	
	public Boolean changePasswordTappable()
	{
		chngPwdLbl = driver.findElement(By.id(ID_TXT_CHANGEPWD));
		if(chngPwdLbl.isDisplayed() && chngPwdLbl.getText().equals(appData.CHANGEPWD))
		{
			genFunc.elemClick(chngPwdLbl);
			return true;
		}
			
		else return false;
	}
	public Boolean termsOfServiceTappable()
	{
		termsOfService = driver.findElement(By.id(ID_TXT_TERMSOFSERVICE));
		if(termsOfService.isDisplayed() && termsOfService.getText().equals(appData.TermsOfservices))
			{
			
			genFunc.elemClick(termsOfService );
			return true;
			}
		else return false;
	}
	
	public Boolean privacyPolicyTappable()
	{
		privacyPolicy = driver.findElement(By.id(ID_TXT_PRIVACYPOLICY));
		if(privacyPolicy.isDisplayed() && privacyPolicy.getText().equals(appData.PrivacyPolicy))
			{
			genFunc.elemClick(privacyPolicy);
			return true;
		
			}
		else return false;
	}
	
	public Boolean feedBackTappable()
	{
		feedBack = driver.findElement(By.id(ID_TXT_FEEDBACK));
		if(feedBack.isDisplayed() && feedBack.getText().equals(appData.FEEDBACK))
			{
			genFunc.elemClick(feedBack);
			
			return true;
			}
		else return false;
	}
	public Boolean adChoiceTappable()
	{
		adChoice= driver.findElement(By.id(ID_TXT_ADCHOICES));
		if(adChoice.isDisplayed() && adChoice.getText().equals(appData.ADCHOICES))
			{
			genFunc.elemClick(adChoice);
			
			return true;
			}
		else return false;
	}

	public Boolean btnLogoutTappable()
	{
		btnLogout = driver.findElement(By.id(ID_BTN_LOGOUT));
		if(btnLogout.isDisplayed() && btnLogout.getText().equals(appData.Logout))
			{
			genFunc.elemClick(btnLogout);
			
			return true;
			}
		else return false;
	}

	//USERNAMEFIELD
	public Boolean userNameFieldExist()
	{
		userNameField = driver.findElement(By.id(ID_TXT_USERNAMEDATA));
		if(userNameField.isDisplayed() && userNameField.getText().equals(appData.userValueSettingxist))//ID_TXT_BACKICNUSERNAME
			return true;
		else return false;
	}
	public Boolean userNameFieldTappable()
	{
	
		userNameField = driver.findElement(By.id(ID_TXT_USERNAMEDATA));
	
		if(userNameField.isDisplayed() && userNameField.getText().equals(appData.userValueSettingxist))
		{
			
			genFunc.elemClick(userNameField );
			
			return true;
		}
		else return false;
	}
	
	
	
	public Boolean backIcnSettingsExist()
	{
		backIcnSettings=driver.findElement(By.id(ID_ICN_BACKICNUSERNAME));
		if(backIcnSettings.isDisplayed())
			return true;
		else return false;
		
	}
	
	public Boolean backIcnSettingsTappable()
	{
		backIcnSettings=driver.findElement(By.id(ID_ICN_BACKICNUSERNAME));
		if(backIcnSettings.isDisplayed())
		{
		genFunc.elemClick(backIcnSettings);
		
		return true;
		}
	else return false;
	
	}
	

	public Boolean userNamelblExist()
	{
		userNamelbl=driver.findElement(By.id(ID_LBL_USERNAME));
		if(userNamelbl.isDisplayed())//&& userNamelbl.getText().equals(appData.USERNAME_LBL)
			return true;
		else return false;
		
	}
	
	//emailfield
	public Boolean emaillblExist()
	{
		emaillblsettng=driver.findElement(By.id(ID_LBL_EMAIL));//ID_TXTBX_EmailData
		if(emaillblsettng.isDisplayed())//&& userNamelbl.getText().equals(appData.USERNAME_LBL)
			return true;
		else return false;
		
	}
	
	public Boolean emailfieldExist()
	{
		emailfield=driver.findElement(By.id(ID_TXTBX_EmailData));
		if(emailfield.isDisplayed() && emailfield.getText().equals(appData.EMAILVALUESTTNGEXIST))//ID_TXT_BACKICNUSERNAME
			return true;
		else return false;
	}
	public Boolean emailfieldTappable()
	{
	
		emailfield=driver.findElement(By.id(ID_TXTBX_EmailData));
	
		if(emailfield.isDisplayed() && emailfield.getText().equals(appData.EMAILVALUESTTNGEXIST))
		{
			
			genFunc.elemClick(emailfield);
			
			return true;
		}
		else return false;
	}
	
	

	public Boolean cleardDataUserName(String sData)
	{
		userNameField = driver.findElement(By.id(ID_TXT_USERNAMEDATA));//ID_BTN_CLOSERLAYOUT
	//	btnCloser = driver.findElement(By.id("ID_BTN_CLOSERLAYOUT"));
		if(userNameField.isDisplayed())
		{
			//genFunc.elemEnterData(userNameField, sData);
		//	genFunc.elemClick(btnPasswordReset);
		//	Assert.assertTrue(driver.findElement(By.id(ID_LBL_FORGOT_ERROR)).getText().equalsIgnoreCase(errData.INVALID_FORGOT));
			
			int maxChars = userNameField.getText().length();
			for (int i = 0; i < maxChars; i++)
				((AppiumDriver)driver).sendKeyEvent(67);
			
			Assert.assertTrue(userNameField.getText().isEmpty());
			return true;
		}
		else return false;
	}
	
	
	
	public Boolean enterInValidDataUserNameTxtField()
	{
		 driver.findElement(By.id(ID_TXT_USERNAMEDATA)).sendKeys("@#$");
		 if(userNameField.isDisplayed())
			{
			 return true;
			}
			else return false;
	}
	
	public Boolean enterValidDataInTxtBxForgotPassword(String sData)
	{
		userNameField = driver.findElement(By.id(ID_TXT_USERNAMEDATA));
		lblSave = driver.findElement(By.id(ID_ICN_STNGSAVE));
		if(userNameField.isDisplayed())
		{
			Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			genFunc.elemEnterData(userNameField, sData);
			if(lblSave.isEnabled())
				genFunc.elemClick(lblSave);
			return true;
		}
		else return false;
	}
	
	public Boolean enterInValidEmailDataInTxtBxEmail(String sData)
	{
		emailfield=driver.findElement(By.id(ID_TXTBX_EmailData));
		lblSave = driver.findElement(By.id(ID_ICN_STNGSAVE));
		if(emailfield.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			genFunc.elemEnterData(emailfield, sData);
			if(lblSave.isEnabled())
				genFunc.elemClick(lblSave);
			return true;
		}
		else return false;
	}
	
	public Boolean cleardDataEmailName(String sData)
	{
		emailfield=driver.findElement(By.id(ID_TXTBX_EmailData));//ID_BTN_CLOSERLAYOUT
	//	btnCloser = driver.findElement(By.id("ID_BTN_CLOSERLAYOUT"));
		if(emailfield.isDisplayed())
		{
		//	genFunc.elemEnterData(emailfield, sData);
		//	genFunc.elemClick(btnPasswordReset);
		//	Assert.assertTrue(driver.findElement(By.id(ID_LBL_FORGOT_ERROR)).getText().equalsIgnoreCase(errData.INVALID_FORGOT));
			
			int maxChars = emailfield.getText().length();
			for (int i = 0; i < maxChars; i++)
				((AppiumDriver)driver).sendKeyEvent(67);
			
			Assert.assertTrue(emailfield.getText().isEmpty());
			return true;
		}
		else return false;
	}
	
	
	//changePassword
	
	
	public Boolean changePasswordlblExist()
	{
		 passwordlbl=driver.findElement(By.id(ID_TXT_CHANGEPASSWORD));
		if(passwordlbl.isDisplayed())//&& userNamelbl.getText().equals(appData.USERNAME_LBL)
			return true;
		else return false;
		
	}
	
	public Boolean oldPasswordlblExist()
	{
		oldPasswordlbl=driver.findElement(By.id(ID_TXT_OLDPASSWORD));
		if(oldPasswordlbl.isDisplayed())//&& userNamelbl.getText().equals(appData.USERNAME_LBL)
			return true;
		else return false;
		
	}
	
	public Boolean enterOldPassword(String sData)
	{
		oldPasswordlbl=driver.findElement(By.id(ID_TXT_OLDPASSWORD));
		
		if(oldPasswordlbl.isDisplayed())
		{
			genFunc.elemEnterData(oldPasswordlbl, sData);
			
			return true;
		}
		else return false;
	}
	public Boolean newPasswordlblExist()
	{
		newPasswordlbl=driver.findElement(By.id(ID_TXT_NEWPASSWORD));
		if(newPasswordlbl.isDisplayed())
			return true;
		else return false;
		
	}
	
	public Boolean enterNewPassword(String sData)
	{
		newPasswordlbl=driver.findElement(By.id(ID_TXT_NEWPASSWORD));
		if(newPasswordlbl.isDisplayed())
		{
			genFunc.elemEnterData(newPasswordlbl, sData);
			
			return true;
		}
		else return false;
	}
	
	public Boolean confirmNewPasswordlblExist()
	{
		confirmNewPasswordlbl=driver.findElement(By.id(ID_TXT_CONFIRMNEWPASSWORD));
		if(confirmNewPasswordlbl.isDisplayed())
			return true;
		else return false;
		
	}
	
	public Boolean enterConfirmNewPassword(String sData)
	{
		confirmNewPasswordlbl=driver.findElement(By.id(ID_TXT_CONFIRMNEWPASSWORD));
		if(confirmNewPasswordlbl.isDisplayed())
		{
			genFunc.elemEnterData(confirmNewPasswordlbl, sData);
			
			return true;
		}
		else return false;
	}
	
	
	public Boolean oldPasswordlblTapppable()
	{
		oldPasswordlbl=driver.findElement(By.id(ID_TXT_OLDPASSWORD));
		if(oldPasswordlbl.isDisplayed())
        {
			
			genFunc.elemClick(oldPasswordlbl);
			
			return true;
		}
		else return false;
	}
	
	public Boolean newPasswordlblTapppable()
	{
		newPasswordlbl=driver.findElement(By.id(ID_TXT_NEWPASSWORD));
		if(newPasswordlbl.isDisplayed())
        {
			
			genFunc.elemClick(newPasswordlbl);
			
			return true;
		}
		else return false;
	}
	
	public Boolean confirmNewPasswordlblTapppable()
	{
		confirmNewPasswordlbl=driver.findElement(By.id(ID_TXT_CONFIRMNEWPASSWORD));
		if(confirmNewPasswordlbl.isDisplayed())
        {
			
			genFunc.elemClick(confirmNewPasswordlbl);
			
			return true;
		}
		else return false;
	}
	
	//LogoutPopup
	

	public Boolean logoutPopupexist()
	{
		logoutConfirmTxt=driver.findElement(By.id(ID_TXT_LOGOUTCONFIRMMSG));
		logoutYesBtn=driver.findElement(By.id(ID_TXT_LOGOUTYES));
		logoutNoBtn=driver.findElement(By.id(ID_TXT_LOGOUTNO));
		if(logoutConfirmTxt.isDisplayed() && logoutConfirmTxt.getText().equals(appData.CONFIRMMSGLOGOUT) && logoutYesBtn.isDisplayed() && logoutYesBtn.getText().equals(appData.LOGOUTBTN) && logoutNoBtn.isDisplayed() && logoutNoBtn.getText().equals(appData.CANCELBTN))
        
		return true;
		
		else return false;
	}
	public Boolean logoutYesBtnTappable()
	{
		logoutYesBtn=driver.findElement(By.id(ID_TXT_LOGOUTYES));
		
		if(logoutYesBtn.isDisplayed())
		{
			
		genFunc.elemClick(logoutYesBtn);
		
		
		return true;
		}
		else return false;
		}
	
	public Boolean logoutNoBtnTappable()
	{
		logoutNoBtn=driver.findElement(By.id(ID_TXT_LOGOUTNO));
		
		if(logoutNoBtn.isDisplayed())
		{
			
		genFunc.elemClick(logoutNoBtn);
		
		
		return true;
		}
		else return false;
		}

	public Boolean okBtnTappable()
	{
		 okBtn= driver.findElement(By.id(ID_BTN_OKBTN));
		if( okBtn.isDisplayed())
		{
			genFunc.elemClick(okBtn);
			return true;
		}
			
		else return false;
	}
	
	
	
}
