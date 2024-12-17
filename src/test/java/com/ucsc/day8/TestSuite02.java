package com.ucsc.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSuite02 {
    WebDriver webDriver;

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            webDriver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            webDriver = new EdgeDriver();
        }
        webDriver.manage().window().maximize();
    }

    @Test
    public void testCase02() {
        webDriver.get("https://www.ebay.com/");
        WebElement searchBox = webDriver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
        searchBox.sendKeys("Laptop");
        WebElement serachButton = webDriver.findElement(By.xpath("//input[@value='Search']"));
        serachButton.click();
    }

    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
