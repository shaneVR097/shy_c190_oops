class Strexample{
	public static void main(String args[]){
		System.out.println(args[0]);
		String s1=args[0];
		System.out.println(args[1]);
		String s2=args[1];
		String s3=String.format("%s%s",s1,s2);
		System.out.println(s3);
		System.out.println(s3.substring(0,2));

/*		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		String s=args[0];
		String s1=args[1];
		String s2=args[2];
		String s3=args[3];
		String s4=String.format("%s%s%s%s",s,s1,s2,s3);
		System.out.println(s4);*/
		
/*		char a=args[0].charAt(3);
		System.out.println(" "+a);
		System.out.println(" "+args[0].length());*/


		/*String s=new String("ComputerScience");
		char ch[]={'c','o','m','p','u','t','e','r','s','c','i','e','n','c','e'};
|		String s1=new String(ch);
		String s2="ComputerScience";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);*/
	}
}
