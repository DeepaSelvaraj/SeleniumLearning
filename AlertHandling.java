package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
	        driver.manage().window().maximize();
	        WebElement alertbox1 = driver.findElement(By.name("B2"));
	        alertbox1.click();
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	        

	}

}
