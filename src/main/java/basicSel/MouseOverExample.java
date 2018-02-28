package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        Actions act = new Actions(driver);
        WebElement signMenu = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));

        //Move an specific element and display pop up or menu when hanging over it
        act.moveToElement(signMenu).build().perform();
        act.moveToElement(searchField).click().keyDown(Keys.SHIFT).sendKeys("kindle").doubleClick().build().perform();
        act.moveToElement(signMenu).contextClick().build().perform();
    }
}
