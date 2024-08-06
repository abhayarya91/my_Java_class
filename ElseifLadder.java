
import java.util.Scanner;

class ElseifLadder
{
    public static void main(String args[])
    {
        try(Scanner ref = new Scanner(System.in);)
        {
            int marks;
        System.out.print("Enter your mark:");
        marks = ref.nextInt();
        if(marks>80)
        {
            System.out.println("You are Topper...");
        }
        else if (marks<80 && marks >=60)
        {
            System.out.println("Your are first...");
        }
        else if (marks<60 && marks >=45)
        {
            System.out.println("Your are Second...");
        }
        else 
        {
            System.out.println("Fail...Try again...");
        }
        }
    }
}