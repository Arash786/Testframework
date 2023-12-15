package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
	
	public static void main(String[] args) {
		
	}
	
	private final WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstResultLink1() {
		return driver.findElement(By.cssSelector("#search .g a"));
	

}

	public Object getFirstResultLink() {
		
		return null;
	}
}