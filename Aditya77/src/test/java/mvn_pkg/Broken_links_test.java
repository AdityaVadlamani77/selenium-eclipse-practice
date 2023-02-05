package mvn_pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Broken_links_test  {

    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");

        // Find all of the links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Create a list to store the valid links
        List<String> validLinks = new ArrayList<String>();

        // Create a list to store the broken links
        List<String> brokenLinks = new ArrayList<String>();
     

        // Iterate through the list of links
        for (WebElement link : links) {
            // Get the href attribute of the link
            String linkURL = link.getAttribute("href");

            // Check if the link is valid
            if (isLinkValid(linkURL)) {
                // If the link is valid, add it to the list of valid links
                validLinks.add(linkURL);
            } else {
                // If the link is broken, add it to the list of broken links
                brokenLinks.add(linkURL);
            }
        }

        // Print the total number of links
        System.out.println("Total number of links: " + links.size());

        // Print the number of valid links
        System.out.println("Number of valid links: " + validLinks.size());

        // Print the list of valid links
        System.out.println("Valid Links:");
        for (String link : validLinks) {
            System.out.println(link);
        }

        // Print the number of broken links
        System.out.println("Number of broken links: " + brokenLinks.size());

        // Print the list of broken links
        System.out.println("Broken Links:");
        for (String link : brokenLinks) {
            System.out.println(link);
        }

       
    }

    // Method to check if a link is valid
    public static boolean isLinkValid(String linkURL) {
        // Try to create a connection to the link
        try {
            URL url = new URL(linkURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.connect();

            // Check if the connection was successful
            if (connection.getResponseCode() == 200) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
}
