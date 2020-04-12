package ItBootCamp.selenium.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZadatacFirstLastName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marijana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement elemfn, elemln;
		elemfn = driver.findElement(By.name("firstname"));
		elemfn.click();
		elemfn.sendKeys("Ivan");
		
		elemln = driver.findElement(By.name("lastname"));
		elemln.click();
		elemln.sendKeys("Damnjanovic");
		
		WebElement gender = driver.findElement(By.id("sex-0"));
		gender.click();
		
		WebElement profession = driver.findElement(By.id("profession-1"));
		profession.click();
		
		WebElement elemdate = driver.findElement(By.id("datepicker"));
		elemdate.sendKeys("06/03/2020");
		
		WebElement atester = driver.findElement(By.id("profession-1"));
		atester.click();
		
		WebElement atool = driver.findElement(By.id("tool-2"));
		atool.click();	
		
		WebElement continents = driver.findElement(By.id("continents"));
		continents.click();
		continents.sendKeys("Europe");
		
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		
		WebElement link = driver.findElement(By.linkText("Selenium Webdriver Tutorials Series"));
		link.click();
	}

}
