package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Searchbox {

	public static void main(String[] args) {
		WebDriver driver  =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		String Amazon = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.get(Amazon);

	
		
	WebElement search_box = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
	search_box.click();
	search_box.sendKeys("cool water", Keys.ENTER);

	
		WebElement checkbox = driver.findElement(By.xpath("//span[text() = 'Get It Today']"));
	    checkbox.click();
	}
}


