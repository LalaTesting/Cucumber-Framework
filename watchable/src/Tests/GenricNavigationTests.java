package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class GenricNavigationTests extends BaseTest {
	
	

	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
/*	
	@Test (priority=1, enabled=true, groups = {"Genre"})
	public void test_TC_NavigationFromLoginToSettings() throws Exception
	{
	
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_5, testData.VALID_LOGIN_PWD_5));
		Assert.assertTrue(login.lnkLoginTap());
		
		Thread.sleep(2000); 
	    Assert.assertTrue(playList.playlistNameClick());
	    genFunc.scrollDownEnd(driver);
		genFunc.scrollUpEnd(driver);
		
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
//		Assert.assertTrue(playListDetail.playlistInlineViewExists());
//		Assert.assertTrue(playList.playlistNameClick());
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
	
		 Thread.sleep(appData.PAGELOADTIME);
		 
		 
		 
	      if(showDetails.icnFollowedShowDetailExists())
			{
				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
				Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowShowDetailExists());
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			else if(showDetails.icnFollowShowDetailExists())
			{
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			
			
			
		  genFunc.scrollDownEnd1(driver);
		  Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		  
		  Assert.assertTrue(showDetails.showdetailBackTappable());
		  Assert.assertTrue(playListDetail.playlistBackClick());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		
	//Genre
		
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
	    genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		
		Assert.assertTrue(slider.icnSliderClick());
		
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
        Assert.assertTrue(myShows.descLatestVideoClick());
        Thread.sleep(appData.PAGELOADTIME);
         genFunc.scrollDownEnd1(driver);
		 Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
	
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		
		//History
		
		 Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
		Thread.sleep(6000);
	//	history.scrollRightToLeft();
	//	Assert.assertTrue(history.SngDeleteBtnExists());
	//	Assert.assertTrue(history.SngDeleteTappable());
		
	//	Thread.sleep(2000);
		Assert.assertTrue(history.ShoLogoTapable());
		 genFunc.scrollDownEnd1(driver);
		 Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		 Assert.assertTrue(slider.icnSliderClick());
		 
		 //Deleting all the items fro history
		 Thread.sleep(3000);
		 Assert.assertTrue(history.historyDeleteTappable());
			Thread.sleep(5000);
			Assert.assertTrue(history.ViewClearTextExists());
			Assert.assertTrue(history.ClearTextTappable());
			Assert.assertFalse(history.VideoDesnotcexists());
		 
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		 Assert.assertTrue(slider.icnSliderClick());        
		
		
		 //SettingsScreen
		
	//	 Assert.assertTrue(slider.icnSliderClick());
		 Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		 Thread.sleep(3000);
		 genFunc.scrollDown(driver);
		 genFunc.scrollDown(driver);
		 Thread.sleep(3000);
		 Assert.assertTrue(setting.btnLogoutExist());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutNoBtnTappable());
		 Assert.assertTrue(setting.btnLogoutTappable());
		
	
		}
	
	@Test (priority=2, enabled=true, groups = {"GenricNavigation"})
	public void test_TC_NavigationFromSignUpToSettings() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.SignUpRegistration());
		Assert.assertTrue(signUp.hideKeyBoard());
		Assert.assertTrue(signUp.selectCheckBox());
		Assert.assertTrue(signUp.signUpButtonTap());
		Assert.assertTrue(signUp.divInTap());
		
		
		
		Thread.sleep(2000); 
	    Assert.assertTrue(playList.playlistNameClick());
	    
	  
	    
	    
		genFunc.scrollDownEnd(driver);
		genFunc.scrollUpEnd(driver);
		
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
	//	Assert.assertTrue(playListDetail.playlistInlineViewExists());
		
		
	//	Assert.assertTrue(playList.playlistNameClick());
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
	
		 Thread.sleep(appData.PAGELOADTIME);
		 
		 
		 
	      if(showDetails.icnFollowedShowDetailExists())
			{
				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
				Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowShowDetailExists());
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			else if(showDetails.icnFollowShowDetailExists())
			{
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			
			
			
		  genFunc.scrollDownEnd1(driver);
		  Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		  
		  Assert.assertTrue(showDetails.showdetailBackTappable());
		  Assert.assertTrue(playListDetail.playlistBackClick());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		
	//Genre
		
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
	    genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		
		Assert.assertTrue(slider.icnSliderClick());
		
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		
		//For FirstSignUp NoShowsFollow
		Assert.assertTrue(genericpage.ShowsToFollowTappable());
		
        Assert.assertTrue(slider.icnSliderClick());
		
        Assert.assertTrue(slider.menuSliderClick(appData.PLAYLISTS));
        
        Assert.assertTrue(playList.playlistNameClick());
        
        Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
	
		if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING))
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW));
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
		}
		else if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
		}
        
		 Assert.assertTrue(playListDetail.playlistBackClick());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
		
			
			
			
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
	        Assert.assertTrue(myShows.descLatestVideoClick());
	        Thread.sleep(appData.PAGELOADTIME);
	         genFunc.scrollDownEnd1(driver);
			 Thread.sleep(appData.SLEEP_TIME);
			  
			 genFunc.scrollUpEnd(driver);
		
			 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
			 Assert.assertTrue(slider.icnSliderClick());
		
		
      
		//History
		
		 Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
		Thread.sleep(6000);
		history.scrollRightToLeft();
		Assert.assertTrue(history.SngDeleteBtnExists());
		Assert.assertTrue(history.SngDeleteTappable());
		
		Thread.sleep(2000);
		Assert.assertTrue(history.ShoLogoTapable());
		 genFunc.scrollDownEnd1(driver);
		 Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		 
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		 Assert.assertTrue(slider.icnSliderClick());     
		
		
		
		 //SettingsScreen
//		 Assert.assertTrue(slider.icnSliderClick());
		 Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		 Thread.sleep(3000);
		 genFunc.scrollDown(driver);
		 genFunc.scrollDown(driver);
		 Thread.sleep(3000);
		 Assert.assertTrue(setting.btnLogoutExist());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutNoBtnTappable());
		 Assert.assertTrue(setting.btnLogoutTappable());
		
	
	
	}
	
	
	@Test (priority=3, enabled=true, groups = {"GenricNavigation"})
	public void test_TC_NavigationFromGuestUserToSettings() throws Exception
	{
		Assert.assertTrue(welcome.btnSignUpExist());
		Assert.assertTrue(welcome.btnLoginExist());
		Assert.assertTrue(welcome.guestUserLinkExist());
		
		Assert.assertTrue(welcome.linkGuestUserTappable());
		Assert.assertTrue(guestuser.discoverExist());
		Assert.assertTrue(guestuser.browseShowsExist());
		Assert.assertTrue(guestuser.personalizeExist());
		Assert.assertTrue(guestuser.diveInButtonExist());
		
		Assert.assertTrue(guestuser.btnDiveInTappable());
		
		Assert.assertTrue(playList.playlistNameClick());
		
        Assert.assertTrue(playListDetail.playlistShareClick());
		
		Assert.assertTrue(guestuser.signUpOverlayExist());
		
		//Login
		Assert.assertTrue(guestuser.loginIntoYourAccountTappable());
		
		
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_5, testData.VALID_LOGIN_PWD_5));
		Assert.assertTrue(login.lnkLoginTap());
		
		//	Assert.assertTrue(playList.playlistNameClick());
		Thread.sleep(appData.PAGELOADTIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
	
		 Thread.sleep(appData.PAGELOADTIME);
		 
		 
		 
	      if(showDetails.icnFollowedShowDetailExists())
			{
				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
				Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowShowDetailExists());
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			else if(showDetails.icnFollowShowDetailExists())
			{
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			
			
			
		  genFunc.scrollDownEnd1(driver);
		  Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		  
		  Assert.assertTrue(showDetails.showdetailBackTappable());
		  Assert.assertTrue(playListDetail.playlistBackClick());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		
	//Genre
		
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
	    genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		
		Assert.assertTrue(slider.icnSliderClick());
		
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
        Assert.assertTrue(myShows.descLatestVideoClick());
        Thread.sleep(appData.PAGELOADTIME);
         genFunc.scrollDownEnd1(driver);
		 Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
	
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		
		//History
		
		 Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
		Thread.sleep(6000);
	//	history.scrollRightToLeft();
	//	Assert.assertTrue(history.SngDeleteBtnExists());
	//	Assert.assertTrue(history.SngDeleteTappable());
		
	//	Thread.sleep(2000);
		Assert.assertTrue(history.ShoLogoTapable());
		 genFunc.scrollDownEnd1(driver);
		 Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		
		 
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		 Assert.assertTrue(slider.icnSliderClick());     
		
		
		 //SettingsScreen
//		 Assert.assertTrue(slider.icnSliderClick());
		 Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		 Thread.sleep(3000);
		 genFunc.scrollDown(driver);
		 genFunc.scrollDown(driver);
		 Thread.sleep(3000);
		 Assert.assertTrue(setting.btnLogoutExist());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutNoBtnTappable());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutYesBtnTappable());
		
	}
	
	*/
	
/*
	@Test (priority=1, enabled=true, groups = {"GenricNavigation"})
	public void test_TC_NavigationFromSignUpToSettingsAndGuestUserToLogout() throws Exception
	{
/*	     //SignUp
		Assert.assertTrue(welcome.btnSignUpTappable());
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.SignUpRegistration());
		Assert.assertTrue(signUp.hideKeyBoard());
		Assert.assertTrue(signUp.selectCheckBox());
		Assert.assertTrue(signUp.signUpButtonTap());
		Assert.assertTrue(signUp.divInTap());
		
		Thread.sleep(2000); 
	    Assert.assertTrue(playList.playlistNameClick());
	    
	  
	    genFunc.scrollDownEnd(driver);
		genFunc.scrollUpEnd(driver);
		
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
	//	Assert.assertTrue(playListDetail.playlistInlineViewExists());
		
		
	//	Assert.assertTrue(playList.playlistNameClick());
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
	
		 Thread.sleep(appData.PAGELOADTIME);
		 
		 
		 
	      if(showDetails.icnFollowedShowDetailExists())
			{
				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
				Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowShowDetailExists());
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			else if(showDetails.icnFollowShowDetailExists())
			{
				Assert.assertTrue(showDetails.icnFollowShowDetailClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			}
			
			
			
		  genFunc.scrollDownEnd1(driver);
		  Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		  
		  Assert.assertTrue(showDetails.showdetailBackTappable());
		  Assert.assertTrue(playListDetail.playlistBackClick());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		
	//Genre
		
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
	    genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		genFunc.scrollUp(driver);
		
		Assert.assertTrue(slider.icnSliderClick());
		
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		
		//For FirstSignUp NoShowsFollow
		Assert.assertTrue(genericpage.ShowsToFollowTappable());
		
        Assert.assertTrue(slider.icnSliderClick());
		
        Assert.assertTrue(slider.menuSliderClick(appData.PLAYLISTS));
        
        Assert.assertTrue(playList.playlistNameClick());
        
        Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
	
		if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING))
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW));
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
		}
		else if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
		}
        
		 Assert.assertTrue(playListDetail.playlistBackClick());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
		
			
			
			
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
	        Assert.assertTrue(myShows.descLatestVideoClick());
	        Thread.sleep(appData.PAGELOADTIME);
	         genFunc.scrollDownEnd1(driver);
			 Thread.sleep(appData.SLEEP_TIME);
			  
			 genFunc.scrollUpEnd(driver);
		
			 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
			 Assert.assertTrue(slider.icnSliderClick());
		
		
      
		//History
		
		 Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
		Thread.sleep(6000);
		history.scrollRightToLeft();
		Assert.assertTrue(history.SngDeleteBtnExists());
		Assert.assertTrue(history.SngDeleteTappable());
		
		Thread.sleep(2000);
		Assert.assertTrue(history.ShoLogoTapable());
		 genFunc.scrollDownEnd1(driver);
		 Thread.sleep(appData.SLEEP_TIME);
		  
		 genFunc.scrollUpEnd(driver);
		 
		 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
		 Assert.assertTrue(slider.icnSliderClick());     
		
		
		
		 //SettingsScreen
//		 Assert.assertTrue(slider.icnSliderClick());
		 Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		 Thread.sleep(3000);
		 genFunc.scrollDown(driver);
		 genFunc.scrollDown(driver);
		 Thread.sleep(3000);
	
		 Assert.assertTrue(setting.btnLogoutExist());
		 Assert.assertTrue(setting.btnLogoutTappable());
		 Assert.assertTrue(setting.logoutPopupexist());
		 Assert.assertTrue(setting.logoutYesBtnTappable());
*/
		
	//Guest user Flow Login To Logout
		 
	/*	 
		 
		    Assert.assertTrue(welcome.btnSignUpExist());
			Assert.assertTrue(welcome.btnLoginExist());
			Assert.assertTrue(welcome.guestUserLinkExist());
			
			Assert.assertTrue(welcome.linkGuestUserTappable());
			Assert.assertTrue(guestuser.discoverExist());
			Assert.assertTrue(guestuser.browseShowsExist());
			Assert.assertTrue(guestuser.personalizeExist());
			Assert.assertTrue(guestuser.diveInButtonExist());
			
			Assert.assertTrue(guestuser.btnDiveInTappable());
			
			Assert.assertTrue(playList.playlistNameClick());
			
	        Assert.assertTrue(playListDetail.playlistShareClick());
			
			Assert.assertTrue(guestuser.signUpOverlayExist());
			
			//Login
			Assert.assertTrue(guestuser.loginIntoYourAccountTappable());
			
			
			Assert.assertTrue(login.titleLoginExist());
			Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
			Assert.assertTrue(login.lnkLoginTap());
			
			//	Assert.assertTrue(playList.playlistNameClick());
			Thread.sleep(appData.PAGELOADTIME);
			genFunc.scrollDown(driver);
			genFunc.scrollDown(driver);
			Assert.assertTrue(playListDetail.playlistShowLogoClick());
		
			 Thread.sleep(appData.PAGELOADTIME);
			 
			 
			 
		      if(showDetails.icnFollowedShowDetailExists())
				{
					//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
					Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
					Thread.sleep(appData.SLEEP_TIME);
					Assert.assertTrue(showDetails.icnFollowShowDetailExists());
					Assert.assertTrue(showDetails.icnFollowShowDetailClick());
					Thread.sleep(appData.SLEEP_TIME);
					Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
				}
				else if(showDetails.icnFollowShowDetailExists())
				{
					Assert.assertTrue(showDetails.icnFollowShowDetailClick());
					Thread.sleep(appData.SLEEP_TIME);
					Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
				}
				
				
				
			  genFunc.scrollDownEnd1(driver);
			  Thread.sleep(appData.SLEEP_TIME);
			  
			 genFunc.scrollUpEnd(driver);
			  
			  Assert.assertTrue(showDetails.showdetailBackTappable());
			  Assert.assertTrue(playListDetail.playlistBackClick());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
			
		//Genre
			
			Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		    genFunc.scrollDown(driver);
			genFunc.scrollDown(driver);
			genFunc.scrollDown(driver);
			Thread.sleep(appData.SLEEP_TIME);
			genFunc.scrollUp(driver);
			genFunc.scrollUp(driver);
			genFunc.scrollUp(driver);
			
			Assert.assertTrue(slider.icnSliderClick());
			
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
	        Assert.assertTrue(myShows.descLatestVideoClick());
	        Thread.sleep(appData.PAGELOADTIME);
	         genFunc.scrollDownEnd1(driver);
			 Thread.sleep(appData.SLEEP_TIME);
			  
			 genFunc.scrollUpEnd(driver);
		
			 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
			
			//History
			
			 Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
			Thread.sleep(6000);
		//	history.scrollRightToLeft();
		//	Assert.assertTrue(history.SngDeleteBtnExists());
		//	Assert.assertTrue(history.SngDeleteTappable());
			
		//	Thread.sleep(2000);
			Assert.assertTrue(history.ShoLogoTapable());
			 genFunc.scrollDownEnd1(driver);
			 Thread.sleep(appData.SLEEP_TIME);
			  
			 genFunc.scrollUpEnd(driver);
			
			 
			 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
			 Assert.assertTrue(slider.icnSliderClick());     
			
			
			 //SettingsScreen
//			 Assert.assertTrue(slider.icnSliderClick());
			 Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
			 Thread.sleep(3000);
			 genFunc.scrollDown(driver);
			 genFunc.scrollDown(driver);
			 Thread.sleep(3000);
			 Assert.assertTrue(setting.btnLogoutExist());
			 Assert.assertTrue(setting.btnLogoutTappable());
			 Assert.assertTrue(setting.logoutPopupexist());
			 Assert.assertTrue(setting.logoutYesBtnTappable());
		
			}
	*/
	
	@Test (priority=1, enabled=true, groups = {"GenricNavigation"})
	public void test_TC_GenricNavigationGuestUserToLogout() throws Exception
	{
		//Guestuser verify
		
		Assert.assertTrue(welcome.btnSignUpExist());
		Assert.assertTrue(welcome.btnLoginExist());
		Assert.assertTrue(welcome.guestUserLinkExist());
		

		Assert.assertTrue(welcome.linkGuestUserTappable());

        Assert.assertTrue(guestuser.discoverExist());
		Assert.assertTrue(guestuser.browseShowsExist());
		Assert.assertTrue(guestuser.personalizeExist());
		Assert.assertTrue(guestuser.diveInButtonExist());
        

        Assert.assertTrue(guestuser.btnDiveInTappable());
        Reporter.log("test_TC_Verifyguestuseroverlay Passed", true);

//Playlist verification
        Thread.sleep(appData.PAGELOADTIME);
        
         Assert.assertTrue(slider.icnSliderClick());
			Thread.sleep(appData.SLEEP_TIME);
			
			//Myshows
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
        
  
       Assert.assertTrue(guestuser.signUpOverlayExist());
		
		Reporter.log("test_TC_VerifyTheSignupOverlayAppearsAfterPerformingAnyActionForUser", true);

        Assert.assertTrue(guestuser.signupBtnTappable());
		
		Assert.assertTrue(signUp.titleSignUpExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(signUp.txtbxUsernameExist());
		Assert.assertTrue(signUp.txtbxEmailExist());
		Assert.assertTrue(signUp.txtbxPasswordExist());
	
		Reporter.log("test_TC_VerifyTapOnSignupNavigatestoSignupscreen", true);


		Assert.assertTrue(signUp.iconBackClick());
		
		Assert.assertTrue(slider.icnSliderClick());
			Thread.sleep(appData.SLEEP_TIME);
			
			//Myshows
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		
		//Login verification
	
		
		Assert.assertTrue(guestuser.signUpOverlayExist());
        Assert.assertTrue(guestuser.loginIntoYourAccountTappable());
        
        //user login to account
            Assert.assertTrue(login.titleLoginExist());
			Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
			Assert.assertTrue(login.lnkLoginTap());
			Thread.sleep(appData.SLEEP_TIME);
			
			Assert.assertTrue(slider.icnSliderClick());
				Thread.sleep(appData.SLEEP_TIME);
			
				Assert.assertTrue(slider.menuSliderClick(appData.PLAYLISTS));

       //Playlist verification
            Thread.sleep(appData.PAGELOADTIME);
            
            
            Assert.assertTrue(playList.titlePlaylistExist());
            Assert.assertTrue(slider.icnSliderExists());
		
		Reporter.log("test_TC_VerifyHomeScreenTabs passed", true);
        
		Assert.assertTrue(playList.playlistThumbnailExists());
		Assert.assertTrue(playList.genreNameExists());
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(playList.playlistDescExists());
		
		Reporter.log("test_TC_VerifyPlayListDetails passed", true);

		//scrolldown in playlist

        Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScrollDownAll passed", true);

       //Scrollup in playlist
		Thread.sleep(appData.SLEEP_TIME);
        genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScrollUpAll passed", true);

      //Entering to playlist detail
        Thread.sleep(appData.SLEEP_TIME);
        
        //sCROLL UP FOR HTC  DESIRE 510
        
        genFunc.scrollUp(driver);
		Assert.assertTrue(playList.playlistNameClick());
        Thread.sleep(appData.PAGELOADTIME);
      
        //Verifying playlist detail
        
        Assert.assertTrue(playListDetail.icnPlayExist());
		Assert.assertTrue(playListDetail.playlistThumbnailExists());
		Assert.assertTrue(playListDetail.genreNameExists());
		Assert.assertTrue(playListDetail.playlistNameExists());
		Assert.assertTrue(playListDetail.playlistDescExists());
		Assert.assertTrue(playListDetail.playlistDurationExists());
		Assert.assertTrue(playListDetail.playlistShareExists());
		Assert.assertTrue(playListDetail.playlistBackExists());
        Reporter.log("test_TC_VerifyPlaylistNavigatePlaylistDetailScreen passed", true);
        
        //Play video in playlist details
        Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(30000);
		Reporter.log("test_TC_VerifyPlaylistScreenPlayVideoInline passed", true);  

////verifyShowname logo and follow

        Thread.sleep(appData.SLEEP_TIME);
        System.out.println("scroll down started");
		genFunc.scrollDown(driver);
		//remove scroll for z2 devices only for samsung note 4
		genFunc.scrollDown(driver);
		System.out.println("scroll twice down ended");
		Assert.assertTrue(playListDetail.playlistShowLogoNameExists());
		Assert.assertTrue(playListDetail.playlistFollowIcnLinkExists());
		
        Assert.assertTrue(playListDetail.playlistEpisodeDescExists());

//Scroll in playlist detail till end
Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		Reporter.log("test_TC_VerifyPlaylistScreenScrollDownAllVideos passed", true);
//Scroll up till end
        Thread.sleep(appData.SLEEP_TIME);
        genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScreenScrollUpAllVideos passed", true);

//playlist suscribe show
        Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
	
		if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING))
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW));
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
		}
		else if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
		}
		
		Reporter.log("test_TC_VerifyPlaylistScreenSubscribeShow passed", true);	
//tap on share icon and navigate back

        Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistShareClick());
        Thread.sleep(appData.SLEEP_TIME);

        driver.navigate().back();
        Thread.sleep(appData.SLEEP_TIME);

//Entering To show details and verifying show details

        Assert.assertTrue(playListDetail.playlistShowLogoClick());
        Thread.sleep(appData.PAGELOADTIME);
        Assert.assertTrue(showDetails.showdetailBackExists());
		Assert.assertTrue(showDetails.showIcnPlayExists());
		Assert.assertTrue(showDetails.showdetailFollowExists());
	//	Assert.assertTrue(showDetails.showdetailCoverImageExist());
		Assert.assertTrue(showDetails.showLogoExists());
		Assert.assertTrue(showDetails.showdetailmoreLinkExists());
		Assert.assertTrue(showDetails.showdetailshowDescExists());
		Assert.assertTrue(showDetails.showdetailGenreNameExists());

Reporter.log("test_TC_VerifyshowDetailScreen_passed", true);

Thread.sleep(appData.SLEEP_TIME);
		
		if(showDetails.icnFollowedShowDetailExists())
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowShowDetailExists());
			Assert.assertTrue(showDetails.icnFollowShowDetailClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
		}
		else if(showDetails.icnFollowShowDetailExists())
		{
			Assert.assertTrue(showDetails.icnFollowShowDetailClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
		}
		
		Reporter.log("test_TC_VerifySubscribingShow", true);

//Scrolling to end

Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);

Reporter.log("test_TC_VerifyShowsDetailScreenScrollDownAllVideos passed", true);

//Scrolling to up

genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyShowsDetailScreenScrollUpAllVideos passed", true);

		Thread.sleep(appData.SLEEP_TIME);
	//verify status bar	
		Assert.assertTrue(showDetails.icnFollowShowDetailExists());
		Assert.assertTrue(showDetails.showdetailBackExists());
		Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
	    
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(showDetails.showTitleExists());
		Reporter.log("test_TC_VerifyShowImageFadesAndShowNameOnStatusBar passed", true);

//Navigate to provider screen or publisher screen
		System.out.println("scrolling down done");
		//genFunc.scrollUp(driver);
		//genFunc.scrollUp(driver);
		//genFunc.scrollUp(driver);
		//genFunc.scrollUp(driver);
		genFunc.scrollUpEnd(driver);
		System.out.println("scrolling up done");
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(showDetails.providerNameClick());	
		Thread.sleep(appData.PAGELOADTIME);
		//Verifying Publisher page

		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(provider.imgShowExist());
		Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
		Assert.assertTrue(provider.nameShowExist());
		Assert.assertTrue(provider.descShowExist());

		Reporter.log("test_TC_VerifyShowsListOfTheProvider passed", true);	

      //Subscribing shows from provider

		Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
				
		if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
		{
		//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
		}
		else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
		}
				
		Reporter.log("test_TC_VerifySubscribingShowFromProvider passed", true);	
		Thread.sleep(appData.SLEEP_TIME);
		//Navigate to show detail from publisher

		Assert.assertTrue(provider.imgShowClick());
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(provider.showdetailLogoExist());
		Reporter.log("test_TC_VerifyNavigateToShowDetails passed", true);
        Assert.assertTrue(provider.showdetailCoverImageExist());
		Assert.assertTrue(provider.showdetailLogoExist());
		Assert.assertTrue(showDetails.showdetailmoreLinkExists());
		Assert.assertTrue(showDetails.providerNameClick());	
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(provider.titleProviderExist());
		Reporter.log("test_TC_VerifyReverseNavigationFromShowDetailToProvider passed", true);

		//Back To show detail
		Assert.assertTrue(signUp.iconBackClick());
		Thread.sleep(appData.PAGELOADTIME);
		//Back To playlist Detail

		Assert.assertTrue(showDetails.showdetailBackTappable());
        
		//Back to playlist
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(playListDetail.playlistBackClick());


		//Verifying slider

		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playList.playlistNameExists());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderClick());
		Thread.sleep(appData.SLEEP_TIME);
	    System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Browse Shows']")).getText());		
	    Assert.assertTrue(genre.titleBrowseExists());
		Assert.assertTrue(myShows.titleMyShowsExists());
		Assert.assertTrue(setting.titleSettingExist());

		Thread.sleep(appData.SLEEP_TIME);

		//MenuHiglishted in slider Menu

		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderClick());
		Thread.sleep(appData.SLEEP_TIME);
       
		//Verify Genre
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderExists());
		Assert.assertTrue(genre.titleBrowseExists());	
		Assert.assertTrue(genre.txtGenreExists());
	    Assert.assertTrue(genre.txtGenreImageExists());
							
		Reporter.log("test_TC_GenreScreenDetails passed", true);
					
		//CategoriesInGenreScreen

		Assert.assertTrue(genre.txtGenreDisplay());
							
		Reporter.log("test_TC_VerifyCategoriesInGenreScreen passed", true);
        
		Assert.assertTrue(genre.icnSearchClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(genre.txtbxSearchExists());
		Assert.assertTrue(genre.icnSearchExists());
		Assert.assertTrue(genre.lnkCancelExists());
		Assert.assertTrue(genre.lnkCancelTappable());
		Reporter.log("test_TC_VerifySearchOverlay passed", true);
		Thread.sleep(appData.SLEEP_TIME);

		//Verify Genre Detail For ex-FUNNY
        
		Assert.assertTrue(genre.txtSelectiveGenreClick(appData.FUNNY));
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(new SignUpPage(driver).iconBackExist());
					       		//Assert.assertTrue(genreDetails.bckImgGenreExists());
		Assert.assertTrue(genreDetails.genreShowImgExists());
		Assert.assertTrue(genreDetails.genreShowNameExists());
		Assert.assertTrue(genreDetails.genreShowDescExists());
		Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
					       		
		Reporter.log("test_TC_VerifyGenreDetailScreenGenreDetail passed", true);


					//SUBSCRIBING SHOW
		Thread.sleep(appData.SLEEP_TIME);
	    genFunc.scrollDown(driver);	
									
	   if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
	   {
		//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
		   Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
		   Thread.sleep(appData.SLEEP_TIME);
		   Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
		   Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
		   Thread.sleep(appData.SLEEP_TIME);
		   Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
		}
		else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
		}
		Reporter.log("test_TC_VerifyGenreDetailScreenSubscribeShow passed", true);
		Thread.sleep(appData.SLEEP_TIME);
		
		//Confirm Status bar
        genFunc.scrollDown(driver);
        genFunc.scrollDown(driver);
        genFunc.scrollDown(driver);
        Assert.assertTrue(genreDetails.genreTitleStatusBarExists());		
		Reporter.log("test_TC_VerifyGenreDetailScreenStatusBar passed", true);

		//Scroll Down End
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		Reporter.log("test_TC_VerifyGenreScrollDownAll passed", true);
			//Scroll Up End
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		Reporter.log("test_TC_VerifyGenreDetailsScrollUpAll passed", true);

		//Back To Genre
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(signUp.iconBackClick());

		//Tap on slider
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(slider.icnSliderClick());
		Thread.sleep(appData.SLEEP_TIME);
		
		//Myshows
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		Thread.sleep(appData.PAGELOADTIME);
							Assert.assertTrue(myShows.titleMyShowsExists());
							Assert.assertTrue(slider.icnSliderExists());

					//Verify My Shows
					                Assert.assertTrue(myShows.imgShowExists());
							Assert.assertTrue(myShows.icnPlayExists());
							Assert.assertTrue(myShows.titleWatchLatestVideoExists());
							Assert.assertTrue(myShows.descLatestVideoExists());
							
							Reporter.log("test_TC_VerifyMyShowsDetails passed", true);

					//Navigate to show detail from Myshows
							Thread.sleep(appData.SLEEP_TIME);
					        Assert.assertTrue(myShows.imgShowClick());
					        Thread.sleep(appData.PAGELOADTIME);
							Assert.assertTrue(showDetails.showLogoExists());
							Assert.assertTrue(showDetails.showIcnPlayExists());
							
							Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapShowImage passed", true);

							Thread.sleep(appData.SLEEP_TIME);
					Assert.assertTrue(myShows.bckIcnMyshowsTappable());

					//Tap on description navigate to show detail
					 Thread.sleep(appData.PAGELOADTIME);
					  Assert.assertTrue(myShows.descLatestVideoClick());
					        Thread.sleep(appData.PAGELOADTIME);
							Assert.assertTrue(showDetails.showLogoExists());
							Assert.assertTrue(showDetails.showIcnPlayExists());
							
							Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapVideoDescription passed", true);


							Thread.sleep(appData.PAGELOADTIME);
					         genFunc.scrollDownEnd(driver);
							 Thread.sleep(appData.SLEEP_TIME);
							  
							 genFunc.scrollUpEnd(driver);
						
					//Tap on back button navigate to my shows
							 Thread.sleep(appData.SLEEP_TIME);
					Assert.assertTrue(myShows.bckIcnMyshowsTappable());

					//Tap on slider
					Thread.sleep(appData.PAGELOADTIME);
					Assert.assertTrue(slider.icnSliderClick());



					//Navigate To History
					
		String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
					        Assert.assertTrue(history.titleHistoryTappable());
					        Reporter.log("test_TC_HistoryScreen() passed", true);
					        Thread.sleep(appData.PAGELOADTIME);
					//verify History Screen
							Assert.assertTrue(history.bulkDeleteExists());
							Assert.assertTrue(history.VideoIcoExists());
							Assert.assertTrue(history.ShoLogoExists());
							Assert.assertTrue(history.VideoDescexists());
							Reporter.log("test_TC_VerifyTheDetailsOfHistoryScreen() passed", true);


					//VerifyCancellingBulkDeleteFunctionality

					        Assert.assertTrue(history.historyTxtExists());
							Assert.assertTrue(history.historyDeleteTappable());
							Thread.sleep(5000);
							Assert.assertTrue(history.ViewClearTextExists());
							Assert.assertTrue(history.historyDoneTappable());
							Thread.sleep(2000);
							Assert.assertFalse(history.NoClearTextExists());
							Reporter.log("test_TC_VerifyCancellingBulkDeleteFunctionality() passed", true);

							//Navigate showDetail

					       Thread.sleep(3000);
							Assert.assertTrue(history.ShoLogoTapable());
							Thread.sleep(appData.PAGELOADTIME);
							 genFunc.scrollDownEnd(driver);
							 Thread.sleep(appData.SLEEP_TIME);
							  
							 genFunc.scrollUpEnd(driver);
							 Thread.sleep(appData.SLEEP_TIME);
							 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
							 Thread.sleep(appData.PAGELOADTIME);
					//Navigate To Setting SCREEN and Logout
					Assert.assertTrue(slider.icnSliderClick());  
                    Thread.sleep(3000);
					Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));   
					Thread.sleep(appData.SLEEP_TIME);
					Assert.assertTrue(setting.lblSupportExist());
					Assert.assertTrue(setting.lblAccountExist());
					Thread.sleep(3000);
					 genFunc.scrollDown(driver);
					 genFunc.scrollDown(driver);
					 Thread.sleep(3000);
					 Assert.assertTrue(setting.btnLogoutExist());
					 Assert.assertTrue(setting.btnLogoutTappable());
					 Assert.assertTrue(setting.logoutPopupexist());
					 Assert.assertTrue(setting.logoutYesBtnTappable());
		            Reporter.log("test_TC_VerifyLogoutFromSettingScreen", true);  
		            
		          
		            
		           

	}
}
	
	/*
	@Test (priority=1, enabled=true, groups = {"GenricNavigation"})
	public void test_TC_GenricNavigationGuestUserToLogout() throws Exception
	{
	
		//Guestuser verify
		
				Assert.assertTrue(welcome.btnSignUpExist());
				Assert.assertTrue(welcome.btnLoginExist());
				Assert.assertTrue(welcome.guestUserLinkExist());
				

				Assert.assertTrue(welcome.linkGuestUserTappable());

		        Assert.assertTrue(guestuser.discoverExist());
				Assert.assertTrue(guestuser.browseShowsExist());
				Assert.assertTrue(guestuser.personalizeExist());
				Assert.assertTrue(guestuser.diveInButtonExist());
		        

		        Assert.assertTrue(guestuser.btnDiveInTappable());
		        Reporter.log("test_TC_Verifyguestuseroverlay Passed", true);

		//Playlist verification
		        Thread.sleep(appData.PAGELOADTIME);
		    //    SCROLLING FOR HTC DESIRE 510
		        genFunc.scrollUp(driver);
		  
		        Assert.assertTrue(playList.playlistNameClick());
		        Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(playListDetail.playlistShareClick());
				
				Assert.assertTrue(guestuser.signUpOverlayExist());
				
				Reporter.log("test_TC_VerifyTheSignupOverlayAppearsAfterPerformingAnyActionForUser", true);

		        Assert.assertTrue(guestuser.signupBtnTappable());
				
				Assert.assertTrue(signUp.titleSignUpExist());
				Assert.assertTrue(signUp.iconBackExist());
				Assert.assertTrue(signUp.txtbxUsernameExist());
				Assert.assertTrue(signUp.txtbxEmailExist());
				Assert.assertTrue(signUp.txtbxPasswordExist());
			
				Reporter.log("test_TC_VerifyTapOnSignupNavigatestoSignupscreen", true);


				Assert.assertTrue(signUp.iconBackClick());

				//Login verification
				Thread.sleep(appData.SLEEP_TIME);
				//System.out.println("sleep is done");
				Assert.assertTrue(playListDetail.playlistShareClick());
				System.out.println("tapped on share button");
				Assert.assertTrue(guestuser.signUpOverlayExist());
		        Assert.assertTrue(guestuser.loginIntoYourAccountTappable());
		        
		        //user login to account
		            Assert.assertTrue(login.titleLoginExist());
					Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
					Assert.assertTrue(login.lnkLoginTap());
					Thread.sleep(appData.SLEEP_TIME);
		            Assert.assertTrue(playListDetail.playlistBackClick());

		       //Playlist verification
		            Thread.sleep(appData.PAGELOADTIME);
		            Assert.assertTrue(playList.titlePlaylistExist());
		            Assert.assertTrue(slider.icnSliderExists());
				
				Reporter.log("test_TC_VerifyHomeScreenTabs passed", true);
		        
				Assert.assertTrue(playList.playlistThumbnailExists());
				Assert.assertTrue(playList.genreNameExists());
				Assert.assertTrue(playList.playlistNameExists());
				Assert.assertTrue(playList.playlistDescExists());
				
				Reporter.log("test_TC_VerifyPlayListDetails passed", true);

				//scrolldown in playlist

		        Thread.sleep(appData.SLEEP_TIME);
				genFunc.scrollDownEnd(driver);
				
				Reporter.log("test_TC_VerifyPlaylistScrollDownAll passed", true);

		       //Scrollup in playlist
				Thread.sleep(appData.SLEEP_TIME);
		        genFunc.scrollUpEnd(driver);
				
				Reporter.log("test_TC_VerifyPlaylistScrollUpAll passed", true);
	      //Entering to playlist detail
	        Thread.sleep(appData.SLEEP_TIME);
	        ///////////////////
	        genFunc.scrollDown(driver);
	        genFunc.scrollDown(driver);
	        Thread.sleep(appData.SLEEP_TIME);
	        //////////////////
			Assert.assertTrue(playList.playlistNameClick());
	        Thread.sleep(appData.PAGELOADTIME);
	       //Verifying playlist detail

         
         //Play video in playlist details
         Thread.sleep(appData.SLEEP_TIME);
 		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
 		Thread.sleep(appData.SLEEP_TIME);
 		Assert.assertTrue(playListDetail.playlistInlineViewExists());
 		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
 		Thread.sleep(10000);
 		genFunc.scrollDown2(driver);
 		genFunc.scrollDown2(driver);
 		Thread.sleep(3000);
 		genFunc.scrollDownEnd2(driver);
 		Thread.sleep(5000);
 		genFunc.scrollUpEnd2(driver);
 	//	Reporter.log("test_TC_VerifyPlaylistScreenPlayVideoInline passed", true);
 		
 		Reporter.log("test_TC_VerifyPlaylistScreenScrollUpAllVideos passed", true);

 		//playlist suscribe show
 		        Thread.sleep(appData.SLEEP_TIME);
 				genFunc.scrollDown(driver);
 				genFunc.scrollDown(driver);
 			
 				if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING))
 				{
 					//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
 					Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW));
 					Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
 				}
 				else if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW))
 				{
 					Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
 				}
 				
 				Reporter.log("test_TC_VerifyPlaylistScreenSubscribeShow passed", true);	
 		//tap on share icon and navigate back

 		        Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(playListDetail.playlistShareClick());
 		        Thread.sleep(appData.SLEEP_TIME);

 		        driver.navigate().back();
 		        Thread.sleep(appData.SLEEP_TIME);

 		//Entering To show details and verifying show details

 		        Assert.assertTrue(playListDetail.playlistShowLogoClick());
 		        Thread.sleep(appData.PAGELOADTIME);
 		        Assert.assertTrue(showDetails.showdetailBackExists());
 				Assert.assertTrue(showDetails.showIcnPlayExists());
 				Assert.assertTrue(showDetails.showdetailFollowExists());
 			//	Assert.assertTrue(showDetails.showdetailCoverImageExist());
 				Assert.assertTrue(showDetails.showLogoExists());
 				Assert.assertTrue(showDetails.showdetailmoreLinkExists());
 				Assert.assertTrue(showDetails.showdetailshowDescExists());
 				Assert.assertTrue(showDetails.showdetailGenreNameExists());

 		Reporter.log("test_TC_VerifyshowDetailScreen_passed", true);

 		Thread.sleep(appData.SLEEP_TIME);
 				
 				if(showDetails.icnFollowedShowDetailExists())
 				{
 					//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
 					Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(showDetails.icnFollowShowDetailExists());
 					Assert.assertTrue(showDetails.icnFollowShowDetailClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
 				}
 				else if(showDetails.icnFollowShowDetailExists())
 				{
 					Assert.assertTrue(showDetails.icnFollowShowDetailClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
 				}
 				
 				Reporter.log("test_TC_VerifySubscribingShow", true);
 				
 				//Play video in show details
 				
 				Thread.sleep(appData.SLEEP_TIME);

 				Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
 				Assert.assertTrue(playListDetail.playlistInlineViewExists());
 				
 				Thread.sleep(appData.SLEEP_TIME);
 		 		Assert.assertTrue(playListDetail.playlistInlineViewExists());
 		 		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
 		 		Thread.sleep(20000);
 		 		genFunc.scrollDown2(driver);
 		 		genFunc.scrollDown2(driver);
 		 		Thread.sleep(3000);
 		 		genFunc.scrollDownEnd2(driver);
 		 		Thread.sleep(5000);
 		 		genFunc.scrollUpEnd2(driver);
 		 		
 		 		Reporter.log("test_TC_VerifyShowsDetailScreenScrollUpAllVideos passed", true);

 				Thread.sleep(appData.SLEEP_TIME);
 			   //verify status bar	
 				Assert.assertTrue(showDetails.icnFollowShowDetailExists());
 				Assert.assertTrue(showDetails.showdetailBackExists());
 				Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
 			    
 				genFunc.scrollDown2(driver);
 				genFunc.scrollDown2(driver);
 				genFunc.scrollDown2(driver);
 				Assert.assertTrue(showDetails.showTitleExists());
 				Reporter.log("test_TC_VerifyShowImageFadesAndShowNameOnStatusBar passed", true);

	
 				//Navigate to provider screen or publisher screen
 				System.out.println("scrolling down done");
 				//genFunc.scrollUp(driver);
 				//genFunc.scrollUp(driver);
 				//genFunc.scrollUp(driver);
 				//genFunc.scrollUp(driver);
 				genFunc.scrollUpEnd(driver);
 				System.out.println("scrolling up done");
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(showDetails.providerNameClick());	
 				Thread.sleep(appData.PAGELOADTIME);
 				//Verifying Publisher page

 				Assert.assertTrue(provider.titleProviderExist());
 				Assert.assertTrue(signUp.iconBackExist());
 				Assert.assertTrue(provider.imgShowExist());
 				Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
 				Assert.assertTrue(provider.nameShowExist());
 				Assert.assertTrue(provider.descShowExist());

 				Reporter.log("test_TC_VerifyShowsListOfTheProvider passed", true);	

 		      //Subscribing shows from provider

 				Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
 						
 				if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
 				{
 				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
 				}
 				else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
 				{
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
 				}
 						
 				Reporter.log("test_TC_VerifySubscribingShowFromProvider passed", true);	
 				
 				
 				Thread.sleep(appData.SLEEP_TIME);
 				//Navigate to show detail from publisher

 				Assert.assertTrue(provider.imgShowClick());
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(provider.showdetailLogoExist());
 				Reporter.log("test_TC_VerifyNavigateToShowDetails passed", true);
 		        Assert.assertTrue(provider.showdetailCoverImageExist());
 				Assert.assertTrue(provider.showdetailLogoExist());
 				Assert.assertTrue(showDetails.showdetailmoreLinkExists());
 				Assert.assertTrue(showDetails.providerNameClick());	
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(provider.titleProviderExist());
 				Reporter.log("test_TC_VerifyReverseNavigationFromShowDetailToProvider passed", true);
 				

 				//Back To show detail
 				Assert.assertTrue(signUp.iconBackClick());
 				Thread.sleep(appData.PAGELOADTIME);
 				//Back To playlist Detail

 				Assert.assertTrue(showDetails.showdetailBackTappable());
 		        
 				//Back to playlist
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(playListDetail.playlistBackClick());

 				
 				//Verifying slider

 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(playList.playlistNameExists());
 				Assert.assertTrue(slider.icnSliderClick());
 				Thread.sleep(appData.SLEEP_TIME);
 			    System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Browse Shows']")).getText());		
 			    Assert.assertTrue(genre.titleBrowseExists());
 				Assert.assertTrue(myShows.titleMyShowsExists());
 				Assert.assertTrue(setting.titleSettingExist());

 				Thread.sleep(appData.SLEEP_TIME);

 				//MenuHiglishted in slider Menu

 				Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(slider.icnSliderClick());
 				Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(slider.icnSliderClick());
 				Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(slider.icnSliderClick());
 				Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(slider.icnSliderClick());
 				Thread.sleep(appData.SLEEP_TIME);
 		       
 				//Verify Genre
 				Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(slider.icnSliderExists());
 				Assert.assertTrue(genre.titleBrowseExists());	
 				Assert.assertTrue(genre.txtGenreExists());
 							//		Reporter.log(assertMsg.GENRE_TXT_EXIST,true);
 							                
 			    Assert.assertTrue(genre.txtGenreImageExists());
 									
 				Reporter.log("test_TC_GenreScreenDetails passed", true);
 							
 				//CategoriesInGenreScreen

 				Assert.assertTrue(genre.txtGenreDisplay());
 									
 				Reporter.log("test_TC_VerifyCategoriesInGenreScreen passed", true);
 		        
 				Assert.assertTrue(genre.icnSearchClick());
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(genre.txtbxSearchExists());
 				Assert.assertTrue(genre.icnSearchExists());
 				Assert.assertTrue(genre.lnkCancelExists());
 				Assert.assertTrue(genre.lnkCancelTappable());
 				Reporter.log("test_TC_VerifySearchOverlay passed", true);
 				Thread.sleep(appData.SLEEP_TIME);

	
 				//Verify Genre Detail For ex-FUNNY
 		        
 				Assert.assertTrue(genre.txtSelectiveGenreClick(appData.FUNNY));
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(new SignUpPage(driver).iconBackExist());
 							       		//Assert.assertTrue(genreDetails.bckImgGenreExists());
 				Assert.assertTrue(genreDetails.genreShowImgExists());
 				Assert.assertTrue(genreDetails.genreShowNameExists());
 				Assert.assertTrue(genreDetails.genreShowDescExists());
 				Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
 							       		
 				Reporter.log("test_TC_VerifyGenreDetailScreenGenreDetail passed", true);


 							//SUBSCRIBING SHOW
 				Thread.sleep(appData.SLEEP_TIME);
 			    genFunc.scrollDown(driver);	
 											
 			   if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
 			   {
 				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
 				   Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 				   Thread.sleep(appData.SLEEP_TIME);
 				   Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
 				   Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 				   Thread.sleep(appData.SLEEP_TIME);
 				   Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
 				}
 				else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
 				{
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
 				}
 				Reporter.log("test_TC_VerifyGenreDetailScreenSubscribeShow passed", true);
 				
 				Thread.sleep(appData.SLEEP_TIME);
 				
 				//Confirm Status bar
 		        genFunc.scrollDown(driver);
 		        genFunc.scrollDown(driver);
 		        genFunc.scrollDown(driver);
 		        Assert.assertTrue(genreDetails.genreTitleStatusBarExists());		
 				Reporter.log("test_TC_VerifyGenreDetailScreenStatusBar passed", true);

 				//Scroll Down End
 				Thread.sleep(appData.SLEEP_TIME);
 				genFunc.scrollDownEnd(driver);
 				Reporter.log("test_TC_VerifyGenreScrollDownAll passed", true);
 				
 				//Scroll Up End
 				Thread.sleep(appData.SLEEP_TIME);
 				genFunc.scrollUpEnd(driver);
 				Reporter.log("test_TC_VerifyGenreDetailsScrollUpAll passed", true);
 				Thread.sleep(appData.SLEEP_TIME);
 				
 				//Navigating From GenreDetailsToShowDetails
 				
 				Assert.assertTrue(genreDetails.genreShowThumbnailClick());
 				

  				//Play video in show details
  				
  				Thread.sleep(appData.SLEEP_TIME);

  				Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
  				Assert.assertTrue(playListDetail.playlistInlineViewExists());
  				
  				Thread.sleep(appData.SLEEP_TIME);
  		 		Assert.assertTrue(playListDetail.playlistInlineViewExists());
  		 		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
  		 		Thread.sleep(20000);
  		 		genFunc.scrollDown2(driver);
  		 		genFunc.scrollDown2(driver);
  		 		Thread.sleep(3000);
  		 		genFunc.scrollDownEnd2(driver);
  		 		Thread.sleep(5000);
  		 		genFunc.scrollUpEnd2(driver);
  		 		
  		 		Reporter.log("test_TC_VerifyShowsDetailScreenScrollUpAllVideos passed", true);

  				Thread.sleep(appData.SLEEP_TIME);
  			   //verify status bar	
  			//	Assert.assertTrue(showDetails.icnFollowShowDetailExists());
  				Assert.assertTrue(playListDetail.playlistBackExists());
  				Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
  			    
  				genFunc.scrollDown2(driver);
  				genFunc.scrollDown2(driver);
  				genFunc.scrollDown2(driver);
  				Assert.assertTrue(showDetails.showTitleGenreDetailsExists());
  				Reporter.log("test_TC_VerifyShowImageFadesAndShowNameOnStatusBar passed", true);

 	
  				//Navigate to provider screen or publisher screen
  				System.out.println("scrolling down done");
  				//genFunc.scrollUp(driver);
  				//genFunc.scrollUp(driver);
  				//genFunc.scrollUp(driver);
  				//genFunc.scrollUp(driver);
  				genFunc.scrollUpEnd(driver);
  				System.out.println("scrolling up done");
  				Thread.sleep(appData.SLEEP_TIME);
  				Assert.assertTrue(showDetails.providerNameClick());	
  				Thread.sleep(appData.PAGELOADTIME);
  				//Verifying Publisher page

  				Assert.assertTrue(provider.titleProviderExist());
  				Assert.assertTrue(signUp.iconBackExist());
  				Assert.assertTrue(provider.imgShowExist());
  				Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
  				Assert.assertTrue(provider.nameShowExist());
  				Assert.assertTrue(provider.descShowExist());

  				Reporter.log("test_TC_VerifyShowsListOfTheProvider passed", true);	
  				
  				
  				
  				
  			  //Subscribing shows from provider

 				Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
 						
 				if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
 				{
 				//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
 				}
 				else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
 				{
 					Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
 				}
 						
 				Reporter.log("test_TC_VerifySubscribingShowFromProvider passed", true);	
 				
 				
 				Thread.sleep(appData.SLEEP_TIME);
 				//Navigate to show detail from publisher

 				Assert.assertTrue(provider.imgShowClick());
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(provider.showdetailLogoExist());
 				Reporter.log("test_TC_VerifyNavigateToShowDetails passed", true);
 		        Assert.assertTrue(provider.showdetailCoverImageExist());
 				Assert.assertTrue(provider.showdetailLogoExist());
 				Assert.assertTrue(showDetails.showdetailmoreLinkExists());
 				
/////////////////////////////////////////////////////////////
                Thread.sleep(appData.SLEEP_TIME);
 				
 				if(showDetails.icnFollowedShowDetailGenreExists())
 				{
 					//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
 					Assert.assertTrue(showDetails.icnFollowedShowDetailGenreClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(showDetails.icnFollowedShowDetailGenreExists());
 					Assert.assertTrue(showDetails.icnFollowShowDetailGenreClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(showDetails.icnFollowedShowDetailGenreExists());
 				}
 				else if(showDetails.icnFollowedShowDetailGenreExists())
 				{
 					Assert.assertTrue(showDetails.icnFollowShowDetailGenreClick());
 					Thread.sleep(appData.SLEEP_TIME);
 					Assert.assertTrue(showDetails.icnFollowedShowDetailGenreExists());
 				}
 				
 				Reporter.log("test_TC_VerifySubscribingShow", true);
 				
 				//Play video in show details
 				
 				Thread.sleep(appData.SLEEP_TIME);

 				Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(playListDetail.playlistInlineViewExists());
 				
 				Thread.sleep(appData.SLEEP_TIME);
 		 		Assert.assertTrue(playListDetail.playlistInlineViewExists());
 		 		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
 		 		Thread.sleep(20000);
 		 		genFunc.scrollDown2(driver);
 		 		genFunc.scrollDown2(driver);
 		 		Thread.sleep(3000);
 		 		genFunc.scrollDownEnd2(driver);
 		 		Thread.sleep(5000);
 		 		genFunc.scrollUpEnd2(driver);
 		 		
 		 		Reporter.log("test_TC_VerifyShowsDetailScreenScrollUpAllVideos passed", true);

 				Thread.sleep(appData.SLEEP_TIME);
 			   //verify status bar	
 				Assert.assertTrue(showDetails.icnFollowedShowDetailGenreExists());
 				Assert.assertTrue(playListDetail.playlistBackExists());
 				Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
 			    
 				genFunc.scrollDown2(driver);
 				genFunc.scrollDown2(driver);
 				genFunc.scrollDown2(driver);
 				Assert.assertTrue(showDetails.showTitleGenreDetailsExists());
 				Reporter.log("test_TC_VerifyShowImageFadesAndShowNameOnStatusBar passed", true);

 				Thread.sleep(5000);
 				//Navigate to provider screen or publisher screen
 				System.out.println("scrolling down done");
 				//genFunc.scrollUp(driver);
 				//genFunc.scrollUp(driver);
 				//genFunc.scrollUp(driver);
 				//genFunc.scrollUp(driver);
 				genFunc.scrollUpEnd(driver);
 				System.out.println("scrolling up done");
 				Thread.sleep(appData.SLEEP_TIME);
 			//	Assert.assertTrue(showDetails.providerNameClick());	
 				
 				//Navigate to ShowDetail To Publisher To Genre
 				Assert.assertTrue(playListDetail.playlistBackClick());
 				//Back To show detail
 				Assert.assertTrue(signUp.iconBackClick());
 				Thread.sleep(appData.PAGELOADTIME);
 				//Back To GenreDetails

 				Assert.assertTrue(playListDetail.playlistBackClick());
 				//Back to Genre
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(signUp.iconBackClick());
 				
 				Thread.sleep(appData.PAGELOADTIME);
 				
 				Reporter.log("Navigate To Genre From Publisher Page", true);
 				
  				
  			//Tap on slider
 				Thread.sleep(appData.SLEEP_TIME);
 				Assert.assertTrue(slider.icnSliderClick());
 				Thread.sleep(appData.SLEEP_TIME);
 				
 				//Myshows
 				Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
 				Thread.sleep(appData.PAGELOADTIME);
 				Assert.assertTrue(myShows.titleMyShowsExists());
 				Assert.assertTrue(slider.icnSliderExists());

 			//Verify My Shows
 			 Assert.assertTrue(myShows.imgShowExists());
 			 Assert.assertTrue(myShows.icnPlayExists());
 			 Assert.assertTrue(myShows.titleWatchLatestVideoExists());
 			 Assert.assertTrue(myShows.descLatestVideoExists());
 									
 			Reporter.log("test_TC_VerifyMyShowsDetails passed", true);

 			//Navigate to show detail from Myshows
 			Thread.sleep(appData.SLEEP_TIME);
 			Assert.assertTrue(myShows.imgShowClick());
 			Thread.sleep(appData.PAGELOADTIME);
 			Assert.assertTrue(showDetails.showLogoExists());
 			Assert.assertTrue(showDetails.showIcnPlayExists());
 									
 			Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapShowImage passed", true);

 			Thread.sleep(appData.SLEEP_TIME);
 			Assert.assertTrue(myShows.bckIcnMyshowsTappable());

 			//Tap on description navigate to show detail
 			Thread.sleep(appData.PAGELOADTIME);
 			Assert.assertTrue(myShows.descLatestVideoClick());
 			Thread.sleep(appData.PAGELOADTIME);
 			Assert.assertTrue(showDetails.showLogoExists());
 			Assert.assertTrue(showDetails.showIcnPlayExists());
 									
 		 Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapVideoDescription passed", true);
 		 
 		 
 		 
 		 ////////////////////////////////////////////////////////////
 		 
 		    Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
			Assert.assertTrue(playListDetail.playlistInlineViewExists());
			
			Thread.sleep(appData.SLEEP_TIME);
	 		
	
	 		Thread.sleep(20000);
	 		genFunc.scrollDown2(driver);
	 		genFunc.scrollDown2(driver);
	 		Thread.sleep(3000);
	 		genFunc.scrollDownEnd2(driver);
	 		Thread.sleep(5000);
	 		genFunc.scrollUpEnd2(driver);
	 		
	 		Reporter.log("test_TC_VerifyShowsDetailScreenScrollUpAllVideos passed", true);

			Thread.sleep(appData.SLEEP_TIME);
		   //verify status bar	
			Assert.assertTrue(showDetails.icnFollowShowDetailExists());
			Assert.assertTrue(showDetails.showdetailBackExists());
			Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
		    
			genFunc.scrollDown2(driver);
			genFunc.scrollDown2(driver);
			genFunc.scrollDown2(driver);
			Assert.assertTrue(showDetails.showTitleExists());
			Reporter.log("test_TC_VerifyShowImageFadesAndShowNameOnStatusBar passed", true);


			//Navigate to provider screen or publisher screen
			System.out.println("scrolling down done");
			//genFunc.scrollUp(driver);
			//genFunc.scrollUp(driver);
			//genFunc.scrollUp(driver);
			//genFunc.scrollUp(driver);
			genFunc.scrollUpEnd(driver);
			System.out.println("scrolling up done");
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.providerNameClick());	
			Thread.sleep(appData.PAGELOADTIME);
			//Verifying Publisher page

			Assert.assertTrue(provider.titleProviderExist());
			Assert.assertTrue(signUp.iconBackExist());
			Assert.assertTrue(provider.imgShowExist());
			Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
			Assert.assertTrue(provider.nameShowExist());
			Assert.assertTrue(provider.descShowExist());

			Reporter.log("test_TC_VerifyShowsListOfTheProvider passed", true);	

	      //Subscribing shows from provider

			Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
					
			if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
			{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
				Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
				Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
			}
			else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
			{
				Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
				Thread.sleep(appData.SLEEP_TIME);
				Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
			}
					
			Reporter.log("test_TC_VerifySubscribingShowFromProvider passed", true);	
			
			
			Thread.sleep(appData.SLEEP_TIME);
			//Navigate to show detail from publisher

			Assert.assertTrue(provider.imgShowClick());
			Thread.sleep(appData.PAGELOADTIME);
			Assert.assertTrue(provider.showdetailLogoExist());
			Reporter.log("test_TC_VerifyNavigateToShowDetails passed", true);
	        Assert.assertTrue(provider.showdetailCoverImageExist());
			Assert.assertTrue(provider.showdetailLogoExist());
			Assert.assertTrue(showDetails.showdetailmoreLinkExists());
		//	Assert.assertTrue(showDetails.providerNameClick());	
			Assert.assertTrue(playListDetail.playlistBackClick());
			Thread.sleep(appData.PAGELOADTIME);
			Assert.assertTrue(provider.titleProviderExist());
			Reporter.log("test_TC_VerifyReverseNavigationFromShowDetailToProvider passed", true);
			

			//Back To show detail
			Assert.assertTrue(signUp.iconBackClick());
			Thread.sleep(appData.PAGELOADTIME);
			//Back To playlist Detail

			Assert.assertTrue(showDetails.showdetailBackTappable());
	        
			//Back to playlist
			Thread.sleep(appData.PAGELOADTIME);
			

///////////////////////////////////////
  				
			//Tap on back button navigate to my shows
			// Thread.sleep(appData.SLEEP_TIME);
	//Assert.assertTrue(myShows.bckIcnMyshowsTappable());

	//Tap on slider
	
	Assert.assertTrue(slider.icnSliderClick());



	//Navigate To History
	
String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
	        Assert.assertTrue(history.titleHistoryTappable());
	        Reporter.log("test_TC_HistoryScreen() passed", true);
	        Thread.sleep(appData.PAGELOADTIME);
	//verify History Screen
			Assert.assertTrue(history.bulkDeleteExists());
			Assert.assertTrue(history.VideoIcoExists());
			Assert.assertTrue(history.ShoLogoExists());
			Assert.assertTrue(history.VideoDescexists());
			Reporter.log("test_TC_VerifyTheDetailsOfHistoryScreen() passed", true);


	//VerifyCancellingBulkDeleteFunctionality

	        Assert.assertTrue(history.historyTxtExists());
			Assert.assertTrue(history.historyDeleteTappable());
			Thread.sleep(5000);
			Assert.assertTrue(history.ViewClearTextExists());
			Assert.assertTrue(history.historyDoneTappable());
			Thread.sleep(2000);
			Assert.assertFalse(history.NoClearTextExists());
			Reporter.log("test_TC_VerifyCancellingBulkDeleteFunctionality() passed", true);

			//Navigate showDetail

	       Thread.sleep(3000);
			Assert.assertTrue(history.ShoLogoTapable());
			Thread.sleep(appData.PAGELOADTIME);
			 genFunc.scrollDownEnd1(driver);
			 Thread.sleep(appData.SLEEP_TIME);
			  
			 genFunc.scrollUpEnd(driver);
			 
			 Assert.assertTrue(myShows.bckIcnMyshowsTappable());
			 Thread.sleep(appData.PAGELOADTIME);
	//Navigate To Setting SCREEN and Logout
	Assert.assertTrue(slider.icnSliderClick());  
   Thread.sleep(3000);
	Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));   
	Thread.sleep(appData.SLEEP_TIME);
	Assert.assertTrue(setting.lblSupportExist());
	Assert.assertTrue(setting.lblAccountExist());
	Thread.sleep(3000);
	 genFunc.scrollDown(driver);
	 genFunc.scrollDown(driver);
	 Thread.sleep(3000);
	 Assert.assertTrue(setting.btnLogoutExist());
	 Assert.assertTrue(setting.btnLogoutTappable());
	 Assert.assertTrue(setting.logoutPopupexist());
	 Assert.assertTrue(setting.logoutYesBtnTappable());
   Reporter.log("test_TC_VerifyLogoutFromSettingScreen", true);   
  				
  				
  				
  				
	
	}
	


}
	*/