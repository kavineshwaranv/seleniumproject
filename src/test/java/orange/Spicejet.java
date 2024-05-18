package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("//a[@class='btn_action cart_button']");
		driver.findElement(By.xpath("https://www.spicejet.com/"));
		
		
		
	}

}
