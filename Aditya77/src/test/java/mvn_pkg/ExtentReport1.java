package mvn_pkg;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ExtentReport1 {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver wd;
  @Test
  public void login() throws InterruptedException {
	  logger = extent.startTest("Aditya");
	  wd.get("https://opensource-demo.orangehrmlive.com/");
	  logger.log(LogStatus.PASS, "webpage has opened");
	  Thread.sleep(2000);
	  
	  String title = wd.getTitle();
	  logger.log(LogStatus.PASS, title);
	  
	  Assert.assertEquals("aditya", "aditya");
	  logger.log(LogStatus.PASS, "Assertion Passed");
	  
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  logger.log(LogStatus.PASS, "username entered");
	  
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  logger.log(LogStatus.PASS, "password entered");
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//*[@type='submit']")).click();
	  logger.log(LogStatus.PASS, "Login Successful");
	  Thread.sleep(2000);
  }
  @Test(dependsOnMethods = "login")
  public void logout() throws InterruptedException {
	  wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
	  logger.log(LogStatus.PASS, "Opened Dropdown");
	  Thread.sleep(1000);
	  wd.findElement(By.linkText("Logout")).click();
	  logger.log(LogStatus.PASS, "Logout Successful");
  }
  @BeforeTest
  public void beforeTest() {
	  extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/aditya1.html",true);
	  extent.loadConfig(new File(System.getProperty("user.dir")+ "src/test/java/extent-config.xml"));
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  extent.endTest(logger);
	  extent.flush();
	  extent.close();
	  wd.quit();
  }

}
