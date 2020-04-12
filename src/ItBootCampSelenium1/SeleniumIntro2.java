package ItBootCampSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ovo je relativna putanja i krece od projekta. Apsolutna putanja krece od C:\Users....  
		System.setProperty("webdriver.chrome.driver", "src/ItBootCamp/selenium/resources/chromedriver.exe");
		//klasa
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");   // ove 4 linije koda su uvek iste!
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().to("https://www.youtube.com");
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		
	//	driver.navigate().back();
		
	//	driver.navigate().forward();
		
		//U seleniumu postoje web elementi (ovo je kao string, poseban) i sa njime se definisu komande.
		WebElement search = driver.findElement(By.id("search"));
		
		search.sendKeys("Sport");
		//search.sendKeys(Keys.ENTER);
		
		WebElement searchicon = driver.findElement(By.id("search-icon-legacy"));
		
		searchicon.click();
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
