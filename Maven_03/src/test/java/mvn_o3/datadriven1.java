package mvn_o3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class datadriven1 {
	WebDriver wd;
	public String url1 = "https://opensource-demo.orangehrmlive.com/";
	public String username, username1, password, password1;
	public int i,j;
  @Test
  public void datadriven() throws IOException, InterruptedException {
	  File excel = new File("C:/Users/RJ Aditya/Documents/data_driven_selenium.xlsx/");
	  FileInputStream fis = new FileInputStream(excel);
	  XSSFWorkbook book = new XSSFWorkbook(fis);
	  XSSFSheet sheet = book.getSheet("Sheet1");
	  
	  int row_count = sheet.getLastRowNum();
	  for (i=0; i<row_count; i++) {
		 username = sheet.getRow(i).getCell(0).getStringCellValue();
		 password = sheet.getRow(i).getCell(1).getStringCellValue();
		 wd.findElement(By.name("username")).sendKeys(username);
		 wd.findElement(By.name("password")).sendKeys(password);
		 Thread.sleep(2000);
		 wd.findElement(By.xpath("//*[@type='submit']")).click();
		 Thread.sleep(2000);
		 		 
		 
		 }
		 
	  if (wd.findElement(By.linkText("PIM")).isDisplayed()) {
			System.out.println("error");
			 Thread.sleep(2000);
			 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-tab\']")).click();
			 Thread.sleep(1000);
			 wd.findElement(By.linkText("Logout")).click();
			 Thread.sleep(1000);
			 }
		 
		 else if (wd.findElement(By.partialLinkText("Invalid credentials")).isDisplayed()) {
			 for (j= i+1; j<row_count; j++) {
				username1 = sheet.getRow(j).getCell(0).getStringCellValue();
				password1 = sheet.getRow(j).getCell(1).getStringCellValue();
				wd.findElement(By.name("username")).sendKeys(username1);
				 wd.findElement(By.name("password")).sendKeys(password1);
				 Thread.sleep(2000);
				 wd.findElement(By.xpath("//*[@type='submit']")).click();
				 Thread.sleep(2000);
				 if (wd.findElement(By.linkText("PIM")).isDisplayed()) {
					System.out.println("error");	
					 Thread.sleep(2000);
						 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-tab\']")).click();
						 Thread.sleep(1000);
						 wd.findElement(By.linkText("Logout")).click();
						 Thread.sleep(1000);
						 }
				 
				 
			 }
		 }
	  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver(); wd.manage().window().maximize();
	  wd.get(url1);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
