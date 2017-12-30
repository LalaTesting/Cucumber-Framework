package Pages;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class ShowDetailsPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement showLogo, showNameOnStatusBar, playerinfoBtn, showTitle, showInlinePlay, icnShowPlay, icnPlay,backshowdetail,followshowdetail,genreNameShowDetail,showLogoShowDetail,
	showDescShowDetail,moreLinkShowDetail,icnFollowGenreShowDetail,showTitleGenre,lastImage,coverImageShowDetail,icnFollow,imgEpisode,videoDuration,inlinePlayerShowDetail,descEpisodeShowDetail, nameProvider ;
	
	List <WebElement> webElement1;
	
	public ShowDetailsPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public Boolean showLogoExists()
	{
		showLogo = driver.findElement(By.id(ID_IMG_SHOWLOGO));
		if(showLogo.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean showIcnPlayExists()
	{
		icnShowPlay = driver.findElement(By.id(ID_ICN_PLAY_PLAYLISTDETAIL));
		if(icnShowPlay.isDisplayed())
			return true;
		else return false;
	}
		
	public Boolean showNameOnStatusBarExists()
	{
		showNameOnStatusBar = driver.findElement(By.id(ID_STATUSBAR_SHOWNAME));
		if(showNameOnStatusBar.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean showNameOnStatusBarClick()
	{
		showNameOnStatusBar = driver.findElement(By.id(ID_STATUSBAR_SHOWNAME));
		if(showNameOnStatusBar.isDisplayed())
		{
			genFunc.elemClick(showNameOnStatusBar);
			return true;
		}
		else return false;
	}
	
	public Boolean showVideoPlayInline()
	{
		showInlinePlay = driver.findElement(By.id(ID_INLINEPLAYER));
		if(showInlinePlay.isDisplayed())
			return true;
		else return false;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public Boolean showdetailBackExists()
		{
			backshowdetail = driver.findElement(By.id(ID_ICN_BACK_SHOWDETAIL));
			if(backshowdetail.isDisplayed())
				return true;
			else return false;
		}
		
	public Boolean showdetailBackTappable()
	{
		backshowdetail = driver.findElement(By.id(ID_ICN_BACK_SHOWDETAIL));
		if(backshowdetail.isDisplayed()){
			genFunc.elemClick(backshowdetail);
			return true;
			}
		else return false;
	}
		
	public Boolean showdetailFollowExists()
	{
		followshowdetail = driver.findElement(By.id(ID_ICN_FOLLOW_SHOWDETAIL));
		if(followshowdetail.isDisplayed())
			return true;
		else return false;
	}
		
		
	public Boolean showdetailGenreNameExists()
	{
		genreNameShowDetail = driver.findElement(By.id(ID_TXT_GENRENAME));
		if(genreNameShowDetail.isDisplayed())
			return true;
		else return false;
	}
		
	/*public Boolean showdetailShowLogoExists()
	{
		showLogoShowDetail = driver.findElement(By.id(ID_ICN_SHOWLOGO));
		if(showLogoShowDetail.isDisplayed())
			return true;
		else return false;
	}*/
	public Boolean showdetailshowDescExists()
	{
		showDescShowDetail = driver.findElement(By.id(ID_TXT_SHOWDESC));
		if(showDescShowDetail.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean showdetailmoreLinkExists()
	{
		moreLinkShowDetail = driver.findElement(By.id(ID_TXT_MORElINK));
		if(moreLinkShowDetail.isDisplayed())
			return true;
		else return false;
	}
	
	
	public Boolean showdetailCoverImageExist()
	{
		coverImageShowDetail = driver.findElement(By.id(ID_COVERIMGIMAGE_SHOWDETAIL));
		if(coverImageShowDetail.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean icnFollowShowDetailExists()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_FOLLOW_SHOWDETAIL));
		if(icnFollow.isDisplayed())
			return true;
		else return false;
	}
	
	
	public Boolean icnFollowedShowDetailExists()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_SHOWFOLLOWED));
		if(icnFollow.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean icnFollowShowDetailClick()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_FOLLOW_SHOWDETAIL));
		if(icnFollow.isDisplayed())
		{
			genFunc.elemClick(icnFollow );
			return true;
		}
		else return false;
	}
	
	
	public Boolean icnFollowedShowDetailClick()
	{
		icnFollow = driver.findElement(By.id(ID_ICN_SHOWFOLLOWED));
		if(icnFollow.isDisplayed())
		{
			genFunc.elemClick(icnFollow );
			return true;
		}
		else return false;
	}
	
	
	public Boolean showsEpisodeThumbnailClick()
	{
		imgEpisode= driver.findElement(By.id(ID_IMG_EPISODE));
		if(imgEpisode.isDisplayed())
		{
			genFunc.elemClick(imgEpisode );
			return true;
		}
		else return false;
		
		
	}
	public Boolean showsEpisodeThumbnailClickForLastVideo()
	{	
		Boolean result = false;
		webElement1 = driver.findElements(By.id(ID_IMG_EPISODE));
		result = genFunc.playLastVideo(driver, webElement1);
		if(result) return true;
		else return false;
	}
	
	public Boolean showsEpisodeThumbnailLoads()
	{		
		imgEpisode = driver.findElement(By.id(ID_IMG_EPISODE));
		if(imgEpisode.isDisplayed()) 
		{
			genFunc.waitTillElementVisible(driver, imgEpisode);
			return true;
		}
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
	
	public Boolean playlistInlineViewExists()
	{
		inlinePlayerShowDetail = driver.findElement(By.id(ID_INLINEPLAYER_SHOWDETAIL));
		if(inlinePlayerShowDetail.isDisplayed()) 
		{	genFunc.elemClick(inlinePlayerShowDetail);
			return true;
			}
		else return false;
	}
	public Boolean playlistEpisodeDescClick()
	{
		descEpisodeShowDetail = driver.findElement(By.id(ID_TXT_EPISODEDESC));
		if(descEpisodeShowDetail .isDisplayed()) 
		{
			genFunc.elemClick(descEpisodeShowDetail);
			return true;
		}
		else return false;
	}

	public Boolean providerNameClick()
	{
		nameProvider = driver.findElement(By.id(ID_TXT_MORElINK));
		if(nameProvider.isDisplayed())
		{
			genFunc.elemClick(nameProvider);
			return true;
		}
		else return false;
	}

	public Boolean showTitleExists()
	{
		showTitle= driver.findElement(By.id(ID_TXT_SHOWTITLE));
		if(showTitle .isDisplayed()) 
			return true;
		else return false;
	}
	
	public Boolean playlerInfoClick()
	{
		playerinfoBtn = driver.findElement(By.id(ID_ICN_PLAYERINFO));
		if(playerinfoBtn.isDisplayed()) 
		{
			genFunc.elemClick(playerinfoBtn);
			return true;
		}
		else return false;
	}
	public Boolean icnFollowedShowDetailGenreExists()
	{
		icnFollowGenreShowDetail = driver.findElement(By.id(ID_ICN_SHOWFOLLOWEDGENRE));
		if(icnFollowGenreShowDetail.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean icnFollowShowDetailGenreClick()
	{
		icnFollowGenreShowDetail = driver.findElement(By.id(ID_ICN_SHOWFOLLOWGENRE));
		if(icnFollowGenreShowDetail.isDisplayed())
		{
			genFunc.elemClick(icnFollowGenreShowDetail);
			return true;
		}
		else return false;
	}
	
	
	public Boolean icnFollowedShowDetailGenreClick()
	{
		icnFollowGenreShowDetail= driver.findElement(By.id(ID_ICN_SHOWFOLLOWEDGENRE));
		if(icnFollowGenreShowDetail.isDisplayed())
		{
			genFunc.elemClick(icnFollowGenreShowDetail );
			return true;
		}
		else return false;
	}
/*
	public void lastImageClick()
	{
		
	/*int startx=driver.findElement(By.className(CLASS_lAYOUT_LASTIMAGE)).getLocation().getX();
		int starty=driver.findElement(By.className(CLASS_lAYOUT_LASTIMAGE)).getLocation().getY();
		 int endx =driver.findElement(By.className(CLASS_lAYOUT_LASTIMAGE)).getLocation().getX();
		 int endy =driver.findElement(By.className(CLASS_lAYOUT_LASTIMAGE)).getLocation().getY();
		 driver.tap(startx, starty, endx, endy);  */
	
	//	int startx=596,starty=1720,endx=596,endy=1720;
		
	//	driver.tap(startx, starty, endx, endy);
//	TouchAction touch = new TouchAction(driver);
	//touch.press(596, 1720); 
	
	
	//touch.tap(driver.findElement(By.id("com.comcast.watchablephone:id/ImageView_playListImageId")), 596, 1720).release().perform();
	
	

public Boolean showTitleGenreDetailsExists()
{
	showTitleGenre= driver.findElement(By.id(ID_TXT_SHOWTITLEGENRE));
	if(showTitleGenre.isDisplayed()) 
		return true;
	else return false;
}

}