package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	// here we are create out webelement and use anotation @FindBy to locate
	@FindBy(xpath = "//a[@id='accountLink']")
	WebElement accountOption;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	WebElement nameInput;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	WebElement personalUpdateBtn;
	
	@FindBy(xpath = "//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	WebElement addPaymentLink;
	
	//here er are creating atomatic method to click on input fields
	public void cardNumber(String cardNumber) {
		accountOption.sendKeys(cardNumber);
	}
	public void nameOnTheCard(String nameOnTheCard) {
		accountOption.sendKeys(nameOnTheCard);
	}
	public void expirationMonth(String expirationMonth) {
		accountOption.sendKeys(expirationMonth);
	}
	public void expirationYear(String expirationYear) {
		accountOption.sendKeys(expirationYear);
	}
	public void cvv (String cvv) {
		accountOption.sendKeys(cvv);
	}
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	WebElement payemntSubmitBtn;
	
	// edit button
	@FindBy(xpath = "//button[normalize-space()='Edit']")
	WebElement editBtn;
	
	// remove Card
	@FindBy(xpath = "//button[normalize-space()='remove']")
	WebElement removeCard;
	
	// add Address
	@FindBy(xpath = "//p[normalize-space()='Add Address']")
	WebElement addAddress;
	
	public void country (String country) {
		accountOption.sendKeys(country);
	}
	public void fullName (String fullName) {
		accountOption.sendKeys(fullName);
	}
	public void phoneNumber (String phoneNumber) {
		accountOption.sendKeys(phoneNumber);
	}
	public void streetAddress (String streetAddress) {
		accountOption.sendKeys(streetAddress);
	}
	public void apt (String apt) {
		accountOption.sendKeys(apt);
	}
	public void city (String city) {
		accountOption.sendKeys(city);
	}
	public void state (String state) {
		accountOption.sendKeys(state);
	}
	public void cvv1 (String cvv) {
		accountOption.sendKeys(cvv);
	}
	@FindBy(xpath = "//div[text()'Address Added Successfuly'")
	WebElement addressSuccessMssg;
	
	// edit address
	@FindBy(xpath = "//button[normalize-space()='Edit']")
	WebElement edit;
	
	// address removing
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeaddressBtn;
	
	@FindBy(xpath = "//div.account_address-single")
	public WebElement addressBar;
}
