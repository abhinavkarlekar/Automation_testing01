package dropdown_option;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Dropdown_without_using_select_class extends Base_class {

	public static void main(String[] args) throws Exception   {
	launch_browser("chrome");
	navigate_url("https://www.jeevansathi.com/");
	Thread.sleep(3000);
	
	// Click on dropdown
	WebElement dropdown = driver.findElement(By.xpath("//div[@id='relationshipBlock']"));
	dropdown.submit(); 
	
	//or
	//Actions act = new Actions(driver);
	//act.moveToElement(dropdown).click().build().perform(); 
	
	// Locate dropdown options
	 WebElement options = driver.findElement(By.xpath("//div[@id='relationshipOptions']//ul//li"));
	 
   // Find out no of options 
	 System.out.println(options.size());
	 
  // Choose one option from seven
	 for (int i=0; i<7; i++) {
		 if(options.get(i).getText().equalsIgnoreCase("Self")) {
			 options.get(i).click();
			 
		 }
	 }
		
	}

}
