		<dependency>
        <groupId>org.hibernate.javax.persistence</groupId>
        <artifactId>hibernate-jpa-2.0-api</artifactId>
        <version>1.0.1.Final</version>
    </dependency>



package seehanGrp.seehanAr;
mavProj1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
   @FindBy(xpath="//input[@name='username']")
   public WebElement username;

     @FindBy(name="password")
     public WebElement password;
     @FindBy(name="Submit")
     public WebElement Login;


    public void testApp()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://71.122.15.163/dms/");
        driver.findElement(By.name("username")).sendKeys("admin"); 
        driver.findElement(By.name("password")).sendKeys("demo"); 
        driver.findElement(By.name("Submit")).click(); 
                
    }
}
