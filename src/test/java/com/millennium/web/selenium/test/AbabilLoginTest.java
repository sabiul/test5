package com.millennium.web.selenium.test;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.millennium.web.selenium.page.AabilLPageDitails;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;


public class AbabilLoginTest {


    static WebDriver driver = null;

    @BeforeClass
    public static void loginTestShouldBeSuccess() {
        AabilLPageDitails abilLPageDitails = new AabilLPageDitails();
        String service = "E:\\work\\AbabilTest\\chromedriver.exe";

//    @BeforeClass
//    public static void runChrome() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
        driver.findElement(className("btn-quaternary")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
               WebElement element = wait.until(ExpectedConditions.elementToBeClickable(className("loginbox-v4__content")));


        driver.findElement(id("id_email")).sendKeys("rajib.info@gmail.com");
        driver.findElement(id("id_password")).sendKeys("udemy9");
        driver.findElement(By.id("submit-id-submit")).click();
//        abilLPageDitails.pageWait();
    }

//    @org.testng.annotations.Test
//    public void Test(){
//        //Loading jQuery Real Person Captcha demonstration page
//        driver.get("http://keith-wood.name/realPerson.html");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        //Setting the captcha values
//        js.executeScript("docum   ent.getElementsByName('defaultRealHash')[0].setAttribute('value', '-897204064')");
//        driver.findElement(By.name("defaultReal")).sendKeys("QNXCUL");
//        //Submit the form
//        driver.findElement(By.xpath(".//*[@id='default']/form/p[2]/input")).submit();
//    }

    public static void main(String avgs[]) {
        AbabilLoginTest ababilLoginTest = new AbabilLoginTest();
        ababilLoginTest.loginTestShouldBeSuccess();
    }
}