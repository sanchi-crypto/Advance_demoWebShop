package ui.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	public static void initDriver() {
		String browser=ConfigReader.get("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		else
		{
			throw new RuntimeException("Unsupported browser");
		}
		driver.get().manage().window().maximize();
		driver.get().get(ConfigReader.getBaseUrl());
	}
	public static WebDriver getDriver() {
		return driver.get();
	}
	public static void quitDriver() {
		driver.get().quit();
		driver.remove();
	}
	
	}
	


