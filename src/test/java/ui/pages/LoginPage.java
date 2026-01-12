package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By loginLink=By.className("ico-login");
	By email=By.id("Email");
	By password=By.id("Password");
	By loginBtn=By.xpath("//input[@class='button-1 login-button']");
	
	public void login(String user,String pass) {
		driver.findElement(loginLink).click();
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}

}
