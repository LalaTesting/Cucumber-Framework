package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class GenrePage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);

	WebElement lblBrowse, txtGenre, imgGenre, icnSearch, txtbxSearch, icnSearchScrn, lnkCancel;
	
	public GenrePage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
		
	public Boolean titleBrowseExists()
	{
		lblBrowse = driver.findElement(By.xpath(XPATH_LBL_BROWSE));
		if(lblBrowse.isDisplayed() && lblBrowse.getText().equals(data.BROWSE))
			return true;
		else return false;
	}
	
	public Boolean txtGenreExists()
	{
		txtGenre = driver.findElement(By.id(ID_TXT_GENRES));
		if(txtGenre.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean txtGenreImageExists()
	{
		imgGenre = driver.findElement(By.id(ID_IMG_GENRES));
		if(imgGenre.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean txtGenreDisplay()
	{
		List <WebElement> txtGenres = driver.findElements(By.id(ID_TXT_GENRES));

		if(txtGenres.size()!=0)
		{
			for(int i=0; i<txtGenres.size(); i++)
				Reporter.log(txtGenres.get(i).getText(),true);
			return true;
		}
		else return false;
	}
	
	public Boolean txtGenreClick()
	{
		List <WebElement> txtGenres = driver.findElements(By.id(ID_TXT_GENRES));

		if(txtGenres.size()!=0)
		{
			for(int i=0; i<txtGenres.size()-1; i++)
			{
				Reporter.log(txtGenres.get(i).getText(),true);
				genFunc.elemClick(txtGenres.get(i));
				Assert.assertTrue(new SignUpPage(driver).iconBackClick());
			}
			return true;
		}
		else return false;
	}
	
	public Boolean txtSelectiveGenreClick(String genreName)
	{
		List <WebElement> txtGenres = driver.findElements(By.id(ID_TXT_GENRES));
		int flag = 0;
		if(txtGenres.size()!=0)
		{
			for(int i=0; i<txtGenres.size()-1; i++)
			{
				//Reporter.log(txtGenres.get(i).getText(),true);
				if(txtGenres.get(i).getText().equals(genreName))
				{
					genFunc.elemClick(txtGenres.get(i));
					flag=1;
				}
				if (flag==1) break;
			}
			if (flag==1)
				return true;
			else return false;
		}
		else return false;
	}
	
	public Boolean icnSearchClick()
	{
		icnSearch = driver.findElement(By.id(ID_ICN_SEARCH));
		if(icnSearch.isDisplayed())
		{
			genFunc.elemClick(icnSearch);
			return true;
		}
		else return false;
	}
	
	public Boolean txtbxSearchExists()
	{
		txtbxSearch = driver.findElement(By.id(ID_TXTBX_SEARCH));
		if(txtbxSearch.isDisplayed() )
			return true;
		else return false;
	}
	
	public Boolean icnSearchExists()
	{
		icnSearchScrn = driver.findElement(By.id(ID_ICN_SEARCHSCRN));
		if(icnSearchScrn.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean lnkCancelExists()
	{
		lnkCancel = driver.findElement(By.id(ID_LNK_SEARCH_CANCEL));
		
		if(lnkCancel.isDisplayed())
			
			return true;
		else return false;
	}
	
	public Boolean lnkCancelTappable()
	{
		lnkCancel = driver.findElement(By.id(ID_LNK_SEARCH_CANCEL));
		if(lnkCancel.isDisplayed())
		{
			
			genFunc.elemClick(lnkCancel);
			return true;
		}
			
		else return false;
	}
}
