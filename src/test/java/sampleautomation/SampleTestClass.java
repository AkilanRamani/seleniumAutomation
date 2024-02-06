package sampleautomation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.emulation.Emulation;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestClass {

	public static void main(String[] args) {
		
		   WebDriverManager.chromedriver().setup();
		   
		    //ChromeDriver driver = new ChromeDriver();
		    
		   ChromeDriver driver1 = new ChromeDriver();// Performing upcasting.
		   WebDriver driver = new ChromeDriver();
	       driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	        driver.getTitle();
	        System.out.println(driver.getTitle());

	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	        
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        	       .withTimeout(Duration.ofSeconds(30L))
	        	       .pollingEvery(Duration.ofSeconds(5L))
	        	       .ignoring(NoSuchElementException.class);

	        	   WebElement foo = wait.until(new Function<WebDriver, WebElement>()  {
	        	     public WebElement apply(WebDriver driver) {
	        	       return driver.findElement(By.id("foo"));
	        	     }
	        	   });

	        WebElement textBox = driver.findElement(By.name("my-text"));
	        WebElement submitButton = driver.findElement(By.cssSelector("button"));
	        
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        textBox.sendKeys("Gowtham");
	        submitButton.click();
	        WebElement message = driver.findElement(By.id("message"));
	        message.getText(); 
	   

	        driver.quit();
	    }
	
	}


