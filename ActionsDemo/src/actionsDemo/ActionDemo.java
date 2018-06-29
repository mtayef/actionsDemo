package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo {

	static WebDriver driver;
	static WebElement accList;

	@Test
	public static void action() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		accList = driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"));

		Actions act = new Actions(driver);
		act.moveToElement(accList).perform();
	}
}