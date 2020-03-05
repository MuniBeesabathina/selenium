package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethods {
static File f;
XSSFWorkbook wb;
String readExcel()
{
String s=null;
FileInputStream fis;

try {
fis = new FileInputStream(f);
wb = new XSSFWorkbook(fis);
XSSFSheet sh= wb.getSheet("Sheet1");
XSSFRow row=sh.getRow(0);
XSSFCell cell=row.getCell(0);
s=cell.getStringCellValue();


} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

return s;

}
void writeExcel()
{
FileOutputStream fos;
try {
fos=new FileOutputStream(f);

XSSFSheet sh= wb.getSheet("Sheet1");
XSSFRow row=sh.createRow(1);
XSSFCell cell=row.createCell(0);
cell.setCellValue("Chennaaai");
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
f=new File("C:\\Users\\BLTuser.BLT172\\Desktop\\Muni.xlsx");
ExcelMethods obj=new ExcelMethods();
String s =obj.readExcel();
System.out.println(s);
obj.writeExcel();
}

}
