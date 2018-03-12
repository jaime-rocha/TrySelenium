package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutosuggestiveDropDownExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.ksrtc.in/oprs-web/");

        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        Thread.sleep(2000);
        //System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

        //Javascript DOM can extract hidden elements because Selenium cannot identify any of them - (Ajax implementation)
        //To solve it, investigate the properties of object if it has some hidden text

        //JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String javaScript = "return document.getElementById('fromPlaceName').value";
        String objText = (String) js.executeScript(javaScript);

        while (!objText.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
        {
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            objText = (String) js.executeScript(javaScript);
            System.out.println("First set of words found: " + objText);
        }

        int i = 0;

        while (!objText.equalsIgnoreCase("BENGALURU INTEASAS AIPORT"))
        {
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            objText = (String) js.executeScript(javaScript);
            System.out.println("This is the target search? " + objText);
            if(i > 10)
                break;
        }

        if(i>10)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element  found");
        }

    }
}
