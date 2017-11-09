package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByPartialLinkText {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.17-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	WebElement aboutLink = driver.findElement(By.partialLinkText("About"));
	aboutLink.click();
	}
}

