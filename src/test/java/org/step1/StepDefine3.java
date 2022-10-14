package org.step1;

import java.util.List;
import java.util.Map;

import org.base.BaseCls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine3 extends BaseCls {
	@Given("user need to be in amazon homepage")
	public void user_need_to_be_in_amazon_homepage() {
	   chromeDriver();maxWindow();waits();
	   lanuchUrl("https://www.amazon.in/");
	}

	@When("user should enter product name in searchbox")
	public void user_should_enter_product_name_in_searchbox(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> m  = d.asMaps();
	    WebElement ser = cu.findElement(By.id("twotabsearchtextbox"));
	    textBox(ser, m.get(0).get("Smart Watch"));
	}

	@When("user should click search button")
	public void user_should_click_search_button() {
		WebElement seBt = cu.findElement(By.xpath("//input[@type='submit']"));
		btnClk(seBt);
	}

	@Then("user will navigate to the product page")
	public void user_will_navigate_to_the_product_page() {
	   System.out.println("user in product page");
	   cu.quit();
	}


	
	
	
}
