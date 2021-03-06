package com.hrms.stepdefenitions;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefenition extends CommonMethods {

    @Given("navigate to HRMS login page")
    public void navigate_to_hrms_login_page() {
        setUp();
    }

    @When("enter valid credentials")
    public void enter_valid_credentials() {
        loginPage.login("Admin", "Hum@nhrm123");
    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Then("verify dashboard is displayed")
    public void verify_dashboard_is_displayed() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
    }

    @Then("quit the browser")
    public void quit_the_browser() {
        tearDown();
    }

    @When("enter invalid credentials")
    public void enter_invalid_credentials() {
        loginPage.login("Admina", "Hum@nhrm123");
    }

    @Then("verify error message")
    public void verify_error_message() {
        Assert.assertEquals("Verifying error message", "Invalid credentials", loginPage.getErrorMessageText());
    }

    @When("enter no username")
    public void enter_no_username() {
        loginPage.login("", ConfigsReader.getPropertyValue("password"));
    }

    @Then("verify error message no name")
    public void verify_error_message_no_name() {
        Assert.assertEquals("Verifying error message","Username cannot be empty", loginPage.getErrorMessageText());
    }

    @When("enter no password")
    public void enter_no_password() {
        loginPage.login("Admin","");
    }

    @Then("verify error message no password")
    public void verify_error_message_no_password() {
        Assert.assertEquals("Verifying error message","Password cannot be empty", loginPage.getErrorMessageText());
    }


}
