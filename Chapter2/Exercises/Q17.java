package Chapter2.Exercises;

/*
Write a program that displays a frame window 800 pixels wide and 600 pixels
high. Set the title of the frame to Welcome to Java.
 */

import javax.swing.*;
public class Q17 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();

        myWindow.setSize(800,600);
        myWindow.setTitle("Welcome to Java");
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
