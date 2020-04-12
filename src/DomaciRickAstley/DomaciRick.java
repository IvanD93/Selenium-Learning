package DomaciRickAstley;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DomaciRick {
	
	WebDriver driver;
	WebDriverWait wait;
	static WebElement searchInput;
	static WebElement song;
	static WebElement next_song;
	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);
	}

	@Test(priority = 1)
	public void openYouTube() {
		driver.get("https://www.youtube.com/");
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.youtube.com/";
		Assert.assertEquals(currentURL, expectedURL);
	}

	@Test(priority = 2)
	public void searchSong() {
		searchInput = driver.findElement(By.name("search_query"));
		searchInput.sendKeys("Rick Astley");
		searchInput.sendKeys(Keys.ENTER);
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.youtube.com/results?search_query=rick+astley";
		Assert.assertEquals(currentURL.toLowerCase(), expectedURL.toLowerCase());
	}

	@Test(priority = 3)
	public void playSong() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Rick Astley - Never Gonna Give You Up (Video)")));
		song = driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up (Video)"));
		song.click();
	}

	@Test(priority = 4)
	public void playNextSong() {
		next_song = driver.findElement(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[2]/div/div[3]/ytd-watch-next-secondary-results-renderer/div[2]/ytd-compact-video-renderer[1]/div[1]/div/div[1]/a/h3/span"));
		next_song.click();
	}

	@AfterClass
	public void afterClass() {
		driver.close();

}
}