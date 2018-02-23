package basicSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com//");
		
		//static dropdown code, follow up
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("1");
		s.selectByIndex(5);
		s.selectByVisibleText("8");
		
		System.out.println("All static dropdown haven been choosen");
		
		//dynamic dropdown code, follow up
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXE']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		System.out.println("All dynamic dropdown haven been choosen");

	}

}
