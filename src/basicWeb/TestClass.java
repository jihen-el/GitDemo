package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	public static void main (String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Eclipse/libs/geckodriver-v0.26.0-win64/geckodriver.exe");
		
		WebDriver  driver= new FirefoxDriver() ;
		String baseURL ="https://learn.letskodeit.com/p/practice";
		driver.get(baseURL);
	}

	

}
