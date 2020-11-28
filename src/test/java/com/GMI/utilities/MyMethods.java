package com.GMI.utilities;

import com.GMI.pages.LandingPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyMethods {

    public static void login(){
        LandingPage landingPage = new LandingPage();

        landingPage.clickAccntMenu();
        landingPage.clickTo("Sign in");
        landingPage.username.sendKeys(ConfigurationReader.getProperty("EmployeeUsername"));
        landingPage.password.sendKeys(ConfigurationReader.getProperty("EmployeePassword"));
        landingPage.submit.click();
    }

    public static void getDefaultMessage(String message){
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + message + "')]"));

        String actual = element.getText();
        System.out.println(actual);

        Assert.assertTrue("message is not displayed ",actual.contains(message));

    }


    public static void fillBoxes(String input, String info){
        WebElement element = Driver.getDriver().findElement(By.xpath("//input[@id='" + input + "']"));
        element.clear();
        Driver.waitForVisibility(element,3).sendKeys(info);
        Driver.wait(2);
        System.out.println(info+" Entered to=====>> "+input);

    }




//end
}
