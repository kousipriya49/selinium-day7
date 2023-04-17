

package DAY7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TASK1 {
public void function() {
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(co);
driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
   String expectedtitle="Guest Registration Form - User Registration";
String actualtit1=driver.getTitle();
Assert.assertEquals(expectedtitle,actualtit1);
}
}

