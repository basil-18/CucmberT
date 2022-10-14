package org.step1;

import org.base.BaseCls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine1 extends BaseCls {
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {
	   chromeDriver();maxWindow();waits();
	   lanuchUrl("https://www.facebook.com/");
	}
	@When("user should enter invalid {string} and invalid {string}")
	public void user_should_enter_invalid_and_invalid(String u, String pa) {
		WebElement user = cu.findElement(By.id("email"));
		textBox(user, u);
		WebElement pas = cu.findElement(By.id("pass"));
		textBox(pas, pa);		
	}
	@When("user should click login button")
	public void user_should_click_login_button() {
	   WebElement log = cu.findElement(By.name("login"));
	   btnClk(log);
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
	   System.out.println("invalid user");
	   cu.quit();
	}



}
