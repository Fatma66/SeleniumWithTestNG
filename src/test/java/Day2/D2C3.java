package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2C3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.id("email"));
        userName.sendKeys("Fatma");

        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("123456");

        WebElement login=driver.findElement(By.name("login"));
        login.click();

        WebElement error=driver.findElement(By.className("_9ay7"));
        if (error.isDisplayed() ) {
            System.out.println("test is passed");
        }else{
            System.out.println("test is failed");

        }



    }
}