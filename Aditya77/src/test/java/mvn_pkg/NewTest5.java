package mvn_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest5 {
	WebDriver wd;
	Robot rb;
	public String url1 = "https://demoqa.com/upload-download";
	public String url2 = "https://demoqa.com/alerts";
	public String url3 = "https://demoqa.com/browser-windows";
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		wd  = new ChromeDriver();
		wd.manage().window().maximize();		 
	  }
	@Test(enabled = false)
	public void file_upload() {
		wd.get(url1);
		wd.findElement(By.id("uploadFile")).sendKeys("C:/Users/RJ Aditya/Pictures/Screenshot 2021-12-12 123940.png"); //uploading a file
  }
	@Test(enabled = false)
	public void alerts() throws InterruptedException {
		wd.get(url2);
		wd.findElement(By.id("alertButton")).click();//clicking on alert button
		Alert alt = wd.switchTo().alert();
		System.out.println("Alert: " + alt.getText());//print alert text
		Thread.sleep(1000);
		alt.accept();//clicking okay or yes in alert box
		wd.findElement(By.id("timerAlertButton")).click();//clicks timer alert button
		WebDriverWait	wbw = new WebDriverWait(wd, 180);//explicit wait for 180 seconds
		wbw.until(ExpectedConditions.alertIsPresent());//wait till alert pops up
		System.out.println("Alert: " + alt.getText());//print alert text		
		alt.accept();//clicking okay or yes in alert box
		wd.findElement(By.id("confirmButton")).click();//clicks confirm button
		Thread.sleep(2000);
		alt.dismiss();
		wd.findElement(By.id("promtButton")).click();//clicks prompt button
		Thread.sleep(1000);
		alt.sendKeys("aditya");
		alt.accept();		
  }
	@Test
	public void window() throws AWTException, InterruptedException {
		wd.get(url3);
		/*wd.findElement(By.id("tabButton")).click();;
		Thread.sleep(2000);
		rb = new Robot();
		rb.keyPress(MenuKeyEvent.VK_CONTROL);
		rb.keyPress(MenuKeyEvent.VK_1);
		rb.keyRelease(MenuKeyEvent.VK_CONTROL);
		rb.keyRelease(MenuKeyEvent.VK_1);
		Thread.sleep(2000);*/
		for (int i=0; i<3; i++) {
			wd.findElement(By.id("windowButton")).click();//click window button 3 times
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		String Parent_Window = wd.getWindowHandle();
		System.out.println(Parent_Window);
		Set<String>allwindow = wd.getWindowHandles();
		System.out.println("No. of windows open: " + allwindow.size());
		System.out.println(allwindow);
		String lastwindow = "";
		for (String handle: allwindow) {
			wd.switchTo().window(handle);
			wd.get("https://google.co.in");
			Thread.sleep(2000);
			lastwindow = handle;
		}
		Thread.sleep(3000);
		wd.switchTo().window(Parent_Window);
		wd.get("https://opensource-demo.orangehrmlive.com/");
		wd.close();
		wd.switchTo().window(lastwindow);
		wd.get("https://gmail.com");
		
		/*wd.switchTo().window(Parent_Window);
		wd.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(5000);*/
		
		
	 }

  @AfterTest
  public void afterTest() {
	  //wd.quit();
  }

}
