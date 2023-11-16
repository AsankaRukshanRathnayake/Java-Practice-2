package Chapter2.Exercises;

/*
Display the current time in the title of a frame window using this format:
12:45:43 PM.
 */

import java.text.SimpleDateFormat;
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

        System.out.println(sdf.format(today));
    }
}
