package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pl.lait.Setup.Init;

public class ReservTest extends Init{

	protected WebDriver driver;
	
	@Before
	public void init(){
		driver = getDriver();
		
	}
	
	@After
	public void end(){
		cleanUp();
	}
}