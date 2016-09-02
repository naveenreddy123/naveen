package naveen.alti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
@Test
	public void test1(){
	//driver=new FirefoxDriver();
	//driver.get("http://www.google.com/");
	//driver.manage().window().maximize();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\naveenreddyaleti\\Desktop\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
		System.out.println("hi");
	}
@AfterMethod
public void teadDown(){
	driver.close();
	driver.quit();
}
}
