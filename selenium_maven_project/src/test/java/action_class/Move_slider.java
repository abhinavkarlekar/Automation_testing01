package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Move_slider extends Base_class {

	public static void main(String[] args) throws Exception {
	launch_browser("Chrome");
	navigate_url("https://jqueryui.com/slider/");
	
// To enter inside frame. 
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); 
	
// To locate slider. 
	WebElement slider = driver.findElement(By.cssSelector("div#slider")); 
	
Actions act = new Actions(driver);

// Slider move forward x-axis. 
//act.dragAndDropBy(slider, 200, 0).build().perform();

Thread.sleep(2000);

// Slider move backward. 
//act.dragAndDropBy(slider, -50, 0).build().perform();


// 2nd way to move slider. 
act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();  // Forward

Thread.sleep(2000);

act.clickAndHold(slider).moveByOffset(-50, 0).release().build().perform(); // Backward 
		
		

	}

}
