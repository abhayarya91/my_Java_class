public class Variable
{
    static int b = 52;// static variable
    int x=56; // Instance Varriable
    public static void main (String[] args )
    {
        int a = 10;//Local variable
        System.out.println(a);
        System.out.println(Variable.b);
        Variable r = new Variable();
        System.out.println(r.x);
    }   
}



// class Sun
// {
//     static int a=10;
//     void fun()
//     {
//         int b=10;
//         System.out.println(a+" "+b);
//         a++;
//         b++;
//     }
//     public static void main(String[] args) {
//         Sun d = new Sun();
//         d.fun();
//         d.fun();

//     }
// }
