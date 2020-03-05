package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
/*import org.testng.annotations.Test;
*/
public class PageObjectModel {
	public static WebDriver dr;
	 //define register page and loginpage
	static RegisterJava registerjava;
	static LoginJava loginjava;
	/*@Test
	public void logintoDemoWebShop()*/
	public static void main(String[] args) {
	{
		screenshotpom mb=new screenshotpom();
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		WebDriver dr=new ChromeDriver();
		//dr.get("http://demowebshop.tricentis.com/login");
		dr.get("http://demowebshop.tricentis.com/register");
		
		System.out.println("Browser launched successfully");
		
	registerjava=PageFactory.initElements(dr, RegisterJava.class);
	loginjava=PageFactory.initElements(dr, LoginJava.class);
	
	registerjava.validRegistrationMale("subramanyam","beesabathina","munisubramanyam6@gmail.com","muni42812345","muni42812345");
	mb.Screenshottaking(1, dr);
	//loginjava.validLogIn("munisubramanyam@gmail.com","muni42812345");
	dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click(); //for logout
	dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();//for login page
	loginjava.validLogIn("munisubramanyam6@gmail.com","muni42812345");
	mb.Screenshottaking(2, dr);
	String exp_title="Demo Web Shop";
	String act_title=dr.getTitle();
	if(exp_title.equals(act_title))
	{
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}
	dr.close();
	}
	}
}



