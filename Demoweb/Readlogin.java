package Demoweb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readlogin {
String login(String eid,String password)
{
	System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com/login");
	dr.findElement(By.id("Email")).sendKeys(eid);
	dr.findElement(By.id("Password")).sendKeys(password);
	dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	String s= dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
	return s;
}
public String read_excel(int r, int c)
{
String sheet="sheet1";
String s= null;
String filename="C:\\Users\\BLTuser.BLT172\\Desktop\\login.xlsx";
File f=new File(filename);
try
{
FileInputStream fis=new FileInputStream(f);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh=wb.getSheet(sheet);
XSSFRow row=sh.getRow(r);
XSSFCell cell= row.getCell(c);
   s= cell.getStringCellValue();
}
catch (IOException e)
{
e.printStackTrace();
}
return s;
}

void write_excel(int r,int c,String actual_result)
{
String sheet="sheet1";

String filename="C:\\Users\\BLTuser.BLT172\\Desktop\\login.xlsx";
File f=new File(filename);
try
{
FileInputStream fis=new FileInputStream(f);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh=wb.getSheet(sheet);
XSSFRow row=sh.getRow(r);
XSSFCell cell= row.createCell(c);
FileOutputStream fos = new FileOutputStream(f);
   cell.setCellValue(actual_result);
   wb.write(fos);
}
catch(FileNotFoundException e)
{
	e.printStackTrace();
}
catch (IOException e)
{
e.printStackTrace();
}
}

}
