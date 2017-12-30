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
import Utils.TestData;
import Utils.UIElements;

public class SignUpPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	TestData testData = new TestData();
	ErrorMsgs errData = new ErrorMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement txtSignUp, txtFooter;
	WebElement icnBack,footerMSG,signUpButton;
	WebElement lnkDone,userNameFld,txtEmail,txtPassword;
	WebElement txtBxUsername, txtBxEmail,divInButton, txtBxPassword,txtPrivacy,checkBox;
	
	public SignUpPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean titleSignUpExist()
	{
		txtSignUp = driver.findElement(By.id(ID_BTN_SIGUP));
		if(txtSignUp.isDisplayed() && (txtSignUp.getText().equalsIgnoreCase(appData.SIGNUP)))
		{
			Reporter.log(assertMsg.SIGNUP_LBL_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean iconBackExist()
	{
		icnBack = driver.findElement(By.id(ID_ICN_BACK));
		if(icnBack.isDisplayed())
		{
			Reporter.log(assertMsg.BACK_ICN_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean linkDoneExist()
	{
		lnkDone = driver.findElement(By.id(ID_LNK_DONE));
		if(lnkDone.isDisplayed())
		{
			Reporter.log(assertMsg.DONE_LNK_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtbxUsernameExist()
	{
		txtBxUsername = driver.findElement(By.id(ID_TXT_USERNAME));
		if(txtBxUsername.isDisplayed())
		{
			Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtbxEmailExist()
	{
		txtBxEmail = driver.findElement(By.id(ID_TXTBX_EMAIL));
		if(txtBxEmail.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtPassword()
	{
		txtPassword = driver.findElement(By.id(ID_PASSWORD));
		if(txtPassword.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	
	
	public Boolean txtbxPasswordExist()
	{
		txtBxPassword = driver.findElement(By.id(ID_TXTBX_PASSWORD));
		if(txtBxPassword.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	
	public Boolean signUpButtonExist()
	{
		signUpButton = driver.findElement(By.id(ID_BTN_SIGUP));
		if(signUpButton.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtEmailExist()
	{
		txtEmail = driver.findElement(By.id(ID_EMAIL));
		if(txtEmail.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			return true;
		}
		else return false;
	}
	
	
	public Boolean footerTxtExist()
	{
		footerMSG = driver.findElement(By.id(ID_TXT_FOOTERMSG));
		if(footerMSG.isDisplayed())
		{
			Reporter.log(assertMsg.FOOTER_TXT_EXIST,true);
			return true;
		}
		else return false;
	}
		
	
	public Boolean iconBackClick()
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
	
	public Boolean txtbxUsernameWatermark()
	{
		txtBxUsername = driver.findElement(By.id(ID_TXTBX_USERNAME));
		if(txtBxUsername.isDisplayed())
		{
			Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			if (txtBxUsername.getText().equals(appData.USERNAME));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxEmailWatermark()
	{
		txtBxEmail = driver.findElement(By.id(ID_USERNAME));
		if(txtBxEmail.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			if (txtBxEmail.getText().equals(appData.EMAIL));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxPasswordWatermark()
	{
		txtBxPassword = driver.findElement(By.id(ID_PASSWORD));
		if(txtBxPassword.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			if (txtBxPassword.getText().equals(appData.PASSWORD));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxUsernameInvalid(String username)
	{
		txtBxUsername = driver.findElement(By.id(ID_USERNAME));
		if(txtBxUsername.isDisplayed())
		{
			Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxUsername, username);

			//if (driver.findElement(By.id(ID_ERR_USERNAME)).getText().equals(errData.INVALID_USERENAME));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxUsernameValid(String username)
	{
		txtBxUsername = driver.findElement(By.id(ID_USERNAME));
		if(txtBxUsername.isDisplayed())
		{
			Reporter.log(assertMsg.USERNAME_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxUsername, username);

			//if (driver.findElement(By.id(ID_CHK_USERNAME)).isDisplayed());
				return true;
		}
		else return false;
	}

	
	public Boolean txtbxEmailInvalid(String email) throws InterruptedException
	{
		txtBxEmail = driver.findElement(By.id(ID_EMAIL));
		if(txtBxEmail.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxEmail, email);
			Thread.sleep(3000);
			driver.findElement(By.id(ID_PASSWORD)).click();
		
		if (driver.findElement(By.id(ID_ERR_EMAIL)).getText().equals(errData.INVALID_EMAIL));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxEmailValid(String email) throws InterruptedException
	{
		txtBxEmail = driver.findElement(By.id(ID_EMAIL));
		if(txtBxEmail.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxEmail, email);
			Thread.sleep(3000);
			driver.findElement(By.id(ID_PASSWORD)).click();
			if (driver.findElement(By.id(ID_CHK_EMAIL)).isDisplayed());
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxEmailAlreadyExists() throws InterruptedException
	{
		txtBxEmail = driver.findElement(By.id(ID_EMAIL));
		if(txtBxEmail.isDisplayed())
		{
			Reporter.log(assertMsg.EMAIL_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxEmail, testData.VALID_EMAIL_1);
			Thread.sleep(3000);
			driver.findElement(By.id(ID_PASSWORD)).click();
			if (driver.findElement(By.id(ID_ERR_EMAIL)).equals(errData.INVALID_EMAIL_2));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxPasswordInvalid(String password) throws InterruptedException
	{
		txtBxPassword = driver.findElement(By.id(ID_PASSWORD));
		if(txtBxPassword.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxPassword, password);
			Thread.sleep(3000);
			driver.findElement(By.id(ID_EMAIL)).click();
			if (driver.findElement(By.id(ID_ERR_PASSW)).getText().equals(errData.INVALID_PASSWORD));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxPasswordValid(String password) throws InterruptedException
	{
		txtBxPassword = driver.findElement(By.id(ID_PASSWORD));
		if(txtBxPassword.isDisplayed())
		{
			Reporter.log(assertMsg.PASSWORD_TXTBX_EXIST,true);
			genFunc.elemEnterData(txtBxPassword, password);
			Thread.sleep(3000);
			driver.findElement(By.id(ID_EMAIL)).click();
			//if (driver.findElement(By.id(ID_CHK_PASSWORD)).isDisplayed());
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxFooterExists()
	{
		txtFooter = driver.findElement(By.id(ID_TXT_FOOTERMSG));
		if(txtFooter.isDisplayed())
		{
			Reporter.log(assertMsg.FOOTER_TXT_EXIST,true);

			if (txtFooter.isDisplayed() && (txtFooter.getText().equals(appData.FOOTER_MSG)));
				return true;
		}
		else return false;
	}
	
	public Boolean txtbxFooterLinks()
	{
		txtFooter = driver.findElement(By.id(ID_TXT_FOOTERMSG));
		if(txtFooter.isDisplayed())
		{
			Reporter.log(assertMsg.FOOTER_TXT_EXIST,true);

			if (txtFooter.isDisplayed() && (txtFooter.getText().equals(appData.FOOTER_MSG)));
			{
				//genFunc.elemClick(driver.findElement(By.partialLinkText("Privacy Policy")));
				return true;
			}				
		}
		else return false;
	}
	
	public Boolean txtPrivacyLinks()
	{
		txtPrivacy = driver.findElement(By.id(IDTXT_PRIVACYPOLICY));
		if(txtPrivacy.isDisplayed())
		{
			Reporter.log(assertMsg.FOOTER_TXT_EXIST,true);

			if (txtPrivacy.isDisplayed() && (txtPrivacy.getText().equals(appData.FOOTER_MSG)));
			{
				//genFunc.elemClick(driver.findElement(By.partialLinkText("Privacy Policy")));
				driver.findElement(By.id(IDTXT_PRIVACYPOLICY)).click();
				return true;
			}				
		}
		else return false;
	}
	
	public Boolean txtServiceLinks()
	{
		txtPrivacy = driver.findElement(By.id(IDTXT_PRIVACYPOLICY));
		if(txtPrivacy.isDisplayed())
		{
			Reporter.log(assertMsg.FOOTER_TXT_EXIST,true);

			if (txtPrivacy.isDisplayed() && (txtPrivacy.getText().equals(appData.FOOTER_MSG)));
			{
				//genFunc.elemClick(driver.findElement(By.partialLinkText("Privacy Policy")));
				driver.findElement(By.id(IDTXT_SERVICEPOLICY)).click();
				return true;
			}				
		}
		else return false;
	}
	public Boolean icnBackTapOnError() throws InterruptedException
	{
		//txtBxUsername = driver.findElement(By.id(ID_TXTBX_USERNAME));
		
		//genFunc.elemEnterData(txtBxUsername, testData.VALID_USERNAME_1);
		//driver.findElement(By.id(ID_TXT_USERNAME)).click();
		txtBxUsername = driver.findElement(By.id(ID_TXT_USERNAME));
		txtBxUsername.click();
		Thread.sleep(3000);
		txtBxUsername.sendKeys(testData.VALID_USERNAME_1);
		Thread.sleep(3000);
		driver.findElement(By.id(ID_EMAIL)).click();
		if (driver.findElement(By.id(ID_ERR_USERNAME)).getText().equals(errData.INVALID_USERENAME));
		Assert.assertTrue(iconBackClick());
		return true;
	}
	
	
	public Boolean selectCheckBox()
	{
		checkBox = driver.findElement(By.id(ID_CHECK_BOX));
		if(checkBox.isDisplayed())
		{
			
			{
				genFunc.elemClick(checkBox);
				return true;
			}
			
			
		}
		else return false;
	}
	
	
	
	public Boolean signUpButtonTap()
	{
		signUpButton = driver.findElement(By.id(ID_BTN_SIGUP));
		if(signUpButton.isDisplayed())
		{
			genFunc.elemClick(signUpButton);
			return true;
		}
		else return false;
	}
	

	

	public Boolean hideKeyBoard() throws InterruptedException
	{		
			
			driver.hideKeyboard();
			Thread.sleep(2000);
			return true;
	}
	
	public Boolean SignUpRegistration() throws InterruptedException
	{
		//txtBxUsername = driver.findElement(By.id(ID_TXTBX_USERNAME));
		
		//genFunc.elemEnterData(txtBxUsername, testData.VALID_USERNAME_1);
		//driver.findElement(By.id(ID_TXT_USERNAME)).click();
		txtBxUsername = driver.findElement(By.id(ID_TXT_USERNAME));
		txtBxUsername.click();
		Thread.sleep(3000);
		txtBxUsername.sendKeys(testData.VALID_USERNAME);
		Thread.sleep(3000);
		txtEmail = driver.findElement(By.id(ID_EMAIL));
		txtEmail.click();
		txtEmail.sendKeys(testData.VALID_EMAIL);
		Thread.sleep(3000);
		txtPassword = driver.findElement(By.id(ID_PASSWORD));
		txtPassword.click();
		txtPassword.sendKeys(testData.VALID_LOGIN_PWD_2);
		return true;
	}
	

	public Boolean divInTap()
	 {
	  divInButton = driver.findElement(By.id(ID_BTN_DIVEIN));
	  if(divInButton.isDisplayed())
	  {
	   genFunc.elemClick(divInButton);
	   return true;
	  }
	  else return false;
	 }
	
	
	
	
}
