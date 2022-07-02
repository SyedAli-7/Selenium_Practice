package com.websitepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SyedAli\\eclipse-workspace\\TestingPractice\\browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demoqa.com/text-box");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.id("userName")).sendKeys("Syed Ali");
		//driver.findElement(By.id("userEmail")).sendKeys("Syedali@gmail.com");
		//driver.findElement(By.id("currentAddress")).sendKeys("14 B T Nagar");
		//driver.findElement(By.id("permanentAddress")).sendKeys("27 C Triplicane");
		//WebElement sub = driver.findElement(By.id("submit"));
		//sub.click();
		
		WebElement checkbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/ul/li[2]/span"));
		checkbox.click();
		//Thread.sleep(2000);
		//WebElement home = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/ol/li/span/label/span[3]"));
		//home.click();
		Thread.sleep(2000);
        WebElement plus = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/button[1]"));
        plus.click();
        Thread.sleep(2000);
        WebElement notes = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/span[3]"));
	    notes.click();
	}

}
