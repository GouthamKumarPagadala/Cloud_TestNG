package com.terrain;

import org.testng.annotations.Test;

import com.helper.UserActions;
import com.pageobjects.Jyoti_pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Jyoti extends BaseTest{

	

	@Test
	public void f() throws IOException {
		System.out.println("Hello "+ driver);
		  Jyoti_pageobject.driver = driver;
		  Jyoti_pageobject mobile =new Jyoti_pageobject();
		  //mobile.okButton.click(); 
		  System.out.println(Jyoti_pageobject.driver);
		  mobile.userName.sendKeys("company");
		  mobile.password.sendKeys("company"); mobile.loginButton.click();
		  UserActions.pass("Pressed Login Button", driver);
		  
		  MobileElement el6 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/makePaymentButton");
		  el6.click(); MobileElement el7 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/phoneTextField");
		  el7.sendKeys("123456789"); MobileElement el8 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/nameTextField");
		  el8.sendKeys("priti"); TouchAction touch = new TouchAction(driver);
		  touch.press(PointOption.point(545, 764)).moveTo(PointOption.point(557,
		  764)).release().perform();
		  
		  MobileElement el9 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/countryTextField");
		  el9.sendKeys("india"); MobileElement el10 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/countryButton");
		  el10.click(); MobileElement el11 = (MobileElement) driver.findElementByXPath(
		  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]"
		  ); el11.click(); MobileElement el12 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/sendPaymentButton");
		  el12.click(); MobileElement el13 = (MobileElement)
		  driver.findElementById("android:id/button1"); el13.click(); MobileElement
		  el14 = (MobileElement)
		  driver.findElementById("com.experitest.ExperiBank:id/logoutButton");
		  el14.click();
		 
	}



	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

}
