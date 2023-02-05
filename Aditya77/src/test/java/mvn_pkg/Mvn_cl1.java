package mvn_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.swing.event.MenuKeyEvent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mvn_cl1 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1500);
		/*wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("Admin")).click();
		Thread.sleep(2000);
		wd.findElement(By.linkText("My Info")).click();
		Thread.sleep(2000);
		wd.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
		Thread.sleep(1000);
		wd.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);	*/
		File scr = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:/Users/RJ Aditya/Pictures/scr.png"));
		
		
 		
		
		
		
		//wd.close();
	}
}