package mvn_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest3 {
	WebDriver wd;
	@BeforeTest
	public void beforeTest() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	wd = new ChromeDriver();
	wd.manage().window().maximize();
	wd.navigate().to("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	}
	
	
  @Test
  public void f() {
	  String Actual_Title = wd.getTitle();
		String Expected_Title = "OrangeHRM1";
		Assert.assertEquals(Actual_Title, Expected_Title);
		
  }
}
