package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2C2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement forgot =driver.findElement(By.linkText("Forgot Password?"));
        forgot.sendKeys("Forgot password");
        driver.navigate().back();
        WebElement createAccount=driver.findElement(By.className(""));




    }
}
