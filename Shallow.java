class Shallow{

	public static void main(String[] args){
	
	Abc ob=new Abc();
	ob.i=23;
	ob.j=26;
	Abc ob1=new Abc();
	ob1.i=ob.i;
	ob1.j=ob.j;
	
	
	ob1.i=67;
	ob1.j=45;	
	
	System.out.println(ob1.i);
	System.out.println(ob1.j);
	
	}
	
	
  }
  
  
  class Abc {
  		int i,j;
  		
  		
  		}	
	
