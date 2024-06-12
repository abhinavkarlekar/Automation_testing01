package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class Practice2 extends Base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.netmeds.com/");

		// locate element wellness
		WebElement wellness = driver.findElement(By.xpath("//a[text()='Wellness']"));

		// use actions class
		Actions act = new Actions(driver);

		// to perform mouse hover
		act.moveToElement(wellness).build().perform();

		Thread.sleep(3000);

		// take screenshot
		take_screenshot("after mouse hover on wellness link");

		// loacte element beauty
		WebElement beauty = driver.findElement(By.xpath("//a[text()='Beauty']"));

		// to perform mouse hover
		act.moveToElement(beauty).build().perform();

		Thread.sleep(4000);

		// take screenshot
		take_screenshot("after mouse hover on beauty link");
		
		//to locate element searchbox 
		WebElement searchbox=driver.findElement(By.cssSelector("input#search"));
		
		//send input in searchbox
		searchbox.sendKeys("DOLO SUSP Suspension 60ml");
		
		//capture the name of medicine in console
		System.out.println("Name of medicine is: "+searchbox.getAttribute("value"));
		
		
		//press enter
		act.keyDown(Keys.ENTER).build().perform();
		
		//scroll_page(450);
		
		//to locate medicine
		WebElement medicine=driver.findElement(By.xpath("//h3[text()='DOLO SUSP Suspension 60ml']"));
		
		//move to element
		act.moveToElement(medicine).build().perform();
		
		//to click on medicine
		act.click(medicine).build().perform();
		
		
		
		//to locate add to cart button
		WebElement add_to_cart=driver.findElement(By.xpath("(//span[text()='ADD TO CART'])[1]"));
		
		//System.out.println(add_to_cart.isEnabled());
		
		act.moveToElement(add_to_cart).click().build().perform();
	}

}
