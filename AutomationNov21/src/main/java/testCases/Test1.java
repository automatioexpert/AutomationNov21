package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/My%20Framework%20VV/Nov2022/Automation/target/cucumber.html");
	
		System.out.println(driver.getTitle());
		System.out.println("I am the best expert on the Planet");
		driver.quit();
	}

}

