import java.util.Scanner;
public class Sphere
{
    public static void main (String[] args)
    {
        double radius ;
        double volume;
        double surfacearea ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius:");
        radius = scan.nextDouble();
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        surfacearea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.printf("Volume: %.4f%n", volume);
        System.out.printf("Surface Area: %.4f%n", surfacearea);

    }
}

