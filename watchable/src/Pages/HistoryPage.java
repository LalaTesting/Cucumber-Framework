package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import Utils.ApplicationData;
import Utils.AssertMsgs;
import Utils.GenericFunctions;
import Utils.UIElements;

public class HistoryPage extends UIElements {

	
	AppiumDriver driver;
	ApplicationData data = new ApplicationData();
	AssertMsgs assertMsg = new AssertMsgs();
	GenericFunctions genFunc = new GenericFunctions(driver);
	
	
	WebElement lblHistory,slidHistory,buldelbut,vidicon,ShoLogo,VidDesc,ClearText,SngBut;
	WebElement UnDo,multioption,PlayListButton,icnPlay,ad_icon,next_vid,BackButton;
	public HistoryPage(AppiumDriver driver)
	{
		this.driver = driver;		
	}
	public Boolean titleHistoryExists()
	{
		lblHistory= driver.findElement(By.xpath(XPATH_LBL_HISTORY));
		if(lblHistory.isDisplayed() && lblHistory.getText().equals(data.HISTORY))
			return true;
		else return false;
	}
	
	

	
		public boolean titleHistoryTappable()
		{
			
			lblHistory= driver.findElement(By.xpath(XPATH_LBL_HISTORY));
			if(lblHistory.isDisplayed() && lblHistory.getText().equals(data.HISTORY))
			{
				
				genFunc.elemClick(lblHistory);
				
				return true;
			}
			
			else return false;
		}
	
		public boolean bulkDeleteExists()
		{
			
			buldelbut = driver.findElement(By.id(ID_BTN_BULKDELETE));
			if(buldelbut.isDisplayed())
			{
					return true;
			}
			
			else return false;
		}
			
		public boolean VideoIcoExists()
		{
			
			vidicon = driver.findElement(By.id(ID_VOD_IMG));
			if(vidicon.isDisplayed())
			{
					return true;
			}
			
			else return false;
		}
		
		public boolean ShoLogoExists()
		{
			
			ShoLogo = driver.findElement(By.id(SH_LOGO));
			if(ShoLogo.isDisplayed())
			{
					return true;
			}
			
			else return false;
		}
		
		public boolean VideoDescexists()
		{
			
			VidDesc = driver.findElement(By.id(VOD_DESC));
			if(VidDesc.isDisplayed())
			{
					return true;
			}
			
			else return false;
		}
		
		
		public boolean historyTxtExists()
		{
			
			lblHistory= driver.findElement(By.xpath(XPATH_LBL_HISTORY));
			if(lblHistory.isDisplayed()&& lblHistory.getText().equals(data.HISTORY))
			{
					return true;
			}
			
			else return false;
		}
		
		public boolean historyDeleteTappable()
		{
			
			buldelbut= driver.findElement(By.id(ID_BTN_BULKDELETE));
			if(buldelbut.isDisplayed())
			{
				
				genFunc.elemClick(buldelbut);
				
				return true;
			}
			
			else return false;
		}
		
		
		
		public boolean ViewClearTextExists()
		{
			
			ClearText = driver.findElement(By.id(CLEARTEXT));
			if(ClearText.isDisplayed())
			{
					return true;
			}
			
			else return false;
		}
		
		
		public boolean NoClearTextExists()
		{
			return false;
			
		}
		
		public boolean ClearTextTappable()
		{
			
			ClearText = driver.findElement(By.id(CLEARTEXT));
			if(ClearText.isDisplayed())
			{
				genFunc.elemClick(ClearText);
					return true;
			}
			
			else return false;
		}
		
		
		public boolean historyDoneTappable()
		{
			
			buldelbut= driver.findElement(By.id(ID_BTN_BULKDELETE));
			if(buldelbut.isDisplayed())
			{
				
				genFunc.elemClick(buldelbut);
				
				return true;
			}
			
			else return false;
		}
		
		
		public void scrollRightToLeft()
		{
			driver.swipe(900, 400, 10, 400, 5000);
		}
		
		

		public boolean SngDeleteBtnExists()
		{
			
			SngBut = driver.findElement(By.id(ID_SINGLE_DELETE));
			if(SngBut.isDisplayed())
			{
					return true;
			}
			
			else return false;
		}
		
		
		public boolean SngDeleteTappable()
		{
			
			SngBut= driver.findElement(By.id(ID_SINGLE_DELETE));
			if(SngBut.isDisplayed())
			{
				
				genFunc.elemClick(SngBut);
				
				return true;
			}
			
			else return false;
		}
		
		public boolean VideoDesnotcexists()
		{
			
			
					return false;
			
		}
		public boolean Undo_Tappable()
		{
			
			UnDo = driver.findElement(By.id(ID_UNDO));
			if(UnDo.isDisplayed())
			{
				
				genFunc.elemClick(UnDo);
				
				return true;
			}
			
			else return false;
		}
		
		public boolean MultiOp_Tappable()
		{
			
			multioption = driver.findElement(By.xpath(XPATH_MULTI_BUTTON));
			if(multioption.isDisplayed())
			{
				
				genFunc.elemClick(multioption);
				
				return true;
			}
			
			else return false;
		}
		
		public boolean PlayList_Tapable()
		{
			
			PlayListButton = driver.findElement(By.xpath(XPATH_LBL_PLAYLIST));
			if(PlayListButton.isDisplayed())
			{
				
				genFunc.elemClick(PlayListButton);
				
				return true;
			}
			
			else return false;
		}
		
		public Boolean icnPlay_Tapable()
		{
			icnPlay = driver.findElement(By.id(ID_ICN_PLAY_PLAYLISTDETAIL));
			if(icnPlay.isDisplayed())
			{
				genFunc.elemClick(icnPlay);
				return true;
			}
			else return false;
		}
		
		public Boolean Ad_IconExists()
		{
			//ad_icon = driver.findElement(By.id(AD_ICON));
			next_vid = driver.findElement(By.id(ID_NEXT_VIDE));
			if(next_vid.isDisplayed())
			{
				
					genFunc.elemClick(next_vid);
					
					return true;
			}
			else return false;
			
		}
		
		public boolean ShoLogoTapable()
		{
			
			ShoLogo = driver.findElement(By.id(SH_LOGO));
			if(ShoLogo.isDisplayed())
			{		
					genFunc.elemClick(ShoLogo);
					return true;
			}
			
			else return false;
		}
			
		public boolean BackTappable()
		{
			
			BackButton = driver.findElement(By.id(ID_ICN_BACK_PLAYLISTDETAIL));
			if(BackButton.isDisplayed())
			{		
					genFunc.elemClick(BackButton);
					return true;
			}
			
			else return false;
		}
}



