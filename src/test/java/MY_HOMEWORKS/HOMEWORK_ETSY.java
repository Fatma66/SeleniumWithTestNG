package MY_HOMEWORKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HOMEWORK_ETSY {
    public static void main(String[] args) {
        /*
        Go to https://www.etsy.com/
-Maximize window
-Verify title
-Verify Current Url
-Go to https://www.amazon.com/
-Verify title
-Verify Current Url
-Navigate Back
-Refresh
-Quit browser

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Go to https://www.etsy.com/
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        String actualTitle=driver.getTitle();
        String expectedTitle="Etsy";
        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println(" Test passed");
        } else {
            System.out.println("Test failed");
        }



    }
}
