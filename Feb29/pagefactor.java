package Feb29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import ScreenShotCapture.ScreenShot;

public class pagefactor
{
public static WebDriver driver;
static login loginpage;
static register registerpage;
public static void main(String args[]) throws Exception
{
setup();
seleniumSynchronisationTest();
tearDown();
}
private static void setup()
{
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/register");
registerpage=PageFactory.initElements(driver, register.class);
loginpage= PageFactory.initElements(driver, login.class);
}
private static void seleniumSynchronisationTest()
{
register.validregistration();
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
ScreenShot ss=new ScreenShot();
ss.screenshot12(driver);
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
login.validlogin();
}

private static void tearDown()
{
String s1= driver.getTitle();
String s2="Demo Web Shop";
if (s1.equals(s2))
{
System.out.println("PASS");
driver.close();
}
}
}



