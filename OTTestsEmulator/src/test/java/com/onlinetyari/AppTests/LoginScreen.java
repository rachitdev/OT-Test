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
	//@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/login_splash_tv\")")
	//private static WebElement Login;
	
	@Test
	public static void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.tap(1, 500, 560, 5);
		Thread.sleep(5000);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new EmailLoginScreen());
	}

}
