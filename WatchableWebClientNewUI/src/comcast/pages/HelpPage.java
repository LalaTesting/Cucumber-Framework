package comcast.pages;

import static comcast.util.PropertyFileReader.ObjRepoProp;
//import static comcast.util.PropertyFileReader.TextProp;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import comcast.custom.CustomFun;
//import comcast.uiFunctions.GUIFunctions;

public class HelpPage {

	private final WebDriver driver;
	// For logging
	public Logger log = Logger.getLogger(this.getClass().getName());
	
	// Play lists Constructor
	public HelpPage(WebDriver driver) {
		
		this.driver = driver;
		
		// Check that we're on the right in Help Page.

		if (!(CustomFun
				.isElementPresent(
						By.xpath(ObjRepoProp.getProperty("helpPageType_XPATH")),
						driver))) {

			throw new IllegalStateException("This is not the Web clint Help page");
		}
	}

	
}
