package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement checkBox= driver.findElement(By.cssSelector("#bmwradio"));
        checkBox.click();
        /*if (checkBox.isSelected()){
            System.out.println("yay");
        }else{
            System.out.println("oh no");
        }

         */
        WebElement BenzButton=driver.findElement(By.xpath("//label[@for='benz']"));
        BenzButton.click();
    }
    }

