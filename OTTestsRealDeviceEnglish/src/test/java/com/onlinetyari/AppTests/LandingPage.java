/**
 * 
 */
package com.onlinetyari.AppTests;

import java.io.IOException;
import java.util.Random;
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
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/tab_text\")")
	private static WebElement my_exams;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/title\").text(\"Send feedback\")")
	private static WebElement send_feedback;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/instabug_option_report_bug\")")
	private static WebElement instabug_report;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/instabug_action_open_composer\")")
	private static WebElement text_instabug;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/user_email\")")
	private static WebElement user_email;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/text_composer\")")
	private static WebElement content_feedback;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/instabug_action_send\")")
	private static WebElement feedback_send;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/instabug_option_send_feedback\")")
	private static WebElement feedback_send2;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/text_composer\")")
	private static WebElement enter_feedback;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/send_message\")")
	private static WebElement feedback_send3;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/search_src_text\")")
	private static WebElement search_box;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/ask_button\")")
	private static WebElement add_question;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/select_unselect_group_radiobutton\")")
	private static WebElement ask_question_ssc;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/select_unselect_group_radiobutton\")")
	private static WebElement ask_question_banking;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/edit_box_question_text\")")
	private static WebElement write_question;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/proceed_id\")")
	private static WebElement proceed;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/sub_name_id\").text(\"Others\")")
	private static WebElement category_others;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/submit_id\")")
	private static WebElement submit;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/done\")")
	private static WebElement done;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_to_plan\")")
	private static WebElement browse_store;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/mocktest_btn\")")
	private static WebElement mock_test_button;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/spinnerStore\")")
	private static WebElement spinner_store;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"Banking\")")
	private static WebElement opt_banking;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"IAS\")")
	private static WebElement opt_ias;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"GATE\")")
	private static WebElement opt_gate;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"State Level\")")
	private static WebElement opt_state;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"CLAT\")")
	private static WebElement opt_clat;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"Railways\")")
	private static WebElement opt_railways;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"Insurance\")")
	private static WebElement opt_insurance;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"CTET\")")
	private static WebElement opt_ctet;
	@AndroidFindBy(uiAutomator = "resourceId(\"android:id/text1\").text(\"NDA\")")
	private static WebElement opt_nda;
	
	@Test(priority = 1)
	public static void test_announcements() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		announcements.click();
		Thread.sleep(5000);
		Utils.Screenshot();
		driver.navigate().back();
	}
	@Test(enabled = false, priority = 2)
	public static void test_instabug() throws InterruptedException{
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 700, 100, 5);
		send_feedback.click();
		instabug_report.click();
		text_instabug.click();
		user_email.click();
		user_email.sendKeys("rachit.dev@onlinetyari.com");
		content_feedback.click();
		content_feedback.sendKeys("Test Content by Rachit Dev");
		feedback_send.click();
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 3)
	public static void test_feedback() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 700, 100, 1);
		send_feedback.click();
		feedback_send2.click();
		enter_feedback.sendKeys("Test feedback by Rachit Dev");
		feedback_send3.click();
		Thread.sleep(3000);
	}
	@Test(enabled = false, priority = 4, invocationCount = 6)
	public static void search_string() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		search_button.click();
		search_box.click();
		search_box.sendKeys(Utils.exams[new Random().nextInt(Utils.exams.length)]);
		System.out.println("Search String for this test is " + Utils.exams[new Random().nextInt(Utils.exams.length)]);
		driver.tap(1, 710, 1260, 1);
		Utils.Screenshot();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public static void homepage_overview() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 300, 200, 2); //taps the My exam section
		Thread.sleep(2000);
		driver.tap(1, 600, 200, 2); //taps the Ask and Answer Section
		Thread.sleep(2000);
		driver.tap(1, 200, 200, 2); //taps the Updates section
		Thread.sleep(2000);
	}
	@Test(enabled = false, priority = 6)
	public static void test_ask_answer(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		add_question.click();
		ask_question_ssc.click();
		write_question.sendKeys("What a Test Question By Rachit Dev?");
		driver.navigate().back();
		proceed.click();
		driver.scrollTo("others");
		category_others.click();
		submit.click();
		driver.navigate().back();
	}
	@Test(priority = 7)
	public static void test_my_exams() throws Exception{
		//Tests the mock-test section
		driver.tap(1, 300, 200, 2); //taps the My exam section
		browse_store.click(); //taps the add to plan section.
		mock_test_button.click(); //taps at the mock test section.
		Thread.sleep(15000);
		driver.swipe(360, 1024, 360, 360, 3000);
		Utils.Screenshot();
		driver.swipe(360, 360, 360, 1024, 3000);
		//mock test section test over.
	}
	@Test(priority = 8)
	public static void test_ebook() throws InterruptedException, IOException{
		//Tests the ebook section
		driver.tap(1, 380, 200, 5); //taps on the ebooks section.
		Thread.sleep(6000);
		driver.swipe(360, 1024, 360, 360, 3000);
		Utils.Screenshot();
		driver.swipe(360, 360, 360, 1024, 2000);
		Thread.sleep(2000);
		driver.swipe(360, 360, 360, 1024, 3000);
	}
	@Test(priority = 9)
	public static void test_question_bank() throws InterruptedException, IOException{
		//Tests the question bank section
		driver.tap(1, 600, 200, 5);
		Thread.sleep(6000);
		//driver.swipe(360, 1024, 360, 360, 3000); 
		Utils.Screenshot();
	}
	@Test(priority = 10)
	public static void test_product_various_exams_banking() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_banking.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 2); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 11)
	public static void test_product_various_exams_ias() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_ias.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 12)
	public static void test_product_various_exams_gate() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_gate.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 13)
	public static void test_product_various_exams_state() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_state.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 14)
	public static void test_product_various_exams_clat() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_clat.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 15)
	public static void test_product_various_exams_railways() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_railways.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 16)
	public static void test_product_various_exams_insurance() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_insurance.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 17)
	public static void test_product_various_exams_ctet() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_ctet.click();
		Thread.sleep(10000);
		driver.tap(1, 300, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
	}
	@Test(priority = 18)
	public static void test_product_various_exams_nda() throws InterruptedException, IOException{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.tap(1, 200, 100, 5);
		//driver.tap(1, spinner_store, 5);
		opt_nda.click();
		Thread.sleep(10000);
		driver.tap(1, 30, 200, 5); //taps the My exam section
		Thread.sleep(10000);
		Utils.Screenshot();		
		driver.tap(1, 600, 200, 5); //taps the Ask and Answer Section
		Utils.Screenshot();
		driver.tap(1, 200, 200, 5); //taps the Updates section
		Utils.Screenshot();
		Thread.sleep(2000);
		driver.navigate().back();
		PageFactory.initElements(new AppiumFieldDecorator(driver), new NavigationDrawer());
	}
	
}
