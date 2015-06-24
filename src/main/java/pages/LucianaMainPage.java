package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LucianaMainPage extends AbstractLucianaPage{

    public LucianaMainPage(WebDriver driver){
        super(driver);

    }

   /* public LucianaMainPage clickOnMainPage(){

        return new LucianaMainPage(driver);

    }
*/


    public LucianaLoginPage clickOnLoginPage(){
        driver.findElement(By.xpath(".//*[@id='topbar-right']/div[1]/a")).click();
        return new LucianaLoginPage(driver);

    }

}

