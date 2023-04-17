package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TASK3 {
	
	WebDriver driver;
	@BeforeSuite
		void init()
		{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		
	}
		@Test
		void test1() throws InterruptedException
		{
			String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 
			driver.get(url);
			Thread.sleep(3000);
			WebElement name=driver.findElement(By.name("username"));
			name.sendKeys("Admin");
			WebElement pw=driver.findElement(By.name("password"));
			pw.sendKeys("admin123");
			WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			login.click();
			WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
			logout.click();
			Select se1=new Select(logout);
			se1.selectByIndex(3);
			
		}
}


