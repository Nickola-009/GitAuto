package GitAutomation.GitAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoamtion {
	public WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\104 ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Test
	public void GoogleSearch() {
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium"+Keys.ENTER);
		
	}
	@Test
	public void MyntraSearch() {
		driver.navigate().to("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Hats"+Keys.ENTER);
		
	}
	@Test
	public void WikiSearch() {
		driver.navigate().to("https://www.wikipedia.com");
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Universe"+Keys.ENTER);
		
	}
	

}
