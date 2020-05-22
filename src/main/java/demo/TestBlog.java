package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBlog {
	
	public static WebDriver driver=null;
    
	@BeforeTest
	public void run() {
//		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.topbuzz.com/feed/foryou");
		driver.getPageSource();
	}

	@Test(priority=2)
	public void CheckLinksTitle() {

		List<WebElement> content = driver.findElements(By.className("feedcard-container"));
		for (WebElement contentData : content) {
			try {
				WebElement data = contentData.findElement(By.className("feedcard-title"));
				System.out.println(data.getText());
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	@Test(priority=1)
	public void getTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "TopBuzz - Top Video, GIFs, TV, News";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority=3)
	public void searchResult() {
		WebElement search = driver.findElement(By.className("search-input"));
		search.sendKeys("J. Crew");
		search.sendKeys(Keys.ENTER);
		driver.navigate().back();

	}
	@Test(enabled=false)
	public void disabled() {
		System.out.println("This method will not executed");
	}

	@AfterTest
	public void close() {
		driver.quit();

	}
}
