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
public class EmailLoginScreen extends Config {
		@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_email\")")
		private static WebElement Login_email;
		@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_pass\")")
		private static WebElement Login_pass;
		@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_btn\")")
		private static WebElement Login_button;
		
		@Test
	public static void start_login_text() throws InterruptedException{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			Login_email.sendKeys("rachit.dev@onlinetyari.com");
			Login_pass.sendKeys("OT123456");
			driver.navigate().back();
			Login_button.click();
			Thread.sleep(5000);
			PageFactory.initElements(new AppiumFieldDecorator(driver), new LanguageSelection());
		
	}
}
