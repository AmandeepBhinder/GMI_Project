package com.GMI.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyMethods {

    public static void getDefaultMessage(String message){
        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + message + "')]"));

        String actual = element.getText();
        System.out.println(actual);

        Assert.assertTrue("message is not displayed ",actual.contains(message));


    }





//end
}
