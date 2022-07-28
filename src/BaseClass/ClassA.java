package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassA {
	 public static WebDriver getDriver(String a) throws InterruptedException
		{
			if(a.equals("chrome"))
			{
			  System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver.exe");
				
			     WebDriver driver = new ChromeDriver();            //upcasting
				
				driver.get("https://www.flipkart.com/");
				 
			
				driver.manage().window().maximize();
				return driver;
			}
			else
			{
				System.setProperty("webdriver.gecko.driver","E:\\Automation\\geckodriver.exe");
				
			     WebDriver driver = new FirefoxDriver();            //upcasting
				
				driver.get("https://www.flipkart.com/");
				 
			
				driver.manage().window().maximize();
				return driver;
			}
			  
			  
	}
}
