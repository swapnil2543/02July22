package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import module.SignUpPopup;

public class VerifySignUpButton {
	
	private WebDriver driver;
	private SignUpPopup signUp;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("before class");
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();//launch the chrome browser
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void openFacebookLoginPage()
	{
		driver.get("https://www.facebook.com/");
		signUp = new SignUpPopup(driver);
		signUp.clickOnCreateNewAccountButton();
			
	}
	
	@Test
	
	public void fillPersonalData()
	{
		signUp.enterFirstName();
		signUp.enterLastName();
		signUp.enterMobNo();
		signUp.enterNewPassword();
		signUp.selectDateFromDropDown();
		signUp.selectMonthFromDropDown();
		signUp.selectYearFromDropDown();
		signUp.clickOnMaleRadioButton();
		signUp.clickOnSignUpButton();
		String alert = signUp.handleErrorPopupMsg();
		System.out.println(alert);
		Assert.assertEquals(alert, "Please choose a more secure password. It should be longer than 6 characters, unique to you and difficult for others to guess.");
		
	}
	
@Test
	
	public void fillPersonalData1()
	{
		signUp.enterFirstName();
		signUp.enterLastName();
		signUp.enterMobNo();
		signUp.enterNewPassword();
		signUp.selectDateFromDropDown();
		signUp.selectMonthFromDropDown();
		signUp.selectYearFromDropDown();
		signUp.clickOnCustomRadioButton();
		String str = signUp.selectPronounFromDropDown();
		signUp.clickOnSignUpButton();
		Assert.assertEquals(str, "Select your pronoun");
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();	
	}
	
	
	
	
}
