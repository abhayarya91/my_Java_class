import java.util.*;
class IfElseStatement
{
    public static void main(String args[])
    {
        try(Scanner obj = new Scanner(System.in);)
        {
            int n;
            System.out.print("Enter any number:");
            n= obj.nextInt();
            if(n>=1)
            {
                System.out.println("you entered positive number...");
            }
            else
            {
                System.out.println("you enterd nagetive number...");
            }
            System.out.println("thank you....");
        }

   }
}