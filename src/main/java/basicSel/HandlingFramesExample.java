package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFramesExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");

        //How many iframes would have this web page?
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //Going inside iframe and web element actions
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
        a.dragAndDrop(source, target).build().perform();

        //Going outside iframe and keep finding other elements on page
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[8]/a")).click();
    }
}
