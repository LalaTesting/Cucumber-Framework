package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class SliderPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	WebElement icnMenu, icnMenuName, lblMyShows, lblSettings;
	WebElement titlePlaylists, titleGenre, namePlaylist, descPlaylist;
	WebElement popUpConfirmEmail, btnViewMore;
	
	public SliderPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}

	public Boolean icnSliderExists()
	{
		icnMenu = driver.findElement(By.className(CLASS_ICN_SLIDER));
		if(icnMenu.isDisplayed())
			return true;
		else return false;
	}
	
	public Boolean icnSliderClick()
	{
		icnMenu = driver.findElement(By.className(CLASS_ICN_SLIDER));
		if(icnMenu.isDisplayed())
		{
			genFunc.elemClick(icnMenu);
			return true;
		}
		else return false;
	}
	
	public Boolean menuSliderClick(String menuName)
	{
		
		List <WebElement> menuItems = driver.findElements(By.id(ID_MENU_SLIDER));
		int flag = 0;
		
		for(int i = 0; i <menuItems.size(); i++)
		{
			if(menuName.equals(menuItems.get(i).getText()))
			{
				genFunc.elemClick(menuItems.get(i));
				flag=1;				
			}	
			if(flag==1) break;
		}
		if(flag==1) return true;
		else return false;		
		
	}
	
	public void swipeLeftToRight()
	{
		driver.swipe(23, 1223, 965, 1223, 3000);
	}
	public void swipeRightToLeft()
	{
		driver.swipe(791, 1363, 110, 1363, 3000);
	}
	
	public void tapOnScreen()
	{
		driver.swipe(830, 1363, 850, 1363, 3000);
	}
	
	

}
