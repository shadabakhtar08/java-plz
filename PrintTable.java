//Print Table of any number

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number y: ");
        int no = s.nextInt();
        System.out.println("Table of " + no);
        for (int i = 1; i <= 10; i++) {

            System.out.println(no + "*" + i + "=" + no * i);
        }
    }
}
