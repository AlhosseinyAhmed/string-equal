import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s1;
        String s2;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter your first name ");
        s1=scanner.next();
        System.out.println(" Enter your scaned name ");
        s2=scanner.next();
        System.out.println(" Your Name " + s1.concat(s2));
        System.out.println(" Result of equals " + s1.equals(s2));
        System.out.println(" Result of equalsIgnoreCase " + s1.equalsIgnoreCase(s2));

    }
}