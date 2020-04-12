package lokatori;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Lokatori {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/ItBootCamp/selenium/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//	driver.get("http://shop.demoqa.com/my-account/");
		//  http://shop.demoqa.com/my-account/
		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * //driver.findElement(By.id("username")).sendKeys("ivan");
		 * username.sendKeys("ivan");
		 * 
		 * driver.findElement(By.id("password")).sendKeys("ivan123");;
		 * driver.findElement(By.cssSelector("input#password")).sendKeys("ivan123");
		 * //tag + cssID
		 */										//input.woocommerce-Input--text (. (tacka) je poziv za neku klasu)
										//tag + cssClass
										//tag[atribut=vrednost]
		
		
		// //img[@title='lime-snake-plunge-slinky-cross-back-midi-dress']
		
		/*
		 * driver.findElement(By.name("login")).click();
		 * 
		 * driver.navigate().to("http://shop.demoqa.com/");
		 * 
		 * driver.findElement(By.linkText("Search")).click();
		 * 
		 * driver.findElement(By.className("form-control")).sendKeys("dress");
		 * driver.findElement(By.className("form-control")).sendKeys(Keys.ENTER);
		 */
		driver.get("http://shop.demoqa.com/product/black-cross-back-maxi-dress/");
		
		//List<WebElement> slike = driver.findElements(By.className("noo-woo-thumbnails__image"));
		//relativna xPath //*[@id="product-1162"]/div[1]/div[1]/div[2]/div/div/div/div[1]/img
		//apsolutna full xPath /html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div[1]/img
		//relativni xPatn	//tag[@atribut='vrednost']
		//					//img[@title='black-cross-back-maxi-dress']
		
		driver.findElement(By.xpath("//img[@title='black-cross-back-maxi-dress']")).click();
		
		/*
		 * for(int i = 0; i<slike.size();i++) { slike.get(0).click(); sacekaj(); }
		 */
	}
	public static void sacekaj() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
