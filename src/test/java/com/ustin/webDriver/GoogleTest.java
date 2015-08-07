package com.ustin.webDriver;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	public static final String URL = "http://www.google.com";	
	public static WebDriver driver;	
		
	@BeforeClass
	public static void createDriver() {
		driver = new ChromeDriver();
	}

	@Before
	public void BeforeMethod() {
		driver.get(URL);
	}

	@Test
	public void googleTest1() {
		System.out.println("GoogleTest1 ");
	}

	@Test
	public void googleTest2() {
		System.out.println("GoogleTest2");
	}

	@Test
	public void googleTest3() {
		System.out.println("GoogleTest2");
	}

	@AfterClass
	public static void Destroy() {
		driver.close();
	}
}
