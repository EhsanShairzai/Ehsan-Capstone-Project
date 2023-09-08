package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	
	// We will create one constructor and by using the initElement method from PageFactory class we will
	// initialize out page objects in this class.
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// we will use the @FindBy annotation from selenium to find elements instead of 
	// findElement() or findElements() method
//	@FindBy(linkText = "TEKSCHOOL")
//	public WebElement signIn;

	// Login
	@FindBy(xpath = "//*[contains(text(),'TEKSCHOOL')]")
	public WebElement tekschoolLogo;
	
	@FindBy(linkText = "Sign in")
	public WebElement signInLink;
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBttn;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutBttn;
	
	// creatAccount
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBttn;
	
	@FindBy(id = "nameInput")
	public WebElement nameInputField;
	
	@FindBy(id = "emailInput")
	public WebElement emailInputField;
	
	@FindBy(id = "passwordInput")
	public WebElement passwordInputField;
	
	@FindBy( id = "confirmPasswordInput")
	public WebElement confirmPassInputField;
	
	@FindBy(id = "signupBtn")
	public WebElement signupBttn;
	
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement yourProfileText;
	
}
