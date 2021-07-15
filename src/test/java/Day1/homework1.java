package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
                /*
        TASK
        Navigate to https://www.google.com/
        Get the title
        Navigate to "https://www.facebook.com/"
        Get the title
        Navigate Back
        Navigate Forward
        Refresh
         */

        driver.navigate().to("https://www.google.com/");
        String GoogleActualTitle = driver.getTitle();
        driver.navigate().to("https://www.facebook.com/");
        String FacebookActualTitle = driver.getTitle();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }



    }

