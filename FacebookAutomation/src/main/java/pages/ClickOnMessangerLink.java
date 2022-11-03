package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnMessangerLink {
	
	@FindBy (xpath ="//a[text()='Messenger']")
	private WebElement messanger;
	
	public ClickOnMessangerLink(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnMessengerLink()
	{
		messanger.click();
	}
	
}
