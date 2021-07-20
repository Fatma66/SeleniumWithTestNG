package MY_HOMEWORKS;

import Utilities.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ceylan_version {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtils.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        // driver.quit();
    }

    @Test
    public void smartbearlogin() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement usernameBox = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        WebElement passwordBox = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        usernameBox.sendKeys("Tester");
        passwordBox.sendKeys("test");
        WebElement loginbutton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginbutton.click();
    }

    @Test
    public void smartbearcalculate() {
        smartbearlogin();
        WebElement clickorder = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        clickorder.click();
        WebElement clickproduct = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(clickproduct);
        select.selectByIndex(1);
        WebElement clickquantity = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity"));
        clickquantity.sendKeys("5");
        WebElement clickcalculate = driver.findElement(By.xpath("//input[@class='btn_dark' and @value='Calculate']"));
        clickcalculate.click();
    }

    @Test(dataProvider = "Address")
    public void filladdress(String customername, String street, String city, String state, String zip) {
        smartbearcalculate();
        WebElement customer = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtName"));
        customer.sendKeys(customername);
        WebElement strt = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox2"));
        strt.sendKeys(street);
        WebElement cty = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox3"));
        cty.sendKeys(city);
        WebElement stt = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox4"));
        stt.sendKeys(state);
        WebElement zp = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox5"));
        zp.sendKeys(zip);
    }

    @DataProvider(name = "Address")
    public static Object[][] obj() {
        Object[][] objects = {
                {"ahmet", "bleu", "to", "on", "35"},
                {"ilaky", "maple", "qu", "on", "34"}
        };
        return objects;

    }
}
