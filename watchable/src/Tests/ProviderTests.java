package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class ProviderTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	void loginNavigateProvider() throws InterruptedException
	{
		Assert.assertTrue(welcome.btnLoginTappable());
		Assert.assertTrue(login.titleLoginExist());
		Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1,testData.VALID_LOGIN_PWD_1));
		Assert.assertTrue(login.lnkLoginTap());
		
		Thread.sleep(2000); 
		Assert.assertTrue(playList.playlistNameClick());
		Thread.sleep(appData.SLEEP_TIME);		
		genFunc.scrollDown(driver);		
		Assert.assertTrue(playListDetail.playlistShowLogoLoads());
		Assert.assertTrue(playListDetail.playlistShowLogoClick());
		Thread.sleep(appData.PAGELOADTIME);
		Assert.assertTrue(showDetails.providerNameClick());		
	}

	@Test (priority=1, enabled=true, groups = {"Provider"})
	public void test_TC_VerifyProviderScreen() throws Exception
	{
		loginNavigateProvider();
		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		
		Reporter.log("test_TC_VerifyProviderScreen passed", true);		
	}
	

	@Test (priority=2, enabled=true, groups = {"Provider"})
	public void test_TC_VerifyShowsListOfTheProvider() throws Exception
	{
		loginNavigateProvider();
		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(provider.imgShowExist());
		Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
		Assert.assertTrue(provider.nameShowExist());
		Assert.assertTrue(provider.descShowExist());
		
		Reporter.log("test_TC_VerifyShowsListOfTheProvider passed", true);		
	}
	
	@Test (priority=3, enabled=true, groups = {"Provider"})
	public void test_TC_VerifySubscribingShowFromProvider() throws Exception
	{
		loginNavigateProvider();
		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(provider.imgShowExist());
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
	}
	
	@Test (priority=4, enabled=true, groups = {"Provider"})
	public void test_TC_VerifyUnsubscribingShowFromProvider() throws Exception
	{
		loginNavigateProvider();
		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(provider.imgShowExist());
		Assert.assertTrue(genreDetails.genreShowFollowStatusExists());
		
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
		
		Reporter.log("test_TC_VerifyUnsubscribingShowFromProvider passed", true);		
	}
	
	@Test (priority=5, enabled=true, groups = {"Provider"})
	public void test_TC_VerifyNavigateToShowDetails() throws Exception
	{
		loginNavigateProvider();
		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		//Assert.assertTrue(provider.imgShowExist());
		Assert.assertTrue(provider.imgShowClick());
		Assert.assertTrue(provider.showdetailCoverImageExist());
		Assert.assertTrue(provider.showdetailLogoExist());
		
		Reporter.log("test_TC_VerifyNavigateToShowDetails passed", true);
	}
	
	@Test (priority=6, enabled=true, groups = {"Provider"})
	public void test_TC_VerifyReverseNavigationFromShowDetailToProvider() throws Exception
	{
		loginNavigateProvider();
		Assert.assertTrue(provider.titleProviderExist());
		Assert.assertTrue(signUp.iconBackExist());
		Assert.assertTrue(provider.imgShowClick());
		Assert.assertTrue(provider.showdetailCoverImageExist());
		Assert.assertTrue(provider.showdetailLogoExist());
		Assert.assertTrue(showDetails.showdetailmoreLinkExists());
		Assert.assertTrue(showDetails.providerNameClick());	
		Assert.assertTrue(provider.titleProviderExist());
		
		Reporter.log("test_TC_VerifyReverseNavigationFromShowDetailToProvider passed", true);
	}
}
