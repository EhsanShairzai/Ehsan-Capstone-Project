package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.RetailOrderPage;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory pomFactory = new POMFactory();
	
	RetailOrderPage retailOrderPage;
	
	// constrctor to initialaze the retailOrderPage object
	public RetailOrderSteps() {
		retailOrderPage = pomFactory.retailOrderPage();		
	}
	// add item to cart
	@Then("Verify user is logged in")
	public void verifyUserIsLoggedIn() {
		System.out.println("user is on the retail website");
	}
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		retailOrderPage.allDepartmentDropdown.sendKeys(category);
		logger.info("the category is changed seccessfully");
	}
	@Then("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		retailOrderPage.searchInputField.sendKeys(item);
		logger.info("user search for an item");
		
	}
	@Then("User click on search icon")
	public void userClickOnSearchIcon() {
		retailOrderPage.searchBtn.click();
		logger.info("user clicked on item seccessfully");				
	}
	@Then("User click on item")
	public void userClickOnItem() {
		retailOrderPage.itemkasaoutdoorsmartplug.click();
		System.out.println("user clicked on item seccessfully");
	}
	@Then("user select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("The item was selected successfully");
	}
	@Then("User click add to cart button")
	public void userClickAddToCartButton() {
		retailOrderPage.addToCartBtn.click();
		logger.info("user clicked on cart button successfully");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		Assert.assertEquals(quantity, pomFactory.retailOrderPage().cartItemQty.getText());
	}
	// add item to cart and checkout
	@Then("User changes the category to {string} Apex Legeds")
	public void userChangesTheCategoryTo(String category) {
		retailOrderPage.allDepartmentDropdown.sendKeys(category);
		logger.info("the category is changed seccessfully");
		
	}
	@Then("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String item) {
		retailOrderPage.searchInputField.sendKeys(item);
		logger.info("user search for an item");
	}
	@Then("User click search icon")
	public void userClickSearchIcon() {
		retailOrderPage.searchBtn.click();
		logger.info("User clicked on search icon seccessfully");
	}
	@Then("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		retailOrderPage.apexLegendsItem.click();
		System.out.println("User clicked on item Apex Legends");
	}
	@Then("User select quantity {string} for Apex Legends")
	public void userSelectQuantityForApexLegends(String itemQty) {
		selectByVisibleText(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("user clicekd on cart button seccessfully");
	}
	@Then("The cart icon quantity should changed to {string}")
	public void theCartIconQuantityShouldChangedTo(String cartItemQty) {
		Assert.assertEquals(cartItemQty, pomFactory.retailOrderPage().cartItemQty.getText());
		logger.info("The cart icon quantity changed successfully");
	}
	@Then("User click on cart option")
	public void userClickOnCartOption() {
		retailOrderPage.cartBtn.click();
		logger.info("User clicked on cart button successfully");
	}
	@Then("User click on proceed to checkout button")
	public void userClickOnProceedToCheckoutButton() {
		retailOrderPage.preceedToCartBttn.click();
		logger.info("User clicked on checkout button successfully");
	}
	@Then("User Click on place your order")
	public void userClickOnPlaceYourOrder() {
		retailOrderPage.placeOrderBttn.click();
		logger.info("User clicked on cart button successfully");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplaeyd(String orderPlaceSuccessfully) {
		System.out.println("order Placed successfully");
	}
	// cancel Order
	@Then("User clicked on orders section")
	public void userClickOnOrdersSection() {
		retailOrderPage.OrderLink.click();
		logger.info("user clicked on order button successfully");
	}
	@Then("User click on first order in list")
	public void userClickOnFristOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for(int i = 0; i < listOfOrder.size(); i++) {
			if(listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
			}else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
			}}}
	
	@Then("User click on cancel the order button")
	public void userClickonCancelTheOrderButton() {
		List<WebElement> cancelBttns = pomFactory.retailOrderPage().cancelOrderBttn;
		click(cancelBttns.get(0));
		logger.info("User clicked on cancel order button successfully");
	}
	@Then("User select the cancelation reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		retailOrderPage.reasonForCancelation.click();
		logger.info("User clicked on Reason for cancelation button successfully");
	}
	@Then("User click on cancel order button")
	public void userClickOnCancelOrderButton() {
		click(pomFactory.retailOrderPage().cancelationSubmitBttn);
		logger.info("Cancel submit button was clicked successfully");	
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String yourOrderHasBeenCancelled) {
		logger.info("Your order has beed cancelled message displayed seccessfully");
		}
	// return order
	@Then("User clicks on orders section")
	public void userClicksOnOrderSection() {
		retailOrderPage.OrderLink.click();
		logger.info("user clicked on order button successfully");
	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i <listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
		}else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
			click(pomFactory.retailOrderPage().listOfOrders.get(i));
			logger.info("User click on first order in list successfully");
		}}}
	@Then("User click on return items button")
	public void userClickOnReturnItemsButton() {
		retailOrderPage.returnBttn.click();
		logger.info("User click on return items button successfully");
	}
	@Then("User select the return reason {string}")
	public void userSelectTheReturnReason(String reason) {
		retailOrderPage.reasonForCancelation.click();
		logger.info("User clicked on reason for return button successfully");
	}
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOffInput) {
		retailOrderPage.dropOffInput.click();
		logger.info("User clicked on drop off option successfully");
	}
	@Then("User click on return order button")
	public void userClickOnReturnOrderButton() {
		retailOrderPage.cancelationSubmitBttn.click();
		logger.info("order return successMssg displayed successfully");
	}
	@Then("cancelation message should be displayed {string}")
	public void cancelationMessageShouldBeDisplayed(String orderreturnSuccessMssg) {
		logger.info("order return successMssg displayed successfully");
	}
	// review order
	@Then("User click on orders sections")
	public void userClickOnOrdersSections() {
		retailOrderPage.OrderLink.click();
		logger.info("User clicked on order button successfully");
	}
	@Then("User click on review button")
	public void userClickOnReviewButton() {
		retailOrderPage.reviewBtn.click();
		logger.info("user clicked on review button successfully");
	}
	@Then("User click on the first order in list")
	public void  userClickOnTheFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");			}
		}}
	@Then("User click add your review button")
	public void userClickAddYourReviewButton() {
		click(pomFactory.retailOrderPage().reviewSubmitBtn);
		logger.info("User click on review button successfully");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedSucessfully) {
		System.out.println("A review message displayed successfully");
	}
}
