import java.util.*;

public class ShyArr3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Enter size of array: ");
        n1 = sc.nextInt();

        System.out.println("Enter " + n1 + " elements into the array:\n");
        int[] myArr = new int[n1];
        for (int i = 0; i < n1; i++) {
            myArr[i] = sc.nextInt();
        }

        System.out.println("\n" + n1 + " elements of the array are:\n");
        for (int elm : myArr) {
            System.out.println(elm);
        }
    }
}
