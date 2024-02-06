import java.util.Scanner;
public class Age
{
    public static void main(String[] args)
    {
        Age Obj = new Age();
        Obj.go();

    }
    public void go ()
    {
        int age ;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter your age ");
        age = scan.nextInt();

        System.out.println("Your age is " + age) ;
        if (age > 20 )
        {
            System.out.println("You are old");
        }
        else if (age < 10)
        {
            System.out.println("You are too young");
        }
        else
        {
            System.out.println("You are young");
        }

    }
}


