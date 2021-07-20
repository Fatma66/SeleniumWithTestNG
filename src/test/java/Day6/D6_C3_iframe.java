package Day6;

import Utilities.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class D6_C3_iframe {


    /*
Navigate to "http://the-internet.herokuapp.com/iframe"
Clean the text field
Type "Hello it's me" to the text field
Validate the title
 */
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtils.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframes() {
        driver.get("http://the-internet.herokuapp.com/iframe");
      /*
          In order to interact with elements within an iframe, one needs to
          locate the iframe first by using locators
          and then SWITCH to the iframe
        */
        driver.switchTo().frame("mce_0_ifr"); //id for iframe
        WebElement messageBox = driver.findElement(By.id("tinymce"));
        messageBox.clear();
        messageBox.sendKeys("Hello it's me");
        //  driver.switchTo().parentFrame();// returns to  previous iframe ot html block
        driver.switchTo().defaultContent();// returns to the main html
        System.out.println(driver.getTitle());
    }
}