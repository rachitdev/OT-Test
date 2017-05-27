/**
 * 
 */
package com.onlinetyari.AppTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author rachit
 *
 */
public class LanguageSelection extends Config {
	
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/button1\")")
	private static WebElement ok;
	
	public static void select_lang(){
		driver.tap(1, 100, 650, 5);
	}
	
	public static void go_further(){
		driver.tap(1, ok, 5);
	}
	@Test
	public static void select_language() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		select_lang();
		go_further();
		Thread.sleep(5000);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new SelectExams());
	}
}
