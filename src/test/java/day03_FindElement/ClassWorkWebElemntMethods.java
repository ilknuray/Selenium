package day03_FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ClassWorkWebElemntMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1)http://a.testadressbook.com adresine gidiniz
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://a.testaddressbook.com");

        //2)sign in butonuna basin
        WebElement signIn= driver.findElement(By.id("sign-in"));
        signIn.sendKeys("sign-in" + Keys.ENTER);

        //3)email textbox,password textbox,signin button elementlerini locate ediniz
        WebElement emailTextbox= driver.findElement(By.id("session_email"));
        WebElement passwordTextbox= driver.findElement(By.id("session_password"));
        WebElement siginButton=driver.findElement(By.name("commit"));

        //4)Kullanici adi ve sifreyi asagiya giriniz ve sign in i tiklayin
        emailTextbox.sendKeys("testtechproed@gmail.com");
        passwordTextbox.sendKeys("Test1234!");
        siginButton.click();

        //5)Expected user id nin testtechproed@gmail.com oldugunu locate edin
       WebElement actualKullaniciAdi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdi.getText());
        String expectedUserMail="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullaniciAdi.getText())){
            System.out.println("expected kullanici adi PASSED");
        }else{
            System.out.println("test FAILED");
        }


        //6)Addresses ve "Sign Out" textlerinin goruntulendigini(displayed)dogrulayin(verify)
       WebElement addressesElement=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElement=driver.findElement(By.linkText("Sign out"));

        if (addressesElement.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else{
            System.out.println("adresses testi FAILED");
        }
        if (signOutElement.isDisplayed()){
            System.out.println("signout testi PASSED");
        }else{
            System.out.println("sign out FAILED");
        }


        //7)sayfada kactane link oldugunu bulun
        List<WebElement>linkSayisi=driver.findElements(By.tagName("a"));
        System.out.println(linkSayisi.size());

        //8)Linkleri yazdiralim
        for (WebElement each:linkSayisi
             ) {
            System.out.println(each.getText());

        }



        //9)sayfalari kapatalim
        driver.close();



    }

}
