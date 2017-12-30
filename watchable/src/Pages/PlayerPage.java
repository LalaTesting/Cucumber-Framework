package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class PlayerPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement icnPortraitClose, icnInfo, icnPlay, icnShare, icnRewind, icnSeekBar, icnFullScreen, descTitle, startTime, endTime;
	
	public PlayerPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean playerIcnCloseExist()
	{
		icnPortraitClose = driver.findElement(By.id(ID_ICN_PORTRAITPLAYCLOSE));
		if(icnPortraitClose.isDisplayed()) 
			return true;
		else return false;
	}
	
	public Boolean playerInfoExist()
	{
		icnInfo = driver.findElement(By.id(ID_ICN_PLAYERINFO));
		if(icnInfo.isDisplayed()) 
			return true;
		else return false;
	}
	
	public Boolean playerInfoClick()
	{
		icnInfo = driver.findElement(By.id(ID_ICN_PORTRAITPLAYCLOSE));
		if(icnInfo.isDisplayed()) 
		{
			genFunc.elemClick(icnInfo);
			return true;
		}
		else return false;
	}
	
	public Boolean playerFullScreenClick()
	{
		icnFullScreen = driver.findElement(By.id(ID_ICN_PLAYERFULLSCREEN));
		if(icnFullScreen.isDisplayed()) 
		{
			genFunc.elemClick(icnFullScreen);
			return true;
		}
		else return false;
	}
	
	public Boolean playerControlsExists()
	{
		icnInfo = driver.findElement(By.id(ID_ICN_PLAYERINFO));
		icnShare = driver.findElement(By.id(ID_ICN_PLAYERSHARE));
		icnFullScreen = driver.findElement(By.id(ID_ICN_PLAYERFULLSCREEN));
		icnPlay = driver.findElement(By.id(ID_ICN_PLAYERPLAY));
		
		if(icnInfo.isDisplayed() && icnShare.isDisplayed() && icnFullScreen.isDisplayed() && icnPlay.isDisplayed()) 
			return true;
		else return false;
	}
	
	public Boolean playerControls2Exists()
	{
		icnRewind = driver.findElement(By.id(ID_ICN_PLAYERREWIND));
		startTime = driver.findElement(By.id(ID_TXT_INLINESTARTTIME));
		endTime = driver.findElement(By.id(ID_TXT_INLINEENDTIME));
		icnSeekBar = driver.findElement(By.id(ID_CTLR_INLINESEEKBAR));
		
		if(icnRewind.isDisplayed() && startTime.isDisplayed() && endTime.isDisplayed() && icnSeekBar.isDisplayed()) 
			return true;
		else return false;
	}
	
	public String getPortraitPlayerStartTime()
	{
		startTime = driver.findElement(By.id(ID_TXT_PORTRAITSTARTTIME));
		if(startTime.isDisplayed()) 
			return startTime.getText();
		return null;		
	}
	
	public String getPortraitPlayerEndTime()
	{
		endTime = driver.findElement(By.id(ID_TXT_PORTRAITENDTIME));
		if(endTime.isDisplayed()) 
			return endTime.getText();
		return null;		
	}
	
	public Boolean playerDescTitleExists()
	{
		descTitle = driver.findElement(By.id(ID_TXT_PORTRAITDESCTITLE));
		if(descTitle.isDisplayed()) 
			return true;
		else return false;
	}
	
	
}
