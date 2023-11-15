import java.util.Scanner;

public class Ch2Ex4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String firstname, lastname;

        System.out.print("Enter your full name (Firstname Lastname) : ");
        firstname=s.next();
        lastname=s.next();

        System.out.println("Hello "+firstname+" "+lastname);
    }
}
