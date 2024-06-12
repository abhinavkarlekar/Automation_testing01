package dropdown_option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Dropdown_with_select_class extends Base_class {

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAjwjeuyBhBuEiwAJ3vuoQ8RiwOzzofQsSAB7e0usHQhmjykg1ujtDGStbvc14ZtGyWyWUQNDRoC_f0QAvD_BwE");
		take_screenshot("hompage_jeevansathi");
		
		WebElement profile_dropdown = driver.findElement(By.xpath("//select[@name='reg[relationship]']"));
		
		// Use select class
		Select s = new Select(profile_dropdown);
		
		// select option by visible text
		//s.selectByVisibleText("Son");
		
		// select option with option attribute value
		//s.selectByValue("3");
		
		// select option by choosing index
		s.selectByIndex(1); 
	}

}
