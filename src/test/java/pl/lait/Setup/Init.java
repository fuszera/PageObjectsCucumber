package pl.lait.Setup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Init {
	
	
	//static FirefoxDriver driver;
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver == null){
			
			URL hubUrl = null;
			
			try {
				// po uruchomieniu huba i noda (java -jar seleniumserver...) ustawiamy jego adres IP (localhost - nasz komputer, wszystko na tej samej maszynie)
				hubUrl = new URL("http://192.168.0.116:4444/wd/hub/");
			} catch (MalformedURLException e) {				
				e.printStackTrace();
				
			}
			
			//zmieniamy firefoxDriver na WebDriver, wiec trzeba tez podac jakeij przegladarki oczekujemy
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			
			//wylaczamy stary sposob i wskazujemy nowy - RemoteWebDriver - podajac w parametrach, gdzi ma wolac
			//driver = new FirefoxDriver();			
			driver = new RemoteWebDriver(hubUrl, cap);
			
			driver.get("http://newtours.demoaut.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		} else {
			return driver;
		}
		
	}
	
	
	public static void close() {
		driver.close();
		driver.quit();
		driver = null;
	}
	
	@After
	public void cleanUp(){
		close();
	}

}
