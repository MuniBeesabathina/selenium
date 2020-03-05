package DDFW_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readandwrite {

	user Read(int r)
	{
		user s=new user();
	
		String filename="C:\\Users\\BLTuser.BLT172\\Desktop\\login.xlsx";
		String sheet="Sheet2";
		File f=new File(filename);
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			XSSFWorkbook wk=new XSSFWorkbook(fis);
			XSSFSheet sh=wk.getSheet(sheet);
			XSSFRow rw=sh.getRow(r);
			XSSFCell c1=rw.getCell(0);
			 s.gender=c1.getStringCellValue();
			 
			 XSSFCell c2=rw.getCell(1);
			 s.first=c2.getStringCellValue();
			 
			 XSSFCell c3=rw.getCell(2);
			 s.last=c3.getStringCellValue();
			 
			 XSSFCell c4=rw.getCell(3);
			 s.mail=c4.getStringCellValue();
			 
			 XSSFCell c5=rw.getCell(4);
			 s.passward=c5.getStringCellValue();
			 
			 XSSFCell c6=rw.getCell(5);
			 s.expected=c6.getStringCellValue();
			 
			 
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		return s;
	
		
	}
	void write(int r,String g)
	{
		
	}
}

