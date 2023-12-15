package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	
public class GoogleHomePage {

	public GoogleHomePage(WebDriver driver) {
		
	}

	public static void main(String[] args) {
	
	}

	private WebDriver driver;

	public void GoogleHomePage1(WebDriver driver) {
		this.driver = driver;
	}

	public void open() {
		driver.get("https://www.google.com");
	}

	public void search(String searchTerm) {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchTerm);
		searchBox.sendKeys(Keys.RETURN);
	
	
	
}
}
