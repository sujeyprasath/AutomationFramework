package Test;
//Active/Deactive
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class news {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
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
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[1]/li[1]/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[1]/li[3]/a/span")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"result-table\"]/table/tbody/tr[1]/td[6]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div[2]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[1]/li[5]/a/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[3]/div/div/div/div/div[1]/div/div[1]/a[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("inventory_product_name")).sendKeys("Books");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"select2-parent_id-container\"]")).click();
		Thread.sleep(1000);
		
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Stationary");
		element.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("has_sub_value")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"select2-ledger_id-container\"]")).click();
		Thread.sleep(1000);
		
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Printing & Stationery Exp");
		element.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"select2-units-container\"]")).click();
		Thread.sleep(1000);
		element=driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		element.sendKeys("Numbers");
		element.sendKeys(Keys.ENTER);
		
		Select drop1=new Select(driver.findElement(By.id("border-multiple")));
		drop1.selectByVisibleText("Consumable");
		Thread.sleep(3000);
		
		element=driver.findElement(By.id("product_code"));
		element.sendKeys("100C");
		
		element=driver.findElement(By.id("min_stock_alert"));
		element.sendKeys("50");
		
		
		
		
	driver.findElement(By.xpath("//*[@id=\"inventory-product-addform\"]/div/button[2]")).click();
	
	Thread.sleep(3000);
	
	
	
	
		driver.close();
		
		
		
		
	}

}
