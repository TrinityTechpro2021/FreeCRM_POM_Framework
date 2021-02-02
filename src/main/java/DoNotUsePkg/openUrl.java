package DoNotUsePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openUrl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "C:/Softwares/webDrivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("www.google.com");
	
	}

}
