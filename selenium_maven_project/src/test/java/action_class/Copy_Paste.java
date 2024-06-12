package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Copy_Paste extends Base_class{

	public static void main(String[] args) {
		
	launch_browser("Chrome");
	navigate_url("https://facebook.com");
	
	// Locate email text box. 
	WebElement email = driver.findElement(By.cssSelector("input#email"));
	
	// Locate pass text box.
	//WebElement pass = driver.findElement(By.cssSelector("input#pass"));
	
	// Action class.
	Actions act = new Actions (driver);
	
	// Send input 
	act.sendKeys(email, "abhinavkarlekar@gmail.com").build().perform();
	
	// Press control a to select. 
	act.moveToElement(email).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	
	// Press control c to copy. 
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	// Press TAB to move to password text box. 
	act.sendKeys(Keys.TAB).build().perform(); 
	
	// Press control v to paste in password text box. 
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); 
	
	

	}

	
	}


