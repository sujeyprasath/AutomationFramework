package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		
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
		
		//Ledgers
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[4]/li[1]/span")).click();
		
		//Ledger Creations
		
	   driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[4]/li[2]/a/span")).click();
	   Thread.sleep(3000);
	   
	   //Add
	   
	   driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[1]/div/div[1]/a[2]")).click();
		
	   //Ledger name
	   
	   
	   element=driver.findElement(By.id("ledger_name"));
		element.sendKeys("Travel Advance Sujey");
		
		element=driver.findElement(By.id("ledger_perfix_no"));
		element.sendKeys("26");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"select2-parent_id-container\"]")).click();
		
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Travel Advance - Ashok");
		element.sendKeys(Keys.ENTER);

		
		
		Thread.sleep(5000);
		
		Select msmee=new Select(driver.findElement(By.id("msme")));
		msmee.selectByVisibleText("Yes"); 
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div/div/div/div/span/span[1]/span/ul/li[1]/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div/div/div/div/span/span[1]/span/ul")).click();
		
		Thread.sleep(2000);
	
		/*element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div/div/div/div/span/span[1]/span/ul"));
		element.sendKeys("Test1");
		element.sendKeys(Keys.ENTER);*/
		
		 
			
			
			String name []= {"Test1","Test2","Test3","Test4"};
			
			for(int i=0; i<4; i++) {
				
				element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div/div/div/div/span/span[1]/span/ul"));
				element.sendKeys(name[i]);
				element.sendKeys(Keys.ENTER);
				
				Thread.sleep(5000);
			
			
			
		
			}	
		
		driver.close();
	}

}
