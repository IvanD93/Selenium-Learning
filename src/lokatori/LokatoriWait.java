package lokatori;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LokatoriWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/ItBootCamp/selenium/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://shop.demoqa.com/my-account/");

		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("ivan");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input#password")));
		driver.findElement(By.cssSelector("input#password")).sendKeys("ivan123");
		
		driver.findElement(By.name("login")).click();
		
		driver.navigate().to("http://shop.demoqa.com/");
	
	}	
}
