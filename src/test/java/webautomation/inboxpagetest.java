package webautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class inboxpagetest {
  @Test
  public void f() {
	 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
	  WebDriver dr=new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  

	  dr.findElement(By.xpath("//div[text()='COMPOSE']")).click();
	  
	  
	  
  }
}
