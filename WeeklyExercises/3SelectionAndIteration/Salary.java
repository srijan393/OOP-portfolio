import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {

public static void main (String[] args)
{
    double currentSalary;
    double raise;
    double newSalary;
    String rating;
    double presalary;


    Scanner scan = new Scanner(System.in);


    System.out.print ("Enter the current salary: ");
    currentSalary = scan.nextDouble();
    System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
    rating = scan.next();
    if(rating.equals("Excellent"))
    {
        raise = 0.6;}
    else if (rating.equals("Poor"))
    {
        raise = 0.4;
    }
    else
    {
    raise = 0.15;
}

    newSalary = currentSalary * raise;
    presalary = newSalary + currentSalary;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    System.out.println();
    System.out.println("Current Salary:       " + money.format(currentSalary));
    System.out.println("Amount of your raise: " + money.format(raise));
    System.out.println("Your new salary:      " + money.format(presalary));
    System.out.println();
}
}
