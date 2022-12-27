package mvn_pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class ParallelTest1 {
	WebDriver wd;
	@Parameters("mybrowser")
	@BeforeTest
	  public void BT(String mybrowser) {
		  if(mybrowser.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  wd = new ChromeDriver();
		  }
		  else if (mybrowser.equalsIgnoreCase("firefox")) {
			  WebDriverManager.firefoxdriver().setup();
			  wd = new FirefoxDriver();		
		}
		  
	  }
  @Test
  public void Orangehrm() throws InterruptedException {
	  wd.get("https://opensource-demo.orangehrmlive.com/");
	  Thread.sleep(2000);
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@type='submit']")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.linkText("Logout")).click();
	  Thread.sleep(2000);
  }
  
	 

  @AfterTest
  public void afterTest() {
  }

}
