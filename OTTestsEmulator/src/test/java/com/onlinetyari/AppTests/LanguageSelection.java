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
	
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/lang_name\")")
	private static WebElement selected_lang;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/button1\")")
	private static WebElement ok;
	
	public static void select_lang(){
		selected_lang.click();
	}
	
	public static void go_further(){
		ok.click();
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
