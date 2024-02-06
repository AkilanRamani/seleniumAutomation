package sampleautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        
        List<WebElement>allHorizontalTH= driver.findElements(By.xpath("//table[contains(@class,'tsc_tab')]//thead//th"));
        		int sizeOfHorTH=allHorizontalTH.size();
        		Assert.assertEquals(sizeOfHorTH, 7,"Column couldn't match");
        		// Validating total horizontal column
        		boolean columnStatus=false;
        		for(WebElement horTH : allHorizontalTH)
        		{
        		String text=horTH.getText();//Structure Built
        		System.out.print(text + " ");
        		if(text.contains("Built"))
        		{
        		columnStatus=true;
        		break;
        		}
        		}
        		Assert.assertTrue(columnStatus,"Built column not found!!");
       
        
        

	}

}
