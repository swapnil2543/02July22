package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//variables- WebElement
	
	@FindBy (xpath ="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath ="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath ="//button[text()='Log in']")
	private WebElement loginButton;
	
	//constructor - initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Methods - Actions on webelement
	
	public void enterUserName()
	{
		username.sendKeys("swapnil@gmail.com");
	}
	
	public void enterPassword()
	{
		password.sendKeys("12345");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	//Group by actions
	
	public void loginToApplication()
	{
		username.sendKeys("swapnil@gmail.com");
		password.sendKeys("12345");
		loginButton.click();
	}
	

}
