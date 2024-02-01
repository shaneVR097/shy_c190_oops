import java.util.*;
class emp
{
	String nm;
	String dept;
	String ceo;
	int yrs;
	Scanner sc=new Scanner(System.in);
	void showEmp()
	{
		System.out.println("Name: "+nm+" Dept: "+dept+" CEO: "+ceo+" Company years: "+yrs);
	}
	void EmpEntry()
	{
		System.out.println("Enter Name: ");
		nm=sc.nextLine();
		System.out.println("Enter Dept: ");
		dept=sc.nextLine();
		System.out.println("Enter CEO:  ");
		ceo=sc.nextLine();
		System.out.println("Enter Company years:  ");
		yrs=sc.nextInt();
	}
}

class ShyEmpInfo{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		emp ob1=new emp();
		emp ob2=new emp();
		emp ob3=new emp();
		emp ob4=new emp();
		emp ob5=new emp();
		emp ob6=new emp();
		ob1.nm="John"; 
		ob1.dept="Sales"; 
		ob1.ceo="M.Kippers";
		ob1.yrs=5;
		
		ob2.nm="James"; 
		ob2.dept="R&D"; 
		ob2.ceo="S.Tippers";
		ob2.yrs=6;
		
		ob3.nm="Joseph"; 
		ob3.dept="Admin"; 
		ob3.ceo="H.Rippers";
		ob3.yrs=7;
		
		ob1.showEmp();
		ob3.showEmp();
		ob2.showEmp();
		ob4.EmpEntry();
		ob5.EmpEntry();
		ob6.EmpEntry();
		ob4.showEmp();
		ob5.showEmp();
		ob6.showEmp();
	}
}

/*
Name: John Dept: Sales CEO: M.Kippers Company years: 5
Name: Joseph Dept: Admin CEO: H.Rippers Company years: 7
Name: James Dept: R&D CEO: S.Tippers Company years: 6
Enter Name: 
rosalin
Enter Dept: 
iedc ece
Enter CEO:  
sb
Enter Company years:  
2
Enter Name: 
priti
Enter Dept: 
iedc bsh
Enter CEO:  
pkd
Enter Company years:  
8
Enter Name: 
arghya
Enter Dept: 
iedc bsh
Enter CEO:  
pkd
Enter Company years:  
5
Name: rosalin Dept: iedc ece CEO: sb Company years: 2
Name: priti Dept: iedc bsh CEO: pkd Company years: 8
Name: arghya Dept: iedc bsh CEO: pkd Company years: 5
*/
