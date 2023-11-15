package Chapter2;

/* Write a code to input the last name of a user. */

import java.util.*;
public class Ch2Act5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String lastname;
        System.out.print("Enter your last name : ");
        lastname = s.next();

        System.out.println("Hello, "+lastname);
    }
}
