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
public class SelectExams extends Config{
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"SSC\")")
	private static WebElement ssc;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"Banking\")")
	private static WebElement banking;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"IAS\")")
	private static WebElement ias;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"GATE\")")
	private static WebElement gate;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"State Level\")")
	private static WebElement state_level;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"CLAT\")")
	private static WebElement clat;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"Railways\")")
	private static WebElement railways;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"Insurance\")")
	private static WebElement insurance;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"CTET\")")
	private static WebElement ctet;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/add_remove_button\").text(\"NDA\")")
	private static WebElement nda;
	@AndroidFindBy(uiAutomator = "resourceId(\"com.hinkhoj.questionbank:id/proceed\")")
	private static WebElement proceed;
	
	public static void select_ssc(){
		ssc.click();
	}
	public static void select_banking(){
		banking.click();
	}
	public static void select_ias() {
		ias.click();
	}
	public static void select_gate(){
		gate.click();
	}
	public static void select_state_level(){
		state_level.click();
	}
	public static void select_clat(){
		clat.click();
	}
	public static void select_railways(){
		railways.click();
	}
	public static void select_insurance(){
		insurance.click();
	}
	public static void select_ctet(){
		ctet.click();
	}
	public static void select_nda(){
		nda.click();
	}
	public static void go_further(){
		proceed.click();
	}
	@Test
	public static void exam_selection() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		select_ssc();
		select_banking();
		select_ias();
		select_gate();
		select_state_level();
		select_clat();
		select_railways();
		select_insurance();
		select_ctet();
		select_nda();
		go_further();
		Thread.sleep(15000);
		Utils.Screenshot();		
		PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
	}
	}
