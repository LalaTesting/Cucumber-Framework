package Pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class MyShowsPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);

	WebElement imgShow, titleMyShows, bckIcnMyshows,icnPlay, titleWatchLatestVideo, descLatestVideo, msgNoVideoSubscribed;
	
	public MyShowsPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}

	public Boolean titleMyShowsExists()
	{
		titleMyShows = driver.findElement(By.xpath(XPATH_LBL_MYSHOWS));
		if(titleMyShows.isDisplayed() && titleMyShows.getText().equals(data.MYSHOWS))
			return true;
		else return false;
	}
	
	public Boolean imgShowExists()
	{
		imgShow = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOW));
		if(imgShow.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean imgShowClick()
	{
		imgShow = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOW));
		if(imgShow.isDisplayed())
		{
			genFunc.elemClick(imgShow);
			return true;
		}
		else return false;
	}
	
	public Boolean icnPlayExists()
	{
		icnPlay = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOWPLAY));
		if(icnPlay.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean icnPlayClick()
	{
		icnPlay = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOWPLAY));
		if(icnPlay.isDisplayed())
		{
			genFunc.elemClick(icnPlay);
			return true;
		}
		else return false;
	}
	
	public Boolean titleWatchLatestVideoExists()
	{
		titleWatchLatestVideo = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOWNAME));
		if(titleWatchLatestVideo.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean titleWatchLatestVideoClick()
	{
		titleWatchLatestVideo = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOWNAME));
		if(titleWatchLatestVideo.isDisplayed())
		{
			genFunc.elemClick(titleWatchLatestVideo);
			return true;
		}
		else return false;
	}
	
	public Boolean descLatestVideoExists()
	{
		descLatestVideo = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOWDESC));
		if(descLatestVideo.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean descLatestVideoClick()
	{
		descLatestVideo = driver.findElement(By.id(ID_IMG_SUBSCRIBEDSHOWDESC));
		if(descLatestVideo.isDisplayed())
		{
			genFunc.elemClick(descLatestVideo);
			return true;
		}
		else return false;
	}

	public Boolean msgNoVideoSubscribedExists()
	{
		msgNoVideoSubscribed = driver.findElement(By.id(ID_TXT_NOVIDEOSUBSCRIBED));
		if(msgNoVideoSubscribed.isDisplayed() && msgNoVideoSubscribed.getText().equals(data.NOVIDEOSUBSCRIBEDMSG))
			return true;
		else return false;
	}
	
	public Boolean bckIcnMyshowsTappable()
	{
		bckIcnMyshows = driver.findElement(By.id(ID_ICN_BACK_SHOWDETAIL));
		if(bckIcnMyshows .isDisplayed())
		{
			genFunc.elemClick(bckIcnMyshows );
			return true;
			}
		else return false;
	}
	
	
}
