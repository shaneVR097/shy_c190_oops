class Pol_method{

	void m1(int x){
		System.out.println(" Integer value is: "+x);
	}
	
	int m1(int x,int y){
	return x+y;
	}
	
	double m1(float x, float y, int z){
	 return x*y*z;
	}
}

public class Main_class{
	public static void main(String args[]){
	Pol_method B=new Pol_method();
	int p=B.m1(8,90);
	double p1=B.m1(8.0f,9.0f,100);
	B.m1(20);
	System.out.println(" Sum is: "+p);
	System.out.println(" Sum is: "+p1);	
}
}
