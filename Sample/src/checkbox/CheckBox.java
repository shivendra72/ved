package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id=\'twotabsearchtextbox\']")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ground lamp");
		
		
		String urlToNavigate = "https://www.amazon.in/s?k=ground+lamp&crid=3U15A070LO8YG&sprefix=ground+lamp%2Caps%2C248&ref=nb_sb_noss_1";
		
		driver.navigate().to(urlToNavigate);
		driver.findElement(By.xpath("//li[@id=\"p_90/6741118031\"]//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id=\"p_n_is_cod_eligible/4931671031\"]//i[@class= 'a-icon a-icon-checkbox']")).click();

	}

}
