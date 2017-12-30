package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class GenreTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	void loginNavigateGenreScreen() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());

		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Assert.assertTrue(login.lnkLoginTap());
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		Assert.assertTrue(slider.icnSliderExists());
		Assert.assertTrue(genre.titleBrowseExists());		
	}
	
	@Test (priority=1, enabled=true, groups = {"Genre"})
	public void test_TC_GenreScreenDetails() throws Exception
	{
		loginNavigateGenreScreen();		
		Reporter.log(assertMsg.GENRESCREEN_EXIST,true);
		Assert.assertTrue(genre.titleBrowseExists());
		Reporter.log(assertMsg.BROWSE_LBL_EXIST,true);
		Assert.assertTrue(genre.txtGenreExists());
		Reporter.log(assertMsg.GENRE_TXT_EXIST,true);
		Assert.assertTrue(genre.txtGenreImageExists());
		Reporter.log("test_TC_GenreScreenDetails passed", true);
	}
	
	@Test (priority=2, enabled=true, groups = {"Genre"})
	public void test_TC_VerifyCategoriesInGenreScreen() throws Exception
	{
		test_TC_GenreScreenDetails();
		Assert.assertTrue(genre.txtGenreDisplay());
		Reporter.log("test_TC_VerifyCategoriesInGenreScreen passed", true);
	}
	
	@Test (priority=3, enabled=true, groups = {"Genre"})
	public void test_TC_VerifyCategoriesAreTappable() throws Exception
	{
		test_TC_GenreScreenDetails();
		Assert.assertTrue(genre.txtGenreClick());
		Reporter.log("test_TC_VerifyCategoriesAreTappable passed", true);
	}
	
	@Test (priority=4, enabled=true, groups = {"Genre"})
	public void test_TC_VerifySearchOverlay() throws Exception
	{
		test_TC_GenreScreenDetails();
		Assert.assertTrue(genre.icnSearchClick());
		Assert.assertTrue(genre.txtbxSearchExists());
		Assert.assertTrue(genre.icnSearchExists());
		Assert.assertTrue(genre.lnkCancelExists());
		Reporter.log("test_TC_VerifySearchOverlay passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"Genre"})
	public void test_TC_VerifyGenreScrollDownAll() throws Exception
	{
		loginNavigateGenreScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollDownEnd(driver);
		Reporter.log("test_TC_VerifyGenreScrollDownAll passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Genre"})
	public void test_TC_VerifyGenreScrollUpAll() throws Exception
	{
		loginNavigateGenreScreen();
		Thread.sleep(appData.SLEEP_TIME);
		genFunc.scrollUpEnd(driver);
		Reporter.log("test_TC_VerifyGenreScrollUpAll passed", true);
	}

}
