package pac1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class TC007_javascriptexecuter {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://amazon.in");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("alert('Welcome to Javascriptexe");
		
		//SCROLLING IN PAGE
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,700)");
		
		
	}
}
