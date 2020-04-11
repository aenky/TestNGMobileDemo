package test.java.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ListPage {
    WebDriver driver;

    public ListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//android.widget.TextView[contains(@text,'LIST')]")
    WebElement listTab;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'MY PROPERTIES')]")
    WebElement MyPropertiesPage;


    public void clickOnListTab()
    {
        listTab.click();
    }

    public void verifyListPropertyPage()
    {
        Assert.assertTrue(MyPropertiesPage.isDisplayed());
    }

}
