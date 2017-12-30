package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class HistoryTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();


	/*void loginNavigateHistoryScreen1() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		//Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());


	}*/
	
	
	void loginNavigateHistoryScreen() throws  InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		Assert.assertTrue(login.lnkLoginTap());
		Assert.assertTrue(slider.icnSliderClick());
		
		
	}
		
	void test_TC_HistoryScreen()  throws  InterruptedException
	{
		loginNavigateHistoryScreen();
		String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
        Assert.assertTrue(history.titleHistoryTappable());
        Reporter.log("test_TC_HistoryScreen() passed", true);
	}

	@Test (priority=1, enabled=true, groups = {"History"})
	public void test_TC_VerifyAllVideosWatchedFor2OrMoreSecondsAreDisplayedInHistoryScreen() throws Exception
	{
		
		test_TC_HistoryScreen();	
		String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
        //System.out.println(str);
        Assert.assertTrue(history.titleHistoryTappable());
        Reporter.log("test_TC_VerifyAllVideosWatchedFor2OrMoreSecondsAreDisplayedInHistoryScreen() passed", true);
	}
	

	@Test (priority=2, enabled=true, groups = {"History"})
	public void test_TC_VerifyTheDetailsOfHistoryScreen() throws Exception
	{
	 
		test_TC_HistoryScreen();
		Thread.sleep(2000);
		Assert.assertTrue(history.bulkDeleteExists());
		Assert.assertTrue(history.VideoIcoExists());
		Assert.assertTrue(history.ShoLogoExists());
		Assert.assertTrue(history.VideoDescexists());
		Reporter.log("test_TC_VerifyTheDetailsOfHistoryScreen() passed", true);
	}
	
	
	@Test (priority=3, enabled=true, groups = {"History"})
	public void test_TC_VerifyCancellingBulkDeleteFunctionality()  throws Exception
	{
		test_TC_HistoryScreen();
		Thread.sleep(5000);
		String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
        //System.out.println(str);
        Assert.assertTrue(history.historyTxtExists());
		Assert.assertTrue(history.historyDeleteTappable());
		Thread.sleep(5000);
		Assert.assertTrue(history.ViewClearTextExists());
		Assert.assertTrue(history.historyDoneTappable());
		Thread.sleep(2000);
		Assert.assertFalse(history.NoClearTextExists());
		Reporter.log("test_TC_VerifyCancellingBulkDeleteFunctionality() passed", true);
	}
	
	@Test (priority=8, enabled=true, groups = {"History"})
	public void test_TC_VerifyDeletingAllTheItemsAtOnce()  throws Exception
	{
		test_TC_HistoryScreen();
		Thread.sleep(5000);
        Assert.assertTrue(history.historyTxtExists());
		Assert.assertTrue(history.historyDeleteTappable());
		Thread.sleep(5000);
		Assert.assertTrue(history.ViewClearTextExists());
		Assert.assertTrue(history.ClearTextTappable());
		Assert.assertFalse(history.VideoDesnotcexists());
		Reporter.log("test_TC_VerifyCancellingBulkDeleteFunctionality() passed", true);
	}
	
	@Test (priority=7, enabled=true, groups = {"History"})
	public void test_TC_VerifyDeletingOneItemsAtOnce()  throws Exception
	{
		
		test_TC_HistoryScreen();
		Thread.sleep(6000);
		history.scrollRightToLeft();
		Assert.assertTrue(history.SngDeleteBtnExists());
		Assert.assertTrue(history.SngDeleteTappable());
		Reporter.log("test_TC_VerifyDeletingOneItemsAtOnce() passed", true);
		
	}
	
	@Test (priority=4, enabled=true, groups = {"History"})
	public void VerifyTheOrderInWhichTheItemsAreDisplayedInTheScreen() throws Exception
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Assert.assertTrue(login.lnkLoginTap());
		Thread.sleep(6000);
		Assert.assertTrue(playListDetail.playthumbnailClick());
		Assert.assertTrue(history.icnPlay_Tapable());
		Thread.sleep(8000);
		Assert.assertTrue(history.Ad_IconExists());
		Thread.sleep(8000);
		Assert.assertTrue(history.BackTappable());
		Assert.assertTrue(slider.icnSliderClick());
		String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
        //System.out.println(str);
        Assert.assertTrue(history.titleHistoryTappable());
		Assert.assertTrue(history.VideoIcoExists());
		Reporter.log("test_TC_VerifyTheOrderInWhichTheItemsAreDisplayedInTheScreen() passed", true);
		
		
	}
	
	@Test (priority=5, enabled=true, groups = {"History"})
	public void VerifyNavigationToShowDetailsScreenFromHistoryScreen()  throws Exception
	{
		test_TC_HistoryScreen();
		Thread.sleep(5000);
		Assert.assertTrue(history.VideoIcoExists());
		Assert.assertTrue(history.ShoLogoExists());
		String logotxt = driver.findElement(By.xpath("//android.widget.ImageView")).getText();
		//System.out.println(logotxt);
		Assert.assertTrue(history.ShoLogoTapable());
		Thread.sleep(3000);
		String logodetailtxt = driver.findElement(By.xpath("//android.widget.ImageView")).getText();
		//System.out.println(logodetailtxt);
		if (logotxt == logodetailtxt)
		{
			Reporter.log("test_TC_VerifyNavigationToShowDetailsScreenFromHistoryScreen() passed", true);
		}
	
	}
	
	@Test (priority=6, enabled=true, groups = {"History"})
	public void VerifyDeletingAnItemResetsToDefaultWhenWeSwipeFromLeftToRight() throws Exception
	{
		
		test_TC_HistoryScreen();
		Thread.sleep(6000);
		history.scrollRightToLeft();
		Assert.assertTrue(history.SngDeleteBtnExists());
		Assert.assertTrue(history.Undo_Tappable());
		Assert.assertTrue(history.VideoIcoExists());
		Assert.assertTrue(history.ShoLogoExists());
		Assert.assertTrue(history.VideoDescexists());
		Reporter.log("test_TC_VerifyDeletingAnItemResetsToDefaultWhenWeSwipeFromLeftToRight() passed", true);
	}
	
	@Test (priority=9, enabled=true, groups = {"History"})
	public void  VerifyAllVideosWatchedForLessThan2SecondsAreNotDisplayedInHistoryScreen() throws Exception
	{
		test_TC_HistoryScreen();
		Thread.sleep(6000);
		Assert.assertTrue(history.historyDeleteTappable());
		Assert.assertTrue(history.ClearTextTappable());
		Assert.assertTrue(history.MultiOp_Tappable());
		Assert.assertTrue(history.PlayList_Tapable());
		//write code for video playing
		Assert.assertTrue(playListDetail.playthumbnailClick());
		Assert.assertTrue(history.icnPlay_Tapable());
		Thread.sleep(2000);
		Assert.assertTrue(history.Ad_IconExists());
		Thread.sleep(2000);
		Assert.assertTrue(history.BackTappable());
		Assert.assertTrue(slider.icnSliderClick());
		String str =  driver.findElement(By.xpath("//android.widget.TextView[@text='History']")).getText();
        //System.out.println(str);
        Assert.assertTrue(history.titleHistoryTappable());
        Reporter.log("test_TC_HistoryScreen() passed", true);
        Assert.assertFalse(history.VideoDesnotcexists());
        Reporter.log("test_TC_VerifyAllVideosWatchedForLessThan2SecondsAreNotDisplayedInHistoryScreen() passed", true);
	
	}
	
}
