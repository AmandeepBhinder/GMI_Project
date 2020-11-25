package com.GMI.pages;
import com.GMI.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
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

    @FindBy(xpath ="//span[contains(text(),'Operations')]")
    public WebElement myOperations;


    public void clickAccntMenu(){
        accountMenu.click();
    }


    public void clickTo(String button){
    WebElement element=Driver.getDriver().findElement(By.xpath("//span[contains(text(),'"+button+"')]"));
    if(element.isDisplayed()){
        element.click();
    } else{
         element= Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Sign in')])[3]"));
         element.click();
       }


    }

}





