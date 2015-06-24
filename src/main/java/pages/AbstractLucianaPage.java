package main.java.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Настена on 24.06.2015.
 */
public class AbstractLucianaPage {

    protected WebDriver driver;

    public AbstractLucianaPage(WebDriver driver){
        this.driver = driver;

    }

    public WebDriver getDriver(){
        return driver;

    }

    public LucianaMainPage navigateToMainPage(){
        driver.navigate().to("http://luciana.integro.kiev.ua/");
        return new LucianaMainPage(driver);

    }





}
