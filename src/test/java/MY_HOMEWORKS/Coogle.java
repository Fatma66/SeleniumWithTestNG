package MY_HOMEWORKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coogle {
    /*
    Navigate to google
    validate the title
    Locate the search field
    Search "Renastech"
    close the browser
     */

    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    //String actualTitle= driver.getTitle();
    //String expectedTitle= "Google";
        WebElement searchButton=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchButton.sendKeys("books");
        searchButton.click();

        //WebElement clickButton=driver.findElement(By.xpath())





    }

}
