package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestMethod implements Constants
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(KEY, VALUE);
		driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
