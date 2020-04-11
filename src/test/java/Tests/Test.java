package test.java.Tests;

import org.testng.Reporter;
import test.java.Commons.*;

public class Test extends Init {


    @org.testng.annotations.Test
    public void loginWithIdPassword()
    {
        pause(10);
        update.ClickOnNoThanksBtn();
        pause(2);
        login.loginwithValidCredentials();
        pause(30);
        dashBoard.clickOnInstruction();
        dashBoard.verifyPageTitle();
        Reporter.log("Test run successfully!!!");

    }

    @org.testng.annotations.Test
    public void listPage(){
        dashBoard.clickOnListTab();
        pause(5);
        dashBoard.verifyListPropertyPage();
        pause(2);
    }


}
