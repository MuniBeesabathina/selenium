package AssgnFeb26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssgnEcomFunc {
	String exp_name,exp_price;
	String act_name,act_price;
	WebDriver dr;
	void login(String id,String password)
	{
	
	System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	 dr=new ChromeDriver();
    dr.get("https://www.saucedemo.com/");
    dr.findElement(By.xpath("//body[@class='main-body']//child::form/input[1]")).sendKeys(id);
    dr.findElement(By.xpath("//body[@class='main-body']//child::form/input[2]")).sendKeys(password);
    dr.findElement(By.xpath("//body[@class='main-body']//child::form/input[3]")).click();
	}
	void addproduct()
	{
	exp_name=dr.findElement(By.xpath("//div[@class='inventory_list']//child::div[1]/div[2]/a/div")).getText();

	String Ex=dr.findElement(By.xpath("//div[@class='inventory_list']//child::div[1]/div[3]/div")).getText();
	exp_price=Ex.substring(1,6);
	dr.findElement(By.xpath("//*[@id='inventory_container']/div/div[1]/div[3]/button")).click();
	dr.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span")).click();
	act_name=dr.findElement(By.xpath("//*[@id='item_4_title_link']/div")).getText();
	act_price=dr.findElement(By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
	System.out.println(exp_name);
	System.out.println(exp_price);
	System.out.println(act_name);
	System.out.println(act_price);
	}
	void verify()
	{
	if((exp_name.equals(act_name))&&(exp_price.equals(act_price)))
	{
	System.out.println("pass");
	}
	else
	System.out.println("fail");
	}
	public static void main(String[] args) {
		 AssgnEcomFunc  af=new  AssgnEcomFunc ();
	af.login("problem_user", "secret_sauce");
	af.addproduct();
	af.verify();
	}
	
}
