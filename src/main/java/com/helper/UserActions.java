package com.helper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.listener.TestListener;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class UserActions {

	public static void pass(String Text) {
		TestListener.test.get().pass(Text);
	}
	
	public static void pass(String Text,AndroidDriver<MobileElement> driver) throws IOException {
		System.out.println(driver !=null);
		
		TestListener.test.get().pass(Text,MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)).build());
	}
}
