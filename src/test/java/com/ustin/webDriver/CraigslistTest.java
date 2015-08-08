package com.ustin.webDriver;



import java.util.List;
import java.util.concurrent.TimeUnit;

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

//Pulls the List of all Audi cars for sale listed on 
//first page of search results
@Test
public void craigsListTest1() {
	WebElement searchField = driver.findElement(By.id("query"));
	searchField.sendKeys("Audi");
	searchField.submit();
	
	try {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("listview"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[class='mode button sel']")));
	}
	catch (Exception e) {
		System.out.println("List View Already Clicked");
	};
	
	List<WebElement> result = driver.findElements(By.cssSelector("a[class='hdrlnk']"));
	
	int counter = 1;
	
	for(WebElement car: result) {
		System.out.println(counter + " : " + car.getText());
		counter ++;
	}
	System.out.println(" -= Test Completed =- ");	
}

@Test
public void craigsListTest2() {
	System.out.println("Test2");
}

@Test
public void craigsListTest3() {
	System.out.println("Test3");
}

@AfterClass
public static void Destroy() {
	driver.close();
}
	

}
