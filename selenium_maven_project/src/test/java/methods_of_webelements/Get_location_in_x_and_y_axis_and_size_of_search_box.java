package methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_location_in_x_and_y_axis_and_size_of_search_box {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds (10));
		
		driver.get("https://www.amazon.in");
		
		//current url 
		System.out.println("Current url is :- "+driver.getCurrentUrl());
		
		//get title of web Page 
		System.out.println("Title of Web Page is :- "+driver.getTitle()); 
		WebElement searchbox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbo x']"));
		
		// get location x Axis 
		System.out.println("Location With respect x-axix :- "+searchbox.getLocation().x);
		
		// get location y Axis 
		System.out.println("Location With respect y-axix :- "+searchbox.getLocation().y);
		
		// get the size of searchbox 
		System.out.println("Size of Searchbox is :-"+searchbox.getSize());
	}

}
