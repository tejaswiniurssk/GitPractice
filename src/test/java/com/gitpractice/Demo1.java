package com.gitpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tejaswini Urs\\Documents\\Selenium Automation testing\\exe files\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://veenas.com/");
        driver.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[2]/div[1]/div[3]/div/p/a")).click();
        driver.findElement(By.id("customer_email")).sendKeys("tejaswiniurssk93@gmail.com");
        driver.findElement(By.id("customer_password")).sendKeys(("9gh8$3N^u"));
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/button")).click();
    }
}
