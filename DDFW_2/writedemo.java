package DDFW_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedemo {
	void write(int k,int l,String av)
	{
		 
		
		try {
			File f=new File("");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wk1=new XSSFWorkbook(fis);
		
			XSSFSheet st1=wk1.getSheet("sheet2");
			XSSFRow rw1=st1.getRow(k);
			XSSFCell cl1=rw1.createCell(l);
			FileOutputStream fos=new FileOutputStream(f);
			cl1.setCellValue(av);
			wk1.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
