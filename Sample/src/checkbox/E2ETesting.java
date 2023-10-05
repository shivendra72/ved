package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ETesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 String baseUrl = ("https://www.amazon.in/");
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("LAPTOP");
		  driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		  String currentUrl = driver.getCurrentUrl();
	      String urltoNavigate = ("https://www.amazon.in/Dell-i5-1135G7-Processor-Spill-Resistant-Keyboard/dp/B0C15BKF4G/ref=sr_1_1_sspa?crid=3OF21S0IME8PW&keywords=LAPTOP&qid=1695788706&sprefix=laptop%2Caps%2C463&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
	      driver.navigate().to(urltoNavigate);
	      driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	      WebElement mo =driver.findElement(By.xpath("//input[@id='ap_email']"));
	      mo.sendKeys("7888383985");
	      mo.sendKeys(Keys.TAB);
	      mo.sendKeys(Keys.ENTER);
//	      WebElement cn =driver.findElement(By.xpath("//input[@id='continue'"));
//	      cn.click();
//	      cn.sendKeys(Keys.ENTER);
	      WebElement pd = driver.findElement(By.xpath("//input[@id='ap_password']"));
	      pd.click();
	      pd.sendKeys("sportscar");
	     
	      pd.sendKeys(Keys.ENTER);
	   
	      
	      driver.findElement(By.xpath("//input[@id='pp-pvLw0e-101']"));
	}

	}


