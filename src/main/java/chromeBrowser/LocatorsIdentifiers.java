package chromeBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdentifiers {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trabajopolis.bo/log-in/");
		driver.findElement(By.name("username")).sendKeys("example@testing.com");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/fieldset[4]/div[2]/input")).click();
		
		/* this line might no work because this is shown as a value, 
	    but it might not refer to this component or Selenium will not recognize element to perform action
		driver.findElement(By.linkText("Ingresar")).click(); */
		
		//driver.close();
	}

}