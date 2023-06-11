package metapersistence;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {
	
	
	public static void main(String[] args) {
		EmployeeData e1;
		ArrayList<EmployeeData>al=new ArrayList();
		while(true)
		{
		System.out.println("enter operation");
		System.out.println("1=> insert employee details");
		System.out.println("2=> show all employee details");
		System.out.println("3=> Delete employee details where id=");
		System.out.println("4=> update employee details where id=");

		System.out.println("5=> Exits");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		EmployeeDetails es=new EmployeeDetails();
		switch(ch)
		{
		case 1:
			System.out.println("enter how many emp insert");
			int empn=sc.nextInt();
			for(int i=0;i<empn;i++)
			{
			System.out.println("enter fname,lname and id"+i);
		//Scanner sc=new Scanner(System.in);
		String fname=sc.next();
		String lname=sc.next();
		int id=sc.nextInt();
		
		e1=new EmployeeData(fname,lname,id);
		
		al.add(e1);
		//System.out.println(al);
			}				
			System.out.println("<---All Record Inserted--->\n\n");
		break;
		
		
		case 2: 
			//System.out.println(al);
			for (EmployeeData e : al) {
			System.out.println("{");
			System.out.println("\t fname: "+e.getFname()+",");
			System.out.println("\t lname: "+e.getLname()+",");
			System.out.println("\t id: "+e.getId());
			System.out.println("}");


			
		}
			System.out.println("<---All Record Display--->\n\n");
		break;
		
		case 3:
			System.out.println("enter id to delete record emp");
			int id1=sc.nextInt();
			EmployeeData ef = null;
			for (EmployeeData e : al) {
				if(e.getId()==id1)
				{
					ef=e;
				}
			}
			//System.out.println(ef.getFname());
			al.remove(ef);
			
			System.out.println("<---Deleted successfully--->\n\n");
			
			
		break;
		
		case 4:
			System.out.println("enter id to update record emp");
			int id2=sc.nextInt();
			System.out.println("enter fname lanme to update record emp");
			
			String fn=sc.next();
			String ln=sc.next();
			EmployeeData ef2 =null;// new EmployeeData(fn,ln,id2) ;
			for (EmployeeData e : al) {
				if(e.getId()==id2)
				{
					ef2=e;
					e.setFname(fn);
					e.setLname(ln);
					e.setId(id2);
				}
			}
			//ef2.setFname(fn);
			//ef2.setLname(ln);
			//ef2.setId(id2);
			
			System.out.println("<---Updated successfully--->\n\n");
			
			
		break;
		case 5:System.exit(0);
		}
		
			
		}
	}
	

}
