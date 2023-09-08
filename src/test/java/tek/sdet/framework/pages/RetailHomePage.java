package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//*[contains(text(), 'TEKSCHOOL')]")
	public WebElement tekschoolLogo;
	
//	@FindBy(xpath = "//button[@id='hambuergerBtn']")
//	public WebElement allOptions;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allOptions;
	
	@FindBy(xpath = "//div[@class='sidebar_content']//span")
	public List<WebElement> sidebarOptions;
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sidebarAllOptions;

}
