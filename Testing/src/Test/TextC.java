package Test;
//Voucher



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;	

public class TextC {
	
	
	public static void main(String args[]) throws InterruptedException, AWTException
 {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\inc2011\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://192.168.2.167:82/taf/login");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement element=null;
		
		element=driver.findElement(By.id("email"));
		element.sendKeys("accounts@gmail.com");
		element=driver.findElement(By.id("password"));
		element.sendKeys("welcome");
		Thread.sleep(3000);
		
         driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[4]/button")).click();
		
		Select drop=new Select(driver.findElement(By.id("company_name")));
		drop.selectByVisibleText("Texila American University Inc - Guyana");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[6]/li[1]/span")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[6]/li[2]/a/span")).click();
		
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[3]/div[2]/div/span/span[1]/span/span[1]")).click();
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("1126");
		element.sendKeys(Keys.ENTER);
		
		element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[3]/div[3]/div/input"));
		element.sendKeys("500");
		
		
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[4]/div[2]/div/span/span[1]/span/span[1]")).click();
			element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			element.sendKeys("Visa Extension Fees");
			element.sendKeys(Keys.ENTER);
			element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[4]/div[4]/div/input"));
			element.sendKeys("300");
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[4]/div[6]/ul/li[2]/a/i")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[5]/div[2]/div/span/span[1]/span/span[1]")).click();
			element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			element.sendKeys("Outstanding");
			element.sendKeys(Keys.ENTER);
			element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[5]/div[4]/div/input"));
				
			element.sendKeys("200");
		
		
		
	  driver.findElement(By.xpath("//*[@id=\"select2-bill_frequency-container\"]")).click();
		
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Monthly");
		element.sendKeys(Keys.ENTER);
		
		element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[7]/div[5]/div/div[2]/input"));
		element.sendKeys("100CA");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[7]/div[6]/div/div/div/div/span/a")).click();
		Thread.sleep(5000);
		
		StringSelection Sat=new StringSelection("C:\\Users\\INC2011\\Pictures\\CAAS\\texila.png");

		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Sat, null);
		
		Thread.sleep(5000);
		
	
		Robot Rob=new Robot();
		
		Rob.keyPress(KeyEvent.VK_CONTROL);
		Rob.keyPress(KeyEvent.VK_V);
		Rob.keyRelease(KeyEvent.VK_CONTROL);
		Rob.keyRelease(KeyEvent.VK_V);
		Rob.keyPress(KeyEvent.VK_ENTER);
		Rob.keyRelease(KeyEvent.VK_ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,200)");
		
		element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/fieldset/div[7]/div[7]/div/div/textarea"));
		element.sendKeys("Voucher creation by Automation");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div/form/div/button")).click();
		Thread.sleep(50000);
		
		driver.close();
		
		
	
		
	}

}