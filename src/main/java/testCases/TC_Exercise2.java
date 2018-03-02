package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Exercise2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement footer_SecSection = driver.findElement(By.xpath("/html/body/div[5]/div/div/footer/div[2]/table/tbody/tr/td[2]/ul"));
        int numberLinks = footer_SecSection.findElements(By.tagName("a")).size();

        //Obtain Site map link into a loop, checking out all links and comparing to contains method
        String BeforeClicking = " ";
        String AfterClicking;
        for(int i=0; i < numberLinks; i++) {
            if (footer_SecSection.findElements(By.tagName("a")).get(i).getText().contains("Mapa del sitio")) {
                BeforeClicking = driver.getTitle();
                footer_SecSection.findElements(By.tagName("a")).get(i).click();
                break;
            }
        }

        //Compare page title before clicking on site map link and after clicking on it, this is to affirmed that page has linked well.
        AfterClicking = driver.getTitle();
        if(BeforeClicking.equals(AfterClicking)) {
            //System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/h3")).isDisplayed());
            System.out.println(BeforeClicking);
            System.out.println(AfterClicking);
            System.out.println("Both pages have matched, TC Passed!!");
        }
        else {
            System.out.println("Both pages haven't matched, TC Failed!!");
        }
    }
}
