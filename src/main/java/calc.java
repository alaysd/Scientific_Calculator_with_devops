import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class calc {
    public static double squareRoot(int value) {
        return Math.sqrt(value);
    }

    public static BigInteger factorial(int value) {
        if(value == 0) return BigInteger.valueOf(1);
        return BigInteger.valueOf(value).multiply(factorial(value-1));
    }

    public static double naturalLog(int value) {
        return Math.log(value);
    }

    public static long powerFunc(int base, int power) {
        return (long)Math.pow(base, power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.println("Scientific calculator");
        System.out.println("******************************************************************");
        boolean cont = true;

        while(cont) {
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural log");
            System.out.println("4. Power function");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            int c;

            if(option == 5) {
                cont = false;
            } else {
                System.out.print("Input value : ");
                int value = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Answer : " + squareRoot(value));
                        break;
                    case 2:
                        System.out.println("Answer : " + factorial(value));
                        break;
                    case 3:
                        System.out.println("Answer : " + naturalLog(value));
                        break;
                    case 4:
                        System.out.print("Enter power : ");
                        int p = sc.nextInt();
                        System.out.println("Answer : " + powerFunc(value, p));
                        break;
                    default:
                        System.out.println("Invalid option");
                }




                System.out.print("1. Continue, 2. Exit :: ");
                c = sc.nextInt();
                System.out.println();
                if(c == 2) {
                    System.out.println("Thank you!!\n");
                    cont = false;
                }
            }

        }

    }
}
