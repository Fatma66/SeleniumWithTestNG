package MY_HOMEWORKS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CHECK_BOX_ILKAY {
    /*
    Please go to ebay.com and locate elements using locators below  each for 15 times. Due date is next class.
    -By.name
    -By.tagName
    -By.id
    -By.className
    -By.linkText
    -By.partialLinkText
  Example: driver.findElement(By.className(“orange”));
     */
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement searchfield=driver.findElement(By.xpath("//input[@type='text']"));
        searchfield.sendKeys("books");
        Thread.sleep(3000);
        //WebElement.seatch =driver.findElement(By.xpath("//input[@type='text']"));


        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        WebElement ebay=driver.findElement(By.id("gh-l-h1"));
        Thread.sleep(3000);
       ebay.click();
    }

    public static class homework {
        /*
        1)Navigate to http://the-internet.herokuapp.com/
    2)Validate  page title
    3)Validate  page url
    4)Click Checkboxes
    5)Change Checkbox 1 to “Checked”
    6)Validate that its “checked”
    7)Change Checkbox 2 to “Unchecked”
    8)Validate that Checkbox 2 is “Unchecked”
    9)Navigate Back to //the-internet.herokuapp.com/ main page
    10)Click Dropdown
    11)Choose “Option 2” from the drop down
    12)Close the browser
         */
        public static void main(String[] args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();{


                WebDriverManager.chromedriver().setup();
                ///WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new ChromeDriver();
                //1)Navigate to http://the-internet.herokuapp.com/
                driver.navigate().to("http://the-internet.herokuapp.com/");
                driver.manage().window().maximize();
                //Validate  page title
                String ActualTitle = driver.getTitle();
                String expectedTitle = "The Internet";
                if (expectedTitle.equalsIgnoreCase(ActualTitle)) {
                    System.out.println(" Test passed");
                } else {
                    System.out.println("Test failed");
                }
                //3)Validate  page url
                String actualURL = driver.getCurrentUrl();
                String expectedURL = "http://the-internet.herokuapp.com/";
                if (expectedURL.equalsIgnoreCase(actualURL)) {
                    System.out.println("Test is well");
                } else {

                    System.out.println("Test is failed");
                }
                //4)Click Checkboxes
                WebElement clickCheckbox = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a"));
                clickCheckbox.click();
                //5)Change Checkbox1 to “Checked”
                WebElement Checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
                Thread.sleep(3000);
                Checkbox1.click();
                //6)Validate that its “checked”
                if (Checkbox1.isSelected()) {
                    System.out.println("It is selected");
                } else {
                    System.out.println("Tty again");
                }
                //Change Checkbox2 to “Unchecked”


                //8)Validate that Checkbox 2 is “Unchecked”

                //9)Navigate Back to //the-internet.herokuapp.com/ main page

                driver.navigate().back();

                //10)Click Dropdown
                WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a"));
                Dropdown.click();

                //11)Choose “Option 2” from the drop down

                WebElement Option2=driver.findElement(By.id("dropdown"));
                Option2.click();
                WebElement option2=driver.findElement(By.xpath("//option[@value='2']"));
                option2.click();
                //12)Close the browser
                driver.close();


            }
            ///WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new ChromeDriver();
            //1)Navigate to http://the-internet.herokuapp.com/
            driver.navigate().to("http://the-internet.herokuapp.com/");
            driver.manage().window().maximize();
            //Validate  page title
            String ActualTitle = driver.getTitle();
            String expectedTitle = "The Internet";
            if (expectedTitle.equalsIgnoreCase(ActualTitle)) {
                System.out.println(" Test passed");
            } else {
                System.out.println("Test failed");
            }
            //3)Validate  page url
            String actualURL = driver.getCurrentUrl();
            String expectedURL = "http://the-internet.herokuapp.com/";
            if (expectedURL.equalsIgnoreCase(actualURL)) {
                System.out.println("Test is well");
            } else {

                System.out.println("Test is failed");
            }
            //4)Click Checkboxes
            WebElement clickCheckbox = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a"));
            clickCheckbox.click();
            //5)Change Checkbox1 to “Checked”
            WebElement Checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
            Thread.sleep(3000);
            Checkbox1.click();
            //6)Validate that its “checked”
            if (Checkbox1.isSelected()) {
                System.out.println("It is selected");
            } else {
                System.out.println("Tty again");
            }
            //Change Checkbox2 to “Unchecked”


           //8)Validate that Checkbox 2 is “Unchecked”

           //9)Navigate Back to //the-internet.herokuapp.com/ main page

            driver.navigate().back();

            //10)Click Dropdown
            WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a"));
            Dropdown.click();

            //11)Choose “Option 2” from the drop down

            WebElement Option2=driver.findElement(By.id("dropdown"));
            Option2.click();
            WebElement option2=driver.findElement(By.xpath("//option[@value='2']"));
            option2.click();
            //12)Close the browser
            driver.close();


        }
    }
}
