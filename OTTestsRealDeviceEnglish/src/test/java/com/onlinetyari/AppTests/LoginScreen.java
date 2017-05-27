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
public class LoginScreen extends Config {
	/**
	 * @param args
	 */
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/try_as_guest\")")
	private static WebElement guest_login;
	
	@Test
	public static void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.tap(1, guest_login, 5);
		Thread.sleep(10000);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new LanguageSelection());
	}

}
