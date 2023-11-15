package Chapter2;

/*
Write an application that asks for the user’s first, middle, and last names and
replies with the user’s initials.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Ch2Task1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String firstname, middlename, lastname;

        System.out.print("Enter your full name (firstname, middlename, lastname) : ");
        firstname=s.next();
        middlename=s.next();
        lastname=s.next();

        String nameWithInitials = firstname.substring(0,1)+". "+middlename.substring(0,1)+". "+lastname;

        System.out.println("**************************************************************");

        System.out.println("Full Name          : "+firstname+" "+middlename+" "+lastname);
        System.out.println("Name with Initials : "+nameWithInitials);

        System.out.println("**************************************************************");
    }
}
