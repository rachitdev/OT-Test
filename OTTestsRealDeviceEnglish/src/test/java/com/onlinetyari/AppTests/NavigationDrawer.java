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
public class NavigationDrawer extends Config {
	
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/name_drawer\")")
	private static WebElement profile;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/button1\")")
	private static WebElement login;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_btn\")")
	private static WebElement email_login;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_email\")")
	private static WebElement new_email_login;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_pass\")")
	private static WebElement login_pass;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/new_login_btn\")")
	private static WebElement login_btn;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/edit_profile\")")
	private static WebElement edit_profile;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/person_name_profile_edit\")")
	private static WebElement edit_profile_name;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/person_email_profile\")")
	private static WebElement edit_email_profile;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/mobile_profile_edit\")")
	private static WebElement edit_mobile_profile;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/edit_profile_pic\")")
	private static WebElement edit_profile_pic;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/dob_profile\")")
	private static WebElement dob;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/numberpicker_input\").text(\"Nov\")")
	private static WebElement month;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/numberpicker_input\").text(\"14\")")
	private static WebElement date;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/numberpicker_input\").text(\"1990\")")
	private static WebElement year;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/button1\")")
	private static WebElement done;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/edit_address_basic\")")
	private static WebElement basic_address;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/edit_address_city\")")
	private static WebElement city_address;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\")")
	private static WebElement city;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/action_sync_notif\")")
	private static WebElement sync;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/title\").text(\"My Question Bank\")")
	private static WebElement my_question_bank;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/txt_see_answer\")")
	private static WebElement see_answer;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/rate_us_btn\")")
	public static WebElement rate_us;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/remind_later_btn\")")
	public static WebElement reminder;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/later\")")
	public static WebElement later;
	
	
	@Test
	public static void aaevnthandler(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if(later.isDisplayed()){
			later.click();
			System.out.println("Campaign handled by clicking on later button.");
		}
		if (rate_us.isDisplayed()){
			reminder.click();
			System.out.println("Campaign handled by clicking on reminder button.");
		}
	}
	@Test(priority=1)
	public static void change_profile() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		Thread.sleep(12000);
		Utils.Screenshot();
		profile.click();
		login.click();
		email_login.click();
		new_email_login.sendKeys("rachit.dev@onlinetyari.com");
		login_pass.sendKeys("OT123456");
		login_btn.click();
		Thread.sleep(5000);
		Utils.Screenshot();
	}
	
	@Test(enabled = false, priority = 2)
	public static void test_change_profile_info(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		edit_profile.click();
	}
	@Test(enabled = false, priority=3)
	public static void test_change_name(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		edit_profile_name.click();
		edit_profile_name.sendKeys("OnlineTyari Tests");
	}
	@Test(enabled = false, priority = 4)
	public static void test_change_email(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		edit_email_profile.click();
		edit_email_profile.sendKeys("onlinetyari.tests@gmail.com");
	}
	@Test(enabled = false, priority = 5)
	public static void test_change_mobile(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		edit_mobile_profile.click();
		edit_mobile_profile.sendKeys("9999633770");
	}
	@Test(enabled = false, priority = 6)
	public static void test_change_photo() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		edit_profile_pic.click();
		Thread.sleep(4000);
		edit_profile_pic.click();
		Thread.sleep(4000);
		//tappping on the photo in gallery of Micromax A190.
		driver.tap(1, 600, 600, 5);
		Thread.sleep(3000);
		driver.tap(1, 360, 500, 5);
		Thread.sleep(3000);
		driver.tap(1, 360, 660, 5);
		Thread.sleep(9000);
		driver.tap(1, 600, 800, 5); //taps the ok button.
		Thread.sleep(5000);
		Utils.Screenshot();
		System.out.println("Photo has been changed!");
	}
	
	@Test(enabled = false, priority = 8)
	public static void change_dob(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, dob, 5);
		driver.tap(1, 200, 700, 5);
		month.sendKeys("Nov");
		driver.tap(1, 350, 700, 5);
		date.sendKeys("14");
		driver.tap(1, 500, 700, 5);
		year.sendKeys("1992");
		done.click();
		System.out.println("Date Of Birth Changed!");
	}
	@Test(enabled = false, priority=9)
	public static void change_address(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.scrollTo("Address");
		basic_address.sendKeys("Sector 39");
		city_address.sendKeys("Gurgaon");
		city.click();
		driver.tap(1, 500, 800, 5);
		edit_profile.click();
		driver.tap(1, 600, 800, 5); //taps the ok button.
	}
	@Test(priority = 10)
	public static void check_order() throws InterruptedException{
		driver.tap(1, 500, 200, 5);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		sync.click();
		Thread.sleep(5000);
		driver.navigate().back();
	}
	@Test(enabled = false, priority = 11)
	public static void settings_memory_location() throws InterruptedException, IOException{
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		Thread.sleep(3000);
		driver.swipe(360, 1024, 360, 360, 3000);//swipes to get the settings tab.
		driver.tap(1, 200, 950, 5); //taps on the settings tab.
		Thread.sleep(3000);
		driver.tap(1, 450, 570, 5); //taps on the external memory.
		Thread.sleep(3000);
		driver.tap(1, 500, 800, 5); //taps on yes button
		Utils.Screenshot();
		Thread.sleep(2000);
		driver.tap(1, 100, 100, 5); //taps on the back button on screen.
		Thread.sleep(2000);
		Utils.Screenshot();
	}
	@Test(priority = 11)
	public static void aevnthandler(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if(later.isDisplayed()){
			later.click();
			System.out.println("Campaign handled by clicking on later button.");
		}
		if (rate_us.isDisplayed()){
			reminder.click();
			System.out.println("Campaign handled by clicking on reminder button.");
		}
	}
	@Test(priority = 12)
	public static void check_my_question_bank_details() throws InterruptedException, IOException{
		Thread.sleep(5000);
		//driver.tap(1, 500, 900, 5);//Taps on remind me later button.
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		Thread.sleep(2000);
		driver.tap(1, 400, 600, 5);// taps on the my question bank button.
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps on the first question bank.
		Thread.sleep(5000);
		//driver.swipe(360, 1024, 360, 360, 2000); //scrolls the page of question bank opened.
		//driver.tap(1, 600, 1200, 5); //taps on open now
		driver.tap(1, 200, 200, 5); // taps on the first subsection of 1st question bank selected.
		//driver.tap(1, 600, 100, 5); //taps on the sync button.
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.swipe(360, 1024, 360, 360, 2000); //scrolls the subsections.
		driver.tap(1, 650, 650, 5); //taps on a random subsection
		driver.swipe(360, 1024, 360, 360, 2000); //scrolls the subsections.
		driver.swipe(360, 1024, 360, 360, 2000); //scrolls the subsections.
		driver.swipe(360, 1024, 360, 360, 2000); //scrolls the subsections.
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.tap(1, 100, 100, 5); //back button pressed.
		Thread.sleep(2000);
		driver.tap(1, 100, 100, 5); //back button pressed.
		Thread.sleep(2000);
		driver.tap(1, 100, 100, 5); //back button pressed.
		Thread.sleep(2000);
		driver.tap(1, 100, 100, 5); //back button pressed.
	}
	@Test(priority = 13)
	public static void check_my_question_bank_fav() throws InterruptedException, IOException{
		Thread.sleep(5000);
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		Thread.sleep(2000);
		driver.swipe(360, 360, 360, 1024, 2000);
		Thread.sleep(2000);
		driver.tap(1, 400, 300, 5);// taps on the my question bank button.
		Thread.sleep(2000);
		driver.tap(1, 200, 200, 5); //taps on the first question bank.
		Thread.sleep(2000);
		driver.tap(1, 200, 200, 5); // taps on the first subsection of 1st question bank selected.
		Thread.sleep(2000);
		driver.tap(1, 500, 500, 5); //taps on the my favourite button.
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.tap(1, 100, 100, 5); //back button pressed.
		Thread.sleep(2000);
		driver.tap(1, 100, 100, 5); //back button pressed.
		Thread.sleep(2000);
		driver.tap(1, 100, 100, 5); //back button pressed.
	}
	@Test(priority = 14)
	public static void check_my_ebook() throws InterruptedException, IOException{
		Thread.sleep(5000);
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		Thread.sleep(2000);
		driver.tap(1, 300, 800, 5);// taps on the my ebooks button.
		Thread.sleep(5000);
		driver.tap(1, 600, 100, 5);//taps on the sync button.
		Thread.sleep(2000);
		Utils.Screenshot();
		driver.tap(1, 500, 300, 5); //taps on the first ebook which has been subscribed.
		Thread.sleep(5000);
		Utils.Screenshot();
		driver.swipe(576, 640, 144, 640, 50);
		Thread.sleep(1000);
		driver.swipe(576, 640, 144, 640, 50);
		Thread.sleep(1000);
		driver.swipe(576, 640, 144, 640, 50);
		Thread.sleep(1000);
		driver.swipe(576, 640, 144, 640, 50);
		Thread.sleep(1000);
		driver.swipe(576, 640, 144, 640, 50);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test(priority = 15)
	public static void check_my_questions() throws InterruptedException, IOException{
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		driver.tap(1, 300, 900, 5);
		Thread.sleep(3000);
		Utils.Screenshot();
		driver.navigate().back();
	}
	@Test(priority =16)
	public static void check_my_articles() throws InterruptedException, IOException{
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		driver.tap(1, 300, 1000, 5);
		Thread.sleep(3000);
		Utils.Screenshot();
		driver.navigate().back();
		
	}
	@Test(priority = 17)
	public static void check_my_wallet() throws InterruptedException, IOException{
		driver.tap(1, 100, 100, 5); //opens the navigation bar.
		driver.tap(1, 300, 1100, 5); 
		Thread.sleep(3000);
		Utils.Screenshot();
		driver.navigate().back();
		PageFactory.initElements(new AppiumFieldDecorator(driver), new CurrentAffairs());
	}
	
}
