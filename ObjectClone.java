import java.util.*;

class Employee implements Cloneable{

			String name, id;
			
			Employee(String name, String id){
			
			this.name=name;
			this.id=id;
			
			}
			
			
		public String toString(){
		
			return "name=" + name + "id=" +id;
			
		}
		
		
		
		public Employee clone() throws CloneNotSupportedException{
		
					return (Employee)super.clone();
					
					}
			
			}
			
		public class ObjectClone{
		
			public static void main(String[] args) throws CloneNotSupportedException{
			
				Scanner s=new Scanner(System.in);
				System.out.println("Enter name of the employee");
				String name=s.nextLine();
				System.out.println("Enter empid of the employee");
				String id=s.nextLine();
				
				Employee ob1=new Employee(name,id);
				System.out.println(ob1);
				System.out.println(ob1.hashCode());
				
				Employee ob2=ob1.clone();
				ob2.name="Artificial Intelligence";
				ob2.id="9867";
				
				System.out.println(ob2);
				System.out.println(ob2.hashCode());
				System.out.println(ob2.name);
				System.out.println(ob2.id);
				System.out.println(ob1.name);
				
				
	}
	
	
}
		
				
				
