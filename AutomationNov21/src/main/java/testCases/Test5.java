package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pubmed.ncbi.nlm.nih.gov/11472466/");
		driver.findElement(By.cssSelector("button.trigger.usa-button")).click();
		driver.findElement(By.cssSelector("select[name='format']")).click();

	}

}
