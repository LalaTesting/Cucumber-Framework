package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import Tests.BaseTest;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class PlaylistPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement lblPlaylist, lblBrowse, lblMyShows, lblSettings;
	WebElement titlePlaylists, titleGenre, namePlaylist,textEmail, descPlaylist;
	WebElement popUpConfirmEmail, btnViewMore;
	
	public PlaylistPage(AppiumDriver driver)
	{
		this.driver = driver;	
	}

	public Boolean titlePlaylistExist()
	{
		lblPlaylist = driver.findElement(By.xpath(XPATH_LBL_PLAYLIST));
		//System.out.println(lblPlaylist.getText());
		if(lblPlaylist.isDisplayed() && lblPlaylist.getText().equals(data.PLAYLISTS))
			return true;
		else return false;
	}
	
	public Boolean playlistNameExists()
	{
		namePlaylist = driver.findElement(By.id(ID_LBL_PLAYLISTTITLE));
		if(namePlaylist.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean playlistDescExists()
	{
		descPlaylist = driver.findElement(By.id(ID_LBL_PLAYLISTDESC));
		if(descPlaylist.isDisplayed())
		{
			System.out.println(descPlaylist.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean genreNameExists()
	{
		titleGenre = driver.findElement(By.id(ID_LBL_GENRETXT));
		if(titleGenre.isDisplayed())
		{
			System.out.println(titleGenre.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean playlistThumbnailExists()
	{
		if(driver.findElement(By.id(ID_IMG_THUMBNAIL)).isDisplayed())
		{
			Reporter.log(assertMsg.PLAYLIST_THUMBNAIL,true);
			return true;
		}
		else return false;
	}
	
	public Boolean titlePlaylistsConfirmEmailExists()
	{
		popUpConfirmEmail = driver.findElement(By.id(ID_POPUP_CONFIRMEMAIL));
		if(popUpConfirmEmail.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean confirmEmailNotExists()
	{
		if(popUpConfirmEmail.isDisplayed())
			return false;
		else return true;
	}
	
	
	
	public Boolean playlistNameClick()
	{
		namePlaylist = driver.findElement(By.id(ID_LBL_PLAYLISTTITLE));
		if(namePlaylist.isDisplayed())
		{
			genFunc.elemClick(namePlaylist);
			return true;
		}
		else return false;
	}
	
	public Boolean viewMoreClick()
	{
		btnViewMore = driver.findElement(By.id(ID_BTN_VIEWMORE));//ID_TXT_EMAILVIEWMORE
		if(btnViewMore.isDisplayed())
		{
			genFunc.elemClick(btnViewMore);
			textEmail = driver.findElement(By.id(ID_TXT_EMAILVIEWMORE));
			if(textEmail.isDisplayed() && textEmail.getText().equals(data.textEmail))
				return true;
			else return false;
		}
		else return false;		
	}
	public Boolean textEmailExist()
	{
		textEmail = driver.findElement(By.id(ID_TXT_EMAILVIEWMORE));//ID_TXT_EMAILVIEWMORE
		if(btnViewMore.isDisplayed())
		{
			return true;
		}
		else return false;
		}
	
	
	public void swipeOnToastToDismiss() throws InterruptedException
	{
		popUpConfirmEmail = driver.findElement(By.id(ID_POPUP_CONFIRMEMAIL));
		int startx = driver.findElement(By.id("com.comcast.watchablephone:id/error_text")).getLocation().getX();
		int starty = driver.findElement(By.id("com.comcast.watchablephone:id/error_text")).getLocation().getY();
		int endx = driver.findElement(By.id("com.comcast.watchablephone:id/view_more_text")).getLocation().getX();
		int endy = driver.findElement(By.id("com.comcast.watchablephone:id/view_more_text")).getLocation().getY();
		System.out.println(startx + " ::::::: " + starty + " ::::::: " + endx +  " ::::::: " + endy);
		
		WebDriverWait wait = new WebDriverWait(driver, data.PAGELOADTIME);
		wait.until(ExpectedConditions.visibilityOf(popUpConfirmEmail));

		driver.swipe(startx, starty, endx, endy, 3000);
	}
	
	
	
}
