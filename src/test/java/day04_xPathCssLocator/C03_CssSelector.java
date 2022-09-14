package day04_xPathCssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a)verilen web sayfasina gidin
        driver.get("http://a.testaddressbook.com/sign_in");
        //b)locate email textbox
        driver.findElement(By.cssSelector("#session_email"));
        //c)locate password textbox
        driver.findElement(By.cssSelector("#session_password"));
        //d)locate sign button
        driver.findElement(By.cssSelector("input[name='commit']"));
        //e)
        WebElement userName= driver.findElement(By.cssSelector("#session_email"));
        userName.sendKeys("testtechproed@gmail.com");
        WebElement password= driver.findElement(By.cssSelector("#session_password"));
        password.sendKeys("Test1234!");
        //f)sayfayi kapatin
        driver.close();

    }
}
