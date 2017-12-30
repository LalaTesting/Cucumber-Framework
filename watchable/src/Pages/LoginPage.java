package Pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Tests.BaseTest;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.ErrorMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class LoginPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	ErrorMsgs errData = new ErrorMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement txtLogin, txtBxUsername, txtBxPassword, txtBxNameFrgtPwd;
	WebElement lnkLogin, lnkForgotPassword;
	WebElement lblLoginErr, lblConfirmFrgtPwd, descConfirmFrgtPwd;
	WebElement titleForgotPassword, btnForgotPassword;
	WebElement btnPasswordReset,btnCloser,closeErrorClick,btnLoginFrgtPwd,lblforgotErr, icnBack,cancelLink,checkYourMailPwd,showPWDdesc,instructionMsg,checkYourMail ;
	
	public LoginPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean titleLoginExist()
	{
		txtLogin = driver.findElement(By.id(ID_LBL_WELCOMEBACK));
		if(txtLogin.isDisplayed() && (txtLogin.getText().equalsIgnoreCase(appData.WELCOMEBACK)))
			return true;
		else return false;
	}   

	public Boolean linkLogInExist()
	{
		lnkLogin = driver.findElement(By.id(ID_BTN_LOGINPAGE));
		if(lnkLogin.isDisplayed())
		{
			Reporter.log(assertMsg.LOGIN_LNK_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtbxUsernameExist()
	{
		txtBxUsername = driver.findElement(By.id(ID_TXTBX_LGNUSERNAME));
		if(txtBxUsername.isDisplayed())
		{
			Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtbxPasswordExist()
	{
		txtBxPassword = driver.findElement(By.id(ID_TXTBX_LGNPASSWORD));
		if(txtBxPassword.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean lnkForgotPasswordExist()
	{
		lnkForgotPassword = driver.findElement(By.id(ID_LNK_FORGOTPASSWORD));
		if(lnkForgotPassword.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_LNK_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean loginEnterCredentials(String username, String password)
	{
		txtBxUsername = driver.findElement(By.id(ID_TXTBX_LGNUSERNAME));
		txtBxPassword = driver.findElement(By.id(ID_TXTBX_LGNPASSWORD));
		if(txtBxUsername.isDisplayed() && txtBxPassword.isDisplayed())
		{
			//Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			//Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxUsername, username);
			genFunc.elemEnterData(txtBxPassword, password);

			return true;
		}
		else return false;
	}
	
	public Boolean lnkLoginTap()
	{
		lnkLogin = driver.findElement(By.id(ID_BTN_LOGINPAGE));
		if(lnkLogin.isDisplayed())
		{
			genFunc.elemClick(lnkLogin);
			return true;
		}	
		else return false;
	}
	//Login error
	public Boolean lblLoginErr()
	{
		lblLoginErr = driver.findElement(By.id(ID_LBL_LOGIN_ERROR));
		if(lblLoginErr.isDisplayed() && lblLoginErr.getText().contains(errData.INVALID_LOGIN))
			return true;
		else return false;
	}
	
	//forgot error
	public Boolean lblForgotErr()
	{
		lblforgotErr = driver.findElement(By.id(ID_LBL_FORGOT_ERROR));
		if(lblforgotErr.isDisplayed() && lblforgotErr.getText().contains(errData.INVALID_FORGOT))
			return true;
		else return false;
	}
	
	public Boolean lnkForgotPasswordClick()
	{
		lnkForgotPassword = driver.findElement(By.id(ID_LNK_FORGOTPASSWORD));
		if(lnkForgotPassword.isDisplayed())
		{
			genFunc.elemClick(lnkForgotPassword);
			return true;
		}
		else return false;
	}
	
	public Boolean titleNdescForgotPasswordExist()
	{
		titleForgotPassword = driver.findElement(By.id(XPATH_LBL_FORGOTPASSWORD ));
		btnForgotPassword = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		cancelLink=driver.findElement(By.id(ID_LNK_CANCEL));
		if(titleForgotPassword.isDisplayed() && btnForgotPassword.isDisplayed() && cancelLink.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean txtBxForgotPasswordExist()
	{
		txtBxNameFrgtPwd = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		if(txtBxNameFrgtPwd.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean btnSendPwdResetExist()
	{
		btnPasswordReset = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		if(btnPasswordReset.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_BTN_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean enterValidDataInTxtBxForgotPassword(String sData)
	{
		txtBxNameFrgtPwd = driver.findElement(By.id(ID_TXTBX_USERNAMEEMAIL));
		btnPasswordReset = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		if(txtBxNameFrgtPwd.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxNameFrgtPwd, sData);
			if(btnPasswordReset.isEnabled())
				genFunc.elemClick(btnPasswordReset);
			return true;
		}
		else return false;
	}
	
	public Boolean btnSendPwdResetClick()
	{
		btnPasswordReset = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		if(btnPasswordReset.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_BTN_EXIST,true);
			genFunc.elemClick(btnPasswordReset);
			return true;
		}
		else return false;
	}
	
	public Boolean confirmFrgtPwdExist()
	{
		lblConfirmFrgtPwd = driver.findElement(By.id(ID_BTN_CONFIRMMAIL));
	//	checkYourMail = driver.findElement(By.id(ID_TXT_CHECK_YOUR_EMAIL));
	//	instructionMsg=driver.findElement(By.id(ID_TXT_INSTRUCTIONmSG));
	//	showPWDdesc = driver.findElement(By.id(ID_TXT_SHOWPASSWORDCONFIRMATION));
		if(lblConfirmFrgtPwd.isDisplayed())
		//if(lblConfirmFrgtPwd.isDisplayed() && (lblConfirmFrgtPwd.getText().equalsIgnoreCase(appData.OKWILLCHECK)) && checkYourMail.isDisplayed() && (checkYourMail.getText().equalsIgnoreCase(appData.CHECKEMAIL)) && instructionMsg.isDisplayed() && (instructionMsg.getText().equalsIgnoreCase(appData.FORGOTiNSTMASG)) && showPWDdesc.isDisplayed())
		{
			
			Reporter.log(assertMsg.FRGTPWD_CONFIRM,true);
		//	genFunc.elemClick(lblConfirmFrgtPwd);
		//	genFunc.elemClick(lblConfirmFrgtPwd);
			return true;
		}
		else return false;
	}
	
	
	public Boolean enterInvalidDataInTxtBxForgotPassword(String sData)
	{
		txtBxNameFrgtPwd = driver.findElement(By.id(ID_TXTBX_USERNAMEEMAIL));
		btnPasswordReset = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		if(txtBxNameFrgtPwd.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxNameFrgtPwd, sData);
			if(btnPasswordReset.isEnabled())
			
				genFunc.elemClick(btnPasswordReset);
			return true;
		}
		else return false;
		
	}
	
	public Boolean btnLoginFrgtPwdClick()
	{
		btnLoginFrgtPwd = driver.findElement(By.id(ID_BTN_CONFIRMMAIL));
		if(btnLoginFrgtPwd.isDisplayed())
		{
			genFunc.elemClick(btnLoginFrgtPwd);
			return true;
		}
		else return false;
	}
	
	public Boolean icnBackClick()
	{
		icnBack = driver.findElement(By.id(ID_ICN_BACK));
		if(icnBack.isDisplayed())
		{
			Reporter.log(assertMsg.BACK_ICN_EXIST,true);
			genFunc.elemClick(icnBack);
			return true;
		}
		else return false;
	}
	
	public Boolean clearInvalidDataInTxtBxForgotPassword()
	{
		txtBxNameFrgtPwd = driver.findElement(By.id(ID_TXTBX_USERNAMEEMAIL));//ID_BTN_CLOSERLAYOUT
	//	btnCloser = driver.findElement(By.id("ID_BTN_CLOSERLAYOUT"));
		if(txtBxNameFrgtPwd.isDisplayed())
		{
		//	genFunc.elemEnterData(txtBxNameFrgtPwd, sData);
		//	genFunc.elemClick(btnPasswordReset);
		//	Assert.assertTrue(driver.findElement(By.id(ID_LBL_FORGOT_ERROR)).getText().equalsIgnoreCase(errData.INVALID_FORGOT));
			
			int maxChars = txtBxNameFrgtPwd.getText().length();
			for (int i = 0; i < maxChars; i++)
				((AppiumDriver)driver).sendKeyEvent(67);
			
		//	Assert.assertTrue(txtBxNameFrgtPwd.getText().isEmpty());
			return true;
		}
		else return false;
	}
	

	public Boolean lblWELCOMEExist()
	{
		btnPasswordReset = driver.findElement(By.id(ID_BTN_SENDPASSWORD));
		if(btnPasswordReset.isDisplayed())
		{
			Reporter.log(assertMsg.FRGTPWD_BTN_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean closeErrorClick()
	{
		closeErrorClick = driver.findElement(By.id(ID_ERR_CLOSEERROR));
		if(closeErrorClick.isDisplayed())
		{
			genFunc.elemClick(closeErrorClick);
			return true;
		}
		else return false;
	}
	
	
			
}
