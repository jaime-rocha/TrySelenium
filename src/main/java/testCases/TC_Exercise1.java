package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_Exercise1 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/");
        int numberLinks = driver.findElements(By.tagName("a")).size();
        System.out.println("How many links does this page have? " + numberLinks);

        //Count number of links in the footer section of page
        WebElement footer = driver.findElement(By.xpath("//*[@id='glbfooter']"));
        System.out.println("How many links does the footer section have? " + footer.findElements(By.tagName("a")).size());

        //Count number of links in the second section of footer section of page
        WebElement secSection_footer = footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
        int numberLinks_secSection_footer = secSection_footer.findElements(By.tagName("a")).size();
        System.out.println("How many links does the second section from footer have? " + numberLinks_secSection_footer);

        //Return all names of each link from second section in the footer of page
        for(int i=0; i < numberLinks_secSection_footer; i++) {
            System.out.println(secSection_footer.findElements(By.tagName("a")).get(i).getText());
        }
    }
}
