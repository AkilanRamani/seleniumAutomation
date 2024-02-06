package sampleautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        
        WebElement table2 = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]"));
        // Find all rows in the table
        java.util.List<WebElement> rows = table2.findElements(By.tagName("tr"));

        // Count the number of rows that have structure values
        int structureCount = 0;
        for (WebElement row : rows) {
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                String cellText = cell.getText();
                if (cellText.equals("Structure")) {
                    structureCount++;
                }
            }
        }

        // Verify that there are only 4 structure values present in the table
        Assert.assertEquals(structureCount, 4);
        // Close the browser
        driver.quit();
    }


	}


