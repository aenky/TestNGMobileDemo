package test.java.Commons;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import test.java.PageObject.DashboardPage;
import test.java.PageObject.ListPage;
import test.java.PageObject.Login;
import test.java.PageObject.Update;

import java.net.MalformedURLException;
import java.net.URL;


public class Init {

   public WebDriver driver;
   public Login login ;
   public DashboardPage dashBoard;
   public Update update;
   //public ListPage listPage;


    @BeforeTest
    public void initApp(){
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("app","/Users/abc/Desktop/Demo/TestNGMobileDemo/Leonardo_11_3.apk");
        capability.setCapability("deviceName","ce051715b2392a1203");
        capability.setCapability("platformName","Android");
        capability.setCapability("automationName","UiAutomator2");
        capability.setCapability("autoGrantPermissions",true);
        capability.setCapability("autoAcceptAlerts",true);
        capability.setCapability("newCommandTimeout",60000);

        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

         update = new Update(driver);
         login = new Login(driver);
         dashBoard = new DashboardPage(driver);
         //listPage = new ListPage(driver);
    }

    @AfterTest
    public void CloseApp(){
        driver.quit();
    }

    public void pause(int sec) {

        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
