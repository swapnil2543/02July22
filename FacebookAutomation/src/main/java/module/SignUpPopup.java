package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPopup {
	
	private Select sc;
	//variables- WebElement
	
		@FindBy (xpath ="//a[text()='Create New Account']")
		private WebElement createNewAccount;
		
		@FindBy (xpath ="//input[@name='firstname']")
		private WebElement firstName;
		
		@FindBy (xpath ="//input[@name='lastname']")
		private WebElement lastName;
		
		@FindBy (xpath ="//input[@name='reg_email__']")
		private WebElement mobNo;
		
		@FindBy (xpath ="//input[@name='reg_passwd__']")
		private WebElement newPassword;
		
		@FindBy (xpath ="//select[@title='Day']")
		private WebElement day;
		
		@FindBy (xpath ="//select[@id='month']")
		private WebElement month;
		
		@FindBy (xpath ="//select[@title='Year']")
		private WebElement year;
		
		@FindBy (xpath ="//label[text()='Female']")
		private WebElement female;
		
		@FindBy (xpath ="(//input[@type='radio'])[2]")
		private WebElement male;
		
		@FindBy (xpath ="//label[text()='Custom']")
		private WebElement custom;
		
		@FindBy (xpath ="//select[@aria-label='Select your pronoun']")
		private WebElement pronoun;
		
		@FindBy (xpath ="//input[@name='custom_gender']")
		private WebElement optional;
		
		@FindBy (xpath ="//button[@name='websubmit']")
		private WebElement signUpButton;
		
		@FindBy (xpath ="//div[contains(text(),'Please choose a more secure password')]")
		private WebElement errorMsg;
		
		
		
		//constructor - initialization
		
		public SignUpPopup(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// Methods - Actions on webelement
		
		public void clickOnCreateNewAccountButton()
		{
			createNewAccount.click();
		}
		public void enterFirstName()
		{
			firstName.sendKeys("Swap");
		}
		
		public void enterLastName()
		{
			lastName.sendKeys("Purti");
		}
		
		public void enterMobNo()
		{
			mobNo.sendKeys("8830000000");;
		}
		public void enterNewPassword()
		{
			newPassword.sendKeys("1234567");;
		}
		
		public void selectDateFromDropDown()
		{
			Select sc = new Select(day);
			sc.selectByIndex(8);
		}
		
		
		public void selectMonthFromDropDown()
		{
			 sc = new Select(month);
			//sc.selectByValue("May");
			sc.selectByIndex(4);
		}
		
		public void selectYearFromDropDown()
		{
			 sc = new Select(year);
			sc.selectByVisibleText("1991");
		}
		
		public void clickOnFemaleRadioButton()
		{
			female.click();
		}
		
		public void clickOnMaleRadioButton()
		{
			male.click();
		}
		
		public void clickOnCustomRadioButton()
		{
			custom.click();
		}
		
		public String selectPronounFromDropDown()
		{
			 sc = new Select(pronoun);
			sc.selectByIndex(1);
			String txt = pronoun.getText();
			return txt;
			
		}
		
		public void optionalGender()
		{
			optional.sendKeys("Male");
		}
		
		
		public void clickOnSignUpButton()
		{
			signUpButton.click();
		}
		
		public String handleErrorPopupMsg()
		{
			String str = errorMsg.getText();
			//System.out.println(str);
			return str;
			
		}
		/*//Group by actions
		
		public void loginToApplication()
		{
			username.sendKeys("swapnil@gmail.com");
			password.sendKeys("12345");
			loginButton.click();
		}*/
		

}
