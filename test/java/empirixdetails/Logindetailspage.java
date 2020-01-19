package empirixdetails;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utility.Base;
import junit.framework.Assert;

public class Logindetailspage extends Base{
	
	private static final String Dashboard = null;
	private static final String Alerts = null;
	private static final String Tests = null;
	protected WebDriver driver;
	
	@FindBy(how=How.CSS, using= "#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown > a")
	private WebElement logindropdown;
	
	
	@FindBy(how=How.CSS, using= "#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown > a")
	private WebElement client;
	
	// profile click
	@FindBy(how=How.CSS, using= "#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown.open > ul > li:nth-child(1) > a > span:nth-child(2)")
	private WebElement profile;
	
	// alert
	
	
	@FindBy(how=How.CSS, using= "#wrapper > header > section.sup-header > div > ul > li:nth-child(4) > a")
	private WebElement Alet;
	
	// Test
	
	@FindBy(how=How.CSS, using= "#wrapper > header > section.sup-header > div > ul > li:nth-child(5) > a")
	private WebElement text;
	
	
	// variable
	
	@FindBy(how=How.CSS, using= "#wrapper > header > section.sup-header > div > ul > li:nth-child(14) > a")
	private WebElement Variable;
	
	// Notofication
	
	
	@FindBy(how=How.CSS, using= "#wrapper > header > section.sup-header > div > ul > li:nth-child(16) > a")
	private WebElement notification;
	
	
	public Logindetailspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
    if(browserName.equalsIgnoreCase("chrome")){
				
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//driver//"+"chromedriver.exe");
    	
    	driver = new ChromeDriver();
			
			
			System.out.println("launching chrome browser");
		
          }else if(browserName.equalsIgnoreCase("firefox")){
	
	     System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//driver//"+"geckodriver.exe");
	    driver=new FirefoxDriver();
	 
		
      } else if(browserName.equalsIgnoreCase("InternetExplorer")){
	   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//driver//"+"InternetExplorer.exe");
	    driver=new InternetExplorerDriver();
	}
       
	}
			
	@Test
	
	public void loginEnGR () throws InterruptedException {
		
	Thread.sleep(12000);
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content > div > div.panel-body > form > fieldset > div.group-field-block.float-right > input")));
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Base.loadPropertiesFile("login.properties", "username"));	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Base.loadPropertiesFile("login.properties", "password"));
	driver.findElement(By.xpath("//input[@type='submit']")).click();
    System.out.println("user login sucessfully");
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
		Thread.sleep(10000);
					
		}
	public void Englishdetails() throws InterruptedException {
		try {
			 String dash = driver.findElement(By.cssSelector("#wrapper > header > section.sup-header > div > ul > li.active.mactive > a")).getText();
			 System.out.println("ravindra");
			 System.out.println(dash);
		 if (dash.equals("Dashboard"))
		System.out.println("user Dashboard tab is display");
		} catch (Exception ee) {
			System.out.println("dashboard"+ ee.getMessage() );
		}
		 
		//  Alert
		try {
			 String Alert = driver.findElement(By.cssSelector("#wrapper > header > section.sup-header > div > ul > li:nth-child(4) > a")).getText();
			 if (Alert.equals("Alerts"))
			 System.out.println("user Alert tab display");
			} catch (Exception ee) {
				System.out.println("Alerts"+ ee.getMessage() );
			}
		
		//// Test
		try {
			 String Test = driver.findElement(By.cssSelector("#wrapper > header > section.sup-header > div > ul > li:nth-child(5) > a")).getText();
			 if (Test.equals("Tests")) 
				 
			 System.out.println("user Test tab display");
			} catch (Exception ee) {
				System.out.println("Tests"+ ee.getMessage() );
			}
		
		////////// varialble
		
		String var = driver.findElement(By.cssSelector("#wrapper > header > section.sup-header > div > ul > li:nth-child(14) > a")).getText();
		System.out.println(var);
		
		 if (var.equals("Variables"))
			 System.out.println("user Variables tab display");
		// Notofication
			
		try {
			 String Notifi = driver.findElement(By.cssSelector("#wrapper > header > section.sup-header > div > ul > li:nth-child(16) > a")).getText();
			 if (Notifi.equals("Notification")) 
			 System.out.println("user Notificatio tab display");
			} catch (Exception ee) {
				System.out.println("Notification"+ ee.getMessage() );
			}
		
		// Dropdown selection
		
		driver.findElement(By.cssSelector("#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown > a")).click();
		//logindropdown.click();
		
		driver.findElement(By.cssSelector("#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown.open > ul > li:nth-child(3) > a > span:nth-child(2)")).click();
		
		// verify the client name Empirix_QA_Training
		
		String clientname = driver.findElement(By.cssSelector("#LAB-R > div > div.panel-body > div > div > form > div:nth-child(1) > label.col-sm-6.content.ng-binding")).getText();
		
		System.out.println(clientname);
		
		Thread.sleep(1000);
		logindropdown.click();
		
		
		//System.out.println("Profile");
		
	//	Thread.sleep(6000);
	
		// profile 
		
		driver.findElement(By.cssSelector("#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown.open > ul > li:nth-child(1) > a > span:nth-child(2)")).click();
		Thread.sleep(6000);
		String username = driver.findElement(By.cssSelector("#LAB-R > div.panel.panel-primary > div.panel-body > div > div:nth-child(1) > form > div:nth-child(1) > input")).getText();
		
		System.out.println(username);
		
	String Pclient = driver.findElement(By.cssSelector("#LAB-R > div.panel.panel-primary > div.panel-body > div > div:nth-child(1) > form > div:nth-child(7) > input")).getText();
			System.out.println(Pclient);
	if (clientname.equals(Pclient))
		System.out.println("Client name is same as per profile name" + Pclient);
	
	String email = driver.findElement(By.cssSelector("#LAB-R > div.panel.panel-primary > div.panel-body > div > div:nth-child(1) > form > div:nth-child(3) > input")).getText();
	
	if(!email.isEmpty())
	System.out.println(email);
	
		
   String fname = driver.findElement(By.cssSelector("#LAB-R > div.panel.panel-primary > div.panel-body > div > div:nth-child(1) > form > div:nth-child(4) > input")).getText();

   if(!email.isEmpty()) {
   System.out.println(fname);
   }
   else {
	System.out.println("First name is not displayed");
   }

			}
	public void Japanesedetails() throws InterruptedException {
		// TODO Auto-generated method stub
		
		logindropdown.click();
		// click the 
		driver.findElement(By.cssSelector("#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown.open > ul > div > div > a")).click();
		
		//driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		 alert.accept();
		 System.out.println("User able to switch the sucessfull english to japanies");
		
		 String das = driver.findElement(By.cssSelector(" #wrapper > header > section.sup-header > div > ul > li:nth-child(1) > a")).getText();
		 System.out.println(das);
		 
		String jAlert = Alet.getText();
		System.out.println(jAlert);
		 String jtext = text.getText();
		 System.out.println(jtext); 
		 String jVariable = Variable.getText();
		 System.out.println(jVariable);
		  String jNotification = notification.getText();
		  System.out.println(jNotification);
		 
		  Thread.sleep(6000);
		  System.out.println("Switch to English");
		 /// switch to English  //////////////
		  logindropdown.click();
		  driver.findElement(By.cssSelector("#wrapper > header > section.navbar.navbar-inverse.docs-navbar-primary.ng-scope > div > div > div > ul > li.dropdown.open > ul > div > div > a")).click();
	
		  Alert alert1 = driver.switchTo().alert();
		  alert1.accept();
		  String dash = driver.findElement(By.cssSelector("#wrapper > header > section.sup-header > div > ul > li:nth-child(1) > a")).getText();
		 System.out.println(dash);
	
	
	}

}
