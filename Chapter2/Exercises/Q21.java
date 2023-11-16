package Chapter2.Exercises;

/*
Write a program to display today’s date in this format: Monday December 10, 2008.
Use the console window for output.
 */

import java.util.*;
import java.text.*;
public class Q21 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMM dd, yyyy");

        System.out.println(sdf.format(today));
    }
}
