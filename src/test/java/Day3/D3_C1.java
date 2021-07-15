package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_C1 {
    /*
    Navigate to https://the-internet.herokuapp.com/
    click forgot password
    fill out email field
    click retrieve password button
 */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        WebElement login = driver.findElement(By.name("q"));
        login.sendKeys("Selenium");
         WebElement search=driver.findElement(By.className("gNO89b"));
         search.click();

        //WebElement password=driver.findElement(By.name("password"));
        //password.sendKeys("lord33");
        //password.click();


    }


}
