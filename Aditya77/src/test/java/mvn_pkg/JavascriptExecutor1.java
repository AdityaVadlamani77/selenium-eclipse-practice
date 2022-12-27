package mvn_pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class JavascriptExecutor1 {
	WebDriver wd;
	Actions act;
	@Test
  public void testcase1() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)wd;
		Thread.sleep(3000);
		js.executeScript("document.getElementById('userName').value='Aditya'");
		js.executeScript("document.getElementById('userEmail').value='aditya.vvkv.21@gmail.com'");
		js.executeScript("document.getElementById('currentAddress').value='New York City'");
		js.executeScript("document.getElementById('permanentAddress').value='New York City'");
		js.executeScript("window.scrollBy(0,500)");
		wd.findElement(By.id("submit")).click();
		//js.executeScript("document.getElementById('submit').click()");
		Thread.sleep(3000);	
		js.executeScript("window.scrollBy(0,-500)");
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]")).click(); //buttons tab
		Thread.sleep(2000);
		act = new Actions(wd);
		WebElement double_click_me =  wd.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]")); //double click me button
		Thread.sleep(1000);
		act.doubleClick(double_click_me).perform();
		Thread.sleep(300);
		WebElement right_click_me =  wd.findElement(By.xpath("//*[@id=\"rightClickBtn\"]")); //right click me button
		Thread.sleep(1000);
		act.contextClick(right_click_me).perform();
		Thread.sleep(300);
		WebElement click_me = wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[2]/div[3]/button")); //click me button
		act.click(click_me).perform();
		Thread.sleep(2000);		
		System.out.println("Title: " + js.executeScript("return document.title"));
		System.out.println("Domain: " + js.executeScript("return document.domain"));
		//System.out.println("Inner Text: " + js.executeScript("return document.documentElement.innerText"));
		System.out.println("Inner Text: " + js.executeScript("return document.getElementById('submit').innerText"));
		
		//js.executeScript("history.go(0)");
		//js.executeScript("window.history.forward(0)");
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get("https://demoqa.com/text-box");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  wd.quit();
  }

}
