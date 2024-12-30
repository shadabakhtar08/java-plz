// WAP to Swap two numbers (3 variable code)

// public class Swap {
//     public static void main(String[] args) {
//         int a = 10, b = 20;
//         int t;
//         System.out.println("Before");
//         System.out.println("a = " +a);
//         System.out.println("b = " +b);
//         t = a;
//         a = b;
//         b = t;
//         System.out.println("After Swap");
//         System.out.println("a = " +a);
//         System.out.println("b = " +b);
//     }
// }


// WAP to Swap two numbers (2 variable code)
public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}