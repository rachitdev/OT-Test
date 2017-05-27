/**
 * 
 */
package com.onlinetyari.AppTests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * @author rachit
 *
 */
public class JobAlerts extends Config{
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/jobs_icon_home\")")
	private static WebElement jobs;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/scroll_to_top\")")
	private static WebElement scroll_to_top;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/my_favourite_filter\")")
	private static WebElement fav;

	
	@Test(priority = 1)
	public static void check_job_alerts(){
		jobs.click();
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		scroll_to_top.click();
	}
	@Test(priority=2)
	public static void check_fav_job_alerts() throws InterruptedException, IOException{
		fav.click();
		Utils.Screenshot();
		driver.navigate().back();
	}
	@Test(priority = 3)
	public static void check_job_news() throws InterruptedException, IOException{
		driver.tap(1, 400, 400, 5);
		Utils.Screenshot();
		driver.tap(1, 100, 100, 5);
		driver.tap(1, 100, 100, 5);
	}
}
