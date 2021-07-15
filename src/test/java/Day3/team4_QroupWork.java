package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class team4_QroupWork {
    public static void main(String[] args) {
        /*
        Please go to amazon.com and locate elements below for 15 times. Due is next class
 locate elements by xpath using
-relative xpath
-Or/And
-Text
-Contains
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com/");
        


    }
}
