package MY_HOMEWORKS;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Check_location {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement password=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        username.sendKeys("Tester");
        password.sendKeys("test");
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement orderButton=driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderButton.click();

        WebElement customer = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        customer.sendKeys("Ahmet");
        WebElement strt = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        strt.sendKeys("Ailisa");
        WebElement cty = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        cty.sendKeys("Toronto");
        WebElement stat = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        stat.sendKeys("On");
        WebElement zipcode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        zipcode.sendKeys("M2R");
        WebElement Visa=driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_cardList_0"));
        Visa.click();
        Thread.sleep(2000);
        WebElement cardNumber=driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox6"));
        WebElement Expiredate= driver.findElement(By.cssSelector("#ctl00_MainContent_fmwOrder_TextBox1"));
        WebElement Process=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));

        //radio Buttonlari nece secirik? Select?



    }



}



