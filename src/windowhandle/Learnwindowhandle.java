package windowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnwindowhandle {
		
		WebDriver driver;

		@Before
		public void init() {

			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.yahoo.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		
		@Test
		public void windowHandle() throws InterruptedException {
			
		/*	System.out.println(driver.getTitle());
			String handle1 = driver.getWindowHandle();
			System.out.println(handle1);
			*/
			
			driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("xpath");
			driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
			Thread.sleep(3000);
			
			/*System.out.println(driver.getTitle());
			String handle2 = driver.getWindowHandle();
			System.out.println(handle2);*/
			
			
			//w3school.com
			driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
			Thread.sleep(3000);
			
//			String handle3 = driver.getWindowHandle();
//			System.out.println(handle3);
			
			Set<String> handles = driver.getWindowHandles();
//			System.out.println(handles);
			
			for(String i : handles) {
				
//				System.out.println(i);
				driver.switchTo().window(i);
				
			}
			
			
			
			System.out.println(driver.getTitle());
			
//			driver.switchTo().window(handle3)
			
		}

	}
