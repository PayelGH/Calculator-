import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverMethods extends CalculatorBase{
    @Test
    public void sum(){
        driver.findElement(By.xpath("//*[contains (text(), '8')]")).click();
        driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
        WebElement sum= driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]"));
        sum.click();
        WebElement output= driver.findElement(By.xpath("//*[@id=\"sciOutPut\"]"));
        Assert.assertEquals(output.getText(), " 10");

        }

    @Test
    public void percentage(){
        driver.findElement(By.xpath("//*[@ id=\"calcSearchTerm\"]")).sendKeys("percentage calculator");
        driver.findElement(By.xpath("//*[@id=\"bluebtn\"]")).click();
    }
}
