class Pol_const{
	int a;
	float x,y;
	String z;
	
	Pol_const(int a){
		this.a=a;
		//System.out.println(" Integer value is: "+x);
	}
	
	Pol_const(float x, float y){
		this.x=x;
		this.y=y;
		System.out.println(" Sum value is: "+(this.x+this.y));
	}
	
	Pol_const(String z){
		 this.z=z;
		 System.out.println(" Sum value is: "+(this.x+this.y));
	}
}

public class Poly_constructor
{
	public static void main(String args[])
	{
		Pol_const B1=new Pol_const(80);
		Pol_const B2=new Pol_const(8.0f,9.0f);
		Pol_const B3=new Pol_const("ABCDEFU");
		System.out.println(" Integer value is: "+B1.a);
	}
}
