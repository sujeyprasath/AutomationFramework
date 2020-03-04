package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
         driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement element=null;
	
			
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		
		//Login
		
       driver.findElement(By.id("ap_email")).sendKeys("8072351752");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("testtest@26");
		
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		
		
		
		driver.close();
		
	}

}
