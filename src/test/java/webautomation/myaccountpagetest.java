package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class myaccountpagetest 
 {
	WebDriver dr;
	
  @Test
  public void f() throws Exception
  {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		  dr.manage().window().maximize();
		  dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
  
	
	  dr.get("http://www.gmail.com");
	  dr.findElement(By.id("Email")).sendKeys("jagadheswar.a");
	  Thread.sleep(3000);
	  dr.findElement(By.id("next")).click();
	  dr.findElement(By.id("Passwd")).sendKeys("iamjagadeesh");
	  Thread.sleep(3000);
	  dr.findElement(By.id("signIn")).click();

	  
	  
  }
}
