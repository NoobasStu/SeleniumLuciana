package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Настена on 24.06.2015.
 */
public class LoginResultPage extends AbstractLucianaPage{

    public LoginResultPage(WebDriver driver){
        super(driver);

    }

    @FindBy(xpath = ".//*[@id='post-9']/div/p[1]/strong")
    WebElement welcomeMassage;

    public String getWelcomingMessage(){
        return welcomeMassage.getText();

    }









}
