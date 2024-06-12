package action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class PageUp_PageDown extends Base_class  {

	public static void main(String[] args) throws Exception {
		
		launch_browser("Chrome");
		navigate_url("https://www.netmeds.com/");
		take_screenshot("Netmeds_homepage");
		
		Actions act = new Actions(driver);
		
		// Press button page_down.
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		// press button page_Up.
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.SHIFT).sendKeys("abs").build().perform();
		

	}

}
