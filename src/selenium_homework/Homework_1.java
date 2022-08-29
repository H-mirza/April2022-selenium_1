package selenium_homework;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_1 {

		
		WebDriver driver;

		@Before
		public void init() {

			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		
		@Test
		public void alertPopup() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
			Thread.sleep(3000);
			String AlertText = driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			System.out.println(AlertText);
			
		}


	}
