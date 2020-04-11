package test.java.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import test.java.Commons.Init;

public class DashboardPage extends Init {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }



    @FindBy(xpath = "//android.widget.TextView[contains(@text,'We are happy')]")
    WebElement instruction;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Navigate to the Task List.')]")
    WebElement otherInstruction;

    @FindBy(xpath = "//android.widget.TextView[@text='Dashboard']")
    WebElement dashboard;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'LIST')]")
    WebElement listTab;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'MY PROPERTIES')]")
    WebElement MyPropertiesPage;



    public void clickOnInstruction(){
        instruction.click();
        pause(2);
        otherInstruction.click();
        pause(2);
    }

    public void verifyPageTitle()
    {
        Assert.assertTrue(dashboard.isDisplayed());
    }

    public void clickOnListTab()
    {
        listTab.click();
    }

    public void verifyListPropertyPage()
    {
        Assert.assertTrue(MyPropertiesPage.isDisplayed());
    }

}
