package mvn_pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FramesTest1 {
	WebDriver wd;
	String url1 = "https://demoqa.com/frames";
  @Test
  public void frames() {
	  JavascriptExecutor js = (JavascriptExecutor)wd;
	  List<WebElement> frame = wd.findElements(By.tagName("iframe"));
	  System.out.println("no.of frames: " + frame.size());
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	  for(int i=0; i<8; i++) 
	  {
		String f1 = frame.get(i).getAttribute("id");
		System.out.println(f1);
	  }
	  wd.switchTo().frame("frame2");
	  
	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get(url1);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  //Thread.sleep(5000);
	  //wd.quit();
  }

}
