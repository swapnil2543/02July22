package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomsTab {
	
	@FindBy (xpath ="//a[text()='Rooms']")
	private WebElement roomsTab;
	
	@FindBy (xpath ="//a[text()=' Return to messenger.com ']")
	private WebElement returnToMessanger;
	
	@FindBy (xpath ="//a[text()=' Visit our help center ']")
	private WebElement visitOurHelpCenter;
	
	
	public RoomsTab(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnRoomsTab()
	{
		roomsTab.click();
	}
	
	public void clickOnReturnToMessabgerButton()
	{
		returnToMessanger.click();
	}
	
	public void clickOnVisitOurHelpCenterButton()
	{
		visitOurHelpCenter.click();
	}
	

}
