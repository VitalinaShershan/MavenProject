$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ConfigurePIM.feature");
formatter.feature({
  "name": "Configure PIM -Optional Fields",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Unchecking unnecessary checkboxes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@pim"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "enter valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.LoginStepDefenition.enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.LoginStepDefenition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify dashboard is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.LoginStepDefenition.verify_dashboard_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on PIM",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.AddEmployeeStepDefenition.click_on_PIM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on configuration dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.PimConfigurationStepDefenition.click_on_configuration_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on optional fields",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.PimConfigurationStepDefenition.click_on_optional_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on edit button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.PimConfigurationStepDefenition.click_on_edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "uncheck unnecessary checkboxes",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.PimConfigurationStepDefenition.uncheck_unnecessary_checkboxes(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefenitions.AddEmployeeStepDefenition.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Unchecking unnecessary checkboxes");
formatter.after({
  "status": "passed"
});
});