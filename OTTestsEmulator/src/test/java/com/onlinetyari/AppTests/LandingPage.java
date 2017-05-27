/**
 * 
 */
package com.onlinetyari.AppTests;

import java.io.IOException;
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
public class LandingPage extends Config {
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/toolbar\").class(\"android.widget.ImageButton\")")
	private static WebElement side_widget;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/search_filter_icon\")")
	private static WebElement search_button;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/notif_bell\")")
	private static WebElement announcements;
	@AndroidFindBy(uiAutomator = "class(\"android.widget.ImageView\")")
	private static WebElement feedback;
	@AndroidFindBy(uiAutomator = "text(\"Updates\")")
	private static WebElement updates;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/tab_text\")")
	private static WebElement my_exams;
	@AndroidFindBy(uiAutomator = "text(\"Ask & Answer\")")
	private static WebElement ask_answer;
	@AndroidFindBy(uiAutomator = "text(\"Current Affairs\")")
	private static WebElement current_affairs;
	@AndroidFindBy(uiAutomator = "text(\"News Articles\")")
	private static WebElement news_articles;
	@AndroidFindBy(uiAutomator = "text(\"Job Alerts\")")
	private static WebElement job_alerts;
	
	public static void click_side_widget(){
		side_widget.click();
	}
	public static void click_search_button(){
		search_button.click();
	}
	public static void click_announcement(){
		announcements.click();
	}
	public static void click_feedback(){
		feedback.click();
	}
	public static void click_updates(){
		updates.click();
	}
	public static void click_my_exams(){
		my_exams.click();
	}
	public static void click_ask_answer(){
		ask_answer.click();
	}
	public static void click_current_affairs(){
		current_affairs.click();
	}
	public static void click_news_articles(){
		news_articles.click();
	}
	public static void click_job_alerts(){
		job_alerts.click();
	}
	
	@Test
	public static void test_current_affairs() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		click_current_affairs();
		Thread.sleep(5000);
		Utils.Screenshot();	
		driver.navigate().back();
		//PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
	}
	@Test
	public static void test_search_button() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		click_search_button();
		Thread.sleep(5000);
		PageFactory.initElements(new AppiumFieldDecorator(driver), new SearchTest());
	}
	
}
