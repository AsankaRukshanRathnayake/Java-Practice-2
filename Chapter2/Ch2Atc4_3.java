package Chapter2;

import java.util.*;

public class Ch2Atc4_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //String ls = System.getProperty("line.separator");
        s.useDelimiter("\n");

        System.out.print("Enter your full name (Firstname Lastname) : ");
        String name;
        name=s.next();

        System.out.println("Hello "+name);
    }
}
