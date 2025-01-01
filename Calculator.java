import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter First No. : ");
            int no1 = s.nextInt();
            System.out.println("Enter Second No. : ");
            int no2 = s.nextInt();
            System.out.println("Select  Symbol (+,-,*,/)");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is : " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtration is : " + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication is : " + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Division is : " + res);
                    break;

                default:
                    System.out.println("Invalid Symbol");
                    break;

            }

            System.out.println("Do you want to continue (Press y for Yes and n for No)");
            yn = s.next();
            s.close();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}
