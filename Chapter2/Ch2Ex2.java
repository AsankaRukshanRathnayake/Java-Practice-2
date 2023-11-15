package Chapter2;

/* divide the given full name into the first
and last names and displays the number of letters in the last name.
 */
public class Ch2Ex2 {
    public static void main(String[] args) {
        String fullname = "Asanka Rathnayake";

        String space=" ";
        String firstname, lastname;

        firstname = fullname.substring(0,fullname.indexOf(space));
        lastname = fullname.substring(fullname.indexOf(space)+1, fullname.length());

        System.out.println("Full Name  : "+fullname);

        System.out.println("First Name : "+firstname);
        System.out.println("Last Name  : "+lastname);

        System.out.println("Number of letters in the last name : "+lastname.length());
    }

}
