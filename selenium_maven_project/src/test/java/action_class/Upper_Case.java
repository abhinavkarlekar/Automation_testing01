package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Upper_Case extends Base_class {

	public static void main(String[] args) {
		
	launch_browser("Chrome");
	navigate_url("https://facebook.com");
	
	// Locate email text box. 
	WebElement email = driver.findElement(By.cssSelector("input#email")); 
	
	// Action class. 
	Actions act = new Actions(driver); 
	
	// Page input in uppercase 
	act.keyDown(Keys.SHIFT).sendKeys("abhinav").build().perform();
	
	act.sendKeys(Keys.ENTER).build().perform(); 
	}

}
