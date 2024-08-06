
import java.util.Scanner;

class Relational
{
    public static void main(String args[])
    {
        int a,b;
        try(Scanner gh = new Scanner(System.in);)
       {
        System.out.print("Enter the value of a:");
        a = gh.nextInt();
        System.out.print("Enter the value of b:");
        b = gh.nextInt();
        System.out.println("True/flase: "+(a<b));
        System.out.println("True/flase: "+(a>b));
        System.out.println("True/flase: "+(a<=b));
        System.out.println("True/flase: "+(a>=b));
        System.out.println("True/flase: "+(a==b));
        System.out.println("True/flase: "+(a!=b));
       }
    }
}