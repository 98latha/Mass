package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class VerificationPage
{
	WebElement ele;
	WebDriver driver;
	
	Actions a=new Actions(driver);
	
	public VerificationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			Assert.fail();
			
		}
	}
	public void verifyElement(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not matching",true);
			Assert.fail();
			
		}
		
	}
	public void hover(WebElement ele)
	{
	
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ele));
			//Thread.sleep(3000);
		a.moveToElement(ele).perform();
		Reporter.log("Element is present",true);
	}
	catch(Exception e)
	{
		Reporter.log("Element is not present",true);
		Assert.fail();
	}
	}
	

}
