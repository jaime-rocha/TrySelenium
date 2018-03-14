package internetExplorerBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTestonIE {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = DesiredCapabilities.internetExplorer();

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
        driver.get("https://www.msn.com/es-xl");
        System.out.println(driver.getTitle());

        driver.findElement(By.className("outlook")).click();
    }
}
