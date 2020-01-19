package Script_test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.Base;

public class Multybrowser extends Base {

	//String url = "https://www.google.com/";
	WebDriver driver = null;
	//String projectpath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
 /*   if(browserName.equalsIgnoreCase("chrome")){
				
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//driver//"+"chromedriver.exe");
    	driver = new ChromeDriver();
		System.out.println("launching chrome browser");
		
}if(browserName.equalsIgnoreCase("firefox")){
	
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//driver//"+"geckodriver.exe");
	driver=new FirefoxDriver();
	System.out.println("launching firefox browser");
	
		
}*/
 if(browserName.equalsIgnoreCase("InternetExplorer")){
	
	//C:\\Users\\ravindrakumar\\Desktop\\IEDriverServer.exe"
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//driver//"+"InternetExplorer.exe");
	driver=new InternetExplorerDriver();
	System.out.println("launching InternetExplorer browser");
	}
       
	}
	
	@Test
	
	public void loginEnGR() {
	//	System.out.println(url);
		//driver.get("https://www.google.com/");
		
		 WebDriverWait wait = new WebDriverWait(driver,30);
			
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));

		
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Base.loadPropertiesFile("login.properties", "username"));	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Base.loadPropertiesFile("login.properties", "password"));
		assertTrue(driver.getTitle().contains("OpenAM"));
		
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("user login sucessfully");
		
		

		
		
	}
	
	
	
}
