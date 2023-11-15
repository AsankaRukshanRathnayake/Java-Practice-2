package Chapter2;

/*
Write a code fragment to display today’s date in the 07-04-2008 format.
 */

import java.text.*;
import java.util.*;
public class Ch2Act4 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(sdf.format(today));
    }
}
