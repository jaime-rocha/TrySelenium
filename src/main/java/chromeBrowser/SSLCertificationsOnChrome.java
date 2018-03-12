package chromeBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificationsOnChrome {
    public static void main(String[] args) {

        //Setting desired capabilities for Chrome browser
        //This is for Chrome profile
        DesiredCapabilities chrome = DesiredCapabilities.chrome();
        //chrome.acceptInsecureCerts();
        chrome.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        chrome.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        //Belows to local browser
        ChromeOptions co = new ChromeOptions();
        co.merge(chrome);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.rakuten.com/");
    }
}
