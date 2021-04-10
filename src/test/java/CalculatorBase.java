import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class CalculatorBase {
     WebDriver driver;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Pragra\\Downloaded tools\\all Webdrivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.calculator.net/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
    Thread.sleep(4000);
    driver.quit();
    }
}
