package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class GuestUserPage extends UIElements {

	
	AppiumDriver driver;
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	WebElement linkGuestUser,txtdiscover,txtdiscoverdesc,icnDiscover,txtbrowseShow,txtbrowseShowdesc,icnbrowseShow;
	WebElement txtpersonalize,txtpersonalizedesc,icnpersonalize,diveInBtn,welcomeInfo,signUpInfo,signUpBtn,loginBtn;

	public GuestUserPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean discoverExist()
	{
		txtdiscover = driver.findElement(By.id(ID_TXT_DISCOVER));
		txtdiscoverdesc=driver.findElement(By.id(ID_TXT_DISCOVERDESC));
		icnDiscover=driver.findElement(By.id(ID_ICN_DISCOVER));
		if(txtdiscover.isDisplayed() && (txtdiscover.getText().equalsIgnoreCase(appData.Discover))&&txtdiscoverdesc.isDisplayed() && (txtdiscoverdesc.getText().equalsIgnoreCase(appData.DiscoverDesc)) &&icnDiscover.isDisplayed())
			return true;
			else return false;	
	}
	
	public Boolean browseShowsExist()
	{
		txtbrowseShow=driver.findElement(By.id(ID_TXT_BROWSERSHOWS));
		txtbrowseShowdesc=driver.findElement(By.id(ID_TXT_BROWSERSHOWSDESC));
		icnbrowseShow=driver.findElement(By.id(ID_ICN_BROWSERSHOWS));
		
		if(txtbrowseShow.isDisplayed() && (txtbrowseShow.getText().equalsIgnoreCase(appData.BrowseShows))&&txtbrowseShowdesc.isDisplayed() && (txtbrowseShowdesc.getText().equalsIgnoreCase(appData.BrowseShowsDesc)) &&icnbrowseShow.isDisplayed())
			return true;
			else return false;	
		
		
	}
	
	public Boolean personalizeExist()
	{
		txtpersonalize=driver.findElement(By.id(ID_TXT_PERSONALIZE));
		txtpersonalizedesc=driver.findElement(By.id(ID_TXT_PERSONALIZEDESC));
		icnpersonalize=driver.findElement(By.id(ID_ICN_PERSONALIZE));
		
		if(txtpersonalize.isDisplayed() && (txtpersonalize.getText().equalsIgnoreCase(appData.Personalize))&&txtpersonalizedesc.isDisplayed() && (txtpersonalizedesc.getText().equalsIgnoreCase(appData.PersonalizeDesc)) &&icnpersonalize.isDisplayed())
			return true;
			else return false;	
		
		
	}
	
	public Boolean diveInButtonExist()
	{
		diveInBtn = driver.findElement(By.id(ID_BTN_DIVEIN));
		if(diveInBtn.isDisplayed() && (diveInBtn.getText().equalsIgnoreCase(appData.DIVEIN)))
		{
			Reporter.log(assertMsg.DIVEIN_LINK_EXIST,true);
			return true;
		}
		else return false;
	}
	
	
	public Boolean btnDiveInTappable()
	{
		diveInBtn = driver.findElement(By.id(ID_BTN_DIVEIN));
		if(diveInBtn.isDisplayed() && (diveInBtn.getText().equalsIgnoreCase(appData.DIVEIN)))
		{
			genFunc.elemClick(diveInBtn);
			Reporter.log(assertMsg.DIVEIN_BTN_TAPPABLE,true);
			return true;
		}
		else return false;
	}
	
	
	public Boolean signUpOverlayExist()
	{
		welcomeInfo = driver.findElement(By.id(ID_TXT_WELCOME));
		signUpInfo = driver.findElement(By.id(ID_TXT_SIGNUPINFO));
		signUpBtn = driver.findElement(By.id(ID_BTN_SIGNUPOVERLAY));
		loginBtn = driver.findElement(By.id(ID_BTN_LOGINACCOUNT));
		if(welcomeInfo.isDisplayed() && (welcomeInfo.getText().equalsIgnoreCase(appData.WELCOMETEXT))&& signUpInfo.isDisplayed() && (signUpInfo.getText().equalsIgnoreCase(appData.SIGNUPINFOTEXT)) &&signUpBtn.isDisplayed()&& (signUpBtn.getText().equalsIgnoreCase(appData.SIGNUPBTN)) && loginBtn.isDisplayed() && (loginBtn.getText().equalsIgnoreCase(appData.LOGINBTN)))
		{
			Reporter.log(assertMsg.SIGNUP_OVERLAY_PAGE_EXIST,true);
			return true;
		}
		else return false;
	}
	
	public Boolean signupBtnTappable()
	{
		signUpBtn = driver.findElement(By.id(ID_BTN_SIGNUPOVERLAY));
	   
		if(signUpBtn.isDisplayed() && (signUpBtn.getText().equalsIgnoreCase(appData.SIGNUPBTN)))
		{
			genFunc.elemClick(signUpBtn);
			Reporter.log(assertMsg.SIGNUP_BTN_TAPPABLE,true);
			return true;
		}
		else return false;
	
	
	}
	
	public Boolean loginIntoYourAccountTappable()
	{
		loginBtn = driver.findElement(By.id(ID_BTN_LOGINACCOUNT));
		if( loginBtn.isDisplayed() && (loginBtn.getText().equalsIgnoreCase(appData.LOGINBTN)))
		{
			genFunc.elemClick(loginBtn);
			Reporter.log(assertMsg.LOGIN_BTN_TAPPABLE,true);
			return true;
		}
		else return false;
	
	
	}
	
	
	
	
}
