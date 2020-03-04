package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testtest2 {
	
	
	@BeforeTest

	public static void beforetest() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\INC2011\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://apply.tauedu.org/bsmdg-guyana/");
		driver.manage().window().maximize();
		
	}
	
	@Test

	public static void test1() {
		
	}
	@Test

	public static void test2() {
		
	}
	
	@AfterTest

	public static void test3() {
		
	}
}



