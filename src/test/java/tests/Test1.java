package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test1 {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            String url = "https://www.network.com.tr/";
            driver.get(url);
            driver.manage().window().maximize();

            Duration d = Duration.ofSeconds(10);
            WebDriverWait wait=new WebDriverWait(driver,d);
            //WebElement c=driver.findElement(By.id("onetrust-accept-btn-handler"));
           // c.click();
            WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
            WebElement search=driver.findElement(By.id("search"));
            //enter text with sendKeys() then apply submit()
            search.click();
            search.sendKeys("ceket");
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            driver.findElement(By.linkText("YENİ GELENLER")).click();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
            WebElement scrollingdown = driver.findElement(By.xpath("//button[contains(text(),'Daha fazla göster')]"));
            scrollingdown.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-999999999)");

            WebElement product = driver.findElement(By.id("product-142195"));

            WebElement ele = driver.findElement(By.id("product-142195"));
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            WebElement size = driver.findElement(By.xpath("//label[@for='size_32']"));
            size.click();


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement iconcart = driver.findElement(By.xpath("//button[@class='header__basketTrigger js-basket-trigger -desktop']"));
            WebElement buttoncart = driver.findElement(By.xpath("//a[text()='Sepete Git']"));
            iconcart.click();
            buttoncart.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement continiuecart = driver.findElement(By.xpath("//button[text()=' DEVAM ET ']"));
            continiuecart.click();
            String user ="tugcanergun@gmail.com";
            String password="Abc123--123";
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement username = driver.findElement(By.xpath("//input[@placeholder='E-posta*']"));
            WebElement userpassword = driver.findElement(By.xpath("//input[@placeholder='Şifre*']"));
            username.sendKeys(user);
            userpassword.sendKeys(password);
            WebElement signin = driver.findElement(By.xpath("//button[text()='GİRİŞ YAP']"));
            signin.click();

            WebElement homelanding = driver.findElement(By.xpath("//a[@class='header__logo']"));
            homelanding.click();

            WebElement iconcartt = driver.findElement(By.xpath("//button[@class='header__basketTrigger js-basket-trigger -desktop']"));
            iconcartt.click();
            //WebElement deletecart = driver.findElement(By.xpath("//use[@xlink:href, '#remove')]"));
            //WebElement deletecart = driver.findElement(By.xpath("[//image/@xlink:href= '#remove']" ));
            WebElement deletecart = driver.findElement(By.cssSelector("header__basketProductRemove > use"));
            deletecart.click();


        }


    }

