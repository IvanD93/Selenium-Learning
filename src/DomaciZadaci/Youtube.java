package DomaciZadaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marijana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/");
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
	/*	driver.get("https://www.youtube.com");
		
		WebElement link = driver.findElement(By.linkText("Reload this page"));
		link.click();
		*/
		
		
	
	
	}

}
