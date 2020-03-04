package Test;
//Edit Bank
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tatvaccc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\INC2011\\\\Documents\\\\Selenium\\\\chromedriver.exe");
	
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
	
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul[1]/li[2]/a/span")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"result-table\"]/table/tbody/tr[3]/td[8]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("bank_name")).clear();
	driver.findElement(By.id("bank_name")).sendKeys("HDFC");
	
	element=driver.findElement(By.id("bank_short_name"));
	element.sendKeys("Axis");
	
	element=driver.findElement(By.id("branch_name"));
	element.sendKeys("Coimbatore");
	
	element=driver.findElement(By.id("account_no"));
	element.sendKeys("87243667836");
	
	element=driver.findElement(By.id("ifsc_code"));
	element.sendKeys("7895475986");
	
	
	element=driver.findElement(By.id("swift_code"));
	element.sendKeys("562365453563");
	
	element=driver.findElement(By.id("iban_no"));
	element.sendKeys("799090475986");
	
	element=driver.findElement(By.id("payment_routing_no"));
	element.sendKeys("9098786545");
	
	element=driver.findElement(By.id("account_details"));
	element.sendKeys("Sarvajana Higher Sec School Campus, No. 23, Avinashi Rd, Peelamedu, Tamil Nadu 641004");
	
	
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[4]/div/div/div[2]/div/div/div/button")).click();
	Thread.sleep(3000);
	
	
	driver.close();
		
	}

}
