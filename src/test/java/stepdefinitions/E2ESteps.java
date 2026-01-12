package stepdefinitions;

import api.requests.RegisterUserAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.base.BaseTest;
import ui.pages.LoginPage;

public class E2ESteps extends BaseTest {
	String email="test"+System.currentTimeMillis()+"@mail.com";
	String password="Test@123";
	@Given("user is registered using API")
	public void register() {
		RegisterUserAPI.register(email, password);
	}
	
	@When("user logs in using UI")
	public void login() {
        start();
        new LoginPage(driver).login(email, password);
    }

    @Then("test should be successful")
    public void verify() {
        System.out.println("E2E flow passed");
        stop();
    }
}