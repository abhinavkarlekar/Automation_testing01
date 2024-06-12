package methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insert_input_in_the_email_text_box_and_captured_input_data {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (10 ));
		
		driver.get("https://www.facebook.com");
		
		//get current url
		System.out.println("Current url is :-"+driver.getCurrentUrl());
		
		//get title of web Page 
		System.out.println("Title of Web Page is "+driver.getTitle());
		
		// locate text box 
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		// pass input in Email Textbox 
		email.sendKeys ("maheshkherell@gmail.com");
		
		// capture input of email Textbox 
		System.out.println("Input Data of EmailTextbox is :-"+email.getAttribute("value"));
		
		// locate password and send input in it.
		driver.findElement(By.cssSelector("input#pass")).sendKeys ("mahe sh@123");
	

	}

}
