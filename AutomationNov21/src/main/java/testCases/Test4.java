package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubmed.ncbi.nlm.nih.gov/11472466/");
		List<WebElement> elements = driver.findElements(By.cssSelector("div.docsum-content>a"));
		for (WebElement e : elements) {
			System.out.println(e.getText());
		}
		
		driver.quit();

	}

}
