package day03_FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {
    public static void main(String[] args) {
        //amazon.com a gidip arama kutusunu locate edin
        //arama kutusunun tagname inin input oldugunu test edin
        //arama kutusunun name attribute degerinin   field-keywords   oldugunu test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
       //1
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
       //2
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.contains(expectedTagName)){
            System.out.println("Tag name testi PASSED");
        }else{
            System.out.println("tag name testi FAILED");
        }

        //3
        String actualAttributeName=aramaKutusu.getAttribute("name");
        String expectedAttributeName="field-keywords";

        if (actualAttributeName.contains(expectedAttributeName)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.close();
    }
}
