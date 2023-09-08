package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	// @updatePI
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		System.out.println("User is on retail website");
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		System.out.println("User click on sign in option");
	}

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		System.out.println("user click on account option");
	}

	@When("User update Name 'Ehsan jan' and Phone '{int}'")
	public void userUpdatenameEhsanJanAndPhone(Integer int1) {
		System.out.println("User update name and Phone ");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		System.out.println("user click on update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		System.out.println("User profile info should be updated");
	}
	// add payment Method

	@When("User click on add a payment method link")
	public void userClickOnAddAPaymentmethodLink() {
		System.out.println("User click on add a payment method link");
	}

	@When("User fill Debit or Credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		System.out.println("User fill Debit or Credit card information");
		List<Map<String, String>> accountData = dataTable.asMaps(String.class, String.class);
		String cardNumber = accountData.get(0).get("cardNumher");
		String nameOnTheCard = accountData.get(0).get("nameOnTheCard");
		String expirationMonth = accountData.get(0).get("expirationMonth");
		String expirationYear = accountData.get(0).get("expirationYear");
		String cvv = accountData.get(0).get("cvv");
		System.out.println("Card Number: " + cardNumber + ", Name on the card: " + nameOnTheCard + ", Expiration Date: "
				+ expirationMonth + "/" + expirationYear + ", cvv: " + cvv);
	}

	@When("User click on add your card button")
	public void userClickOnAddYourCardButton() {
		System.out.println("User click on submitBtn");
	}

	@Then("A message should be displayed 'payment method added successfully'")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfuly() {
		System.out.println("Payment method added successfuly");
	}

	// edit card method
	@When("User click on edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		System.out.println("User click on edit option of card section");
	}

	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		System.out.println("User edit information with below data");
		List<Map<String, String>> accountData = dataTable.asMaps(String.class, String.class);
		String cardNumber = accountData.get(0).get("cardNumber");
		String nameOnTheCard = accountData.get(0).get("nameOnTheCard");
		String expirationMonth = accountData.get(0).get("expirationMonth");
		String expirationYear = accountData.get(0).get("expirationYear");
		String cvv = accountData.get(0).get("cvv");
		System.out.println("Card Number: " + cardNumber + ", Name on the card: " + nameOnTheCard + ", expiration date: "
				+ expirationMonth + "/" + expirationYear + ", cvv: " + cvv);
	}

	@When("User click on update your card button")
	public void userClickOnUpdateYourCardButton() {
		System.out.println("User click on update your card button");
	}

	@Then("a message should be displayed 'Payment Method update seccessfuly'")
	public void aMessgeShouldBeDisplayedPaymentMethodUpdateSeccessfuly() {
		System.out.println("Payement Method is update successfully");
	}
	// remove debit card or credit card

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		System.out.println("User click on remove option of card section");
	}

	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemove() {
		System.out.println("Payment details is removed");
	}

	// add address
	@When("User click on add address option")
	public void userClickOnAddAddressOption() {
		System.out.println("User click on add address option");
	}


	@When("User fill new address form with below information")
		public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
			System.out.println("User fill new address form with below information");
			List<Map<String, String>> accountData = dataTable.asMaps(String.class, String.class);
			String country = accountData.get(0).get("country");
			String fullName = accountData.get(0).get("fullName");
			String phoneNumber = accountData.get(0).get("phoneNumber");
			String streetAddress = accountData.get(0).get("streetAddress");
			String apt = accountData.get(0).get("apt");
			String city = accountData.get(0).get("city");
			String state = accountData.get(0).get("state");
			String postal = accountData.get(0).get("postal");
			System.out.println("country name: " + country + ", full Name: " + fullName + ", phone Number: " + phoneNumber +
					", street Address: " + streetAddress + ",apt:" + "/" + apt + ",city:" + city +
					", state:" + state + ",postal: " + postal);
	}
				
			    @When("user click add your address button")
				public void userClickAddYourAddressButton() {
					System.out.println("user click add your address button");					
					}
				@Then("a message should be displayed 'Address added successfuly'")
				public void aMessageShouldBeDisplayedAddressAddedSuccessfuly() {
					System.out.println("Address added successfuly");
				}
				// address edit
				@When("User click on edit address option")
				public void userClickOnEditAddressOption() {
					System.out.println("User click on edit address option");
			}
			    @When("User edit new address form with below information")
			    public void userEditNewAddressFormWithBelowInformation(DataTable dataTable1) {
			    	System.out.println("User edit new address form with below information");
			    	List<Map<String, String>> accountData1 = dataTable1.asMaps(String.class, String.class);
			    	String country1 = accountData1.get(0).get("country");
					String fullName1 = accountData1.get(0).get("fullName");
					String phoneNumber1 = accountData1.get(0).get("phoneNumber");
					String streetAddress1 = accountData1.get(0).get("streetAddress");
					String apt1 = accountData1.get(0).get("apt");
					String city1 = accountData1.get(0).get("city");
					String state1 = accountData1.get(0).get("state");
					String postal1 = accountData1.get(0).get("postal");
					System.out.println("country name: " + country1 + ", full Name: " + fullName1 + ", phone Number: " + phoneNumber1 +
							", street Address: " + streetAddress1 + ",apt:" + "/" + apt1 + ",city:" + city1 +
							", state:" + state1 + ", postal: " + postal1);
			    }	
			    @When("User click add your address button")
			    public void userClickAddYourAddressButton1() {
			    	System.out.println("User click add your address button");
			    }
			    @When("a message should be displayed 'Address updated successfuly'")
			    public void aMessageShouldBeDisplayedAddressUpdatedSuccessfuly() {
			    	System.out.println("Address updated successfully");
			    }
			    
		}


