package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");

        driver.findElement(By.xpath("//*[@id='widgetcatalogWizard']/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys("Disneyland - Anaheim, California");
        driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys(Keys.TAB);
        driver.findElement(By.id("H-fromDate")).sendKeys("03/04/2018");
        driver.findElement(By.id("H-toDate")).sendKeys("03/10/2018");
        driver.findElement(By.id("H-searchButtonExt1")).click();

        WebDriverWait d = new WebDriverWait(driver, 20);
        d.until(ExpectedConditions.visibilityOfElementLocated(By.id("changeSearchWizard")));

        driver.findElement(By.id("changeSearchWizard")).click();
    }
}
