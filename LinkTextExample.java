package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	        driver.manage().window().maximize();
	        WebElement search = driver.findElement(By.name("q"));
	        search.sendKeys("say cheese");
	        Robot r = new Robot();
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        driver.findElement(By.linkText("SayCheese Photography")).click();
	        

	}

}
