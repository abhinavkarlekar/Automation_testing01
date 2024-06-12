package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (10));

		driver.get("https://www.facebook.com/");
		
		// To get Project Location/Directory 
		String projectpath = System.getProperty("user.dir"); 
		System.out.println(projectpath);
		
		// Take Screen shot Of Homepage 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File source_file = new File(projectpath + "//Screenshot//homepage_1.png"); 
		org.openqa.selenium.io.FileHandler.copy(file,source_file);
		
		
		// insert email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(" abc@gmail.com");
		
		// insert password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("a bc");
		
		// Take Screen shot After insert email and password 
		TakesScreenshot ts1 = (TakesScreenshot) driver; 
	    File file1 = ts1.getScreenshotAs (OutputType. FILE); 
		File source_file1 = new File (projectpath + "//Screenshot//InsertData_in_Textbox.png"); 
		org.openqa.selenium.io.FileHandler.copy(file1, source_file1);
	}

}
