package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByXPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.17-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement aboutButton = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[1]/a[1]"));
		System.out.println(aboutButton.getText());
		}
	}
