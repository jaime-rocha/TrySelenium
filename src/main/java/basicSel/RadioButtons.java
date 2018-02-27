package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");

        driver.findElement(By.xpath("//input[@value='Milk']")).click();
        Boolean radioTest1 = driver.findElement(By.xpath("//input[@value='Milk']")).isSelected();
        System.out.println("Has Milk button been selected? " + radioTest1.toString());

        driver.findElement(By.xpath("//input[@value='Water']")).click();
        Boolean radioTest2 = driver.findElement(By.xpath("//input[@value='Water']")).isSelected();
        System.out.println("Has Water button been selected? " + radioTest2.toString());

        Boolean radioTest3 = driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected();
        System.out.println("Has Cheese button been selected? " + radioTest3.toString());

        Boolean radioTest4 = driver.findElement(By.xpath("//input[@value='Wine']")).isSelected();
        System.out.println("Has Wine button been selected? " + radioTest4.toString());

        Boolean radioTest5 = driver.findElement(By.xpath("//input[@value='Butter']")).isSelected();
        System.out.println("Has Butter button been selected? " + radioTest5.toString());

        Boolean radioTest6 = driver.findElement(By.xpath("//input[@value='Beer']")).isSelected();
        System.out.println("Has Beer button been selected? " + radioTest6.toString());

        int sizeGroup1 = driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println("How many radio buttons are in group 1 on web page? " + sizeGroup1);

        int sizeGroup2 = driver.findElements(By.xpath("//input[@name='group2']")).size();
        System.out.println("How many radio buttons are in group 2 on web page? " + sizeGroup2);

        String attrib = "";
        for (int x=0; x < sizeGroup1; x++) {
            driver.findElements(By.xpath("//input[@name='group1']")).get(x).click();
            attrib = driver.findElements(By.xpath("//input[@name='group1']")).get(x).getAttribute("value");
            if(attrib.equals("Butter"))
                driver.findElements(By.xpath("//input[@name='group2']")).get(x).click();
        }
    }
}
