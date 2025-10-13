package pac1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC002_find_elements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in/");
		
		List<WebElement> amazonLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Total no. links:"+amazonLinks.size());
		
		for(WebElement link: amazonLinks) {
			System.out.println("link is: "+link.getText());
			System.out.println("Attribute is: "+link.getAttribute("href"));
			
		}
		
	}
}