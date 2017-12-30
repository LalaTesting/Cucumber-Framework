package comcast.common.asserts.pageAssertions;

import static comcast.util.PropertyFileReader.ObjRepoProp;
//import static comcast.util.PropertyFileReader.TextProp;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import comcast.custom.CustomFun;

public class HomePageAssertions {

	// For logging
	public static Logger log = Logger.getLogger(HomePageAssertions.class);

	public static void verifySuccessfulLogin(WebDriver driver) throws Exception {

		// Verify Successful Login

		Assert.assertTrue(CustomFun.isElementPresent(By.xpath(ObjRepoProp.getProperty("homePageLoginName_XPATH")),driver), "Failed to login to watchable application.");

		log.info("User successfully login to application and the logged in user name displayed is "+ driver.findElement(By.xpath(ObjRepoProp.getProperty("homePageLoginName_XPATH"))).getText() + " \n");
		
		Reporter.log("<p>User successfully login to application and the logged in user name displayed is "+ driver.findElement(By.xpath(ObjRepoProp.getProperty("homePageLoginName_XPATH"))).getText());

	}

}
