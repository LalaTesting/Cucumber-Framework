package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class GenericFunctions extends UIElements{
	
	AppiumDriver driver;
	
	WebElement gmailShare, txtEmailID, btnSend, descVideo;
	ApplicationData data = new ApplicationData();
	TestData test_data = new TestData();
	static int counter = 0;
		
	public GenericFunctions(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	
	public void elemClick(WebElement elem)
	{
		elem.click();
	}
	
	public void elemEnterData(WebElement elem, String sData)
	{
		elem.sendKeys(sData);
	}

	public void scrollDown(AppiumDriver driver)
	{
		driver.swipe(100, 400, 100, 75, 3000);
	}
	
	public void scrollDown1(AppiumDriver driver)
	{
		driver.swipe(100, 500, 100, 20, 3000);
	}
	public void scrollDown2(AppiumDriver driver)
	{
		driver.swipe(363, 984, 363, 100, 3000);
	}
	
	public void scrollUp(AppiumDriver driver)
	{
		driver.swipe(100, 75, 100, 400, 3000);
	}
	
	public void scrollUp1(AppiumDriver driver)
	{
		driver.swipe(293, 545, 293, 1983, 3000);
	}
	
	
	public void scrollDownEnd(AppiumDriver driver/*, String xPathVideoDesc*/)
	{
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height = 10;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i < height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		  }
	}
	
	public void scrollDownEnd1(AppiumDriver driver/*, String xPathVideoDesc*/)
	{
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height =10;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i <=height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		   
		  
		 System.out.println(counter+i);
		  }
	}
	public void scrollDownEnd2(AppiumDriver driver/*, String xPathVideoDesc*/)
	{
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.7;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height =10;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i <=height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		   
		  
		 System.out.println(counter+i);
		  }
	}
	
	/*public Boolean compareEpisodeDesc(AppiumDriver driver, WebElement descVideo)
	{	
		if(descVideo.getText().equals(descVideo.getText())) 
		{
			counter++;
			if(counter==4)
				return true;
			else return false;
		}
		else return true;
	}*/
	
	public void scrollUpEnd(AppiumDriver driver)
	{
		Dimension dimensions = driver.manage().window().getSize();

		Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height = 12;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i < height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		  }

		  //scroll up
		  for (int i = 24; i > 0; i--) 
		  {
		   driver.swipe(0, scrollEnd, 0, scrollStart, 2000);
		   //System.out.println("The counter value"+i);
		  }
	}
	
	public void scrollUpEnd1(AppiumDriver driver)
	{
		Dimension dimensions = driver.manage().window().getSize();

		Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height = 96;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i < height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		  }

		  //scroll up
		  for (int i = 22; i > 0; i--) 
		  {
		   driver.swipe(0, scrollEnd, 0, scrollStart, 2000);
		   //System.out.println("The counter value"+i);
		  }
	}
	public void scrollUpEnd2(AppiumDriver driver)
	{
		Dimension dimensions = driver.manage().window().getSize();

		Double screenHeightStart = dimensions.getHeight() * 0.7;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height = 8;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i < height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		  }

		  //scroll up
		  for (int i = 20; i > 0; i--) 
		  {
		   driver.swipe(0, scrollEnd, 0, scrollStart, 2000);
		   //System.out.println("The counter value"+i);
		  }
	}
		
	public Boolean waitTillElementVisible(AppiumDriver driver, WebElement elem)
	{
		WebDriverWait waitObj = new WebDriverWait(driver, 10);
		waitObj.until(ExpectedConditions.visibilityOf(elem));
		if(elem.isDisplayed())
			return true;
		else return false;		
	}
	
	public Boolean genericShareGmailClick(AppiumDriver driver, String shareName)
	{
		List <WebElement> shareItems = driver.findElements(By.id(ID_ICN_SHARE));
		int flag = 0;

		for(int i = 0; i <shareItems.size(); i++)
		{
			if(shareName.equals(shareItems.get(i).getText()) && (shareName.equals(data.GMAIL)))
			{
				elemClick(shareItems.get(i));
				enterEmailAndClickSend(driver);
				flag=1;				
			}	
			else if(shareName.equals(shareItems.get(i).getText()) && (shareName.equals(data.COPYTOCLIPBOARD)))
			{
				elemClick(shareItems.get(i));
				enterEmailAndClickSend(driver);
				flag=1;				
			}
			if(flag==1) break;
		}
		if(flag==1) return true;
		else return false;		
	}
	
	public void enterEmailAndClickSend(AppiumDriver driver)
	{
		txtEmailID = driver.findElement(By.id(ID_TXT_EMAILID));
		elemEnterData(txtEmailID, test_data.EMAILID);
		//txtEmailID.sendKeys(test_data.EMAILID);
		btnSend = driver.findElement(By.id(ID_ICN_EMAILSEND));
		elemClick(btnSend);
	
	}
	
	public Boolean playLastVideo(AppiumDriver driver, List <WebElement> elem)
	{
		int videotobePlayed = 0;
		if(null != elem){
			videotobePlayed = elem.size() - 1;	
		}
		
		if(videotobePlayed >= 0 && elem.get(videotobePlayed).isDisplayed()) 
		{
			elemClick(elem.get(videotobePlayed));
			return true;
		}
		else return false;
	}
	
	public void swipeAction(AppiumDriver driver)
	 {
	  int startx = driver.findElement(By.id("com.comcast.watchablephone:id/imageViewdiscover")).getLocation().getX();
	  int starty = driver.findElement(By.id("com.comcast.watchablephone:id/imageViewdiscover")).getLocation().getY();
	  int endx = driver.findElement(By.id("com.comcast.watchablephone:id/textViewdiscover")).getLocation().getX();
	  int endy = driver.findElement(By.id("com.comcast.watchablephone:id/textViewdiscover")).getLocation().getY();
	  System.out.println(startx + " ::::::: " + starty + " ::::::: " + endx +  " ::::::: " + endy);
	 
	  driver.swipe(startx, starty, endx, endy, 3000);
	 }
	
	public void wifiDisable(AppiumDriver driver)
	{
		/*final NetworkConnectionSetting WIFI;
	//	NetworkConnectionSetting ntwkConn = driver.setNetworkConnection(WIFI);
		Boolean status = ntwkConn.wifiEnabled();
		System.out.println(status);
		ntwkConn.setWifi(false);
		status = ntwkConn.wifiEnabled();
		System.out.println(status);*/
	}
	

	public void scrollUpEnd121(AppiumDriver driver)
	{
		Dimension dimensions = driver.manage().window().getSize();

		Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();

		  double height = dimensions.getHeight();
		  height = 12;// fixed height to minimize the scroll duration

		  //scrol down
		  for (int i = 0; i < height; i++) {
		   driver.swipe(0, scrollStart, 0, scrollEnd, 2000);
		   //System.out.println("The counter value"+i);
		  }

		  //scroll up
		  for (int i = 22; i > 0; i--) 
		  {
		   driver.swipe(0, scrollEnd, 0, scrollStart, 2000);
		   //System.out.println("The counter value"+i);
		  }
	}
	
	public void swipeActionVideo(AppiumDriver driver)
	 {
	  int startx = driver.findElement(By.id("com.comcast.watchablephone:id/TextView_genreTextId")).getLocation().getX();
	  int starty = driver.findElement(By.id("com.comcast.watchablephone:id/TextView_genreTextId")).getLocation().getY();
	  int endx = driver.findElement(By.id("com.comcast.watchablephone:id/ImageView_playListPublisherLogoId")).getLocation().getX();
	  int endy = driver.findElement(By.id("com.comcast.watchablephone:id/ImageView_playListPublisherLogoId")).getLocation().getY();
	  System.out.println(startx + " ::::::: " + starty + " ::::::: " + endx +  " ::::::: " + endy);
	 
	  driver.swipe(startx, starty, endx, endy, 3000);
	 }
	
	
	
	
}
