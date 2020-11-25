package com.GMI.pages;

import com.GMI.utilities.Driver;
import com.GMI.utilities.WriteTxtUtil;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegistrationPage {
    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Faker faker = new Faker();


    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath="//span[contains(text(),'Register')]")
    public WebElement registerLink;

    @FindBy(xpath = "//form[@id='register-form']")
    public WebElement registrationForm;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement sSN;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;
    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement mobilePhoneNumber;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement newPassword;
    @FindBy(xpath = "//ul[@id='strengthBar']")
    public WebElement passwordStrength;
    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement newPasswordConfirmation;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement register;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement YouCanTryTheDefaultAcco;
    @FindBy(xpath = "//div[contains(text(),'Your SSN is invalid')]")
    public WebElement invalidSSNMessage;
    @FindBy(xpath = "//div[contains(text(),'Your mobile phone number is invalid')]")
    public WebElement invalidPhoneMessage;


}
