package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public static void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yesbank.in/digital-banking/online-banking/netbanking-services");
		driver.findElement(By.cssSelector("li.il_searchresOpen")).click();
		driver.findElement(By.cssSelector("input#searchmain")).sendKeys("services"+Keys.ENTER);
		driver.quit();

	}
}
