package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindowsExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bisa.com/");
        driver.findElement(By.xpath("//*[@id='enlace2']")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> its = ids.iterator();
        String parentId = its.next();
        String childId = its.next();
        driver.switchTo().window(childId);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentId);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());
    }
}
