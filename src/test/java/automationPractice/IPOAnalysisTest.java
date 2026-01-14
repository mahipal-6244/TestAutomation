package automationPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.uipages.HomePage;

public class IPOAnalysisTest {
	

	
	public static WebDriver driver; 
	
	@Test
	public void BrowserLogin() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.chittorgarh.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	String title = driver.getTitle();
	System.out.println("HomePage Title :    " +title);
	
	
	
	HomePage page = new HomePage(driver);
	
	
	page.ClickonMenu();
	page.ClickonMainBoardIPO();
	page.clickonBCCLLBtn();
	
	page.ClickonGMPlink();
	
	
	 
	String parentHandle = driver.getWindowHandle();
	System.out.println("Parent Window:   " +parentHandle);
	
	
	  Set<String> handles = driver.getWindowHandles(); 
	  for(String handle : handles)
	  { 
		  System.out.println("Child Window :   " +handles); 
		  
//		  page.Tabledata();
//		  TakesScreenshot ts = (TakesScreenshot) driver;
//			File file = ts.getScreenshotAs(OutputType.FILE);
//			File desk = new File("./Screenshots/GMP Table.png");
//			
//				FileUtils.copyFile(file, desk);
		
		  
	  
	  }
	  
	
	String title1 = driver.getTitle();
	System.out.println("ChildPage Title :   " +title1);
	
	driver.close();
	driver.quit();

	
	/*
	 * Set<String> windows = driver.getWindowHandles(); for(String window : windows)
	 * {
	 * 
	 * 
	 * }
	 */
	
	
	
	}
	
	
}
