package com.millennium.web.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.*;

public class AabilLPageDitails {


    WebDriver driver;


//    private String email;
//    private String pass;


    public AabilLPageDitails() {

    }

    public AabilLPageDitails(WebDriver driver) {
        this.driver = driver;
    }

//    public AabilLPageDitails fillEmail(String email,String pass) {
//        //this.email=email;
//        driver.findElement(id("username")).sendKeys(email);
//        driver.findElement(id("password")).sendKeys(pass);
//        return this;
//    }

//    public String fillPassword(String pass) {
//        //this.pass=pass;
//         driver.findElement(id("password")).sendKeys(pass);
////        return this;
//    }

//    public AabilLPageDitails fillEmail(String email) {
//        //this.email=email;
//            this.driver.findElement(id("username")).sendKeys(email);
//        return this;
//    }
//
//    public AabilLPageDitails fillPassword(String pass) {
//     //this.pass=pass;
//        driver.findElement(id("password")).sendKeys(pass);
//        return this;
//    }

//    public AbabilHomePage clickLogin() {
//        //driver.findElement(className("btn-primary")).click();
//        //driver.findElement(By.cssSelector("button[class='disabled-when-loading']")).click();
    //        WebDriverWait wait = new WebDriverWait(driver, 10);
    //        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(className("material-icons")));
    //        return new AbabilHomePage(driver);
//    }

//    public AbabilHomePage submitLoginCredentials() {
//        driver.findElement(cssSelector("button[class='disabled-when-loading']")).click();
//        ;
//        return new AbabilHomePage(driver);
//        //new AbabilHomePage(driver)
//    }

    public void pageWait() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(className("material-icons")));
    }
}
