package pom;

import generic.VerificationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends VerificationPage
{
	
	@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
	private WebElement signicon;
	
	@FindBy(xpath="//a[.='login']")
	private WebElement loginclick;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[.='Log in']")
	private WebElement clicklogin;
			
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	public void signIcon()
	{
		hover(signicon);
	}
	
	public void clickLog()
	{
		loginclick.click();
	}
	
	public void userName(String un)
	{
		username.sendKeys(un);
	}
	
	public void passWord(String pwd)
	{
		username.sendKeys(pwd);
	}
	public void click()
	{
		clicklogin.click();
	}
	
	

}
