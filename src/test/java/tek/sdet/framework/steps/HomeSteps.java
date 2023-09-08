package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import tek.sdet.framework.utilities​​​​​​​.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allOptions);
		logger.info("All options dropdown was clicked");
		
	}
	@When("below options are present in shop by Department sidebar")
	public void belowOptionsArePresnetInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> departmentOption = dataTable.asLists(String.class);
		for(int i = 0; i < departmentOption.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement
					(By.xpath("//div[@class='sidebar_content']//span[text()" + " = ' " +departmentOption.get(0).get(i)+"']" ))));
			logger.info("Option " + departmentOption.get(0).get(i) + " is displayed");
		}
	}
		@When("User on {string}")
		public void userOn(String department) {
			List<WebElement> departments = factory.homePage().sidebarOptions;
			for(int i = 0; i < departments.size(); i++) {
				if(departments.get(i).getText().equalsIgnoreCase(department)) {
					departments.get(i).click();
					break;
				}
			}
		}
	}

