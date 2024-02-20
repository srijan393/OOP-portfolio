public class StringPlay
{ public static void main (String[] args)
    {
        String college = new String ("Leeds Beckett University");

        String town = new String(" Bradford,UK ");

        String c1, c2, c3;

        int stringLength = college.length();

        System.out.println ( college + " contains " + stringLength + " characters.");

        c1 = college.toUpperCase();

        c2 = c1.replace('e', '*');

        c3 = college.concat(town);

        System.out.println ("The final string is " + c3);
    }
}