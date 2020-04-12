package ItBootCampSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumIntro {
		
	WebDriver driver;
	String title;
		@BeforeClass
		public void openBrowser() {
			
		System.setProperty("webdriver.chrome.driver", "src/ItBootCamp/selenium/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		
		@Test
		public void testGoogle() {
			
		driver.get("https://www.google.com");  
		title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		}
		
		@Test
		
		public void testYouTube() {
		driver.navigate().to("https://www.youtube.com");
		title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "YouTube");
		}

		@AfterClass
		public void closeBrowser() {
		driver.close();
		
}

}
