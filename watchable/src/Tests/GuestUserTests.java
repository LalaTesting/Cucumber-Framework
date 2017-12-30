package Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;

public class GuestUserTests extends BaseTest{


	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	
	
	public void navigateToGuestUserOverlay() throws InterruptedException
	{
		
		
		Assert.assertTrue(welcome.btnSignUpExist());
		Assert.assertTrue(welcome.btnLoginExist());
		Assert.assertTrue(welcome.guestUserLinkExist());
		
		Assert.assertTrue(welcome.linkGuestUserTappable());
		
}
	
	@Test (priority=1, enabled=true, groups = {"Guestuser"})
	public void test_TC_Verifyguestuseroverlay() throws Exception
	{
		//Assert.assertTrue(welcome.titleWelcomeExist());
		//Assert.assertTrue(welcome.descWelcomeExist());
		 navigateToGuestUserOverlay();
		Assert.assertTrue(guestuser.discoverExist());
		Assert.assertTrue(guestuser.browseShowsExist());
		Assert.assertTrue(guestuser.personalizeExist());
		Assert.assertTrue(guestuser.diveInButtonExist());
		
		Reporter.log("test_TC_Verifyguestuseroverlay Passed", true);
	
	}
	
	
	@Test (priority=2, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifyDiveInButtonIsTappable() throws Exception
	{
		navigateToGuestUserOverlay();
		
		Assert.assertTrue(guestuser.diveInButtonExist());
		Assert.assertTrue(guestuser.btnDiveInTappable());
	
	
		Reporter.log("test_TC_Verifyguestuseroverlay Passed", true);
	
	
	}
	
	@Test (priority=3, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifySwipeActionsDonotDismissOverlay() throws Exception
	{
	
		navigateToGuestUserOverlay();
		
		genFunc.swipeAction(driver);
		Reporter.log("test_TC_VerifySwipeActionsDonotDismissOverlay Passed", true);
	
    }
	
	@Test (priority=4, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifyOverlayAppearsOnlyOnce() throws Exception
	{
	
		navigateToGuestUserOverlay();
		Assert.assertTrue(guestuser.btnDiveInTappable());
		Assert.assertTrue(playList.playlistNameClick());
		Assert.assertTrue(playListDetail.playlistBackClick());
	//	Assert.assertTrue(playList.titlePlaylistExist());
		
		Reporter.log("test_TC_VerifyOverlayAppearsOnlyOnce Passed", true);
	
	}
	

	@Test (priority=5, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifyTheSignupOverlayAppearsAfterPerformingAnyActionForUser () throws Exception
	{
		navigateToGuestUserOverlay();
		Assert.assertTrue(guestuser.btnDiveInTappable());
		
        Thread.sleep(appData.SLEEP_TIME);
        Assert.assertTrue(slider.icnSliderClick());
		Thread.sleep(appData.SLEEP_TIME);
		
		//Myshows
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
    

   Assert.assertTrue(guestuser.signUpOverlayExist());
	
	Reporter.log("test_TC_VerifyTheSignupOverlayAppearsAfterPerformingAnyActionForUser", true);

   
		
		Reporter.log("test_TC_VerifyTheSignupOverlayAppearsAfterPerformingAnyActionForUser", true);
	
}
	@Test (priority=6, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifyTapOnSignupNavigatestoSignupscreen() throws Exception
	{
	
		navigateToGuestUserOverlay();
		Assert.assertTrue(guestuser.btnDiveInTappable());
        Thread.sleep(appData.SLEEP_TIME);
        Assert.assertTrue(slider.icnSliderClick());
		//Myshows
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
    
		
		Assert.assertTrue(guestuser.signUpOverlayExist());
		
		 Assert.assertTrue(guestuser.signupBtnTappable());
			
			Assert.assertTrue(signUp.titleSignUpExist());
			Assert.assertTrue(signUp.iconBackExist());
			Assert.assertTrue(signUp.txtbxUsernameExist());
			Assert.assertTrue(signUp.txtbxEmailExist());
			Assert.assertTrue(signUp.txtbxPasswordExist());

			Reporter.log("test_TC_VerifyTapOnSignupNavigatestoSignupscreen", true);


		
		
}
	
	
	@Test (priority=7, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifyTapOnLogIntoYourAccountLinkNavigatesToLoginscreen() throws Exception
	{
	
	
	
	
		navigateToGuestUserOverlay();
		Assert.assertTrue(guestuser.btnDiveInTappable());
        Thread.sleep(appData.SLEEP_TIME);
        Assert.assertTrue(slider.icnSliderClick());
		//Myshows
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
    
		
		Assert.assertTrue(guestuser.signUpOverlayExist());
		
		Assert.assertTrue(guestuser.loginIntoYourAccountTappable());
	
	}
	
	@Test (priority=8, enabled=true, groups = {"Guestuser"})
	public void test_TC_VerifynavigatingBackFromSignupAndLoginScreenDisplaysPreviousScreen () throws Exception
	{

		navigateToGuestUserOverlay();
		Assert.assertTrue(guestuser.btnDiveInTappable());
        Thread.sleep(appData.SLEEP_TIME);
        Assert.assertTrue(slider.icnSliderClick());
		//Myshows
		Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
    
		
		Assert.assertTrue(guestuser.signUpOverlayExist());
		
		Assert.assertTrue(guestuser.loginIntoYourAccountTappable());
		
		Assert.assertTrue(signUp.iconBackClick());
		
	}









}