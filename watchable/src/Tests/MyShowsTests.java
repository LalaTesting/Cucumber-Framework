package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class MyShowsTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	void loginNavigateMyShowsScreen() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		Assert.assertTrue(myShows.titleMyShowsExists());
		Assert.assertTrue(slider.icnSliderExists());
	}

	@Test (priority=2, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsDetails() throws Exception
	{
		loginNavigateMyShowsScreen();
		
		Assert.assertTrue(myShows.imgShowExists());
		Assert.assertTrue(myShows.icnPlayExists());
		Assert.assertTrue(myShows.titleWatchLatestVideoExists());
		Assert.assertTrue(myShows.descLatestVideoExists());
		
		Reporter.log("test_TC_VerifyMyShowsDetails passed", true);
	}
	
	@Test (priority=4, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsNavigateToShowDetailOnTapWatchLatestVideo() throws Exception
	{
		loginNavigateMyShowsScreen();
		
		Assert.assertTrue(myShows.titleWatchLatestVideoClick());
		//Assert.assertTrue(showDetails.showNameOnStatusBarExists());
		Assert.assertTrue(showDetails.showVideoPlayInline());
		
		Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapWatchLatestVideo passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsNavigateToShowDetailOnTapShowImage() throws Exception
	{
		loginNavigateMyShowsScreen();
		
		Assert.assertTrue(myShows.imgShowClick());
		Assert.assertTrue(showDetails.showLogoExists());
		Assert.assertTrue(showDetails.showIcnPlayExists());
		
		Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapShowImage passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsNavigateToShowDetailOnTapPlayImage() throws Exception
	{
		loginNavigateMyShowsScreen();
		
		Assert.assertTrue(myShows.icnPlayClick());
		//Assert.assertTrue(showDetails.showNameOnStatusBarExists());
		Assert.assertTrue(showDetails.showVideoPlayInline());
		
		Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapPlayImage passed", true);
	}
	
	@Test (priority=7, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsNavigateToShowDetailOnTapVideoDescription() throws Exception
	{
		loginNavigateMyShowsScreen();
		
		Assert.assertTrue(myShows.descLatestVideoClick());
		Assert.assertTrue(showDetails.showLogoExists());
		Assert.assertTrue(showDetails.showIcnPlayExists());
		
		Reporter.log("test_TC_VerifyMyShowsNavigateToShowDetailOnTapVideoDescription passed", true);
	}
	/*
	@Test (priority=11, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMsgWhenNoShowsSubscribed() throws Exception
	{
		
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		Assert.assertTrue(myShows.titleMyShowsExists());
		Assert.assertTrue(slider.icnSliderExists());
		
		Assert.assertTrue(myShows.msgNoVideoSubscribedExists());
		
		Reporter.log("test_TC_VerifyMsgWhenNoShowsSubscribed passed", true);
	}
	*/
	@Test (priority=12, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsScrollDownEnd() throws Exception
	{
		loginNavigateMyShowsScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		
		Reporter.log("test_TC_VerifyMyShowsScrollDownEnd passed", true);
	}
	
	@Test (priority=13, enabled=true, groups = {"My Shows"})
	public void test_TC_VerifyMyShowsScrollUpEnd() throws Exception
	{
		loginNavigateMyShowsScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyMyShowsScrollUpEnd passed", true);
	}
		
}
