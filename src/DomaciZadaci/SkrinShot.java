package DomaciZadaci;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkrinShot {

	public static void main(String[] args) throws Exception {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marijana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://drive.google.com/open?id=1Q-iuzvfA4ixnVbGZUFwvLbAGVdyNEOhA");
		
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("C:\\Users\\Marijana\\Downloads\\Screen.png"));
		
		driver.quit();
		}
		
	}

