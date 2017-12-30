package comcast.custom;



import static comcast.util.PropertyFileReader.ObjRepoProp;

import java.io.File;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomFun {

	

	public static Logger log = Logger.getLogger(CustomFun.class.getName());

	

	/**
	 * Method Name: isElementPresent Description:Method to verify the Element
	 * 
	 * @param by
	 *            :Element locator
	 * @param driver
	 *            :WebDriver
	 * @return true: if element is present, false: if element is not present
	 */
	public static boolean isElementPresent(By by, WebDriver driver) {
		try 
		{
			driver.findElement(by);
			
			return true;
			
		} 
		catch (NoSuchElementException e) 
		{
			return false;
		}
	}

	/**
	 * Method Name: getRootDir Description: Method to get Root directory
	 * 
	 * @return :rootDir
	 */
	public static String getRootDir()
	{
		File path = new File("");
		
		String absPath = path.getAbsolutePath();
		
		File dir = new File(absPath);
		
		String rootDir = dir.getParent();
		
		return rootDir;

		// return absPath;
	}

	/**
	 * Method Name: refreshPage Description: Method to used refresh a page after
	 * doing some action (if required page refresh)
	 * 
	 * @param driver
	 *            :WebDriver
	 * @return driver
	 * @throws Exception 
	 */
	public static WebDriver refreshPage(WebDriver driver) throws Exception
	{

		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		return (driver);
	}

	/**
	 * Method Name: switchToNewWindow Description: This function switches the
	 * browser control to new window and verifies title
	 * 
	 * @param driver
	 *            : WebDriver
	 * @param pageTitle
	 *            : title of the page
	 * @return newWindow(driver)
	 */
	public static WebDriver switchToNewWindow(WebDriver driver, String pageTitle)
	
	{

		WebDriver newWindow = null;
		
		Set<String> windowIterator = driver.getWindowHandles();
		
		System.err.println("No of windows :  " + windowIterator.size());
		
		for (String s : windowIterator) 
		{
			String windowHandle = s;
			
			newWindow = driver.switchTo().window(windowHandle);
			
			System.out.println("Window Title : " + newWindow.getTitle());
			
			System.out.println("Window Url : " + newWindow.getCurrentUrl());
			
			if (newWindow.getTitle().equals(pageTitle))
			{
				System.out.println("Selected Window Title : "+ newWindow.getTitle());
				
				return newWindow;
			}

		}
		System.out.println("Window Title :" + newWindow.getTitle());
		
		System.out.println();
		
		return newWindow;
	}
	
	/**
	 * This function switches back the handle to parent window.
	 * 
	 * @param driver
	 * @param winHandleBefore
	 */
	public static void switchBackToParentWindow(WebDriver driver, String winHandleBefore) {

		try {
			//Close opened browser
			driver.close();
			
			//Switch back to parent window 
			driver.switchTo().window(winHandleBefore);
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	

	/**
	 * Method Name: isElementHighlighted Description: This function verifies
	 * whether the element is highlighted or not on rollover/mouseOver of the
	 * element based on the action specified
	 * 
	 * @param driver
	 *            : WebDriver instance
	 * 
	 * @param WebElement
	 *            : WebElement that needs to rollover or click to check element
	 *            is highlighted or not
	 * 
	 * @param isHighlight
	 *            : If true checks element is highlighted If false checks
	 *            element is not highlighted
	 * 
	 * @param action
	 *            : "rollOver" : mousehover / roll overs on specified element
	 *            "click" : clicks on specified element
	 * 
	 * @param eleName
	 *            : Name of the element
	 * 
	 * @param prop
	 *            : property of the element
	 * 
	 * @throws Exception
	 *             ,ElementNotHiglightedException, ElementHiglightedException
	 * 
	 */
	

	/**
	 * Method Name: waitObjectToLoad Description: This function waits until the
	 * specific element to load
	 * 
	 * @param driver
	 *            : WebDriver instance
	 * @param by
	 *            :Element locator
	 * @param timeSec
	 *            :time in seconds
	 */
	public static void waitObjectToLoad(WebDriver driver, By by, int timeSec) {

		WebDriverWait wait = new WebDriverWait(driver, timeSec);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	/**
	 * Method Name: mouseOverElement Description: This method used to scroll to
	 * an element which not visible in the screen
	 * 
	 * @param driver
	 *            : WebDriver
	 * @param ele
	 *            : WebElement locator
	 * */
	public static void mouseOverElement(WebDriver driver, WebElement ele)
			throws Exception {
		try {

			// Mouse hover/roll over on element
			//Thread.sleep(3000);
			Actions builder = new Actions(driver);
			builder.moveToElement(ele).build().perform();
			//Thread.sleep(5000);

		} catch (NoSuchElementException e) {
			log.error("Element to mouse over is not present " + e);

		}

	}
	
	
	/**
	 * MethodName: isElementClickable Description: To check whether element is
	 * clickable or not
	 * 
	 * @param ele
	 *            : WebElement
	 * @param eleName
	 *            : Element for which Clickable need to be checked
	 * 
	 * 
	 * @return Boolean value
	 * 
	 * 
	 */
	public static boolean isElementClickable(WebElement ele, String eleName,
			boolean match) throws Exception {

		String eleCursor = ele.getCssValue("cursor");
		log.info(eleCursor);

		//match = false;

		// Check element is not clickable
		// if (eleCursor.equals("auto") || eleCursor.equals("text")) {
		//if (eleCursor.equals("auto") || eleCursor.equals("text")) {
		if (eleCursor.equals("text")) {

			// If not clickable, log success message
			log.info(eleName + " is not clickable");
			match = false;

		}
		
		else if (eleCursor.equals("auto")) {

			// If not clickable, log success message
			log.info(eleName + " is not clickable");
			match = false;

		}
		// Check element is clickable
		//else if (eleCursor.equals("pointer")) {
		else {
			// if element is clickable, log error message
			log.info(eleName + " is clickable");
			match = true;
		}

		return match;
	}
	
	
	/**
	 * This Method mouse over video player and verifies videos control is displayed
	 * home page
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void mouseOverVideoPlayer(WebDriver driver) throws Exception {

		// Mouse over video player

				CustomFun
						.mouseOverElement(
								driver,
								driver.findElement(By.id(ObjRepoProp
										.getProperty("videoPlayer_ID"))));
				
				driver.findElement(By.id(ObjRepoProp
						.getProperty("videoPlayer_ID"))).click();
				
				driver.findElement(By.id(ObjRepoProp
						.getProperty("videoPlayer_ID"))).click();
				
				Thread.sleep(2500);

				
	}
	
	/**
	 * This method for scrolling a page
	 */
	public static void scrollDownForAPage(WebDriver driver) throws Exception
	{
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
		
		Thread.sleep(1000);
	}
	
	
	
	/**
	 * Method Name: scrollDownFromTopOfPage
	 * Description: Method to used Scroll down from top of the page make top menu items visible
	 * @param driver :WebDriver
	 * @return driver
	 * @throws Exception 
	 */
	public static WebDriver scrollDownFromTopOfPage(WebDriver driver) throws Exception {

		//Scroll down to make top menu items visible
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		return (driver);
	}


}
	
	

