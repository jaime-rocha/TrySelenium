package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGridsExample {
    public static void main(String[] args) {

        int sum=0;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowCount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
        System.out.println("Number of rows in the table: " + rowCount);

        int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        for(int i=0;i<count-2;i++)
        {
            String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueInteger=  Integer.parseInt(value);
            sum= sum + valueInteger;    //103
        }

        //System.out.println(sum);

        String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasValue=Integer.parseInt(Extras);
        int TotalSumValue=sum+extrasValue;
        System.out.println(TotalSumValue);


        String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int ActualTotalVAlue=Integer.parseInt(ActualTotal);
        if(ActualTotalVAlue==TotalSumValue)
        {
            System.out.println("Count Matches");
        }
        else
        {
            System.out.println("count fails");
        }
    }

}