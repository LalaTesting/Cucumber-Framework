package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.TestData;
import Utils.UIElements;
public class SliderTests extends BaseTest{
	
	TestData testData = new TestData();
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	UIElements uiElem = new UIElements();
	@Test (priority=1, enabled=true, groups = {"Slider"})
	public void VerifyMenuItemsInSliderItem() throws Exception
	{
		    Assert.assertTrue(welcome.btnLoginTappable());
		//	Assert.assertTrue(login.titleLoginExist());
			Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
			Thread.sleep(2000);
			Assert.assertTrue(login.lnkLoginTap());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
	System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Browse Shows']")).getText());		
		   Assert.assertTrue(genre.titleBrowseExists());
			Assert.assertTrue(myShows.titleMyShowsExists());
			
			Assert.assertTrue(setting.titleSettingExist());
			
			
			}
	
	@Test (priority=2, enabled=true, groups = {"Slider"})
	public void VerifyMenuItemsHighlightedInSliderMenu() throws Exception
	{
	
		 Assert.assertTrue(welcome.btnLoginTappable());
		 Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		 Thread.sleep(2000);
		 
         Assert.assertTrue(login.lnkLoginTap());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
			Assert.assertTrue(slider.icnSliderClick());
			
			Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
			
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
			
			Assert.assertTrue(slider.icnSliderClick());
			
			
		}
	
	@Test (priority=3, enabled=true, groups = {"Slider"})
	public void VerifySliderAppearsInAllScreen() throws Exception
	{
		   Assert.assertTrue(welcome.btnLoginTappable());
		   Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		   Thread.sleep(2000);
		 
           Assert.assertTrue(login.lnkLoginTap());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
			
			slider.swipeLeftToRight();
			
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
			slider.swipeLeftToRight();
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
			slider.swipeLeftToRight();
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
			slider.swipeLeftToRight();
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.icnSliderClick());
}
	
	
	@Test (priority=4, enabled=true, groups = {"Slider"})
	public void VerifySliderClosesInAllScreen() throws Exception
	{
		 Assert.assertTrue(welcome.btnLoginTappable());
		   Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		   Thread.sleep(2000);
		 
         Assert.assertTrue(login.lnkLoginTap());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
			Assert.assertTrue(slider.icnSliderClick());
		    Thread.sleep(2000);
		    Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		    slider.swipeLeftToRight();
		    slider.swipeRightToLeft();
		    Assert.assertTrue(slider.icnSliderClick());
		    Assert.assertTrue(slider.icnSliderClick());
		    Assert.assertTrue(slider.icnSliderClick());
		    
		    Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		    slider.swipeLeftToRight();
		    slider.swipeRightToLeft();
		    Assert.assertTrue(slider.icnSliderClick());
		    Assert.assertTrue(slider.icnSliderClick());
		    Assert.assertTrue(slider.icnSliderClick());
		    
		    Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
			slider.swipeLeftToRight();
			slider.swipeRightToLeft();
		    Assert.assertTrue(slider.icnSliderClick());
		    Assert.assertTrue(slider.icnSliderClick());
		    Assert.assertTrue(slider.icnSliderClick());
		    
		    
	/*	    
		    Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
		   
		    slider.swipeLeftToRight();
		    Thread.sleep(3000);
		    slider.swipeRightToLeft();
		
		     Assert.assertTrue(slider.icnSliderClick());
		     Assert.assertTrue(slider.icnSliderClick());
		     Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
		     slider.swipeLeftToRight();
		     Thread.sleep(3000);
		     slider.swipeRightToLeft();
		     Assert.assertTrue(slider.icnSliderClick());
		     Assert.assertTrue(slider.icnSliderClick());  
			
	*/
	}
	@Test (priority=5, enabled=true, groups = {"Slider"})
	public void VerifyTapOutsideTheSliderClosesInAllScreen() throws Exception
	{
	
		 Assert.assertTrue(welcome.btnLoginTappable());
		   Assert.assertTrue(login.loginEnterCredentials(testData.VALID_LOGIN_UN_1, testData.VALID_LOGIN_PWD_1));
		   Thread.sleep(2000);
		 
       Assert.assertTrue(login.lnkLoginTap());
			
			Assert.assertTrue(playList.playlistNameExists());
			Assert.assertTrue(slider.icnSliderClick());
			Assert.assertTrue(slider.menuSliderClick(appData.BROWSE));
			slider.swipeLeftToRight();
			Thread.sleep(3000);
			slider.tapOnScreen();
			 Assert.assertTrue(slider.icnSliderClick());
			 Assert.assertTrue(slider.menuSliderClick(appData.MYSHOWS));
			  slider.swipeLeftToRight();
			    Thread.sleep(3000);
				slider.tapOnScreen();
				
				Assert.assertTrue(slider.icnSliderClick());
	
				 Assert.assertTrue(slider.menuSliderClick(appData.SETTINGS));
	
				 slider.swipeLeftToRight();
				    Thread.sleep(3000);
					slider.tapOnScreen();
					
					Assert.assertTrue(slider.icnSliderClick());
					Assert.assertTrue(slider.menuSliderClick(appData.HISTORY));
					slider.swipeLeftToRight();
				    Thread.sleep(3000);
					slider.tapOnScreen();
					Assert.assertTrue(slider.icnSliderClick());
	}
	
}
