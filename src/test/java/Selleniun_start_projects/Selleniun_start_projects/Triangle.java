package Selleniun_start_projects.Selleniun_start_projects;


import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Triangle {



	static WebDriver  browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver","C:\\sellenium\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");

	}
	@Test
	public void C1FC2FC3FC4F() {
		browser.findElement(By.name("side1")).sendKeys("1");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Error: Not a Traingle";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}	
	@Test
	public void C1FC2FC3FC4T() {
		browser.findElement(By.name("side1")).sendKeys("7");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Error: Not a Traingle";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}	
	@Test
	public void C1FC2FC3TC4F() {
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("7");
		browser.findElement(By.name("side3")).sendKeys("3");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Error: Not a Traingle";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}	
	@Test
	public void C1FC2TC3FC4F() {
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("7");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Error: Not a Traingle";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}	
	@Test
	public void C1TC2FC3FC4F() {
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("4");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Scalene";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}	
	@Test
	public void C1TC2FC3FC4T() {
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("2");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Isosceles";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}
	@Test
	public void C1TC2FC3TC4F() {
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("2");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Isosceles";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}
	@Test
	public void C1TC2TC3FC4F() {
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Isosceles";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}
	@Test
	public void C1TC2TC3TC4T() {
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("2");

		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue="Equilateral";
		String result= browser.findElement(By.id("triangle-type")).toString();
		assertNotEquals(result,expectedValue);
		browser.close();
	}
}
