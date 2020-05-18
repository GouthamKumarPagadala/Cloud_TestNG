package com.terrain;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.helper.UserActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	static AndroidDriver<MobileElement> driver;

	@Parameters({ "testName", "accessKey", "platformName", "platformVersion", "deviceName", "udId", "appPackage", "appActivity" })
	@BeforeMethod
	public void beforeMethod(String testName, String accessKey, String platformName, String platformVersion, String deviceName,
			String udId, String appPackage, String appActivity) throws IOException {
		System.out.println("Before");

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", platformName);
		desiredCapabilities.setCapability("platformVersion", platformVersion);
		desiredCapabilities.setCapability("deviceName", deviceName);
		desiredCapabilities.setCapability("udId", udId);
		desiredCapabilities.setCapability("appPackage", appPackage);
		desiredCapabilities.setCapability("appActivity", appActivity);

		if (accessKey.isEmpty()) {
			URL remoteUrl = new URL("http://localhost:4723/wd/hub");

			driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
		} else {
			desiredCapabilities.setCapability("testName", testName);
			desiredCapabilities.setCapability("accessKey", accessKey);
			desiredCapabilities.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
			driver = new AndroidDriver<MobileElement>(new URL("https://demo.experitest.com/wd/hub"), desiredCapabilities);

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	}

}
