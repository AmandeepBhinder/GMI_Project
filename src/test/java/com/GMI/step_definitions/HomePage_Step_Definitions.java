package com.GMI.step_definitions;

import com.GMI.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomePage_Step_Definitions {
    HomePage homePage = new HomePage();

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String fullName) {

        homePage.verifyFullName(fullName);
    }



}
