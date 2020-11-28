package com.GMI.step_definitions;

import com.GMI.pages.HomePage;
import com.GMI.pages.LandingPage;
import com.GMI.utilities.Driver;
import com.GMI.utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Step_Definitions {
    LandingPage landingPage = new LandingPage();
    HomePage homePage = new HomePage();

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String fullName) {

        homePage.verifyFullName(fullName);

    }


    @When("User login")
    public void userLogin() {
       MyMethods.login();

    }

    @And("User fill out {string} boxes with valid {string} credentials")
    public void userFillOutBoxesWithValidCredentials(String input, String validInfo) {
        MyMethods.fillBoxes(input, validInfo);
    }
}
