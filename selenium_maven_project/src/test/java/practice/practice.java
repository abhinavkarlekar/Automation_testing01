package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium_maven_project.selenium_maven_project.Base_class;

public class practice extends Base_class{

	public static void main(String[] args) throws Exception {
		launch_browser("chrome");
		navigate_url("https://www.netmeds.com/healthstore?source_attribution=ADW-CPC-Search-NMS-Brand&utm_source=ADW-CPC-Search-NMS-Brand&utm_medium=CPC&utm_campaign=ADW-CPC-Search-NMS-Brand&gad_source=1&gclid=Cj0KCQjwsPCyBhD4ARIsAPaaRf1c9OtHgY3AFj7rLGRNYNhlhKDuFiR5kKMNC_Nes8X8HCxfcKgubMwaAtQREALw_wcB");
		take_screenshot("hompage_netmeds");
		
		Actions act = new Actions(driver); 
		
		// locate wellness link
		WebElement wellness = driver.findElement(By.xpath("//a[text()='Wellness']"));
		
		//mouse hower wellness link
		act.moveToElement(wellness).build().perform(); 
		take_screenshot("mouse_hower_on_wellness");
		
		// locate beauty link 
		WebElement beauty = driver.findElement(By.xpath("(//a [text()='Beauty'])[1]"));
		
		//mouse hower beauty link
		act.moveToElement(beauty).build().perform(); 
		take_screenshot("Mouse_hower_on_beauty"); 
		
		//locate search box and search for medicine and capture name of medicine. 
		WebElement search_box = driver.findElement(By.xpath("//input[@id='search']")); 
		search_box.sendKeys("Dolo 650 Tablet 15'S");
		Thread.sleep(2000);
		take_screenshot("medicine_name_in_search_box");
		search_box.submit();
		
		//Search any one medicine and Capture name of Medicine
		WebElement medicine = driver.findElement(By.xpath("(//a[@class='category_name'])[1]")); 
		String medicine_name = medicine.getText();
		System.out.println("Medicine name :- "+medicine_name);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		// Choose Medicine 
		WebElement clickonmedicine = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]")); 
		clickonmedicine.click(); 
		
		//WebElement clickonaddtocart = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		//clickonaddtocart.submit();
		
		// click on add to cart
		WebElement clickonaddtocart = driver.findElement(By.xpath("(//button[@title='ADD TO CART'])[1]"));
		clickonaddtocart.submit(); 
		take_screenshot("Product_add_in_cart"); 
		
		// Click on Proceed to Cart Button
		WebElement proceedtocart_button = driver.findElement(By.xpath("//div[@class='text']"));
		proceedtocart_button.click();
		take_screenshot("Medicine_present_in_cart"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
