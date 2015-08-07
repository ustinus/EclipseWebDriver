package com.ustin.webDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SVTest {
	public static final String URL = "http://www.strongview.com/";	
	public static WebDriver driver;	
	public static WebDriverWait wait;
	
	@BeforeClass
	public static void Constructor() {
		driver = new ChromeDriver();	
	}
	
	@Before
	public void BeforeClass() {
		driver.get(URL);
	}
	
	// Verifies that Page Title is what expected
	@Test
	public void VerifyTitle_SVTest1() {
		String title = "Email Marketing and Cross-Channel Marketing Solutions | StrongView";
		Assert.assertEquals("Page title is equal to string above", title, driver.getTitle());
	}
	
	//Verify all links on the page are valid
	@Test
	public void VerifyAllLinksValid_SVTest2() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement clickable : links) {
			int code = CheckLink(clickable.getAttribute("href"));
			String linkText = clickable.getText();
			if(linkText.isEmpty()) {
				linkText = "No Link Text";
			}
			System.out.println(code + " : " + linkText);
		}				
	}
	
	@Test
	public void SVTest3() {
	
	}
	
	@AfterClass
	public static void Destroy() {
		driver.quit();
	}
	
	//Gets and returns HTTP requests response code for given URL 
	@Ignore
	public static int CheckLink(String URLName){
	    try {
	        HttpURLConnection.setFollowRedirects(true);
	        HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
	        con.setRequestMethod("HEAD");
	        return con.getResponseCode();
	    }
	    catch (Exception e) {
	        //e.printStackTrace();
	        return 0;
	    }
	}
	
}
