package basicSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckboxExample {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com//");
		
		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
		Boolean selectCheckbox1 = driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected();
		
		System.out.println("Was Checkbox 1 selected?: " + selectCheckbox1.toString());
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		Boolean selectCheckbox2 = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected();
		
		System.out.println("Was Checkbox 2 selected?: " + selectCheckbox2.toString());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Boolean selectCheckbox3 = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		
		System.out.println("Was Checkbox 3 selected?: " + selectCheckbox3.toString());
		
	}

}
