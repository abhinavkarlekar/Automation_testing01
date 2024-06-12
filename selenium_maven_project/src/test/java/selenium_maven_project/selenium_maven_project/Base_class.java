package selenium_maven_project.selenium_maven_project;

import java.io.File;
import java.time.Duration;
import  org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public static WebDriver driver; 
	public static String projectpath = System.getProperty("user.dir"); 
	
	// Dynamic code to launch the Browser. 
	public static void launch_browser (String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("Launched browser is :-" +browser); 
	}
	
	// Dynamic code for navigate URL. 
	public static void navigate_url (String url) {
		driver.get(url);
		System.out.println("Navigated url is :- "+url);
		System.out.println("Title of web-page is :- "+driver.getTitle());
	}
	
  // Dynamic code for screenshot 
   public static void take_screenshot (String screenshotname) throws Exception {
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File target_file = ts.getScreenshotAs(OutputType.FILE);
	   File source_file = new File (projectpath + "\\Screenshot\\" + screenshotname + ".png");
	   FileHandler.copy(target_file, source_file);

}

   // Dynamic code for scroll page. 
   public static void scroll_page (int ypoints) {
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,"+ypoints+")");
	   
	   
   }
}
	
		
	
	
		
	


