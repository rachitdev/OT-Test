/**
 * 
 */
package com.onlinetyari.AppTests;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * @author rachit
 *
 */
public class Utils extends Config{
	static String[] exams = {"SSC","Banking","IAS","GATE","State Exam","CLAT","Railways","Insurance","CTET","NDA"};
	static String random_exam; 
	public static long snapshot_count = 0;
	public static String GetTimeStampValue()throws IOException{
		//This method allows us to get the time and the screenshots are saved accordingly.
		Calendar cal = Calendar.getInstance();       
		Date time=cal.getTime();
		String timestamp=time.toString();
		System.out.println(timestamp);
		String systime=timestamp.replace(":", "-");
		System.out.println(systime);
		return systime;
	}
public static void Screenshot() throws InterruptedException, IOException{
		System.out.println("Taking Screenshot please wait for 2 seconds");
		System.out.println("ScreenShot local directory is" + " C:\\test-output\\screenshots");
		Thread.sleep(3000);
		//The next 2 lines saves the screenshot in the below mentioned directory.
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile,new File("C:\\test-output\\screenshots\\"+"screenshot "+GetTimeStampValue()+".jpg"));
		System.out.println("Screenshot has been taken and saved!");
		snapshot_count++;
		System.out.println("SnapShots till this stage are " + snapshot_count);
		}
public static String[] random_exam(){
	random_exam = (exams[new Random().nextInt(exams.length)]);
	return exams;
}
}
