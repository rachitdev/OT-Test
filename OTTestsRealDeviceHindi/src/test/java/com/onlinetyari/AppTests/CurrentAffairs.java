/**
 * 
 */
package com.onlinetyari.AppTests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author rachit
 *
 */
public class CurrentAffairs extends Config {
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/scroll_to_top\")")
	private static WebElement scroll_to_top;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/scroll_to_top\")")
	private static WebElement current_affairs;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/dynamicTextView\").text(\"Favourite\")")
	private static WebElement fav;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/dynamicTextView\").text(\"Topics\")")
	private static WebElement topics;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/title\")")
	private static WebElement fav_one;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/dynamicTextView\").text(\"Month\")")
	private static WebElement month;
	
	
	
	@Test(priority = 1)
	public static void scroll_check() throws InterruptedException{
		driver.navigate().back();// presses the back button once.
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		scroll_to_top.click();
	}
	@Test(priority = 2)
	public static void open_current_affairs() throws InterruptedException{
		current_affairs.click();
		driver.tap(1, 650, 400, 5);//selects/deselects first question as favourite.
		driver.swipe(360, 1024, 360, 360, 2000);//random scroll
		Thread.sleep(2000);
		driver.tap(1, 650, 400, 5);//selects random question as favourite.
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		driver.tap(1, 650, 400, 5);//selects random question as favourite.
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		driver.tap(1, 650, 400, 5);//selects random question as favourite.
	}
	@Test(priority = 3)
	public static void check_fav_current_affairs() throws InterruptedException, IOException{
		fav.click();
		Utils.Screenshot();
		fav_one.click();
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.tap(1, 200, 950, 5);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	@Test(priority = 4)
	public static void check_topics() throws InterruptedException, IOException{
		Thread.sleep(3000);
		topics.click();
		Thread.sleep(1000);
		driver.tap(1, 400, 200, 5);
		Utils.Screenshot();
		driver.navigate().back();
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.tap(1, 400, 200, 5);
		Utils.Screenshot();
		driver.navigate().back();
	}
	@Test(priority = 5)
	public static void check_month() throws InterruptedException, IOException{
		Thread.sleep(2000);
		month.click();
		driver.tap(1, 400, 200, 5);//taps on last month
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.navigate().back();
		driver.tap(1, 400, 300, 5);//taps on last 3 months.
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.navigate().back();
		driver.tap(1, 400, 300, 5);//taps on last 6 months.
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		driver.swipe(360, 1024, 360, 360, 2000);
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.tap(1,100,100,5);//back button to reach homepage
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), new NewsArticles());
	}
}
