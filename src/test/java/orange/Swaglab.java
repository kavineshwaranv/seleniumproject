package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swaglab {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("600115");
		
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
		
	
	}

}
