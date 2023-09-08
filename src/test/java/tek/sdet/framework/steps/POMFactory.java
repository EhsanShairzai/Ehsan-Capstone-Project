package tek.sdet.framework.steps;

import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.pages.RetailHomePage;
import tek.sdet.framework.pages.RetailOrderPage;
import tek.sdet.framework.pages.RetailSignInPage;

public class POMFactory extends BaseSetup{

	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailHomePage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	
	public POMFactory() {

		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.retailAccountPage = new RetailHomePage();
		this.retailOrderPage = new RetailOrderPage();

	}
	public RetailHomePage homePage() {

		return this.homePage;
	}
	public RetailSignInPage signInPage() {

		return this.signInPage;

	}
	public RetailHomePage retailAccountPage() {

		return this.retailAccountPage;

	}
	public RetailOrderPage retailOrderPage() {

		return this.retailOrderPage;
}
}