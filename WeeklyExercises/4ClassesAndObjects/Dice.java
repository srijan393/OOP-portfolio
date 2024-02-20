import java.util.Scanner;
import java.util.Random;
public class Dice
{ public static void main (String[] args)
 {
     int dice1;
     int dice2;
     int totalRoll1 = 0;
     int totalRoll2 = 0;
     int roll1;
     int roll2;
     double averageRoll1;
     double averageRoll2;
     Scanner scan = new Scanner (System.in);
     Random random = new Random();
     System.out.println(" How many sides does dice 1 have? ") ;
     dice1= scan.nextInt();
     System.out.println(" How many sides does dice 2 have? ") ;
     dice2= scan.nextInt();
     for (int i = 1; i <= 3; i++)
     {
         roll1 = random.nextInt(dice1) + 1;
         roll2 = random.nextInt(dice2) + 1;
         System.out.println("Die 1 roll " + i + " = " + roll1 + ".");
         System.out.println("Die 2 roll " + i + " = " + roll2 + ".");
         totalRoll1 += roll1;
         totalRoll2 += roll2;
     }
     averageRoll1 = (double) totalRoll1 / 3;
     averageRoll2 = (double) totalRoll2 / 3;
     System.out.println("Die 1 rolled a total of " + totalRoll1 + " and rolled " + averageRoll1 + " on average.");
     System.out.println("Die 2 rolled a total of " + totalRoll2 + " and rolled " + averageRoll2 + " on average.");
 }
}