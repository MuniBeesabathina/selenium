package productdetails;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readpro {
static int i;
public product read_excel(int rowno)
{
product s=new product();


File f=new File("C:\\Users\\BLTuser.BLT172\\Desktop\\Productmuni.xlsx");
FileInputStream fis;


try{
fis = new FileInputStream(f);
  XSSFWorkbook wb= new XSSFWorkbook(fis);
  XSSFSheet sh= wb.getSheet("Sheet2");
XSSFRow row=sh.getRow(rowno);

XSSFCell c=row.getCell(0);
s.pid=(int) c.getNumericCellValue();

XSSFCell c1=row.getCell(1);
       s.prod_name= c1.getStringCellValue();

XSSFCell c2=row.getCell(2);
s.punit_price=(int) c2.getNumericCellValue();
       
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
              return s;
}
public product read_excels1(int i)
{
product s1=new product();


File f=new File("C:\\Users\\BLTuser.BLT172\\Desktop\\Productmuni.xlsx");
FileInputStream fis;


try{
fis = new FileInputStream(f);
  XSSFWorkbook wb= new XSSFWorkbook(fis);
  XSSFSheet sh= wb.getSheet("Sheet1");
XSSFRow row=sh.getRow(i);
   XSSFCell c=row.getCell(0);
s1.pid=(int) c.getNumericCellValue();

XSSFCell c2=row.getCell(1);
s1.pqty=(int) c2.getNumericCellValue();
       
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
          return s1;
}

void search(int pid,int pqty)
{
product p=new product();
for(int i=1;i<=3;i++)
{

p=read_excel(i);
if(p.pid==pid)
{
int total=p.punit_price*pqty;
System.out.println(p.prod_name+" "+p.pid+" "+p.punit_price+" "+total);
write_excel(i,p,total);
}
}
}

public void write_excel(int j, product p,int total)
{


File f=new File("C:\\Users\\BLTuser.BLT172\\Desktop\\Productmuni.xlsx");
FileInputStream fis;
try {
fis = new FileInputStream(f);
XSSFWorkbook wb= new XSSFWorkbook(fis);
  XSSFSheet sh= wb.getSheet("Sheet3");
XSSFRow row=sh.getRow(j);
XSSFCell cell=row.createCell(0);
FileOutputStream fos=new FileOutputStream(f);
cell.setCellValue(p.pid);
wb.write(fos);

XSSFCell cell1=row.createCell(1);
fos=new FileOutputStream(f);
cell1.setCellValue(p.prod_name);
wb.write(fos);

XSSFCell cell2=row.createCell(2);
fos=new FileOutputStream(f);
cell2.setCellValue(p.punit_price);
wb.write(fos);

XSSFCell cell3=row.createCell(3);
fos=new FileOutputStream(f);
cell3.setCellValue(total);
wb.write(fos);
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
 
}


public static void main(String[] args) {
// TODO Auto-generated method stub
      Readpro r=new Readpro();
      for(i=3;i<=4;i++)
      {
   product a=r.read_excels1(i);
     r.search(a.pid,a.pqty);
      }
     
}

}
