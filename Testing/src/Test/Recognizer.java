package Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.io.FileHandler;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;



public class Recognizer {

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("loginText")).click();
		
				
		File src=driver.findElement(By.xpath("//*[@id=\"nlpCaptchaImg\"]")).getScreenshotAs(OutputType.FILE);
		
		
		String path=System.getProperty("user.dir")+"/screenshot/captcha.png";
		
		FileHandler.copy(src,new File(path));
		
	
		ITesseract image=new Tesseract();
		
		String imageText=image.doOCR(new File(path));

		System.out.println(imageText);
		
		
		
		Thread.sleep(5000);
		
		
		driver.close();

	}

}
