import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Deli
{
    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;
        Scanner scan = new Scanner(System.in);
        NumberFormat format1 = NumberFormat.getCurrencyInstance();
        DecimalFormat format2 = new DecimalFormat("0.##");
        System. out. println ("******************* CS Deli ****************************");
        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        System.out.println("\nUnit Price: " + format1.format(pricePerPound) + " per pound");
        System.out.println("\nWeight: " + format2.format(weightOunces) + " pounds");
        System.out.println("\nTotal Price: " + format1.format(totalPrice));
    }
}