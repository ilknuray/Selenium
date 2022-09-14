package day04_xPathCssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class webDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/Resources/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1)google web sayfasina gidiniz
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");


        //2)search "city bike"
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);


        //3)amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
        List<WebElement> aranaElemenListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = aranaElemenListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());
        //listede 24 var bize 1.lazim oldugu icin bunu yaptik

        //4)ilk resme tiklayin
        List<WebElement> urunResimleri = driver.findElements(By.className("s-image"));
        WebElement ilkResim = urunResimleri.get(0);
        ilkResim.click();
        //5)sayfayi kapatalim
        //driver.close();


    }
}
