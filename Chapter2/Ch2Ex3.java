package Chapter2;

/*
Displays Formatted Date Information
 */

import java.util.*;
import java.text.*;
public class Ch2Ex3 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());

        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("EEEE, dd MMM, yyyy");
        System.out.println(sdf.format(today));

        sdf = new SimpleDateFormat ("dd/MM/yyyy");
        System.out.println(sdf.format(today));

    }
}
