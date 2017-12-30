package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class SearchTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	void loginNavigateSearchScreen() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Thread.sleep(2000);
		Assert.assertTrue(login.lnkLoginTap());
		
		Assert.assertTrue(playList.playlistNameExists());
		Assert.assertTrue(slider.icnSliderClick());
		Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
		Assert.assertTrue(genre.icnSearchClick());
		Assert.assertTrue(genre.txtbxSearchExists());
	}
	
	@Test (priority=1, enabled=true, groups = {"Search"})
	public void test_TC_VerifySearchWithLessThanTwoCharaters() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.SEARCHLESSTHAN2CHARACTERS));
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(search.getSearchResults());
		
		Reporter.log("test_TC_VerifySearchWithLessThanTwoCharaters passed", true);

	}
	
	@Test (priority=2, enabled=true, dataProvider="Search Data", groups = {"Search"})
	public void test_TC_VerifySearchWithInvalidData(String searchKey) throws Exception
	{
		loginNavigateSearchScreen();
		Assert.assertTrue(search.enterSearchKey(searchKey));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(search.noSearchResults(searchKey));

		Reporter.log("test_TC_VerifySearchWithInvalidData passed", true);
		Reporter.log("test_TC_VerifySearchResultsWhenMatchNotFound passed", true);
		Reporter.log("test_TC_VerifySearchWithSplCharacters", true);
	}
	
	@DataProvider(name = "Search Data")
	 public static Object[][] searchData() 
	 {
			TestData tData = new TestData();
		    return new Object[][] 
	        { 
	        	{ tData.INVALID_SEARCHKEY }, 
	        	{ tData.VALID_SEARCHKEY_NOTFOUND }, 
	        	{ tData.VALID_SEARCHKEY_SPLCHNOTFOUND}
	        };
	 }
	
	@Test (priority=3, enabled=true, groups = {"Search"})
	public void test_TC_VerifySearchWithValidData() throws Exception
	{
		loginNavigateSearchScreen();
		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(search.validSearchResults(testData.VALID_SEARCHKEY));

		Reporter.log("test_TC_VerifySearchWithValidData passed", true);
	}
	
	@Test (priority=4, enabled=true, groups = {"Search"})
	public void test_TC_VerifyCancelInSearch() throws Exception
	{
		loginNavigateSearchScreen();
		
		Assert.assertTrue(search.cancelSearch());
		Assert.assertTrue(genre.titleBrowseExists());

		Reporter.log("test_TC_VerifyCancelInSearch passed", true);
	}
	
	@Test (priority=5, enabled=true, groups = {"Search"})
	public void test_TC_VerifyClearSearchData() throws Exception
	{
		test_TC_VerifySearchWithValidData();
		Assert.assertTrue(search.clearSearchClick());
		Assert.assertTrue(search.getSearchResults());
		Assert.assertTrue(genre.txtbxSearchExists());

		Reporter.log("test_TC_VerifyClearSearchData passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Search"})
	public void test_TC_VerifySearchKeyPadHide() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		//Thread.sleep(appData.SLEEP_TIME);
		search.searchKeyClick();
		Assert.assertTrue(search.validSearchResults(testData.VALID_SEARCHKEY));

		Reporter.log("test_TC_VerifySearchKeyPadHide passed", true);
	}
	
	@Test (priority=7, enabled=true, groups = {"Search"})
	public void test_TC_VerifyNoSearchPerformedWithoutData() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.NODATAENTERED));
		Thread.sleep(appData.SLEEP_TIME);
		Assert.assertTrue(search.getSearchResults());
		Assert.assertTrue(genre.txtbxSearchExists());

		Reporter.log("test_TC_VerifyNoSearchPerformedWithoutData passed", true);
	}
	
	@Test (priority=8, enabled=true, groups = {"Search"})
	public void test_TC_VerifySearchResultsInShowsAndVideos() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		search.backKeyClick();
		Assert.assertTrue(search.validSearchResults(testData.VALID_SEARCHKEY));


		Reporter.log("test_TC_VerifySearchResultsInShows passed", true);
		Reporter.log("test_TC_VerifySearchResultsInVideos passed", true);
	}
	
	@Test (priority=9, enabled=true, groups = {"Search"})
	public void test_TC_VerifyNavigationToShowsDetailFromSearchUnderShows() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		Assert.assertTrue(search.resultsInShowsClick(testData.VALID_SEARCHKEY));
		Assert.assertTrue(showDetails.showIcnPlayExists());
		Assert.assertTrue(showDetails.showLogoExists());
		
		Reporter.log("test_TC_VerifyNavigationToShowsDetailFromSearchUnderShows passed", true);		
	}
	
	@Test (priority=10, enabled=true, groups = {"Search"})
	public void test_TC_VerifyNavigationToShowsDetailFromSearchUnderVideos() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		search.backKeyClick();
		Assert.assertTrue(search.resultsInVideosClick(testData.VALID_SEARCHKEY));
		Assert.assertTrue(showDetails.showNameOnStatusBarExists());
		Assert.assertTrue(showDetails.showVideoPlayInline());
		
		Reporter.log("test_TC_VerifyNavigationToShowsDetailFromSearchUnderVideos passed", true);
		
	}
	
	@Test (priority=11, enabled=true, groups = {"Search"})
	public void test_TC_VerifySectionDisplayedWhenSearchKeyNotFound() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY_VIDEOS));
		search.backKeyClick();
		Thread.sleep(10000);
		Assert.assertTrue(search.resultsInVideosSearchKeyNotFoundClick(testData.VALID_SEARCHKEY_VIDEOS));
		Assert.assertTrue(showDetails.showNameOnStatusBarExists());
		Assert.assertTrue(showDetails.showVideoPlayInline());
		
		Reporter.log("test_TC_VerifySectionDisplayedWhenSearchKeyNotFound passed", true);		
	}
	
	@Test (priority=12, enabled=true, groups = {"Search"})
	public void test_TC_VerifySearchScrollDownAll() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		search.backKeyClick();
		genFunc.scrollDownEnd(driver);
		
		Reporter.log("test_TC_VerifySearchScrollDownAll passed", true);		
	}
	
	@Test (priority=13, enabled=true, groups = {"Search"})
	public void test_TC_VerifySearchScrollUpAll() throws Exception
	{
		loginNavigateSearchScreen();

		Assert.assertTrue(search.enterSearchKey(testData.VALID_SEARCHKEY));
		search.backKeyClick();
		genFunc.scrollUpEnd(driver);
		
		Reporter.log("test_TC_VerifySearchScrollUpAll passed", true);		
	}
}

