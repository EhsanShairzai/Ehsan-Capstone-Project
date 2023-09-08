package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class SignInSteps extends CommonUtility {

	// we will create object of POMFactory class to access the object in page object classes 
	// using the get method we create in the POMFactoty class.
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website homepage")
	public void userIsOnRetailWebsiteHomepage() {
	   // Verifing if tekschool logo is displayed
		Assert.assertTrue(factory.signInPage().tekschoolLogo.isDisplayed());
		logger.info("TEKSCHOOL logo is displayed");
	}

	@When("User click on Sign in link")
	public void userClickOnSignInLink() {
		click(factory.signInPage().signInLink);
		logger.info("Login link was clicked successfully");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email ,String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("Email and password were entered successfully");
	
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginBttn);
		logger.info("Login button was clicked successfully");

	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(factory.signInPage().logoutBttn.isDisplayed());
		logger.info("User is logged in successfully");

	}
	// create Account
	@When("User click on create new account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccountBttn);
		logger.info("New Account Button is clicked");
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> signUpData = dataTable.asMaps(String.class, String.class);
		
		// fill the signUp info with data from dataTable
		sendText(factory.signInPage().nameInputField, signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInputField, signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInputField, signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPassInputField, signUpData.get(0).get("confirmPassword"));
		logger.info("SignUp information is entered successfully");
	}
	@Then("USer click on signUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signupBttn);
		logger.info("SignUp button is clicked successfully");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountpage() {
		Assert.assertTrue(factory.signInPage().yourProfileText.isDisplayed());
		logger.info("Your account is created successfully");
		
	}
}
