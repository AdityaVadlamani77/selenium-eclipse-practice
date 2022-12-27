package mvn_pkg;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mvn_cl2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='category-cards']/div[1]/div/div[3]/h5")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/span/div")).click();
		Thread.sleep(1000);		
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[5]/span/div")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@class='left-pannel']/div[1]/div[5]/div[1]/ul[1]/li[4]/span")).click();
		Thread.sleep(2000);
		WebElement a1 = wd.findElement(By.id("draggable"));
		WebElement a2 = wd.findElement(By.id("droppable"));
		Actions b1 = new Actions(wd);
		b1.dragAndDrop(a1, a2).build().perform();
		}
}
