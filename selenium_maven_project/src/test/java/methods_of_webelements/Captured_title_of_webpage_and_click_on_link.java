package methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captured_title_of_webpage_and_click_on_link {

	public static void main(String[] args) {
		
// Captured Title of web-page and clicked on link.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); driver.manage().timeouts().implicitlyWait (Duration.ofSeconds (10 ));
		
		driver.get("https://www.salesforce.com/in/");
		
		// Capture Title of Web Page 
		System.out.println("The title of Web Page is :- "+driver.getTitle());
		
		// Click on Link
		driver.findElement(By.xpath("(//a[text()='Contact Us']) [1]")).click();
		
		
	}

}
