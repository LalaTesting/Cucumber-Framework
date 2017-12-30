package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class SearchPage extends UIElements{
	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);

	WebElement txtbxSearch, msgNoSearchResults, searchResultsShowsSection, searchResultsVideosSection, searchKeyInShows, searchKeyInVideos_ShowName,
	searchKeyInVideos_Desc, cancelSearch, clearSearch, searchKeyInVideos_Img,searchResultsVideosonly;
	
	public SearchPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}

	public Boolean enterSearchKey(String searchKey)
	{
		txtbxSearch = driver.findElement(By.id(ID_TXTBX_SEARCH));
		if(txtbxSearch.isDisplayed())
		{
			genFunc.elemEnterData(txtbxSearch, searchKey);
			return true;
		}
		else return false;
	}
	
	public Boolean getSearchResults()
	{
		List <WebElement> searchResults = driver.findElements(By.id(ID_SEARCHRESULTS));
		if(searchResults.size()==1)		
			return true;
		else return false;
	}
	
	public Boolean noSearchResults(String searchKey)
	{	
		String result = ""; 
		String str = new String(searchKey);
		for (String retval: str.split("&", 2)){
		   result = result.concat(retval);
		}
		System.out.println(result);
		
		msgNoSearchResults = driver.findElement(By.id(ID_NOSEARCHFOUND));
		if(msgNoSearchResults.isDisplayed() && msgNoSearchResults.getText().contains(data.NOSEARCHRESULTS) && 
				(msgNoSearchResults.getText().contains(searchKey) || msgNoSearchResults.getText().contains(result) ||  msgNoSearchResults.getText().contains("")))
			return true;
		else return false;
	}
	
	public Boolean cancelSearch()
	{
		cancelSearch = driver.findElement(By.id(ID_LNK_SEARCH_CANCEL));
		if(cancelSearch.isDisplayed())
		{
			genFunc.elemClick(cancelSearch);
			return true;
		}
		else return false;
	}
	
	public Boolean validSearchResults(String searchKey)
	{
		searchResultsShowsSection = driver.findElement(By.xpath(XPATH_SHOWS_SEARCHSECTION));
		searchResultsVideosSection = driver.findElement(By.xpath(XPATH_VIDEOS_SEARCHSECTION));
		if(searchResultsShowsSection.isDisplayed() && (searchResultsShowsSection.getText().equals(data.SEARCH_SHOWS) || searchResultsVideosSection.getText().equals(data.SEARCH_VIDEOS)))
		{			
			searchKeyInShows = driver.findElement(By.id(ID_SHOW_NAME_RESULT));
			searchKeyInVideos_ShowName = driver.findElement(By.id(ID_VIDEO_SHOWNAME_RESULT));
			searchKeyInVideos_Desc = driver.findElement(By.id(ID_VIDEO_DESCRESULT));
			searchKeyInVideos_Img = driver.findElement(By.id(ID_VIDEO_IMGRESULT));
			if((searchKeyInVideos_ShowName.isDisplayed() && searchKeyInVideos_Desc.isDisplayed() && searchKeyInVideos_Img.isDisplayed()) 
					&& (searchKeyInVideos_ShowName.getText().contains(searchKey) || searchKeyInVideos_Desc.getText().contains(searchKey)))				return true;
			else return false;
		}
		else return false;
	}
		
	public Boolean clearSearchClick()
	{
		clearSearch = driver.findElement(By.id(ID_LNK_SEARCH_CLEAR));
		if(clearSearch.isDisplayed())
		{
			genFunc.elemClick(clearSearch);
			return true;
		}
		else return false;
	}
	
	public void searchKeyClick()
	{
		driver.sendKeyEvent(84);
	}
	
	public void backKeyClick()
	{
		driver.sendKeyEvent(4);
	}
	
	public Boolean resultsInShowsClick(String searchKey)
	{
		searchResultsShowsSection = driver.findElement(By.xpath(XPATH_SHOWS_SEARCHSECTION));

		if(searchResultsShowsSection.isDisplayed() && searchResultsShowsSection.getText().equals(data.SEARCH_SHOWS))
		{			
			searchKeyInShows = driver.findElement(By.id(ID_SHOW_NAME_RESULT));			
			if(searchKeyInShows.isDisplayed() && searchKeyInShows.getText().contains(searchKey)) 
			{
				genFunc.elemClick(searchKeyInShows);
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public Boolean resultsInVideosClick(String searchKey)
	{
		
		searchResultsVideosSection = driver.findElement(By.xpath(XPATH_VIDEOS_SEARCHSECTION));
		if(searchResultsVideosSection.isDisplayed() && searchResultsVideosSection.getText().equals(data.SEARCH_VIDEOS))
		{			
			searchKeyInVideos_ShowName = driver.findElement(By.id(ID_VIDEO_SHOWNAME_RESULT));
			searchKeyInVideos_Desc = driver.findElement(By.id(ID_VIDEO_DESCRESULT));
			searchKeyInVideos_Img = driver.findElement(By.id(ID_VIDEO_IMGRESULT));
			if((searchKeyInVideos_ShowName.isDisplayed() && searchKeyInVideos_Desc.isDisplayed() && searchKeyInVideos_Img.isDisplayed()) 
				&& (searchKeyInVideos_ShowName.getText().contains(searchKey) || searchKeyInVideos_Desc.getText().contains(searchKey)))
			{
				genFunc.elemClick(searchKeyInVideos_Img);
				return true;
			}				
			else return false;
		}
		else return false;
	}
	
	public Boolean resultsInVideosSearchKeyNotFoundClick(String searchKey)
	{
		
		searchResultsVideosSection = driver.findElement(By.xpath(XPATH_VIDEOS_SEARCHSECTION));
		
		if(searchResultsVideosSection.isDisplayed())
		{			
			searchKeyInVideos_ShowName = driver.findElement(By.id(ID_VIDEO_SHOWNAME_RESULT));
			searchKeyInVideos_Desc = driver.findElement(By.id(ID_VIDEO_DESCRESULT));
			
			
			if(searchKeyInVideos_Desc.isDisplayed() || searchKeyInVideos_ShowName.isDisplayed())
			{
				genFunc.elemClick(searchKeyInVideos_Desc);
				return true;
			}				
			else return false;
		}
		else return false;
	}
	
	
}
