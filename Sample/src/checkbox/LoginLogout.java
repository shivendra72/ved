package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//Login
		
		driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("vikram.singh4574@gmail.com");
		
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Amazon@1234");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		
		WebElement search_box = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		search_box.click();
		search_box.sendKeys("cool water", Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - DAVID OFF COOL WATER STREET FIGHTER PERFUME FOR MEN 100ML WITH DAVID OFF COOL WATER SHOWER GEL FOR MEN 100M...']")).click();
		
		driver.findElement(By.xpath("//div[@id='rightCol']//div[34]//input[@id=\"add-to-cart-button\"]")).click();
		
		driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
		
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"address-list\"]/div/div[1]/div/fieldset[1]/div[2]/span/div/label/input")).click();
		driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
		driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby='bottomSubmitOrderButtonId-announce']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Review or edit your recent orders')]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Cancel order']")).click();
		driver.findElement(By.xpath("//input[@name='cq.submit']")).click();

        //Logout
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
         driver.findElement(By.xpath("//a[@class='hmenu-item'][normalize-space()='Sign Out']")).click();
         driver.findElement(By.xpath("//a[@class='a-link-nav-icon']y")).click();
         Thread.sleep(3000);
         
         driver.quit();
	}

}
