package com.hrms.stepdefenitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class PimConfigurationStepDefenition extends CommonMethods {
    @When("click on configuration dropdown")
    public void click_on_configuration_dropdown() {
        pimConfigurationPage.clickOnConfigDropDown();
    }

    @When("click on optional fields")
    public void click_on_optional_fields() {
        pimConfigurationPage.clickOnOptionalFields();
    }

    @Then("click on edit button")
    public void click_on_edit_button() {
        pimConfigurationPage.clickOnEditButtom();
    }

    @Then("uncheck unnecessary checkboxes")
    public void uncheck_unnecessary_checkboxes(DataTable checkBoxOptions) throws InterruptedException {
        List<String> expectedCheckBoxOptions = checkBoxOptions.asList();
        for (int i = 0; i < expectedCheckBoxOptions.size(); i++) {
            clickRadioOrCheckboxbyText(pimConfigurationPage.checkboxes, expectedCheckBoxOptions.get(i));
        }
        Thread.sleep(2000);
    }
}
