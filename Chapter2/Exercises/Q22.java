package Chapter2.Exercises;

/*
Write a program that displays a frame window W pixels wide and H pixels
high. Use the Scanner to enter the values for W and H. The title of the frame
is also entered by the user.
 */

import java.util.*;
import javax.swing.*;
public class Q22 {
    public static void main(String[] args) {
        int W,H;

        //user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width  : ");
        W=s.nextInt();
        System.out.print("Enter height : ");
        H=s.nextInt();

        //display window
        JFrame myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setTitle("Window of "+W+" width, "+H+" height.");
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
