package Pages;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;



public class GenericPage extends UIElements {
	AppiumDriver driver;
	ApplicationData appData = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	
	WebElement ShowsToFollowBtn;
	
	
	public GenericPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}


public Boolean ShowsToFollowTappable()
{
	ShowsToFollowBtn=driver.findElement(By.id(ID_BTN_ShowsToFollow));
	if(ShowsToFollowBtn.isEnabled())
	{
		genFunc.elemClick(ShowsToFollowBtn);
		return true;
	}
	else return false;
		
		
	

}






}
