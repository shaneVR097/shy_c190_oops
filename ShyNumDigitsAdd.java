import java.util.*;
public class ShyNumDigitsAdd {
    public static void main(String args[]) {
        int scr = 49;
        Scanner sc = new Scanner(System.in);
        int n1, n2, r, nr = 0, chc, res;

        System.out.println("Enter a number: ");
        n1 = sc.nextInt();

        n2 = n1;
        while (n2 > 0) {
            r = n2 % 10;
            n2 /= 10;
            nr = nr + r;
        }

        System.out.println("Sum of digits of the number is: " + nr);
    }
}
