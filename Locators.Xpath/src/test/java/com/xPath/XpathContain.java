package com.xPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathContain {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.doordash.com//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void clickLogIn() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='root']")).click();
		Thread.sleep(3000L);
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@class='sc-LKuAh dIhlZu']")).sendKeys("yyy");
		Thread.sleep(2000L);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
