package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Profiles {
	public static void main (String[] args) {
		System.setProperty("webdriver.gecko.driver ","/Eclipse/libs/geckodriver-v0.26.0-win64/geckodriver.exe");
		String baseURL="https://letskodeit.teachable.com/";
		
		WebDriver driver;
		
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile  fxProfile = profiles.getProfile("automation");
		
		FirefoxOptions options = new FirefoxOptions(); 
		options.setProfile(fxProfile);
		
	
		driver=new FirefoxDriver();
		 
	
	  driver.manage().window().maximize();
	   driver.get(baseURL);
	 
	 
		
	}

}
