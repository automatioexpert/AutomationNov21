package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubmed.ncbi.nlm.nih.gov/11472466/");
		driver.findElement(By.cssSelector("a[href*='advance']")).click();
		driver.findElement(By.cssSelector("input#id_term")).sendKeys("services");
		driver.findElement(By.cssSelector("#query-box-input")).sendKeys("iteim83843");
	}

}
