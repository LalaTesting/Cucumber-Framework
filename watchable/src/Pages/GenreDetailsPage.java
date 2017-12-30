package Pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class GenreDetailsPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);

	WebElement titleGenre, txtGenre, genreDetailThumbnail ,imgGenre, genreShowDesc, genreShowImg, genreShowName, icnFollow, genreStatusBar, lnkFollow, icnSearch, txtbxSearch, icnSearchScrn, lnkCancel;
	
	public GenreDetailsPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}

	public Boolean titleGenreExists()
	{
		titleGenre = driver.findElement(By.id(ID_TXT_GENRETITLE));
		if(titleGenre.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean bckImgGenreExists()
	{
		imgGenre = driver.findElement(By.id(ID_TXT_GENREDETAILIMG));
		if(imgGenre.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean genreShowImgExists()
	{
		genreShowImg = driver.findElement(By.id(ID_TXT_GENRESHOWIMG));
		if(genreShowImg.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean genreShowNameExists()
	{
		genreShowName = driver.findElement(By.id(ID_TXT_GENRESHOWNAME));
		if(genreShowName.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean genreShowDescExists()
	{
		genreShowDesc = driver.findElement(By.id(ID_TXT_GENRESHOWDESC));
		if(genreShowDesc.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean genreShowFollowStatusExists()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_GENRESHOWFOLLOW));
		lnkFollow = driver.findElement(By.id(ID_TXT_GENRESHOWFOLLOW));
		if(icnFollow.isDisplayed() && lnkFollow.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean genreShowFollowStatusClick()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_GENRESHOWFOLLOW));
		lnkFollow = driver.findElement(By.id(ID_TXT_GENRESHOWFOLLOW));
		if(icnFollow.isDisplayed() && lnkFollow.isDisplayed())
		{
			genFunc.elemClick(lnkFollow);
			return true;
		}
		else return false;
	}
	
	public String getGenreFollowText()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_GENRESHOWFOLLOW));
		lnkFollow = driver.findElement(By.id(ID_TXT_GENRESHOWFOLLOW));
		if(icnFollow.isDisplayed() && lnkFollow.isDisplayed()) 
			return lnkFollow.getText();
		else 
			return null;
	}
	
	public Boolean genreTitleStatusBarExists()
	{
		genreStatusBar = driver.findElement(By.id(ID_TXT_GENRETITLESTATUSBAR));
		if(genreStatusBar.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean genreShowThumbnailClick()
	{
		genreDetailThumbnail = driver.findElement(By.id(ID_TXT_GENRESHOWIMG));
		
		if(genreDetailThumbnail.isDisplayed())
		{
			genFunc.elemClick(genreDetailThumbnail);
			return true;
		}
		else return false;
	}
	
}
