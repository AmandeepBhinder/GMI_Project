package com.GMI.step_definitions;

import com.GMI.pages.HomePage;
import com.GMI.utilities.ConfigurationReader;
import com.GMI.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Step_Definitions {


    HomePage home = new HomePage();




    @When("User goes to given url")
    public void user_goes_to_given_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("Click to {string}")
    public void click_to(String accntMenu) {
        home.clickAccntMenu();
    }

    @When("Click to {string} button")
    public void click_to_button(String SingIN) {
    home.clickTo(SingIN);
    }

    @And("Enter the {string} and {string}")
    public void enterTheAnd(String userName, String password) {
        Driver.waitAndSendText(home.username,userName,3);
        Driver.waitAndSendText(home.password,password,3);

    }

//    @When("Enter the {string}")
//    public void enter_the(String string) {
//
//    }



}
