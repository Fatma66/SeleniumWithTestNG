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

import java.util.concurrent.TimeUnit;
/*
1- Open a chrome browser
      2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
      3- Login(username=Tester, password=test)
         -Create a Login method and call it into your @Test
      4. Click on Order
      5. Select familyAlbum from product,
           set quantity to 5
      6. Click to “Calculate” button
      7. Fill address Info with @DataProvider method from TestNG
      8. Click on “visa” radio button
      9. Generate card number using @DataProvider
     10.Enter expiration date
     11. Click on “Process”
    12.Verify success message “New order has been successfully added.” is displaye
 */

public class h1 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtils.getDriver("chrome");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);

    }


    @Test
    public void smartbearlogin() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        userName.sendKeys("Tester");
        password.sendKeys("test");
        login.click();


    }

    @Test
    public void smartbearcalculate() {
        smartbearlogin();//yuxaridaki adi yaziram ki run verende onu da nezere alsin
        WebElement orderButton = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderButton.click();
        WebElement familyAlbum = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(familyAlbum);
        select.selectByIndex(1);//family drop Drown oldugundan ona "click" deyil
        // "select" emri vermeliyik Index 1 yazdik familyAlbum 2 cidir index 0-dan bashlayir

        WebElement quantity = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys("5");

        WebElement calculate = driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_txtTotal"));
        calculate.click();
    }

    @Test(dataProvider = "Address")
    public void Adress(String customername, String street, String city, String state, String zip) {
        smartbearcalculate();
        //AdressInformation String custname state city yazdim ki onlari dataProvide edeceyem
        //7. Fill address Info with @DataProvider method from TestNG
        WebElement customer = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        customer.sendKeys(customername);
        WebElement strt = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        strt.sendKeys(street);
        WebElement cty = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        cty.sendKeys(city);
        WebElement stat = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        stat.sendKeys(state);
        WebElement zipcode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        zipcode.sendKeys(zip);

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
    // 8. Click on “visa” radio button
    //      9. Generate card number using @DataProvider
    //     10.Enter expiration date
    //     11. Click on “Process”
    //    12.Verify success message “New order has been successfully added.” is displaye




































