import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement clickBMWbutton=driver.findElement(By.id("bmwradio"));
        clickBMWbutton.click();
        boolean bmwRadioSelected= clickBMWbutton.isSelected();
        if(!bmwRadioSelected){ // is its not selected print out "failed
            System.out.println("failed");
        }else{  //else passed
            System.out.println("passed");
        }


       // WebElement clickBenzobutton=driver.findElement(By.id("benzradio"));
       // clickBenzobutton.click();
        //WebElement clickHondobutton=driver.findElement(By.id("hondaradio"));
        //clickHondobutton.click();








    }
}
