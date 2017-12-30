import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public AppiumDriver driver;
	
	
    public static void main( String[] args )
    {
    	DesiredCapabilities capbility= new DesiredCapabilities();
    	
    	
       AndroidDriver driver= new AndroidDriver(capbility);
       
       driver.swipe(startx, starty, endx, endy, duration);
       
       
        
    }
}
