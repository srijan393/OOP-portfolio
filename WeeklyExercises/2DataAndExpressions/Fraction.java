import java.util.Scanner;
public class Fraction
{
    public static void main(String[] args)
    {
        int numerator;
        int denominator;
        double fraction ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the numerator: ");
        numerator = scan.nextInt();
        System.out.println("Please enter the denominator: ");
        denominator = scan.nextInt();
        fraction = (double) numerator / denominator;
        System.out.println("The decimal is : " + fraction );
    }
}
