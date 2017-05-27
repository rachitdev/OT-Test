/**
 * @author rachit
 *
 */
package com.onlinetyari.AppTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
	
public class Config {
		static ProcessBuilder pb;  				 //Object for android debug server initialized.
		static ProcessBuilder emu;				 //Object for running android emulator.
		static ProcessBuilder kill_emu;			 //Object for killing android emulator.
		static AppiumDriverLocalService service; //Object for Appium server initialized.
		static DesiredCapabilities capabilities; //Object for android automation capabilities initialized.
		@SuppressWarnings("rawtypes")
		static AndroidDriver driver;             //Object for android automation initialized.		
	@SuppressWarnings("rawtypes")
	@BeforeSuite
	public static void mobile_test_setup() throws IOException, InterruptedException{
		//adb method starts the Android debug (adb) server.
		//Object pb starts the Android debug (adb) server so that Android commands can be executed.
		pb = new ProcessBuilder("adb", "start-server");
  		Process adb = pb.start();
  		adb.waitFor();
  		System.out.println("Android Debug Server has started.");
  		//Object service is there to start or stop the appium server
  		service = AppiumDriverLocalService.buildDefaultService();
  		System.out.println("Appium Server is Starting");
		service.start(); //Appium server starts from here
		//Object capabilities are nothing but the attributes of the automation test.
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.2");
		capabilities.setCapability("deviceName","KBHE6TGAHQRSBIRO");
		//debug apk built on local system
		//capabilities.setCapability("app","C:\\Users\\rachit\\.jenkins\\jobs\\OTAppBuild\\workspace\\android\\android-studio\\OnlineTyari\\app\\build\\outputs\\apk\\app-armv7-debug.apk");
		//release apk provided by management.
		capabilities.setCapability("app","C:\\AppTest\\app-armv7-debug.apk");
		capabilities.setCapability("noReset",false);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("Android Driver Initialized, Starting Tests in few Seconds.");
		Thread.sleep(10000);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new LoginScreen());
	
	}
	@AfterSuite
	public static void kill_setup() throws IOException{
		//This method kills the appium server.
		driver.quit();
		System.out.println("Android Driver Killed.");
		service.stop();
		System.out.println("Appium Server Killed.");
	}
}
