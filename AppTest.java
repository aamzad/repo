package art1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase
{

	public AppTest( String testName )
	{
	super( testName );
	}
	
	public static Test suite()
	{
	return new TestSuite( AppTest.class );
	}
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	@FindBy(name="Submit")
	public WebElement Login;
	
	@FindBy(name="ptnt_name")
	public WebElement ptnt_name;
	
	public void testApp()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://71.122.15.163/dms/root.php");
	driver.findElement(By.name("username")).sendKeys("admin"); 
	driver.findElement(By.name("password")).sendKeys("demo"); 
	driver.findElement(By.name("Submit")).click(); 
	
	driver.findElement(By.name("ptnt_name")).sendKeys("er"); 
	
	
	//test is done lets pause and logout
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.get("http://71.122.15.163/dms/Home.php?call=logout");
	
	        
	}
}
