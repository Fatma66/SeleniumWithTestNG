package Day6;

import Utilities.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class D6_C1 {
    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Enter username --->Tester
//4- Enter password --->test
//5- Click "Login" button
//6- Verify title equals: Web Orders

    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtils.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        // driver.close();
    }

    @Test
    public void smartbearsoftware() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        username.sendKeys("Tester");
        password.sendKeys(("test"));
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }

}
/*
                String expectedTitle=actualTitle.getTitle();
                //Assert.assertEquals(invalidMessage,"Invalid credentials");
                Assert.assertTrue(errorMessage.isDisplayed());

                String actualTitle = driver.getTitle();
                Assert.assertTrue(actualTitle.equalsIgnoreCase("Google"));
                 */




