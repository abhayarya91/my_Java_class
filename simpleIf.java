
import java.util.Scanner;

class simpleIf
{
    public static void main(String args[])
    {
        int age;
        try(Scanner obj = new Scanner(System.in);)
        {
            System.out.print("Enter your age:");
        
            age = obj.nextInt();
    
            if(age<=75)
            {
                System.out.println("You are eligible for drive test....");
            }
            System.out.println("Visite again...thank you");
        }

    }
}