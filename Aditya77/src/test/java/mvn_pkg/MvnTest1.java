package mvn_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MvnTest1 {
	WebDriver ad; 
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:/selenium-java-4.7.0/chromedriver.exe");
		  ad = new ChromeDriver();
		  ad.manage().window().maximize();
		  ad.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  Thread.sleep(1500);
	  }
	  @Test(priority = 0)
	  public void Login() throws InterruptedException {
		  ad.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
		  ad.findElement(By.name("password")).sendKeys("admin123");
		  ad.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		  Thread.sleep(3000);
	  }
	  @Test(priority = 1)
	  public void Homepage() throws InterruptedException {
		  ad.findElement(By.linkText("Admin")).click();
		  Thread.sleep(2000);
		  ad.findElement(By.linkText("My Info")).click();
		  Thread.sleep(2000);
		  ad.findElement(By.linkText("Dashboard")).click();
		  Thread.sleep(1000);	  
	  }
	  @Test(priority = 2)
	  public void Logout() throws InterruptedException{
		  ad.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
		  Thread.sleep(1000);
		  ad.findElement(By.linkText("Logout")).click();
		  Thread.sleep(3000);	  
	  }
	  @AfterTest
	  public void afterTest() {
		  ad.close();
	  }
	}

