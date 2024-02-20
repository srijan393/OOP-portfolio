
import java.util.Scanner;
public class Pin {
    public static void main(String[] args)
    {
        int one, two , digit;
        digit = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a four digit pin:");
        digit = scan.nextInt();
        String hexDigit = Integer.toHexString(digit);
        one = ((int)(Math.random()+1000)*10000);
        two = ((int)(Math.random()+1000)*10000);

        String onestr = Integer.toHexString(one);
        String twostr = Integer.toHexString(two);

        System.out.println(onestr + hexDigit + twostr);
    }
}
