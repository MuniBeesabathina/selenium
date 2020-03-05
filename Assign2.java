import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign2
{

public static void main(String[] args)
{
// TODO Auto-generated method stub
String a="Online Bookstore";
String b="Web Database Development";
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.get(" http://examples.codecharge.com/Store/Default.php");
/*String xp="/html/head/title";
    String s= dr.findElement(By.xpath(xp)).getText();
    if(s.equals(a))
    {
    System.out.println("Pass");
    }
    else
    {
    System.out.println("Fail");
    }*/
WebElement we=dr.findElement(By.name("category_id"));
Select sel=new Select(we);
sel.selectByVisibleText("Databases");
dr.findElement(By.xpath("//input[@name='DoSearch']")).click();
dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/b/a")).click();
String s1= dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/h1")).getText();
if(s1.equals(b))
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
String s2= dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/table/tbody/tr/td[2]")).getText();
dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("2");
dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
String s3= dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[4]")).getText();
float f=Float.parseFloat(s3.substring(1,6));
float f1=Float.parseFloat(s2.substring(8,13));
float f2=f1*2;
if(f2==f)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}

}