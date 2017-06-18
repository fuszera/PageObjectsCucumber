package pl.lait.Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.PageObjects.*;
import pl.lait.Setup.Init;

public class ReservationTest extends Init {

	protected static WebDriver driver;

	//@Before
	public void run() {
		driver = getDriver();
	}

	//@Test
	public void reservation() {
		MainPage mainPage = new MainPage();
		SignOnPage signOnPage = new SignOnPage();
		ReservationPage reservationPage = new ReservationPage();

		// przechodzimy w glownym menu do strony SIGN-ON
		mainPage.link_signOn(driver).click();

		// logujemy sie jako fuszera, z wykorzystaniem podanego hasla, nastepnie
		// klikamy button login
		signOnPage.logInAs("fuszera", "123QW!@#", driver);

		// wypelniamy pierwsza strone rezerwacji
		// checklist
		reservationPage.radio_oneWay(driver).click();
		// lista pasazerow, obie metody
		reservationPage.selectPassengersCount(driver, "3");
		reservationPage.selectPassengersCount(driver).selectByVisibleText("4");
		// start port, from
		reservationPage.selectFromPort(driver, "Seattle");
		// data
		reservationPage.selectFromMonth(driver, "August");
		reservationPage.selectFromDay(driver, "20");

		// target port, to
		reservationPage.selectToPort(driver, "Paris");
		// data
		reservationPage.selectToMonth(driver, "December");
		reservationPage.selectToDay(driver, "2");

		// preferences
		reservationPage.radio_servClass(driver).click();
		reservationPage.selectAirline(driver, "Pangea Airlines");
	}

}
