package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// identify element
		WebElement p = driver.findElement(By.name("q"));
		
		// enter text with sendKeys() then apply submit()
		p.sendKeys("QUALITEST");
		
		p.submit();
		
		
	}
}
