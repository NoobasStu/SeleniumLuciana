package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LucianaLoginPage extends AbstractLucianaPage{



    public LucianaLoginPage(WebDriver driver){
        super(driver);

    }

    public LucianaLoginPage fillWithDataLoginForm(){
        driver.findElement(By.xpath(".//*[@id='username']")).clear();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("noobas.stu@gmail.com");
        driver.findElement(By.xpath(".//*[@id='password'])")).clear();
        driver.findElement(By.xpath(".//*[@id='password'])")).sendKeys("qwerty");
        return new LucianaLoginPage(driver);

    }

    public LoginResultPage loginButton() {
        driver.findElement(By.cssSelector(".login .button")).click();
        return new LoginResultPage(driver);
    }



}
