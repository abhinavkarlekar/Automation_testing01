package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Scroll_page extends Base_class {

	public static void main(String[] args) throws Exception {
	
		launch_browser("chrome");
		navigate_url("https://www.railyatri.in/");
		take_screenshot("homepage_jeevansathi");
		
	// Scroll page. 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,5000)"); 
		 
	// Scroll to Bottom 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		 
		 
	// Take screenshot after page scroll
	take_screenshot("homepage_after_scroll");
		 
	// Click facebook element 
	driver.findElement(By.xpath("(//a[@target='_blank'])[14]")).click();
		 
	// Click back arrow 
	js.executeScript("window.history.back"); 
	
	
	}

}
