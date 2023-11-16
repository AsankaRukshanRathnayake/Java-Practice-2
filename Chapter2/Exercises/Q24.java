package Chapter2.Exercises;

/*
Write a Java program that displays a frame window 300 pixels wide and
200 pixels high with the title My First Frame. Place the frame so that its top
left corner is at a position 50 pixels from the top of the screen and 100 pixels
from the left of the screen.
 */

import javax.swing.*;
public class Q24 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();

        myWindow.setSize(300,200);
        myWindow.setTitle("My First Frame");
        myWindow.setVisible(true);
        myWindow.setLocation(50,50);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
