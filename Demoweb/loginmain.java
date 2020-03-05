package Demoweb;

public class loginmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Readlogin mn=new Readlogin();
		String testresult=null;
		for(int i=1;i<=2;i++)
		{
		String e=mn.read_excel(i,0);
		String p=mn.read_excel(i,1);
	    String a_eid=mn.login(e,p);
	    String e_eid=mn.read_excel(i,2);
	    if(a_eid.equals(e_eid))
	    {
		System.out.println("pass");
	    testresult="pass";
	    }
		else
		{
		System.out.println("Fail");
		testresult="Fail";
		}
mn.write_excel(i, 3, a_eid);
mn.write_excel(i, 4, testresult);

	}

}
}
