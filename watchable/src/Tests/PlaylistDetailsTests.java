package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class PlaylistDetailsTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	void loginNavigatePlaylistDetails() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		Assert.assertTrue(login.lnkLoginTap());
		
		Thread.sleep(2000); 
		Assert.assertTrue(playList.playlistNameClick());
	}
	
	@Test (priority=1, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistNavigatePlaylistDetailScreen() throws Exception
	{
		
		loginNavigatePlaylistDetails();
		
		Assert.assertTrue(playListDetail.icnPlayExist());
		Assert.assertTrue(playListDetail.playlistThumbnailExists());
		Assert.assertTrue(playListDetail.genreNameExists());
		Assert.assertTrue(playListDetail.playlistNameExists());
		Assert.assertTrue(playListDetail.playlistDescExists());
		Assert.assertTrue(playListDetail.playlistDurationExists());
		Assert.assertTrue(playListDetail.playlistShareExists());
		Assert.assertTrue(playListDetail.playlistBackExists());
		
		Reporter.log("test_TC_VerifyPlaylistNavigatePlaylistDetailScreen passed", true);
	}
	
	@Test (priority=2, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenNameLogoAndFollow() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoNameExists());
		Assert.assertTrue(playListDetail.playlistFollowIcnLinkExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenNameLogoAndFollow passed", true);
	}
	
	@Test (priority=3, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenVideoThumbnailAndDescription() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);	
		genFunc.scrollDown(driver);	
		Assert.assertTrue(playListDetail.playlistEpisodeDescExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenVideoThumbnailAndDescription passed", true);
	}
	
	@Test (priority=4, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenScrollDownAllVideos() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScreenScrollDownAllVideos passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenScrollUpAllVideos() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScreenScrollUpAllVideos passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenPlayVideoInline() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenPlayVideoInline passed", true);
	}
	
	@Test (priority=7, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenScrollDownToDefaultMode() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
	    genFunc.scrollDown1(driver);
		genFunc.scrollDown1(driver);
		 genFunc.scrollDown1(driver);
			genFunc.scrollDown1(driver);
	//	Assert.assertTrue(playListDetail.playlistInlineViewNotExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenScrollDownToDefaultMode passed", true);		
	}
	
	@Test (priority=8, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenScrollUpToDefaultMode() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);

		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		
		genFunc.swipeActionVideo(driver);
	//	genFunc.scrollUp1(driver);
	//	genFunc.scrollUp(driver);
	//	genFunc.scrollUp(driver);
		Assert.assertTrue(playListDetail.playlistInlineViewNotExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenScrollUpToDefaultMode passed", true);

	}
	
	@Test (priority=9, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenFocusOutOnTapStatusBar() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);

		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		Assert.assertTrue(playListDetail.playlistTapOnStatusBar());
		Assert.assertTrue(playListDetail.playlistInlineViewNotExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenFocusOutOnTapStatusBar passed", true);
	}
	
	@Test (priority=10, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenAutoPlayVideos() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);

		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		Thread.sleep(appData.LONG_SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenAutoPlayVideos passed", true);
	}
	
	/*
	@Test (priority=11, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenNavigateToPlayer() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
	//	driver.findElement(By.id("com.comcast.watchablephone:id/RelativeLayout_videoOptionsId")).click();
		
		
//List<WebElement>	ele=	driver.findElements(By.id("com.comcast.watchablephone:id/RelativeLayout_videoOptionsId"));
		
		
   
//System.out.println(ele.size());
		
Assert.assertTrue(playListDetail.playlistInlineViewExists());

		Assert.assertTrue(playListDetail.playlistInlineViewClick());
	//	Assert.assertTrue(player.playerInfoClick());
		
		Assert.assertTrue(playListDetail.playerInfoClick());
		
	//	Assert.assertTrue(player.playerDescTitleExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenNavigateToPlayer passed", true);
	}
	*/
	@Test (priority=12, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenSubscribeShow() throws Exception
	{
		loginNavigatePlaylistDetails();
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
		
	}
	
	@Test (priority=13, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenUnsubscribeShow() throws Exception
	{
		loginNavigatePlaylistDetails();
		genFunc.scrollDown(driver);	
		genFunc.scrollDown(driver);
		if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING))
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW));
		}
		else if(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOWING));
			Assert.assertTrue(playListDetail.playlistFollowIcnLinkClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(playListDetail.getPlaylistFollowText().equals(appData.FOLLOW));
		}
		
		Reporter.log("test_TC_VerifyPlaylistScreenUnsubscribeShow passed", true);
	}
	
	@Test (priority=14, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenBack() throws Exception
	{
		loginNavigatePlaylistDetails();
		
		Assert.assertTrue(playListDetail.playlistBackClick());
		Assert.assertTrue(playList.titlePlaylistExist());
		
		Reporter.log("test_TC_VerifyPlaylistScreenBack passed", true);
	}
	
	@Test (priority=15, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlaylistScreenShare() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistShareClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(genFunc.genericShareGmailClick(driver, appData.GMAIL));
		Assert.assertTrue(playListDetail.playlistNameExists());
		
		Reporter.log("test_TC_VerifyPlaylistScreenShare passed", true);
	}
	
	@Test (priority=16, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyNavigationToShowDetail() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
		Assert.assertTrue(showDetails.showLogoExists());
		
		Reporter.log("test_TC_VerifyNavigationToShowDetail passed", true);
	}
	
	@Test (priority=17, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyNavigationToInlinePlayerOnTappingVideoDescription() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.playlistEpisodeDescClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistInlineViewExists());		
		
		Reporter.log("test_TC_VerifyNavigationToInlinePlayerOnTappingVideoDescription passed", true);
	}
/*	
	@Test (priority=18, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyNavigationOnTapOfFullScreenIcon() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Assert.assertTrue(playListDetail.playlistInlineViewClick());	
		
		Assert.assertTrue(player.playerFullScreenClick());
		Assert.assertTrue(playListDetail.playlistLandscapeModeExists());
		
		Reporter.log("test_TC_VerifyNavigationOnTapOfFullScreenIcon passed", true);
	}
	*/
	
	@Test (priority=19, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyDurationForEachVideoDisplayed() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDown(driver);
		Assert.assertTrue(playListDetail.videoDurationExist());
		
		Reporter.log("test_TC_VerifyDurationForEachVideoDisplayed passed", true);
	}
	
	
	/*
	@Test (priority=20, enabled=true, groups = {"Playlist Details"})
	public void test_TC_VerifyPlayerControlsInInlineMode() throws Exception
	{
		loginNavigatePlaylistDetails();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		//Thread.sleep(appData.SLEEP_TIME);
		
		Assert.assertTrue(playListDetail.playlistInlineViewClick());
		Thread.sleep(2000);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());
//		Thread.sleep(appData.SLEEP_TIME);
		Thread.sleep(2000);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());		
		Assert.assertTrue(player.playerControls2Exists());
		
		Reporter.log("test_TC_VerifyPlayerControlsInInlineMode passed", true);
	}
	
	*/
}
