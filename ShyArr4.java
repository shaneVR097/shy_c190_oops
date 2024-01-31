import java.util.*;
public class ShyArr4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2 = 0, chc, res;

        System.out.println("Enter no. of subjects: ");
        n1 = sc.nextInt();

        System.out.println("Enter marks of " + n1 + " subjects:\n");
        int[] myArr = new int[n1];
        for (int i = 0; i < n1; i++) {
            myArr[i] = sc.nextInt();
        }

        System.out.println("\nEntered marks of " + n1 + " subjects are:\n");
        for (int elm : myArr) {
            System.out.println(elm);
            n2 = n2 + elm;
        }

        System.out.println("\nAverage of marks in " + n1 + " subjects is: " + (float) (n2 / n1));
    }
}
