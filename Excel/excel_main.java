package Excel;

public class excel_main {

	public static void main(String[] args) {
		String filename="C:\\Users\\BLTuser.BLT172\\Desktop\\Muni.xlsx",
				sheetname="Sheet1";
				int r=1;int c=2;
				getexcel muni=new getexcel();
				String s=muni.read_excel(filename,sheetname,r,c);
		         System.out.println(s);
		         
				 c=3;
				muni.write_excel(filename,sheetname,r,c,"Hello");

	}

}
