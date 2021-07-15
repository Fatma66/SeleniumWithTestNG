package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2C1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.orangehrm.com");


       /* WebElement userName =driver.findElement(By.name("txtUsername"));
       //<input name="txtUsername" id="txtUsername" type="text">
        userName.sendKeys("admin");
        ////<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
        WebElement password= driver.findElement(By.name("txtPassword"));
        password.sendKeys("admin123");
        WebElement loginButton =driver.findElement(By.name("Submit"));
        //<input type="submit" name="Submit" class="button" id="btnLogin"
        loginButton.click();

        */
        WebElement username =driver.findElement(By.id("txtUsername"));
        //<input name="txtUsername" id="txtUsername" type="text">
        username.sendKeys("admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("password");
        WebElement loginbutton =driver.findElement(By.id("btnLogin"));
        loginbutton.click();










    }



}
