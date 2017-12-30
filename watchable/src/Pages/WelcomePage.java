package Pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Tests.BaseTest;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class WelcomePage extends UIElements {
	
	AppiumDriver driver;
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement txtWatchable, txtDesc, btnSignUp, btnLogin,linkGuestUser;
	
	public WelcomePage(AppiumDriver driver)
	{
		this.driver = driver;		
	}

	public Boolean titleWelcomeExist()
	{
		txtWatchable = driver.findElement(By.id(ID_LBL_WATCHABLE));
		System.out.println(appData.WATCHABLE);
		if(txtWatchable.isDisplayed() && (txtWatchable.getText().equalsIgnoreCase(appData.WATCHABLE)))
		{
			Reporter.log(assertMsg.WATCHABLE_TITLE_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean descWelcomeExist()
	{
		txtDesc = driver.findElement(By.id(ID_LBL_VIDEOWITHOUTLIMITS));
		if(txtDesc.isDisplayed() && (txtDesc.getText().equalsIgnoreCase(appData.WATCHABLEDESC)))
		{
			Reporter.log(assertMsg.DESCR_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean btnSignUpExist()
	{
		btnSignUp = driver.findElement(By.id(ID_BTN_SIGNUP));
		if(btnSignUp.isDisplayed() && (btnSignUp.getText().equalsIgnoreCase(appData.SIGNUP)))
		{
			Reporter.log(assertMsg.SIGNUP_BTN_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean btnLoginExist()
	{
		btnLogin = driver.findElement(By.id(ID_BTN_LOGIN));
		if(btnLogin.isDisplayed() && (btnLogin.getText().equalsIgnoreCase(appData.LOGIN)))
		{
			Reporter.log(assertMsg.LOGIN_BTN_EXIST,true);
			return true;
		}
		else return false;
	}
	public Boolean guestUserLinkExist()
	{
		linkGuestUser = driver.findElement(By.id(ID_BTN_TRYWITHOUTANACCOUNT));
		if(linkGuestUser.isDisplayed() && (linkGuestUser.getText().equalsIgnoreCase(appData.TRYWITHOUTANACCOUNT)))
		{
			Reporter.log(assertMsg.GUESTUSER_LINK_EXIST,true);
			return true;
		}
		else return false;
	}
	

	public Boolean btnSignUpTappable()
	
	{
		btnSignUp = driver.findElement(By.id(ID_BTN_SIGNUP));
		if(btnSignUp.isDisplayed() && (btnSignUp.getText().equalsIgnoreCase(appData.SIGNUP)))
		{
			genFunc.elemClick(btnSignUp);
			Reporter.log(assertMsg.SIGNUP_BTN_TAPPABLE,true);
			return true;
		}
		else return false;
	}
	
	public Boolean btnLoginTappable()
	{
		btnLogin = driver.findElement(By.id(ID_BTN_LOGIN));
		if(btnLogin.isDisplayed() && (btnLogin.getText().equalsIgnoreCase(appData.LOGIN)))
		{
			genFunc.elemClick(btnLogin);
			//Reporter.log(assertMsg.LOGIN_BTN_TAPPABLE,true);
			return true;
		}
		else return false;
	}
	
	public Boolean linkGuestUserTappable()
	{
		linkGuestUser= driver.findElement(By.id(ID_BTN_TRYWITHOUTANACCOUNT));
		if(linkGuestUser.isDisplayed() && (linkGuestUser.getText().equalsIgnoreCase(appData.TRYWITHOUTANACCOUNT)))
		{
			genFunc.elemClick(linkGuestUser);
			return true;
		}
		else return false;
		
	}
}
