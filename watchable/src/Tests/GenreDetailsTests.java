package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.SignUpPage;
import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class GenreDetailsTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	//Below Method includes navigation from Login to Genre Screen
	
	void loginNavigateGenreDetailsScreen() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		Thread.sleep(2000);
		Assert.assertTrue(genre.txtSelectiveGenreClick(appData.FUNNY));
	}
	
	@Test (priority=1, enabled=true, groups = {"Genre Details"})
	public void test_TC_VerifyGenreDetailScreenGenreDetail() throws Exception
	{
		loginNavigateGenreDetailsScreen();
		//Assert.assertTrue(genreDetails.titleGenreExists());
		Assert.assertTrue(new SignUpPage(driver).iconBackExist());
		//Assert.assertTrue(genreDetails.bckImgGenreExists());
		Assert.assertTrue(genreDetails.genreShowImgExists());
		Assert.assertTrue(genreDetails.genreShowNameExists());
		Assert.assertTrue(genreDetails.genreShowDescExists());
		Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
		
		Reporter.log("test_TC_VerifyGenreDetailScreenGenreDetail passed", true);
	}
	
	@Test (priority=2, enabled=true, groups = {"Genre Details"})
	public void test_TC_VerifyGenreDetailScreenSubscribeShow() throws Exception
	{
		loginNavigateGenreDetailsScreen();
		//Assert.assertTrue(genreDetails.titleGenreExists());
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
	}
	
	@Test (priority=3, enabled=true, groups = {"Genre Details"})
	public void test_TC_VerifyGenreDetailScreenUnsubscribeShow() throws Exception
	{
		loginNavigateGenreDetailsScreen();
		//Assert.assertTrue(genreDetails.titleGenreExists());
		genFunc.scrollDown(driver);	
		if(genreDetails.getGenreFollowText().equals(appData.FOLLOWING))
		{
			//Assert.assertTrue(playList.TabMyWatchClick()); // change to menu slider
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
		}
		else if(genreDetails.getGenreFollowText().equals(appData.FOLLOW))
		{
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOWING));
			Assert.assertTrue(genreDetails.genreShowFollowStatusClick());
			Thread.sleep(appData.SLEEP_TIME);
			Assert.assertTrue(genreDetails.getGenreFollowText().equals(appData.FOLLOW));
		}
		
		Reporter.log("test_TC_VerifyGenreDetailScreenUnsubscribeShow passed", true);
	}
	
	@Test (priority=4, enabled=true, groups = {"Genre Details"})
	public void test_TC_VerifyGenreDetailScreenStatusBar() throws Exception
	{
		loginNavigateGenreDetailsScreen();
		//Assert.assertTrue(genreDetails.titleGenreExists());
		genFunc.scrollDown1(driver);
		genFunc.scrollDown1(driver);
		genFunc.scrollDown1(driver);
		genFunc.scrollDown1(driver);
		Assert.assertTrue(genreDetails.genreTitleStatusBarExists());		
		
		Reporter.log("test_TC_VerifyGenreDetailScreenStatusBar passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"Genre Details"})
	public void test_TC_VerifyGenreScrollDownAll() throws Exception
	{
		loginNavigateGenreDetailsScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver/*, uiElem.ID_TXT_GENRESHOWNAME*/);
		
		Reporter.log("test_TC_VerifyGenreScrollDownAll passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Genre"})
	public void test_TC_VerifyGenreDetailsScrollUpAll() throws Exception
	{
		loginNavigateGenreDetailsScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifyGenreDetailsScrollUpAll passed", true);
	}

}
