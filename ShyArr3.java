import java.util.*;
public class ShyArr3{
public static void main(String args[]){
//int[] myArr={100,80,60,40,20};
Scanner sc= new Scanner(System.in);
int n1,n2,chc,res;
System.out.println("Enter size of array: ");
n1 = sc.nextInt();
//n2 = sc.nextInt();
/*
int[] myArr=new int[3];
int[] myArr={1,2,3};
int[] myArr=new int[]{1,2,3};
*/
System.out.println("Enter "+n1+" elements into the array:\n");
int[] myArr=new int[n1];
for(int i=0;i<n1;i++)
{
myArr[i]= sc.nextInt();
}
System.out.println("\n"+n1+" elements of the array are:\n");
for(int elm:myArr)
{
System.out.println(elm);
}
}
}
