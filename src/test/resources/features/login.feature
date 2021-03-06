@featureTag @login
Feature: Login Functionality

  @validCreds @smoke
  Scenario: Login with valid credentials
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed


  @smoke
  Scenario: Login with invalid credentials

    When enter invalid credentials
    And click on login button
    Then verify error message


  @regression
  Scenario: Empty username
    #Given  navigate to HRMS login page
    When enter no username
    And click on login button
    Then verify error message no name
    #And quit the browser

  @smoke @syntax @whatever
  Scenario: Empty Password
   # Given  navigate to HRMS login page
    When enter no password
    And click on login button
    Then verify error message no password
    #And quit the browser
