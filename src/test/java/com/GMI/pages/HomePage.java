package com.GMI.pages;

import com.GMI.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    LandingPage landingPage =new LandingPage();
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[contains(text(),'myname mylastname')]")
    protected WebElement fullName;


    public void verifyFullName(String fullName){
     // String actual =  landingPage.accountMenu.getText();

     WebElement element =   Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+fullName+"')]"));
        Assert.assertEquals("FAILED!!! Full Names mismatched!!!",fullName,element.getText());
        System.out.println("Full name= "+fullName+ "\n actual = "+element.getText());
    }
}
