package mvn_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mvn_cl3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Checkbox
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		System.out.println("Checkbox 1 selected: " + checkbox1.isSelected());
		
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
		checkbox2.click();
		System.out.println("Checkbox 2 selected: " + checkbox2.isSelected());
		//Radio Button
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		radioButton1.click();
		System.out.println("Radio Button 1 selected: " + radioButton1.isSelected());
		
		WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		radioButton2.click();
		System.out.println("Radio Button 2 selected: " + radioButton2.isSelected());
		
		//Dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		WebElement option1 = driver.findElement(By.xpath("//option[text()='Option1']"));
		option1.click();
		System.out.println("Option selected: " + option1.isSelected());
		Thread.sleep(1000);
		dropdown.click();
		WebElement option2 = driver.findElement(By.xpath("//option[text()='Option2']"));
		option2.click();
		System.out.println("Option selected: " + option2.isSelected());
		
		//Button
		WebElement button = driver.findElement(By.id("name"));
		button.sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println("Alert displayed: " + driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Link
		WebElement link = driver.findElement(By.linkText("Open Tab"));
		link.click();
		System.out.println("Link clicked");
		Robot rb = new Robot();
		rb.keyPress(MenuKeyEvent.VK_CONTROL);
		rb.keyPress(MenuKeyEvent.VK_TAB);
		rb.keyRelease(MenuKeyEvent.VK_CONTROL);
		rb.keyRelease(MenuKeyEvent.VK_TAB);
		Thread.sleep(1000);
		rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		//element show example
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		WebElement show = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		show.click();
		
		// Perform a mouse hover over the "Mouse Hover Example" element
		WebElement mouseHover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHover).perform();

		// Click on the "Reload" element after the mouse hover
		WebElement reload = driver.findElement(By.xpath("//a[text()='Reload']"));
		reload.click();
		Thread.sleep(1000);
		
		rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		
		// Switch to the iframe
		driver.switchTo().frame("iframe-name");

		// Find the element and perform the required action
		WebElement blog = driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[normalize-space()='Blog']"));
		blog.click();
		Thread.sleep(500);
		// Switch back to the default content
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();

		}
	
	
}