
import java.util.Scanner;

class Arithmetic
{
    public static void main(String args[])
    {


        int a,b;
        try(Scanner obj = new Scanner(System.in))
        {
            System.out.print("Enter the value of a:");
            a = obj.nextInt();
            System.out.print("Enter the value of b:");
            b = obj.nextInt();
            System.out.println("Addition="+(a+b));
        }
    }   
}