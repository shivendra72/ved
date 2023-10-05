package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		driver.findElement(By.xpath("//label[normalize-space()='60% and above']")).click();

	}

}
