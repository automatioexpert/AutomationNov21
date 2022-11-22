package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubmed.ncbi.nlm.nih.gov/11472466/");
		System.out.println(driver.findElement(By.cssSelector("img[alt*='U.S']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("img[alt*='U.S']+p")).getText());
		driver.findElement(By.cssSelector("input[type='Search']")).sendKeys("user34938");
		driver.findElement(By.cssSelector("button.search-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("section.search-results-list")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.results-amount")).getText());
	System.out.println("I am the best expert on the Planet!!");
	driver.quit();

	}

}
