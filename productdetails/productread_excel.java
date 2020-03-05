package productdetails;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class productread_excel<Product> {

	public product read_excel(int rowno)
	{
		product s=new product();
		

			File f=new File("C:\\Users\\BLTuser.BLT172\\Desktop\\pdetails.xlsx");
			FileInputStream fis;

			
			try{
				fis = new FileInputStream(f);
			   XSSFWorkbook wb= new XSSFWorkbook(fis);
			   XSSFSheet sh= wb.getSheet("Sheet1");
				XSSFRow row=sh.getRow(rowno);
				
				XSSFCell c=row.getCell(0);
				s.pid=(int)c.getNumericCellValue();
				
				XSSFCell c1=row.getCell(1);
		        s.prod_name= c1.getStringCellValue();
				
				XSSFCell c2=row.getCell(2);
				s.unit_price=(int) c2.getNumericCellValue();
		        
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              return s;
	}
	void search(int pid,int qty)
	{
		product p=new product();
		for(int i=7;i<=9;i++)
		{
			
			p=read_excel(i);
			if(p.pid==pid)
			{
				int total=p.unit_price*qty;
				System.out.println(p.prod_name+" "+p.pid+" "+p.unit_price+" "+total);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      productread_excel r=new productread_excel();
       int pid=20;
       int qty=2;
       r.search(pid, qty);
	}

}