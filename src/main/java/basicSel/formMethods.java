package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class formMethods {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.makemytrip.com/");

        System.out.println("Before to click on Multi city radio button");
        System.out.println(driver.findElement(By.xpath("//*[@id='addModifyBtn']")).isDisplayed());

        driver.findElement(By.xpath("//*[@id='multicity']/label")).click();

        System.out.println("After to click on Multi city radio button");
        System.out.println(driver.findElement(By.xpath("//*[@id='addModifyBtn']")).isDisplayed());
    }
}
