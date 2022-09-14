package day04_xPathCssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1)https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2)add element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3)delete butonunun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu testi passed");
        }else {
            System.out.println("test failed");
        }
        //4)delete butonuna basin
        //driver.findElement(By.xpath("//button[@class='added-manually']")).click();
        driver.findElement(By.xpath("//*[text()='Delete']")).click();

        //5)"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemove=driver.findElement(By.xpath("//h3"));
        if (addRemove.isDisplayed()){
            System.out.println("Add remove test passed");
        }else {
            System.out.println("add remove test failed");
        }
        //kapat
        //driver.close();
    }
}
