package methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleared_input_data_in_text_box {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds (10 ));
		
		driver.get("https://www.facebook.com");
		
		//Get current url 
		System.out.println("Current url is :- "+driver.getCurrentUrl());
		
		//Get title Of web page 
		System.out.println("Title of Web Page is :- "+driver.getTitle());
		
		// Locate Email text box 
		driver.findElement(By.cssSelector("input#email")).sendKeys ("abc ");
		
		// Locate Password Textbox
		driver.findElement(By.cssSelector("input#pass")).sendKeys ("cd");
		
		// clear email input
		driver.findElement(By.cssSelector("input#email")).clear();
		
		// Clear password input
		driver.findElement(By.cssSelector("input#pass")).clear();
	}

}
