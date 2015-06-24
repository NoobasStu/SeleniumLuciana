package test.java;

import main.java.pages.LoginResultPage;
import main.java.pages.LucianaLoginPage;
import main.java.pages.LucianaMainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Настена on 24.06.2015.
 */
public class LoginPageTest {

    WebDriver driver;

    @Before
    public void startBrowser(){
        driver = new FirefoxDriver();
    }


    @After
    public void closeBrowser(){
        driver.close();
    }


    @Test
    public void correctLoginAlert()throws Exception{
        LucianaMainPage onLucianaMainPage = new LucianaMainPage(driver);
        onLucianaMainPage = onLucianaMainPage.navigateToMainPage();
        /*onLucianaMainPage.clickOnMainPage();*/
        LucianaLoginPage onLucianaLoginPage = onLucianaMainPage.clickOnLoginPage();
        LoginResultPage onLoginResultPage = onLucianaLoginPage.fillWithDataLoginForm().loginButton();
        Assert.assertTrue(onLoginResultPage.getWelcomingMessage().contains("noobas"));
    }
}
