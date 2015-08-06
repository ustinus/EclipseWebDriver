package com.ustin.webDriver;

import org.junit.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Craigslist {

public static final String URL = "http://www.craigslist.org";	
public static WebDriver driver;	
	
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
	System.out.println("Test1");
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
