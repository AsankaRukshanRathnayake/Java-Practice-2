package Chapter2.Exercises;

/*
Input the user’s first and last name as two separate strings. Then display a
frame window with its title set to <last>, <first>, where <last> and <first> are
the input values. For example, if the input values are Johann and Strauss,
then the title would be Strauss, Johann.
 */

import java.util.*;
import javax.swing.*;
public class Q18 {
    public static void main(String[] args) {
        //user input
        Scanner s = new Scanner(System.in);

        String firstname,lastname;

        System.out.print("Enter first name : ");
        firstname=s.next();
        System.out.print("Enter last name  : ");
        lastname=s.next();

        //display the window
        JFrame myWindow = new JFrame();
        myWindow.setSize(800,600);
        myWindow.setTitle(lastname+" "+firstname);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
