package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		WebElement element=null;
		
		driver.findElement(By.id("u_0_m")).sendKeys("Fu");
		
		driver.findElement(By.id("u_0_o")).sendKeys("Vision");
		
		driver.findElement(By.id("u_0_r")).sendKeys("sujeysujey@gmail.com");
		driver.findElement(By.id("u_0_u")).sendKeys("sujeysujey@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("sujey");
		
		Select drop1=new Select(driver.findElement(By.id("day")));
		drop1.selectByVisibleText("7");
		Thread.sleep(3000);
		
		Select drop2=new Select(driver.findElement(By.id("month")));
		drop2.selectByVisibleText("Mar");
		Thread.sleep(3000);
		
		Select drop3=new Select(driver.findElement(By.id("year")));
		drop3.selectByVisibleText("2000");
		Thread.sleep(3000);
		
		
		
		Select gender=new Select(driver.findElement(By.id("u_0_7")));
		gender.selectByValue("1");
		Thread.sleep(3000);
		
	
		
		driver.findElement(By.id("u_0_13")).click(); 
		
		driver.close();
		

	}

}
