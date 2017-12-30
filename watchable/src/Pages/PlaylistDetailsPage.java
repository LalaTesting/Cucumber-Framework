package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class PlaylistDetailsPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement icnPlay, icnFollow, videoDuration;
	WebElement titleGenre, namePlaylist, descPlaylist, durationPlaylist, sharePlaylist, backPlaylist, showLogoName, lnkFollow, descEpisode;
	WebElement imgEpisode, inlineProgressBar,inlinePlayerNotExist,icnInfo, inlinePlayer, statusBar, startTime, endTime,thumbnail;
	
	public PlaylistDetailsPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean icnPlayExist()
	{
		icnPlay = driver.findElement(By.id(ID_ICN_PLAY_PLAYLISTDETAIL));
		if(icnPlay.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean videoDurationExist()
	{
		videoDuration = driver.findElement(By.id(ID_TXT_VIDEODURATION));
		System.out.println(videoDuration.getText());
		if(videoDuration.isDisplayed())
			return true;
		else return false;
	}
	

	public Boolean playlistNameExists()
	{
		namePlaylist = driver.findElement(By.id(ID_LBL_PLAYLISTNAME_PLAYLISTDETAIL));
		if(namePlaylist.isDisplayed())
		{
			System.out.println(namePlaylist.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean playlistDescExists()
	{
		descPlaylist = driver.findElement(By.id(ID_LBL_PLAYLISTDESC_PLAYLISTDETAIL));
		if(descPlaylist.isDisplayed())
		{
			System.out.println(descPlaylist.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean genreNameExists()
	{
		titleGenre = driver.findElement(By.id(ID_LBL_GENRE_PLAYLISTDETAIL));
		if(titleGenre.isDisplayed())
		{
			System.out.println(titleGenre.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean playlistThumbnailExists()
	{
		if(driver.findElement(By.id(ID_LBL_PLAYLISTTHUMBNAIL_PLAYLISTDETAIL)).isDisplayed())
		{
			Reporter.log(assertMsg.PLAYLIST_THUMBNAIL,true);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistDurationExists()
	{
		durationPlaylist = driver.findElement(By.id(ID_LBL_PLAYLISTDURATION_PLAYLISTDETAIL));
		if(durationPlaylist.isDisplayed())
		{
			System.out.println(durationPlaylist.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean playlistShareExists()
	{
		sharePlaylist = driver.findElement(By.id(ID_ICN_SHARE_PLAYLISTDETAIL));
		if(sharePlaylist.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean playlistBackExists()
	{
		backPlaylist = driver.findElement(By.id(ID_ICN_BACK_PLAYLISTDETAIL));
		if(backPlaylist.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean playlistBackClick()
	{
		backPlaylist = driver.findElement(By.id(ID_ICN_BACK_PLAYLISTDETAIL));
		if(backPlaylist.isDisplayed())
		{
			genFunc.elemClick(backPlaylist);
			return true;
		}
		else return false;
	}

	public Boolean playlistShowLogoNameExists()
	{
		showLogoName = driver.findElement(By.id(ID_IMG_SHOWLOGONAME));
		if(showLogoName.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean playlistShareClick()
	{
		sharePlaylist = driver.findElement(By.id(ID_ICN_SHARE_PLAYLISTDETAIL));
		if(sharePlaylist.isDisplayed())
		{
			genFunc.elemClick(sharePlaylist);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistShowLogoClick()
	{
		showLogoName = driver.findElement(By.id(ID_IMG_SHOWLOGONAME));
		if(showLogoName.isDisplayed())
		{
			genFunc.elemClick(showLogoName);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistShowLogoLoads()
	{
		showLogoName = driver.findElement(By.id(ID_IMG_SHOWLOGONAME));
		if(showLogoName.isDisplayed())
		{
			genFunc.waitTillElementVisible(driver, showLogoName);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistFollowIcnLinkExists()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_FOLLOW));
		lnkFollow = driver.findElement(By.id(ID_LNK_FOLLOW));
		if(icnFollow.isDisplayed() && lnkFollow.isDisplayed()) 
		{
			System.out.println(lnkFollow.getText());
			return true;
		}
		else return false;
	}
	
	public Boolean playlistEpisodeDescExists()
	{
		descEpisode = driver.findElement(By.id(ID_TXT_EPISODEDESC));
		imgEpisode = driver.findElement(By.id(ID_IMG_EPISODE));
		if(descEpisode.isDisplayed() && imgEpisode.isDisplayed()) 
			return true;
		else return false;
	}
	
	
	
	public Boolean playlistLandscapeModeExists()
	{
		imgEpisode = driver.findElement(By.id(ID_IMG_EPISODE));
		if(imgEpisode.isDisplayed()) 
			return true;
		else return false;
	}
	
	public Boolean playlistEpisodeDescClick()
	{
		descEpisode = driver.findElement(By.id(ID_TXT_EPISODEDESC));
		if(descEpisode.isDisplayed()) 
		{
			genFunc.elemClick(descEpisode);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistEpisodeThumbnailClick()
	{
		imgEpisode = driver.findElement(By.id(ID_IMG_EPISODE));
		if(imgEpisode.isDisplayed()) 
		{
			genFunc.elemClick(imgEpisode);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistInlineProgressBarExists()
	{
		inlineProgressBar = driver.findElement(By.id(ID_CTLR_INLINESEEKBAR));
		if(inlineProgressBar.isDisplayed()) 
			return true;
		else return false;
	}
	
	
	public Boolean playlistInlineViewExists()
	{
		inlinePlayer = driver.findElement(By.id(ID_INLINEPLAYER));
		if(inlinePlayer.isDisplayed()) 
			return true;
		else return false;
	}
	
	public Boolean playlistInlineViewClick()
	{
		inlinePlayer = driver.findElement(By.id(ID_INLINEPLAYER));
		if(inlinePlayer.isDisplayed()) 
		{
			genFunc.elemClick(inlinePlayer);
			return true;
		}
		else return false;
	}
	
	public Boolean playlistInlineViewNotExists()
	{		
		inlinePlayerNotExist=driver.findElement(By.id(ID_IMG_EPISODE));
		if(inlinePlayerNotExist.isEnabled()) 
		{
			return true;
	}
	else return false;
	}
	
	public Boolean playlistTapOnStatusBar()
	{
		statusBar = driver.findElement(By.id(ID_STATUSBAR));
		if(statusBar.isDisplayed())
		{
			genFunc.elemClick(statusBar);
			return true;
		}
		else return false;
	}
	
	
	
	public String getPlaylistEpisodeDesc(int episodeNum)
	{
		descEpisode = driver.findElement(By.xpath("//android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout["+episodeNum+"]/android.widget.RelativeLayout[1]/android.widget.TextView"));
		
		if(descEpisode.isDisplayed()) 
			return descEpisode.getText();
		else return null;
	}
	
	
	
	public Boolean playlistFollowIcnLinkClick()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_FOLLOW));
		lnkFollow = driver.findElement(By.id(ID_LNK_FOLLOW));
		if(icnFollow.isDisplayed() && lnkFollow.isDisplayed()) 
		{
			genFunc.elemClick(icnFollow);
			return true;
		}
		else return false;
	}
	
	public String getPlaylistFollowText()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_FOLLOW));
		lnkFollow = driver.findElement(By.id(ID_LNK_FOLLOW));
		if(icnFollow.isDisplayed() && lnkFollow.isDisplayed()) 
			return lnkFollow.getText();
		else 
			return null;
	}
	
	public String getInlinePlayerStartTime()
	{
		startTime = driver.findElement(By.id(ID_TXT_INLINESTARTTIME));
		if(startTime.isDisplayed()) 
			return startTime.getText();
		return null;		
	}
	
	public String getInlinePlayerEndTime()
	{
		endTime = driver.findElement(By.id(ID_TXT_INLINEENDTIME));
		if(endTime.isDisplayed()) 
			return endTime.getText();
		return null;		
	}
	
	public Boolean playthumbnailClick()
	 {
	  thumbnail = driver.findElement(By.id(ID_IMG_THUMBNAIL));
	  if(thumbnail.isDisplayed())
	 {
	  genFunc.elemClick(thumbnail);
	  return true;
	 }
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
	
}
