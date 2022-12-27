package mvn_pkg;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mvn_cl4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='category-cards']/div[1]/div/div[3]/h5")).click(); //elements
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span")).click(); //text box tab
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("Aditya Vadlamani"); //full name
		Thread.sleep(1000);		
		wd.findElement(By.xpath("//*[@id=\'userEmail\']")).sendKeys("aditya.vvkv.21@gmail.com"); //email
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\'currentAddress\']")).sendKeys("2571 Wallingford Dr, Beverly Hills, CA 90210"); //current address	
		wd.findElement(By.xpath("//*[@id=\'permanentAddress\']")).sendKeys("2571 Wallingford Dr, Beverly Hills, CA 90210"); // permanent address
		Robot rb = new Robot();
		rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();//check box tab
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[2]/div/div/button[1]")).click(); //expand button
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[2]/div/ol/li/span/label/span[3]")).click(); //home check box
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]/span")).click(); //radio button tab
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click(); //yes radio button
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")).click(); //impressive radio button
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]")).click(); //web tables tab
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"delete-record-3\"]")).click();  //delete record no.3
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"edit-record-1\"]")).click();  //edit record no.1
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'firstName\']")).clear(); //clear first name box
		Thread.sleep(300);
		wd.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys("Aditya"); //type first name
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\'lastName\']")).clear(); //clear last name box
		Thread.sleep(300);
		wd.findElement(By.xpath("//*[@id=\'lastName\']")).sendKeys("Vadlamani"); //last name
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\'userEmail\']")).clear(); //clear email box
		Thread.sleep(300);
		wd.findElement(By.xpath("//*[@id=\'userEmail\']")).sendKeys("aditya.vvkv.21@gmail.com"); //type email
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\'age\']")).clear(); //clear age box
		Thread.sleep(300);
		wd.findElement(By.xpath("//*[@id=\'age\']")).sendKeys("24"); //type age
		Thread.sleep(1000);	
		wd.findElement(By.xpath("//*[@id=\'salary\']")).clear(); //clear salary box
		Thread.sleep(300);
		wd.findElement(By.xpath("//*[@id=\'salary\']")).sendKeys("350000"); //type salary
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\'department\']")).clear();// clear department box
		Thread.sleep(300);
		wd.findElement(By.xpath("//*[@id=\'department\']")).sendKeys("Software Testing"); //type department
		Thread.sleep(1000);	 
		wd.findElement(By.xpath("//*[@id=\"submit\"]")).click(); //submit button
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]")).click(); //buttons tab
		Thread.sleep(2000);
		Actions act = new Actions(wd);
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
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_DOWN);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]")).click(); //links tab
		Thread.sleep(2000);
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_DOWN);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"created\"]")).click(); //created link
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"no-content\"]")).click(); //no content link
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"moved\"]")).click(); //moved link
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"bad-request\"]")).click(); //bad request link
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"unauthorized\"]")).click(); //unauthorized link
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"forbidden\"]")).click(); //forbidden link
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"invalid-url\"]")).click(); //not found link
		Thread.sleep(6000);
		wd.quit();
		}
}
