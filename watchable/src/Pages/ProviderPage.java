package Pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class ProviderPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement lblProvider, imgShow, nameShow, descShow, coverImageShowDetail, logoShowDetail;
	WebElement titlePlaylists, titleGenre, namePlaylist, descPlaylist, nameProvider;
	WebElement popUpConfirmEmail, btnViewMore;
	
	public ProviderPage(AppiumDriver driver)
	{
		this.driver = driver;	
	}

	public Boolean titleProviderExist()
	{
		lblProvider = driver.findElement(By.id(ID_LBL_PROVIDERNAME));
		if(lblProvider.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean imgShowExist()
	{
		imgShow = driver.findElement(By.id(ID_IMG_SHOW));
		if(imgShow.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean imgShowClick()
	{
		imgShow = driver.findElement(By.id(ID_IMG_SHOW));
		if(imgShow.isDisplayed())
		{
			genFunc.elemClick(imgShow);
			return true;
		}
		else return false;
	}
	
	public Boolean nameShowExist()
	{
		nameShow = driver.findElement(By.id(ID_TITLE_SHOWNAME));
		if(nameShow.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean descShowExist()
	{
		descShow = driver.findElement(By.id(ID_SHOWDESC));
		if(descShow.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean showdetailCoverImageExist()
	{
		coverImageShowDetail = driver.findElement(By.id(ID_LBL_PLAYLISTTHUMBNAIL_SHOWDETAIL));
		if(coverImageShowDetail.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean showdetailLogoExist()
	{
		logoShowDetail = driver.findElement(By.id(ID_PROVIDER_SHOWLOGO));
		if(logoShowDetail.isDisplayed())
			return true;
		else return false;
	}

}
