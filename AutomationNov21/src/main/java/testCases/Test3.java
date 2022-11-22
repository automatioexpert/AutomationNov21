package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubmed.ncbi.nlm.nih.gov/11472466/");
		driver.findElement(By.cssSelector("a#account_login")).click();
		System.out.println(driver.findElement(By.cssSelector("div.usa-alert-body")).getText());

		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Log in')]")).getText());
		
		driver.quit();
	}

}
