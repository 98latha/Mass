package execution;

import generic.Excel;
import generic.TestMethod;

import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginTest extends TestMethod
{
	@Test
	public void Login()
	{
		// String user = Excel.getCell(path, "LoginTest", 1, 1);
		 //String pwd = Excel.getCell(path, "LoginTest", 1, 2);
        LoginPage lp=new LoginPage(driver);
		lp.signIcon();
		lp.clickLog();
		lp.userName("rrrani13@gmail.com");
		lp.passWord("reddirani");
		lp.click();
	}

}
 