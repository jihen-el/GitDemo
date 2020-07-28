package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDXpathDemo {
public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver","/Eclipse/libs/chromedriver_win32/chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    String baseURL= "https://learn.letskodeit.com/";
    driver.get(baseURL);
   //river.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");
    driver.findElement(By.name("enter-name")).sendKeys("Automation");
}
}
