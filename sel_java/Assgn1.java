package sel_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn1
{

public static void main(String[] args)
{

      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      WebDriver dr=new ChromeDriver();
      dr.get("http://demowebshop.tricentis.com/login");
      //Using text()
     /*//dr.findElement(By.xpath("//label[text()='Email:']"));
    dr.findElement(By.xpath("//label[text()='Password:']"));
    //  dr.findElement(By.xpath("//label[text()='Remember me?']")).click();
*/      
      //Using text() and contains
     /*// dr.findElement(By.xpath("//label[contains(text(),'Ema')]"));
      dr.findElement(By.xpath("//label[contains(text(),'Pass')]"));
      dr.findElement(By.xpath("//label[contains(text(),'Remem')]")).click();*/
     
      //Using contains and attribute
      dr.findElement(By.xpath("//label[contains(@id,'Email')]"));
      dr.findElement(By.xpath("//label[contains(@id,'Password')]"));
}

}

