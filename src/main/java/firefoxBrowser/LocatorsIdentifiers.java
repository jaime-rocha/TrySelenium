package firefoxBrowser;

public class LocatorsIdentifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("example@testing.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("#Login")).click();
		
		
		/* this line might no work because the class contain a string with spaces between words, 
	    so this will cause an error when Selenium tries to find element and to perform action, this is because Selenium
	    can't recognize this type of string as parameter for any method, neither a compound class.
		driver.findElement(By.className("input r4 wide mb16 mt8 password")).sendKeys("1234567890");; */
		
		//driver.close();

	}

}
