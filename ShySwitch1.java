public class ShySwitch1 {
    public static void main(String args[]) {
        int scr = 49;
        switch (scr) {
            case 90:
                System.out.println("Very Good");
                break;
            case 60:
                System.out.println("Good");
                break;
            case 40:
                System.out.println("Okay");
                break;
            default:
                System.out.println("Grade not defined");
                break;
        }
    }
}
