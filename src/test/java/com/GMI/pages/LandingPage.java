package com.GMI.pages;
import com.GMI.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//li[@id='account-menu']")
    protected WebElement accountMenu;

    @FindBy(xpath="//span[contains(text(),'Sign in')]")
    protected WebElement SignIn;

    @FindBy(xpath="//span[contains(text(),'Register')]")
    protected WebElement register;


    @FindBy(xpath = "//input[contains(@id,'username')]")
    public WebElement username;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath =" //*[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@class='modal-content']//span[contains(text(),'Did you forget your password?')]")
    public WebElement alertMessages;

    @FindBy(xpath ="//span[contains(text(),'Operations')]")
    public WebElement myOperations;


    public void clickAccntMenu(){
        accountMenu.click();
    }


    public void clickTo(String button){
    WebElement element=Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+button+"')]"));
    if(element.isDisplayed()){
       Driver.waitAndClick(element,3);
    } else{
         element= Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Sign in')])[3]"));
        Driver.waitAndClick(element,3);
       }

    }


    public void login(String userName,String passWord){
        Driver.waitAndSendText(username,userName,3);
        Driver.waitAndSendText(password,passWord,3);
        Driver.verifyElementDisplayed(cancelButton);
    }


//    public void isMessageDisplayed(String message){
//        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class='modal-content']//span[contains(text(),'"+message+"')]"));
//
//
//    }





}





