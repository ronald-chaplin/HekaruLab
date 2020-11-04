package com.zork.grue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class GrueApplicationTests {
	private WebDriver driver;

	@BeforeEach
	void setUp(){
		System.setProperty("webdriver.chrome.driver", "d:/selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://zorkherokutest.herokuapp.com/");
	}

	@Test
	void contextLoads() {
		assertEquals("https://zorkherokutest.herokuapp.com/", driver.getCurrentUrl());
	}

	@Test
	void turnOnLightsTest(){
		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/button)"));
		button.click();
		assertEquals("https://zorkherokutest.herokuapp.com/lights?",driver.getCurrentUrl());
	}

}
