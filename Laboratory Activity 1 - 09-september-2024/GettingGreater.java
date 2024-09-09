import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char f1 = value.next().charAt(0);

        System.out.print("Enter second character: ");
        char s2 = value.next().charAt(0);

        char maxChar = (char) Math.max(f1, s2);

        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + maxChar);
        System.out.println("-------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(f1 + " : " + (int)f1);
        System.out.println(s2 + " : " +  (int)s2);

        value.close();
    }
}