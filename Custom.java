class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}

class Custom{

	public static void main(String args[]){
	
		int i=20;
		int j=0;
		try{
			j=18/i;
			if(j==0)
			{
				j=18/1;
				throw new MyException("invalid value of i");
			}
		}
		
		catch(MyException e)
		{
			System.out.println("Exception"+e);
		}
		
		finally
		{
			System.out.println("ok");
		}
	}
}
		
		
		
