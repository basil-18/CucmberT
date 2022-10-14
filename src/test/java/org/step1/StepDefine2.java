package org.step1;

import org.base.BaseCls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefine2 extends BaseCls {
	@Given("user should be in login page")
	public void user_should_be_in_login_page() {
		chromeDriver();waits();maxWindow();
		lanuchUrl("https://www.facebook.com/");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement log = cu.findElement(By.name("login"));
		btnClk(log);
	}

	@Then("user will redirect to invalid credential page")
	public void user_will_redirect_to_invalid_credential_page() {
		System.out.println("invalid user");
		cu.quit();
	}

}
