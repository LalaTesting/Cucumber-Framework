package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class PlaylistTests extends BaseTest{
	
	TestData testData = new TestData();
	AssertMsgs assertMsg = new AssertMsgs();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	@Test (priority=1, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyPlayListDetails() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		Assert.assertTrue(playList.playlistThumbnailExists());
		Assert.assertTrue(playList.genreNameExists());
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(playList.playlistDescExists());
		
		Reporter.log("test_TC_VerifyPlayListDetails passed", true);
	}
	
	@Test (priority=2, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyPlayListTitle() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
	//	Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(login.lnkLoginTap());
		
		
	//	Assert.assertTrue(playList.titlePlaylistExist());
		Assert.assertFalse(playList.titlePlaylistExist());
		Reporter.log(assertMsg.PLAYLISTSCREEN_EXIST,true);
	//	Thread.sleep(appData.SLEEP_TIME);
		
		Assert.assertTrue(slider.icnSliderExists());
		
		Reporter.log("test_TC_VerifyHomeScreenTabs passed", true);
	}
	
	
	
	@Test (priority=3, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyPlayListsMenuTitle() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		Assert.assertTrue(playList.titlePlaylistExist());
		
		Reporter.log("test_TC_VerifyPlayListFeaturedTitle passed", true);
	}
	
		
	@Test (priority=4, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyToastHidesOnScroll() throws Exception
	{
		test_TC_VerifyPlayListTitle();
	
		//Assert.assertTrue(playList.titlePlaylistsConfirmEmailExists());
		 genFunc.scrollDown1(driver);
		 genFunc.scrollDown1(driver);
		 genFunc.scrollDown1(driver);
		 genFunc.scrollDown1(driver);
			
		Assert.assertTrue(playList.confirmEmailNotExists());
		
		Reporter.log("test_TC_VerifyToastHidesOnScroll passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyToastNotificationExists() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		
		Assert.assertTrue(playList.titlePlaylistExist());
		
		Assert.assertTrue(playList.titlePlaylistsConfirmEmailExists());
		
		Reporter.log("test_TC_VerifyToastNotificationExists passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyOnSwipeToastNotificationDismiss() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		Assert.assertTrue(playList.titlePlaylistExist());
		Assert.assertTrue(playList.titlePlaylistsConfirmEmailExists());
		playList.swipeOnToastToDismiss();
		Assert.assertTrue(playList.confirmEmailNotExists());
		 
		 Reporter.log("test_TC_VerifyOnSwipeToastNotificationDismiss passed", true);
	}
	
	@Test (priority=7, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyTapOnToastNotification() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playList.titlePlaylistExist());
		Assert.assertTrue(playList.titlePlaylistsConfirmEmailExists());
		
		Assert.assertTrue(playList.viewMoreClick());
		Reporter.log("test_TC_VerifyTapOnToastNotification passed", true);
	}
	
	@Test (priority=8, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyEmailScreen() throws Exception
	{
		test_TC_VerifyTapOnToastNotification();
		Thread.sleep(appData.SLEEP_TIME);
		
		Assert.assertTrue(setting.icnBackExist());
		Assert.assertTrue(setting.lblEmailExist());
		Assert.assertTrue(setting.lnkSaveExist());
		Assert.assertTrue(setting.txtEmailExist());
		Assert.assertTrue(setting.lblMessageExist());
		Assert.assertTrue(setting.btnRsndConfExist());
		
		Reporter.log("test_TC_VerifyEmailScreen passed", true);
	}
	
	@Test (priority=9, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyTapOnResendConfirmationButton() throws Exception
	{
		test_TC_VerifyTapOnToastNotification();
		Thread.sleep(appData.SLEEP_TIME);
		
		Assert.assertTrue(setting.lblEmailExist());
		Assert.assertTrue(setting.btnRsndConfExist());
		Assert.assertTrue(setting.btnRsndConfClick());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(setting.btnRsndConfOKClick());
		Assert.assertTrue(setting.btnRsndConfExist());
		
		Reporter.log("test_TC_VerifyTapOnResendConfirmationButton", true);
	}
	
	@Test (priority=10, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyToastNotificationExistsOnlyInPlaylistsTab() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		
		Assert.assertTrue(playList.titlePlaylistExist());
		Assert.assertTrue(playList.titlePlaylistsConfirmEmailExists());
		
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		Assert.assertTrue(playList.confirmEmailNotExists());
		
		Reporter.log("test_TC_VerifyToastNotificationExistsOnlyInPlaylistsTab", true);
	}
	
	@Test (priority=11, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyPlaylistScrollDownAll() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScrollDownAll passed", true);
	}
	
	@Test (priority=12, enabled=true, groups = {"Playlist"})
	public void test_TC_VerifyPlaylistScrollUpAll() throws Exception
	{
		test_TC_VerifyPlayListTitle();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyPlaylistScrollUpAll passed", true);
	}
		

}
