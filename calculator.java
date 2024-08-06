// import java.util.*;

// public class Main
// {
//     public static void fun(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a:");
//         int a = sc.nextInt();
//         System.out.println("Enter the value of b");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum of a & b:\n sum");
//     }
// }



import java.util.*;

public class calculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number:");
            int a = sc.nextInt();
            System.out.print("Enter second number:");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum of a & b= "+sum);
            int sub = a - b;
            System.out.println("subtraction of a &b= "+sub);
            int mult = a / b;
            System.out.println("Multipition of a & b= "+mult);
        }

    }
}
