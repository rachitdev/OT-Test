package com.onlinetyari.AppTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
	@SuppressWarnings("unused")
	public class Config {
		static ProcessBuilder pb;  				 //Object for android debug server initialized.
		static ProcessBuilder emu;				 //Object for running android emulator.
		static ProcessBuilder kill_emu;			 //Object for killing android emulator.
		static ProcessBuilder devices;
		static AppiumDriverLocalService service; //Object for Appium server initialized.
		static DesiredCapabilities capabilities; //Object for android automation capabilities initialized.
		@SuppressWarnings("rawtypes")  
		static AndroidDriver driver;             //Object for android automation initialized.
	@BeforeSuite
	public static void adb() throws IOException, InterruptedException{
	//adb method starts the Android debug (adb) server, android virtual device (avd) and the appium server so that Android commands can be executed.
	//Object pb starts the Android debug (adb) server so that Android commands can be executed.
		pb = new ProcessBuilder("adb", "start-server");
  		Process adb = pb.start();
  		adb.waitFor();
  		System.out.println("Android Debug Server has started.");
  		//Object emu starts the android emulator on which the tests are going to be executed.
  		emu = new ProcessBuilder("emulator", "-avd", "nexus_kitkat");
  		System.out.println("Android Virtual Device with Kitkat version 4.4.2 is starting.");
  		Process emulator = emu.start(); //emulator starts from here
  		System.out.println("Please wait for 4 minutes");
  		Thread.sleep(240000); //time given to the emulator for synchronizing with appium server.
  		//Object service is there to start or stop the appium server
  		service = AppiumDriverLocalService.buildDefaultService();
  		System.out.println("Appium Server is Starting");
		service.start(); //Appium server starts from here
	}
  	@BeforeTest
	public static void caps() throws MalformedURLException {
		//Object capabilities are nothing but the attributes of the automation test.
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.2");
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("app","C:\\Users\\rachit\\.jenkins\\jobs\\OTAppBuild\\workspace\\android\\android-studio\\OnlineTyari\\app\\build\\outputs\\apk\\app-armv7-debug.apk");
		capabilities.setCapability("noReset",false);
	}
	@BeforeTest
	public  String GetTimeStampValue()throws IOException{
		//This method allows us to get the time and the screenshots are saved accordingly.
	    Calendar cal = Calendar.getInstance();       
	    Date time=cal.getTime();
	    String timestamp=time.toString();
	    System.out.println(timestamp);
	    String systime=timestamp.replace(":", "-");
	    System.out.println(systime);
	    return systime;
	}
	@AfterSuite
	public static void kill_emu() throws IOException{
		//This method kills avd as well as the appium server.
		kill_emu = new ProcessBuilder("adb", "emu", "kill");
  		Process kill = kill_emu.start();
  		System.out.println("Android Virtual Device killed. Hope tests are successfull. Bye Bye!");
		service.stop();
		System.out.println("Appium Server Killed");
	}
}
