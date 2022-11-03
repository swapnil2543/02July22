package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ClickOnMessangerLink;
import pages.RoomsTab;

public class VerifyRoomsTab {
	
	private WebDriver driver;
	private ClickOnMessangerLink clickOnMessangerLink;
	private RoomsTab roomsTab;
	
	
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("before class");
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Library\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();//launch the chrome browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void OpenRoomsPage() 
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
		clickOnMessangerLink = new ClickOnMessangerLink(driver);
		clickOnMessangerLink.clickOnMessengerLink();
		roomsTab = new RoomsTab(driver);
	}
	
	@Test
	public void verifyReturnToMessengerButton()
	{
		System.out.println("test1");
		roomsTab.clickOnRoomsTab();
		roomsTab.clickOnReturnToMessabgerButton();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		Assert.assertEquals(url, "https://www.messenger.com/");
		
	}
	@Test
	public void verifyVisitOurHelpCenterButton()
	{
		System.out.println("test2");
		roomsTab.clickOnRoomsTab();
		roomsTab.clickOnVisitOurHelpCenterButton();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.messenger.com/help");
	}
	
	@AfterMethod
	public void logOutFromApplication()
	{
		System.out.println("after method");
		System.out.println("logout");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("after class");
		driver.close();
	}
}
