
import java.util.Scanner;

class NestedIfelse
{
    public static void main(String args[])
    {
        try(Scanner ref =new Scanner(System.in);)
        {
            int a,b,c;
            System.out.print("Enter value of a:");
            a=ref.nextInt();
            System.out.print("Enter value of b:");
            b=ref.nextInt();
            System.out.print("Enter value of c:");
            c=ref.nextInt();
            if(a>b)
            {
                if(a>c)
                {
                    System.out.println(a+" is grater.");
                }
                else
                {
                    System.out.println(c+" is grater.");
                }
            }
            else
            {
                if(b>c)
                {
                    System.out.println(b+" is grater.");
                }
                else{
                    System.out.println(c+ "is grater.");
                }
            }
        }

    }
}