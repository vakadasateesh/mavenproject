package mavendemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
@Test
public void teardown() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://amazon.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://facebook.com");
	//refresh
	driver.navigate().refresh();
	Thread.sleep(3000);
	//back
	driver.navigate().back();
	Thread.sleep(3000);
	//forward
	driver.navigate().forward();
	Thread.sleep(3000);
	//close
	driver.close();
}
}
