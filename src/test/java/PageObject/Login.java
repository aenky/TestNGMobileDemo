package test.java.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.java.Commons.Init;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="//android.widget.EditText[1]")
    WebElement emailTextbox;

    @FindBy(xpath="//android.widget.EditText[2]")
    WebElement passwordTextBox;

    @FindBy(xpath = "//android.widget.TextView[@text='Login']")
    WebElement  loginBnt;



    public void loginwithValidCredentials()
    {
        emailTextbox.sendKeys("ddtester14@leonardo.com");
        passwordTextBox.sendKeys("sagar@123");
        loginBnt.click();
    }

    /*String emailTextbox = "//android.widget.EditText[1]";

    String passwordTextBox = "//android.widget.EditText[2]";

    String loginBnt = "//android.widget.TextView[@text='Login']";
    String noThanksBtn = "//android.widget.TextView[@text='No Thanks']";

    public void ClickOnNoThanksBtn()
    {
        driver.findElement(By.xpath(noThanksBtn)).click();
    }

    public void loginwithValidCredentials()
    {
        driver.findElement(By.xpath(emailTextbox)).sendKeys("ddtester14@leonardo.com");
        driver.findElement(By.xpath(passwordTextBox)).sendKeys("sagar@123");
        driver.findElement(By.xpath(loginBnt)).click();

    }*/
}
