package mvn_pkg;

import java.awt.AWTException;
import java.awt.Menu;
import java.awt.Robot;
import java.awt.Desktop.Action;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver wd;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/selenium-java-4.7.0/chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://rahulshettyacademy.com/practice-project");
		Thread.sleep(7000);
		}
  @Test
  public void test1() throws AWTException, InterruptedException {
	  Actions actions = new Actions(wd);
	  //WebElement link = wd.findElement(By.xpath("//*[@class='nav-outer clearfix']/nav/div[2]/ul/li[1]"));
	  //WebElement link = wd.findElement(By.xpath("//*[@class='pull-left logo-outer']/div"));
	  WebElement link = wd.findElement(By.xpath("//*[@class='fa fa-youtube']"));
	  actions.contextClick(link).build().perform();	  
	  Robot rb = new Robot();
	  rb.keyPress(MenuKeyEvent.VK_DOWN);
	  rb.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(1000);
	  rb.keyPress(MenuKeyEvent.VK_CONTROL);
	  rb.keyPress(MenuKeyEvent.VK_TAB);
	  Thread.sleep(6000);
	  /*rb.keyPress(MenuKeyEvent.VK_CONTROL);
	  rb.keyPress(MenuKeyEvent.VK_TAB);*/
	  rb.keyRelease(MenuKeyEvent.VK_CONTROL);
	  rb.keyRelease(MenuKeyEvent.VK_TAB);
	  }
  @AfterTest
  public void aftertest() {
  wd.quit();
  }
}
