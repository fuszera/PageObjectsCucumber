package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOnPage {
	
	static String userNameName = "userName";
	static String passwordName = "password";
	static String logInButtonName = "login";

	public void logInAs(String user, String pass, WebDriver driver){
		
		driver.findElement(By.name(userNameName)).sendKeys(user);
		driver.findElement(By.name(passwordName)).sendKeys(pass);
		driver.findElement(By.name(logInButtonName)).click();
	}
	
}
