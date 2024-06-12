package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;



public class Drag_and_Drop extends Base_class  {

	public static void main(String[] args) throws Exception {
	launch_browser("chrome");
	navigate_url("https://jqueryui.com/droppable/");
	take_screenshot("jquery_homepage");
	
	// Locate frame
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	// To enter inside frame 
	driver.switchTo().frame(frame);
	
	// Locate drag element
	WebElement drag = driver.findElement(By.cssSelector("div#draggable")); 
	
	// Locate drop element
	WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	
	// Action class
	Actions act = new  Actions (driver);
	
	// Another way to perform drag and drop
	act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
	// To come out-off frame
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
		
	}

	
	}


