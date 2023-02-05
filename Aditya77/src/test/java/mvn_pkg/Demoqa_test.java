package mvn_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqa_test {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		// Enter the first name
		WebElement firstNameField = driver.findElement(By.id("firstName"));
		firstNameField.sendKeys("John");
		
		// Enter the last name
		WebElement lastNameField = driver.findElement(By.id("lastName"));
		lastNameField.sendKeys("Doe");
		
		//enter email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("jdoe1@ta.pe");
		Thread.sleep(500);

		// Select the gender
		WebElement genderRadioButton = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		genderRadioButton.click();
		Thread.sleep(500);
		//enter mobile
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("7545414555");		
		Thread.sleep(3000);		 
		// Enter the subject
		WebElement subject = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
		subject.sendKeys("Maths");
		Robot rb = new Robot();
		rb.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(500);
		//checkbox
		WebElement sports = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
		sports.click();
		Thread.sleep(500);
		//upload picture
		WebElement choose_element = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		choose_element.sendKeys("C:/Users/RJ Aditya/Pictures/Screenshot 2021-12-12 123940.png/");
		Thread.sleep(500);
		//current address
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("924 Bel Air, Los Angeles");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[normalize-space()='Widgets']")).click();
		Thread.sleep(500);
		//select state
		WebElement state = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
		state.sendKeys("u");
		rb.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(500);
		//select city
		WebElement city = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
		city.sendKeys("l");		
		rb.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(500);
		rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(500);
		// Click the "Submit" button
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();

	}

}
