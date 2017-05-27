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
public class NewsArticles extends Config {
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/nd_icon_home\").text(\"News Articles\")")
	private static WebElement news_articles;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/my_favourite_filter\")")
	private static WebElement fav;

	@Test(priority = 1)
	public static void check_news_ariticles() throws InterruptedException, IOException{
		news_articles.click();
		driver.tap(1, 400, 400, 5);//taps on the first news article downloaded.
		Utils.Screenshot();
		driver.tap(1, 100, 100, 5);
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public static void check_fav_news_articles() throws InterruptedException, IOException{
		fav.click();
		Utils.Screenshot();
		driver.tap(1, 100, 100, 5);
		driver.tap(1, 100, 100, 5);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new JobAlerts());
	}
	
	
	
	
}
