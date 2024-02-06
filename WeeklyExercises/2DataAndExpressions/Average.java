import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
            int i1, i2, i3;
            double average;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter three values ");
            System.out.print("Enter the first value: ");
            i1 = scan.nextInt();
            System.out.print("Enter the second value: ");
            i2 = scan.nextInt();
            System.out.print("Enter the third value: ");
            i3 = scan.nextInt();
            average = (double) (i1 + i2 + i3) / 3 ;
            System.out.println("The average is " + average);
        }
    }


