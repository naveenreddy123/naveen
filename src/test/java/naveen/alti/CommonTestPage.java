package naveen.alti;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class CommonTestPage {

	File appDir=null;
	 DesiredCapabilities capabilities=null;
	 WebDriver driver=null;
	 AppiumDriver d;
	 
	/* public CommonTestPage(String testingType) throws MalformedURLException{
		getDriver(testingType);
	 }
	*/

	public  void getDriver(String mobileTest) throws MalformedURLException{
	if(mobileTest.equalsIgnoreCase("web")) {
		capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "naveenreddy");
	    capabilities.setCapability("PlatformVersion", "5.1.1");
	    capabilities.setCapability("platformName", "Android");
	    //capabilities.setCapability("app", "");
	    capabilities.setCapability("browser", "Chrome");
	} else {
        appDir = new File("F:\\F_DRIVE_DATA\\APK_FILES\\com.facebook.katana-Android-5.0.apk");
	  	//appDir = new File("F:\\APK_FILES\\com.linkedin.android-1.apk");
	    capabilities = new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "emulator-5556");
	    capabilities.setCapability(CapabilityType.VERSION, "4.4");
	    capabilities.setCapability("automationName", "Appium");
	    capabilities.setCapability(CapabilityType.PLATFORM, "WINDOW");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("app", appDir.getAbsolutePath());
	    }
	
	    d =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
}
	
	@Test
	public void androidTest() throws MalformedURLException{
	getDriver("we");
	 driver.get("http://www.facebook.com/");
		//driver.get("http://www.facebook.com/");
	}
}

