package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubmed.ncbi.nlm.nih.gov/advanced/");
		driver.findElement(By.xpath("//a[contains(text(),'NLM')]")).click();
		driver.quit();
	
	}

}
