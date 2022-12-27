package package_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/selenium-java-4.7.0/chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://amazon.in");		
	}

}
