package Pageobject.java;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.Base;
import empirixdetails.Logindetailspage;



  public class Logindetail extends Base {
	@Test(priority=1)
	public void BasicDetailsonloginPage() throws Exception 
	{
	System.out.println("Driver valueE inside fillBasicDetailsPage() method is "+ driver);
	Logindetailspage detailsPage = PageFactory.initElements(driver, Logindetailspage.class);
	detailsPage.loginEnGR();
				
	}

  @Test(priority=2)
  public void checkdetailsEn() throws Exception {
	Logindetailspage detailsPage = PageFactory.initElements(driver, Logindetailspage.class);
	detailsPage.Englishdetails();
	
   }
   @Test(priority=3)
   public void checkdetailsjap() throws Exception {
	Logindetailspage detailsPage = PageFactory.initElements(driver, Logindetailspage.class);
	detailsPage.Japanesedetails();
   }

	
}
