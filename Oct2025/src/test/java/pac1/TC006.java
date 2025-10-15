package pac1;
 
import java.time.Duration;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
 

//SYNCHRONIZATION-----------------------------------------------------------------------------------------------------
public class TC006 {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//THIS APP IS SLOW SLOW THERE WILL BE SYNC ERROR SO WE WILL PUT SLEEP
//		Thread.sleep(3000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		ele.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}

