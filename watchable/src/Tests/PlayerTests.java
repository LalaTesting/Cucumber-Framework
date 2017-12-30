package Tests;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;

public class PlayerTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	void loginNavigatePlayer() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameClick());
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		Assert.assertTrue(player.playerIcnCloseExist());
	}
	
	@Test (priority=1, enabled=true, groups = {"Player"})
	public void test_TC_VerifyPlayerScreenNavigateToPlayerResumeVideo() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameClick());
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());

		String startTime2 = playListDetail.getInlinePlayerStartTime();
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
		
		String startTime3 = player.getPortraitPlayerStartTime();
		
		if(startTime2.compareTo(startTime3) < 0)
			Reporter.log("test_TC_VerifyPlayerScreenNavigateToPlayerResumeVideo passed", true);
		else 
			Assert.fail();
	}
	

	@Test (priority=2, enabled=true, groups = {"Player"})
	public void test_TC_VerifyPlayerScreenNavigateTapOninfoicon() throws Exception
	{

		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameClick());
		
        Thread.sleep(appData.PAGELOADTIME);
       
		Assert.assertTrue(playListDetail.playlistEpisodeThumbnailClick());
	//	driver.findElement(By.xpath("//android.view.View[1]")).click();
	//	driver.findElement(By.xpath("//android.view.View[1]")).click();
		Thread.sleep(2000);
	//	driver.swipe(323, 1033, 729, 1033, 2000);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());
		Thread.sleep(2000);
		Assert.assertTrue(playListDetail.playlistInlineViewClick());
		
		Assert.assertTrue(playListDetail.playerInfoClick());
	//	Thread.sleep(1000);
//		Assert.assertTrue(playListDetail.playlistInlineViewClick());
	//	Thread.sleep(1000);
	//	Assert.assertTrue(playListDetail.playlistInlineViewClick());
		//driver.swipe(323, 1033, 729, 1033, 2000);
//	driver.findElement(By.xpath("android.widget.ImageView")).click();
		
//	WebElement ele=	driver.findElement(By.id("com.comcast.watchablephone:id/commonVideoViewParentId"));
	
	

	
}
}