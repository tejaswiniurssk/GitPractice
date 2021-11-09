package com.gitpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Demo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejaswini Urs\\Documents\\Selenium Automation testing\\exe files\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://en-gb.facebook.com/r.php");

//		Alert alert = driver.switchTo().alert();
//		alert.accept();

        //driver.findElement(By.xpath("//*[@id=\"u_0_1a_bg\"]")).click();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Tejaswini");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Kumar");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("tej93@gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("abcABC123$");

        WebElement day = driver.findElement(By.id("day"));
        Select selectday = new Select(day);
        selectday.selectByVisibleText("1");

        WebElement month = driver.findElement(By.id("month"));
        Select selectmonth = new Select(month);
        selectmonth.selectByVisibleText("Dec");

        WebElement year = driver.findElement(By.id("year"));
        Select selectyear = new Select(year);
        selectyear.selectByVisibleText("1993");
    }
}
