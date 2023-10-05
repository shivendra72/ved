package checkbox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	driver  =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		String Amazon = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.get(Amazon);
  }
  
  @Test
  public void tesccase1() {
	  WebElement search_box = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		search_box.click();
		search_box.sendKeys("cool water", Keys.ENTER);
		  WebElement checkbox = driver.findElement(By.xpath("//li[@id='p_90/6741118031']//i[@class='a-icon a-icon-checkbox']"));
		    checkbox.click();
  }
  
//  @Test
//  public void tesccase2() {
//
//  }

  @AfterMethod
  public void afterMethod() {
	  
  }
  
  

}
