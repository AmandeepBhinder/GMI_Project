package com.GMI.step_definitions;

import com.GMI.pages.LandingPage;
import com.GMI.utilities.ConfigurationReader;
import com.GMI.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPage_Step_Definitions {


    LandingPage landingPage = new LandingPage();




    @When("User goes to given url")
    public void user_goes_to_given_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("Click to {string}")
    public void click_to(String accntMenu) {
        landingPage.clickAccntMenu();
    }

    @And("Verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String cancelBtn) {
        Driver.verifyElementDisplayed(landingPage.cancelButton);
    }

    @When("Click to {string} button")
    public void click_to_button(String SingIN) {
    landingPage.clickTo(SingIN);
    }

    @And("Enter the {string} and {string}")
    public void enterTheAnd(String userName, String password) {

        landingPage.login(userName,password);

    }


//    @When("Enter the {string}")
//    public void enter_the(String string) {
//
//    }



}
