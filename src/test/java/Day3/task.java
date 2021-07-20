package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args){


    /*
Navigate to Etsy.com
Find  Search button and click
Click ShipIn1Day
and verify that it is selected
Click ShipIn3Days
and Verify that it is selected
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://Etsy.com");
        //WebElement SearchButton=driver.findElement(By.());


       // SearchButton.click();





    }


}