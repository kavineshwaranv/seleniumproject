package orange;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vijay"); 
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("DEEPAKvlog");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("no:05,vetuvankani,ECR,Chennai-600001");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vijay23@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9933939393");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,4000)");

		driver.findElement(By.xpath("//input[@value='Movies']")).click();

		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();

		WebElement date = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select select = new Select(date);
		select.selectByVisibleText("5");

		WebElement skills=driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select select1= new Select(skills);
		select1.selectByVisibleText("Java");
		

		//driver.findElement(By.xpath("//select[@id='Skills']")).click();

		//driver.findElement(By.xpath("//option[text()='Adobe InDesign']")).click();
		
		
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		
		WebElement selectContry =driver.findElement(By.xpath("//li[text()='India']"));
		selectContry.click();
		
		
	//	Select select2= new Select(country);
	//	select2.selectByVisibleText("India");
		
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select select3= new Select(month);
		select3.selectByIndex(10);
		
		
		WebElement year =driver.findElement(By.xpath("//select[@placeholder='Year']"));
		Select select4 = new Select(year);
		select4.selectByValue("1995");
		
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Deepak@45");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Deepak@45");
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click(); 
		
		
		
	}
}
