package DomaciZadaci;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marijana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://itbootcamp.rs");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.manage().window().setSize(new Dimension(1050, 660));
		
		
		String url = ("https://itbootcamp.rs");
		
		driver.get(url);
		
		String naslov = driver.getTitle();
		
		int duzina = driver.getTitle().length();
		
		System.out.println("Naslov stranice je " + naslov);
		System.out.println("Duzina naslova stranice je " + duzina);
		

		driver.close();
		
		
	}

}
