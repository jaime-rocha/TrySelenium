package firefoxBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriver_FirstView {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/"); //Get to hit the URL
		
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
