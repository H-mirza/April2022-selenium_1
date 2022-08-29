package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class launchchrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mirza\\selenium\\selenium_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}


