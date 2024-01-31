import java.util.*;

public class ShyCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, chc, res;

        System.out.println("Enter 2 numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("Enter Calculator choice...\n" + "1 Add...\n" + "2 Subtract...\n" + "3 Multiply...\n"
                + "4 Division...\n ");
        chc = sc.nextInt();

        switch (chc) {
            case 1:
                res = n1 + n2;
                System.out.println(n1 + "+" + n2 + "=" + res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println(n1 + "-" + n2 + "=" + res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println(n1 + "*" + n2 + "=" + res);
                break;
            case 4:
                // Using double for floating-point division
                double result = (double) n1 / n2;
                System.out.println(n1 + "/" + n2 + "=" + result);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
