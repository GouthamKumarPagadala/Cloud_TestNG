package com.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Jyoti_pageobject {

	public static AndroidDriver<MobileElement> driver;

	

	public MobileElement userName = (MobileElement) driver
			.findElementById("com.experitest.ExperiBank:id/usernameTextField");

	public MobileElement password = (MobileElement) driver
			.findElementById("com.experitest.ExperiBank:id/passwordTextField");

	public MobileElement loginButton = (MobileElement) driver
			.findElementById("com.experitest.ExperiBank:id/loginButton");

}
