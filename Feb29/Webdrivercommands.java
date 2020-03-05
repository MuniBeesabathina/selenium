package Feb29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivercommands {

static WebDriver driver;

public static void webdriverCommnads() throws InterruptedException{
driver = new ChromeDriver();


driver.navigate().to("https://www.github.com");
Thread.sleep(5000);

driver.manage().window().maximize();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);

driver.navigate().back();
Thread.sleep(5000);

driver.navigate().forward();
Thread.sleep(5000);

String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

WebElement textElement = driver.findElement(By.tagName("h1"));
String text = textElement.getText();
System.out.println(text);
}

public static void main(String [] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
webdriverCommnads();
driver.close();
}
}
