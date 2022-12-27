package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_definition {
	WebDriver wd;
	String url1 = "https://opensource-demo.orangehrmlive.com/";
	@Given("user should be in the login page")
	public void user_should_be_in_the_login_page() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    wd = new ChromeDriver();
	    wd.manage().window().maximize();
	    wd.get(url1);
	    Thread.sleep(2000);
	    
	}
	@When("enter valid username {string}")
	public void enter_valid_username(String string) {
		wd.findElement(By.name("username")).sendKeys(string);
	    	    
	}
	@When("enter valid password {string}")
	public void enter_valid_password(String string) throws InterruptedException {
		wd.findElement(By.name("password")).sendKeys(string);
		Thread.sleep(2000);
	    	    
	}
	@When("click on login button")
	public void click_on_login_button() {
		wd.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}
	@Then("I should get the title {string}")
	public void i_should_get_the_title(String string) {
		Assert.assertEquals(wd.getTitle(), string);
		System.out.println("Actual Title: " + wd.getTitle());
	}

	
					



}
