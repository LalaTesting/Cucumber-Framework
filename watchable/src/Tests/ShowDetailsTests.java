package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class ShowDetailsTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	public void loginNavigateShowDetailScreen() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(playList.playlistNameClick());
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
	}
	
	@Test (priority=1, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyShowDetails() throws Exception
	{
		loginNavigateShowDetailScreen();
		
		Assert.assertTrue(showDetails.showdetailBackExists());
		Assert.assertTrue(showDetails.showIcnPlayExists());
		Assert.assertTrue(showDetails.showdetailFollowExists());
		Assert.assertTrue(showDetails.showdetailCoverImageExist());
		Assert.assertTrue(showDetails.showLogoExists());
		Assert.assertTrue(showDetails.showdetailmoreLinkExists());
		Assert.assertTrue(showDetails.showdetailshowDescExists());
		Assert.assertTrue(showDetails.showdetailGenreNameExists());
		
		
		Reporter.log("test_TC_VerifyshowDetailScreen_passed", true);
		
		
	}
	
	@Test (priority=2, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifySubscribingShow() throws Exception
	{
		loginNavigateShowDetailScreen();
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
	}

	@Test (priority=3, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyUnSubscribingShow() throws Exception
	{	
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		
		if(showDetails.icnFollowedShowDetailExists())
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowShowDetailExists());
		}
		else if(showDetails.icnFollowShowDetailExists())
		{
			Assert.assertTrue(showDetails.icnFollowShowDetailClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowedShowDetailExists());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowedShowDetailClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(showDetails.icnFollowShowDetailExists());
		}
	
		Reporter.log("test_TC_VerifyUnSubscribingShow", true);		
	}
	

	@Test (priority=4, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyShowsDetailScreenScrollDownAllVideos() throws Exception
	{

		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		
		Reporter.log("test_TC_VerifyShowsDetailScreenScrollDownAllVideos passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyShowsDetailScreenScrollUpAllVideos() throws Exception
	{

		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyShowsDetailScreenScrollUpAllVideos passed", true);
	}
	
	
	@Test (priority=6, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyVideosGetPlayedContinouslyAutomatically () throws Exception
	{
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);

		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		Thread.sleep(appData.LONG_SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		
		Reporter.log("test_TC_VerifyVideosGetPlayedContinouslyAutomatically passed", true);
	}
	
	
	@Test (priority=7, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyNavigationToInlinePlayerOnTappingVideoDescription() throws Exception
	{
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistEpisodeDescClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());		
		
		Reporter.log("test_TC_VerifyNavigationToInlinePlayerOnTappingVideoDescription passed", true);
	}
	
	@Test (priority=8, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyDurationForEachVideoDisplayed() throws Exception
	{
		loginNavigateShowDetailScreen();
		//Thread.sleep(appData.SLEEP_TIME);
		Thread.sleep(appData.PAGELOADTIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.videoDurationExist());
		
		Reporter.log("test_TC_VerifyDurationForEachVideoDisplayed passed", true);
	}
	/*
	@Test (priority=9, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyPlayerControlsInInlineMode() throws Exception
	{
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		//Thread.sleep(appData.SLEEP_TIME);
		
		Assert.assertTrue(playListDetail.playlistInlineViewClick());
		Thread.sleep(2000);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());
		Assert.assertTrue(player.playerControlsExists());
//		Thread.sleep(appData.SLEEP_TIME);
		Thread.sleep(2000);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());		
		Assert.assertTrue(player.playerControls2Exists());
		
		Reporter.log("test_TC_VerifyPlayerControlsInInlineMode passed", true);
	}

*/
	@Test (priority=9, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyShowImageFadesAndShowNameOnStatusBar() throws Exception
	{
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		
		Assert.assertTrue(showDetails.icnFollowShowDetailExists());
		Assert.assertTrue(showDetails.showdetailBackExists());
		Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
		//genFunc.scrollDown(driver);
		
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(showDetails.showTitleExists());
		Reporter.log("test_TC_VerifyShowImageFadesAndShowNameOnStatusBar passed", true);

	}
	
	@Test (priority=10, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyShowsDescForEachVideo() throws Exception
	{
	
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistEpisodeDescExists());
		
		Reporter.log("test_TC_VerifyShowsDescForEachVideo passed", true);
	}
	/*
	@Test (priority=12, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyTappingOnInfoicon() throws Exception
	{	
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Assert.assertTrue(showDetails.playlerInfoClick());
		
		Reporter.log("test_TC_VerifyTappingOnInfoicon passed", true);
		
	}
	
	
	@Test (priority=13, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyNavigationOnTapOfFullScreenIcon() throws Exception
	{
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());	
		Assert.assertTrue(player.playerFullScreenClick());
		Assert.assertTrue(playListDetail.playlistLandscapeModeExists());
		
		Reporter.log("test_TC_VerifyNavigationOnTapOfFullScreenIcon passed", true);
	}
	
	*/
	
	@Test (priority=11, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyInlinePlayerFocusOutOnTapStatusBar() throws Exception
	{
		loginNavigateShowDetailScreen();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
	
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		Assert.assertTrue(showDetails.showNameOnStatusBarClick());
		Assert.assertTrue(playListDetail.playlistInlineViewNotExists());
		
		Reporter.log("test_TC_VerifyInlinePlayerFocusOutOnTapStatusBar passed", true);
	}
	
	@Test (priority=12, enabled=true, groups = {"Show Details"})
	public void test_TC_VerifyScrollingToPreviousVideoFocusOutOfInlinePlayerMode() throws Exception
	{
		loginNavigateShowDetailScreen();
		  Thread.sleep(appData.SLEEP_TIME);
		  Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
		  genFunc.scrollDown(driver);
		  genFunc.scrollDown(driver);
		  genFunc.scrollDown(driver);
		  genFunc.scrollDown(driver);
		  genFunc.scrollDown(driver);
		  genFunc.scrollDown(driver);
		  genFunc.scrollDown(driver);
		  Assert.assertTrue(showDetails.showsEpisodeThumbnailClick());
		  Assert.assertTrue(playListDetail.playlistInlineViewExists());
		 
		 genFunc.scrollUp(driver);
		  Assert.assertTrue(playListDetail.playlistInlineViewNotExists());
	

		Reporter.log("test_TC_VerifyScrollingToPreviousVideoFocusOutOfInlinePlayerMode passed", true);
	}	
	
	 @Test (priority=13, enabled=true, groups = {"Show Details"})
	 public void test_TC_VerifyScrollingToNextVideoFocusOutOfInlinePlayerMode() throws Exception
	 {
	 	  loginNavigateShowDetailScreen();
		  Thread.sleep(appData.SLEEP_TIME);
		  Assert.assertTrue(showDetails.showsEpisodeThumbnailLoads());
		  Assert.assertTrue(showDetails.showsEpisodeThumbnailClick());
		  Assert.assertTrue(playListDetail.playlistInlineViewExists());
		  Thread.sleep(appData.SLEEP_TIME);
		  genFunc.scrollDown(driver);
		  Assert.assertTrue(playListDetail.playlistInlineViewNotExists());
		  
		  Reporter.log("test_TC_VerifyScrollingToNextVideoFocusOutOfInlinePlayerMode passed", true);
	}
	 

	 @Test (priority=14, enabled=true, groups = {"Show Details"})
	 public void test_TC_VerifyAfterPlayingLastVideoFirstVideoPlays() throws Exception
	 {
	 
		 loginNavigateShowDetailScreen();
		 // Thread.sleep(appData.SLEEP_TIME);
		 Thread.sleep(appData.PAGELOADTIME);
		  genFunc.scrollDownEnd1(driver);
		  Thread.sleep(appData.SLEEP_TIME);
		//  genFunc.scrollDownEnd(driver);
		 // genFunc.scrollUp(driver);
		 Assert.assertTrue(showDetails.showsEpisodeThumbnailClickForLastVideo());	 
		 
		 
	 }

}