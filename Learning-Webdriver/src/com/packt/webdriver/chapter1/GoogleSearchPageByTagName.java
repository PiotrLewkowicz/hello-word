package com.packt.webdriver.chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GoogleSearchPageByTagName {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.17-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		
	}
}