package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount {
	
	@FindBy (xpath = "//a[text()='Create New Account']")
	private WebElement createNewAccount;
	
	public CreateNewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateNewAccountButton()
	{
		createNewAccount.click();
	}

}
