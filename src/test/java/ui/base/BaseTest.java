package ui.base;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	protected WebDriver driver;
	public void start() {
		DriverFactory.initDriver();
		driver=DriverFactory.getDriver();
	}
	public void stop() {
		DriverFactory.quitDriver();
	}

}

