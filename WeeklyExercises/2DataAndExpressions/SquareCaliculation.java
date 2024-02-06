import java.util.Scanner;
public class SquareCaliculation
{
    public static void main(String[] args)
    {
     int length;
     double perimeter;
     double area;
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        length=scan.nextInt();
        perimeter = (length)*4;
        area = (length)*(length);
        System.out.println("The perimeter of the square is : " + perimeter);
        System.out.println("The area of the square is : " + area );
    }
}
