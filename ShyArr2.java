public class ShyArr2
{
  public static void main(String args[])
  {
    int[] myArr={100,80,60,40,20};
    
    for(int i=0;i<5;i++)
    {
      System.out.println(myArr[i]);
    }
    for(int elm:myArr)
    {
      System.out.println(elm);
    }
  }
}
