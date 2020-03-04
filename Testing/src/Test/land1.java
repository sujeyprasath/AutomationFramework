package Test;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;
import org.openqa.selenium.TakesScreenshot;



public class land1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://apply.tauedu.org/zm-bba/");
		
		driver.manage().window().maximize();
		WebElement element=null;
		
		driver.findElement(By.id("name_e")).sendKeys("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
		
		driver.findElement(By.id("txtEmail")).sendKeys("txtEmail1@gmail.com");
		
		Select countrycode=new Select(driver.findElement(By.id("country_code")));
		countrycode.selectByVisibleText("India (+91)"); 
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("contact")).sendKeys("9790989");
		
		Select qualification=new Select(driver.findElement(By.id("qualification")));
		qualification.selectByVisibleText("Diploma in Business Administration"); 
		Thread.sleep(3000);
		

		
		String captcha =driver.findElement(By.id("captcha_code")).getAttribute("value");
		
		System.out.println(captcha);
		
		

		driver.findElement(By.id("captcha")).sendKeys(captcha);
		

		Thread.sleep(5000);
		
		
		
		
		driver.findElement(By.id("fee")).click();
		
		
		
		Thread.sleep(5000);
		
	
		
		File desc=new File("C:\\Users\\INC2011\\Documents\\Selenium\\Sujey26"+System.currentTimeMillis()+".png");

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, desc);
		
		
		driver.findElement(By.id("btn_submit")).click();
		driver.close();

	}

}
