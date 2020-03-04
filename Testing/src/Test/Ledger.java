package Test;

//Ledger Creation

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ledger {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://192.168.2.167:82/taf/login");
		
		driver.manage().window().maximize();
		
		
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
		Thread.sleep(3000);
		//Ledger Creations
		
	   driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[4]/li[2]/a/span")).click();
	   Thread.sleep(3000);
	   
	   //Add
	   
	   driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[1]/div/div[1]/a[2]")).click();
	   Thread.sleep(3000);
	   
	   //Ledger name
	   
	   
	   element=driver.findElement(By.id("ledger_name"));
		element.sendKeys("Ranbaxy");
		
		element=driver.findElement(By.id("ledger_perfix_no"));
		element.sendKeys("101");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"select2-parent_id-container\"]")).click();
		
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Vendors");
		element.sendKeys(Keys.ENTER);

		
		Thread.sleep(5000);
		
		Select msmee=new Select(driver.findElement(By.id("msme")));
		msmee.selectByVisibleText("Yes"); 
		Thread.sleep(3000);
		
		
		
		 element=driver.findElement(By.id("vendor_address"));
		 element.sendKeys("Indira Nagar, Civil Aerodrome Post, Peelamedu, Coimbatore, Tamil Nadu 641014");
		 Thread.sleep(3000);
		 
		 element=driver.findElement(By.name("vendor_contact_no"));
		 element.sendKeys("912224826000");
		 Thread.sleep(2000);
		 
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"select2-vendor_type-container\"]")).click();
		 element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	     element.sendKeys("Firm");
		 element.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		
		 
		
		 
	     driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div[4]/div/div/div/span/span[1]/span/span[1]")).click();
		 
		 Thread.sleep(1000);
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Applicable");
		
		

		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		
		//element.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		 
		 
		 
		 
		
		 
		 element=driver.findElement(By.name("pan_no"));
		 element.sendKeys("678642758657637");
		 Thread.sleep(1000);
		 
		 
		 driver.findElement(By.id("pan_card")).click();
			Thread.sleep(5000);
		 
		 StringSelection Sat=new StringSelection("C:\\Users\\INC2011\\Documents\\Account & Finance Single file\\Accounts & Finance.docx");

			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Sat, null);
			
			Thread.sleep(5000);
			
		
			Robot Rob=new Robot();
			
			Rob.keyPress(KeyEvent.VK_CONTROL);
			Rob.keyPress(KeyEvent.VK_V);
			Rob.keyRelease(KeyEvent.VK_CONTROL);
			Rob.keyRelease(KeyEvent.VK_V);
			Rob.keyPress(KeyEvent.VK_ENTER);
			Rob.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
			
			
			
			
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div[7]/div/div/div/span/span[1]/span/span[1]")).click();
			 
			 Thread.sleep(1000);
			 
			 
			element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			element.sendKeys("Applicable");
			
			

			driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
			

			 //driver.findElement(By.xpath("//*[@id=\"select2-gst_applicable-container\"]")).click();select2-gst_applicable-container
			
			driver.findElement(By.id("select2-gst_applicable-container")).click();
			 element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		     element.sendKeys("Applicable");
			 element.sendKeys(Keys.ENTER);
			
			 Thread.sleep(2000);

			
			 element=driver.findElement(By.name("gst_or_vat_no"));
			 element.sendKeys("4575456756456");
			 Thread.sleep(1000);
			 
			 
			 driver.findElement(By.id("gst_file")).click();
				Thread.sleep(5000);
			 
			 StringSelection Sat1=new StringSelection("C:\\Users\\INC2011\\Documents\\Account & Finance Single file\\Accounts & Finance.docx");

				
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Sat1, null);
				
				Thread.sleep(5000);
				
			
				Robot Rob1=new Robot();
				
				Rob1.keyPress(KeyEvent.VK_CONTROL);
				Rob1.keyPress(KeyEvent.VK_V);
				Rob1.keyRelease(KeyEvent.VK_CONTROL);
				Rob1.keyRelease(KeyEvent.VK_V);
				Rob1.keyPress(KeyEvent.VK_ENTER);
				Rob1.keyRelease(KeyEvent.VK_ENTER);
			
			
				element=driver.findElement(By.name("bank_name"));
				 element.sendKeys("SBI");
				 Thread.sleep(1000);
				 
				 driver.findElement(By.xpath("//*[@id=\"select2-msme_info-container\"]")).click();
				 element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			     element.sendKeys("Yes");
				 element.sendKeys(Keys.ENTER);
				 
				 
					 element=driver.findElement(By.name("account_no"));
					 element.sendKeys("67862357846");
					 Thread.sleep(1000);
					 
					 driver.findElement(By.xpath("//*[@id=\"test\"]")).click();
					 
					 Thread.sleep(1000);
					 
					 
					 
					 element=driver.findElement(By.name("account_name"));
					 element.sendKeys("Coimbatore Branch");
					 Thread.sleep(1000);
					 
                  driver.findElement(By.xpath("//*[@id=\"test1\"]")).click();
					 
					 Thread.sleep(1000);
	
					 Thread.sleep(1000);	 
							
					 element=driver.findElement(By.name("ifsc_code"));
					 element.sendKeys("6769878666");
					 Thread.sleep(1000);
					 
					 
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("window.scrollBy(0,200)");
					
					 
					 
					 driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div[17]/div/div/div/span/span[1]/span/ul/li[1]/span")).click();






					
					Thread.sleep(5000);

					element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div[17]/div/div/div/span/span[1]/span/ul/li/input"));


					element.click();
					System.out.println("After click");

					String[] input={"Bangalore","Coimbatore"};

					for(int i=0;i<input.length;i++)
					{
					element.sendKeys(input[i]);
					element.sendKeys(Keys.ENTER);
					}
					 
					 
					 element=driver.findElement(By.name("iban_number"));
					 element.sendKeys("45323651264");
					 Thread.sleep(1000);
					 
					 
					// driver.findElement(By.xpath("//*[@id=\"ledger-addform\"]/div/button[1]")).click();
					 
					 driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/fieldset/div[2]/div/div[19]/div/div/div/input")).click();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/thead/tr[1]/th[2]")).click();
					 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr[3]/td[6]")).click();
					 
					 Thread.sleep(1000);
					 element=driver.findElement(By.name("swift_code"));
					 element.sendKeys("55676778687");
					 Thread.sleep(2000);
		 
		 
				
		 
					 
					 driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div/div/div/form/div/button[1]")).click();
					 Thread.sleep(50000);
					 
					 System.out.println("Ledger created");
		
		driver.close();

	}

}
