
package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import Pages.GenericPage;
import Pages.GenreDetailsPage;
import Pages.GenrePage;
import Pages.GuestUserPage;
import Pages.HistoryPage;
import Pages.LoginPage;
import Pages.MyShowsPage;
import Pages.PlayerPage;
import Pages.PlaylistDetailsPage;
import Pages.PlaylistPage;
import Pages.ProviderPage;
import Pages.SearchPage;
import Pages.SettingPage;
import Pages.ShowDetailsPage;
import Pages.SignUpPage;
import Pages.SliderPage;
import Pages.WelcomePage;


public class BaseTest{
       
 public AppiumDriver driver;
 
 protected PlaylistPage playList;
 protected PlaylistDetailsPage playListDetail;
 protected PlayerPage player;
 protected WelcomePage welcome;
 protected SignUpPage signUp;
 protected LoginPage login;
 protected GenrePage genre;
 protected SettingPage setting;
 protected SliderPage slider; 
 protected ShowDetailsPage showDetails;
 protected GenreDetailsPage genreDetails;
 protected MyShowsPage myShows;
 protected SearchPage search;
 protected ProviderPage provider;
 protected GuestUserPage guestuser;
 protected HistoryPage history;
 //protected GenericPage genericpage;
 protected GenericPage genericpage;
   
 @BeforeMethod
 public void setUp() throws Exception
 {
  
  //File app = new File("D:/android_file", "app-release.apk");
	 
 File app = new File("D:/android_file", "app-debug.apk");//D:\android_file\app-debug.apk//D:\android apk\app-debug-automation.apk
  DesiredCapabilities capabilities = new DesiredCapabilities();
      
 //  capabilities.setCapability("deviceName", "ZY2227VCF3");//ZY2227VCF3//
  
   capabilities.setCapability("deviceName", "03157df34047d60d");
   
   //  capabilities.setCapability("deviceName", "emulator-5554   device");
   
  //capabilities.setCapability("deviceName", "32041f73562e21d9");
   
     // capabilities.setCapability("deviceName", "emulator-5554");
   
  //capabilities.setCapability("deviceName", "samsung-sm_g900h-4d007fd64c1f4179");
   
  //capabilities.setCapability("deviceName", "samsung-sm_g920i-03157df34047d60d");
   
  //capabilities.setCapability("deviceName", "3a22802");
  
  
      capabilities.setCapability("platformVersion", "5.0");
      
      capabilities.setCapability("platformName", "Android");
      
      capabilities.setCapability("app", app.getAbsolutePath());
      
      capabilities.setCapability("appPackage", "com.comcast.watchablephone");
      
      //capabilities.setCapability("appActivity", ".activity.WelcomeScreenActivity");
      
      //capabilities.setCapability("appWaitActivity", ".activity.WelcomeScreenActivity");
      
      capabilities.setCapability("appActivity", ".activity.Splash");
      
      
      capabilities.setCapability("appWaitActivity", ".activity.Splash");
      
      
    //  driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
     driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
     
     driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
     
     playList = new PlaylistPage(driver);
     
     playListDetail = new PlaylistDetailsPage(driver);
     
     player = new PlayerPage(driver);
     
     welcome = new WelcomePage(driver);
     signUp = new SignUpPage(driver);
     login = new LoginPage(driver);
     genre = new GenrePage(driver);
     setting = new SettingPage(driver);
     slider = new SliderPage(driver);
     showDetails = new ShowDetailsPage(driver);
     genreDetails = new GenreDetailsPage(driver);
     myShows = new MyShowsPage(driver);
     search = new SearchPage(driver);  
     provider = new ProviderPage(driver);
     guestuser = new GuestUserPage(driver);
     history= new HistoryPage(driver);
     //genericpage= new GenericPage(driver);
     genericpage= new GenericPage(driver);
   
 }
  
    
   /* @AfterMethod
    public void tearDown() throws Exception
    {
     driver.close();
    }*/

}