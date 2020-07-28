package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Eclipse/libs/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String baseUrl= "https://learn.letskodeit.com/p/practice";
		driver.get(baseUrl);
		
		
		
		
	}

}
