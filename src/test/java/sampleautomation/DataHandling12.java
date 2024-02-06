package sampleautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataHandling12 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        
        List<WebElement>allTableData=
        		driver.findElements(By.xpath("//table[contains(@class,'tsc_tab')]//tr//following-sibling::td"));
        		int totalTableData=allTableData.size();
        		System.out.println("Total Table data size : "+totalTableData);
        		boolean allDataStatus=false;
        		for(WebElement tData:allTableData) //
        		{
        		String data=tData.getText(); 
        		System.out.println(data + " ");
        		if(data.contains("Shanghai"))
        		{
        		allDataStatus=true;
        		break;
        		}
        		}
        		Assert.assertTrue(allDataStatus,"Data not found in Table");

	}

}
