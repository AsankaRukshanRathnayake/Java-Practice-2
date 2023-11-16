package Chapter2.Exercises;

/*
Input the user’s first, middle, and last name as three separate strings and
display the name in the order of the first name, the middle initial, and the last
name. Include the period after the middle initial. If the input strings are
Wolfgang, Amadeus, and Mozart, for example, then the ouput would be
Wolfgang A. Mozart. Use the console window for output
 */

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        //user input
        Scanner s = new Scanner(System.in);

        String firstname, middlename, lastname;

        System.out.print("Enter first name    : ");
        firstname=s.next();
        System.out.print("Enter middle name   : ");
        middlename=s.next();
        System.out.print("Enter last name     : ");
        lastname=s.next();

        //display name
        String nameToBeDisplayed = firstname+" "+middlename.substring(0,1)+". "+lastname;
        System.out.println("Name : "+nameToBeDisplayed);
    }
}
