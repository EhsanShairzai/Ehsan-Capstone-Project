package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
	private RetailHomePage retailHomePage;
	private RetailSignInPage homePage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	
	// we create jsut one constructor

	public POMFactory() {
		this.retailHomePage = new RetailHomePage();
		this.homePage = new RetailSignInPage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderPage = new RetailOrderPage();

	}
	//then we create get method
	public RetailHomePage retailHomePage() {
		return this.retailHomePage;
	}

	public RetailSignInPage homePage() {
		return this.homePage;
	}
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;		
	}
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
	public RetailOrderPage signInPage() {
		return this.signInPage();
	}

}
