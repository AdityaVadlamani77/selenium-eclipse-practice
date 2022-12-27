package mvn_pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest6 {
	WebDriver wd;
	Robot rb;
	String url1 = "https://opensource-demo.orangehrmlive.com/";
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {	  
	  Thread.sleep(2000);
	  wd.findElement(By.name("username")).sendKeys(n);
	  wd.findElement(By.name("password")).sendKeys(s);
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@type='submit']")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
	  Thread.sleep(2000);
	  wd.findElement(By.linkText("Logout")).click();
	  Thread.sleep(2000);
	}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Aditya", "aditya123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
		wd  = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get(url1);
  }

  @AfterTest
  public void afterTest() {
  }

}
