package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class password {



	static WebDriver  browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver","C:\\sellenium\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
	}		
	@Test
	public void CorrectPassword() {
		browser.findElement(By.name("characters")).sendKeys("nada234");
		browser.findElement(By.name("validate")).click();
		String expectedValue="Valid Value";
		String result= browser.findElement(By.name("validation_message")).toString();
		assertNotEquals(result,expectedValue);

	}
	@Test
	public void NotCorrectPasswordtLong() {
		browser.findElement(By.name("characters")).sendKeys("nada134abc");
		browser.findElement(By.name("validate")).click();
		String expectedValue="InValid Value";
		String result= browser.findElement(By.name("validation_message")).toString();
		assertNotEquals(result,expectedValue);

	}
	@Test
	public void NotCorrectPasswordtShort() {
		browser.findElement(By.name("characters")).sendKeys("nada");
		browser.findElement(By.name("validate")).click();
		String expectedValue="InValid Value";
		String result= browser.findElement(By.name("validation_message")).toString();
		assertNotEquals(result,expectedValue);
	}
	@Test
	public void NotCorrectPassword1() {
		browser.findElement(By.name("characters")).sendKeys("nadaho@");
		browser.findElement(By.name("validate")).click();
		String expectedValue="InValid Value";
		String result= browser.findElement(By.name("validation_message")).toString();
		assertNotEquals(result,expectedValue);
	}
	@Test
	 public void NotCorrectPassword2() {
	 browser.findElement(By.name("characters")).sendKeys("nada12#");
	 browser.findElement(By.name("validate")).click();
	 String expectedValue="InValid Value";
	 String result= browser.findElement(By.name("validation_message")).toString();
	 assertNotEquals(result,expectedValue);
}
	@Test
	 public void NotCorrectPassword3() {
	 browser.findElement(By.name("characters")).sendKeys("@nada3$");
	 browser.findElement(By.name("validate")).click();
	 String expectedValue="InValid Value";
	 String result= browser.findElement(By.name("validation_message")).toString();
	 assertNotEquals(result,expectedValue);
	}
	
}