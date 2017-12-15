import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\software\\Selenium with java\\Geckodriver\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	@Test
	public void Login()
	{
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("suyal.bhuwan7");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
	}
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
