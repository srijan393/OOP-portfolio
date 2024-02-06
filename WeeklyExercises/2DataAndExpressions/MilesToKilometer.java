import java.util.Scanner;
public class MilesToKilometer
{
    public static void main(String[] args)
    {
     float Miles;
     double Km;
     Scanner scan = new Scanner (System.in);
     System.out.println("Enter the Number of Miles: ") ;
     Miles = scan.nextFloat();
     Km = (Miles) * 1.609 ;
    System.out.println("The distance in kilometer " + Km);

    }
}
