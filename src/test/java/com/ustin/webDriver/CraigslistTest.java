package com.ustin.webDriver;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CraigslistTest {

public static final String URL = "http://www.craigslist.org";	
public static WebDriver driver;	
public static WebDriverWait wait;
	
@BeforeClass
public static void createDriver() {
	driver = new FirefoxDriver();
}

@Before
public void BeforeMethod() {
	driver.get(URL);
}

@Test
public void craigsListTest1() {
	WebElement searchField = driver.findElement(By.id("query"));
	searchField.sendKeys("Audi");
	searchField.submit();
	
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("listview"))).click();
	String result = driver.findElement(By.xpath(".//*[@id='searchform']/div[2]/div[3]/p[1]/span/span[2]/a")).getText();
	
	System.out.println("Test1 completed: " + result);
}

@Test
public void craigsListTest2() {
	System.out.println("Test2");
}

@Test
public void craigsListTest3() {
	System.out.println("Test2");
}

@AfterClass
public static void Destroy() {
	driver.close();
}
	

}
