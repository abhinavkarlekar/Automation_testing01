package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Action_class extends Base_class {

	public static void main(String[] args) throws Exception {
		
	launch_browser("chrome");
	navigate_url("https://www.flipkart.com/");
	take_screenshot("Flipkart_homepage"); 
	
	// Locate Grocery Link
	WebElement link = driver.findElement(By.xpath("//span[text()='Grocery']"));
	
	// Actions Class 
	Actions act = new Actions (driver);
	
	// click on link Grocery
	act.click(link).build().perform();
	
	// locate fashion link 
	WebElement link_fashion = driver.findElement(By.xpath("//span [text()='Fashion']"));
	
	// Mouse Hower-Fashion link 
	act.moveToElement (link_fashion).build().perform();
	
	take_screenshot ("After Mouse Hower"); 
	Thread.sleep(3000);
	
	// Locate Home&Furniture link 
	WebElement link_home_Furniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	
	
	// mouse hower Home & Furniture 
	act.moveToElement (link_home_Furniture).build().perform(); 
	
	take_screenshot ("Mouse Hoser home and furniture");
	
	
	// Perform Right click on Home&Furniture 
	act.moveToElement (link_home_Furniture).contextClick().build().perform();
	
	
	
	
	}

}
