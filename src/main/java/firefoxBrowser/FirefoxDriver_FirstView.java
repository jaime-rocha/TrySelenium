package firefoxBrowser;

public class FirefoxDriver_FirstView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/"); //Get to hit the URL
		
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
