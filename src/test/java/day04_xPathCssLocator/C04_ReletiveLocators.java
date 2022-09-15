package day04_xPathCssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_ReletiveLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement botonWebElementi= driver.findElement(By.id("pid6_thumb"));
        WebElement sailerWebElement= driver.findElement(By.id("pid11_thumb"));

        WebElement mountie= driver.findElement(RelativeLocator.with(By.tagName("img")).below(botonWebElementi).toLeftOf(sailerWebElement));
    }
}
