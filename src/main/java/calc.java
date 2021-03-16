import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class calc {

    private static final Logger logger = LogManager.getLogger(calc.class);

    public static double squareRoot(int value) {
        double answer;

        try {
            answer = Math.sqrt(value);
        } catch (Exception e) {
            logger.error("squareRoot error :: " + e);
            return -1;
        }

        return answer;
    }

    public static BigInteger factorial(int value) {
        if(value < 0) return BigInteger.valueOf(-1);
        if(value == 0) return BigInteger.valueOf(1);
        return BigInteger.valueOf(value).multiply(factorial(value-1));
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

            int option;

            try {
                option = sc.nextInt();
            } catch (InputMismatchException exp) {
                logger.error("Invalid input at option :: " + exp);
                return;
            }

            int c;

            if(option == 5) {
                cont = false;
            } else {
                System.out.print("Input value : ");
                int value;

                try {
                    value = sc.nextInt();
                } catch (InputMismatchException exp){
                    logger.error("Invalid input at value1 :: " + exp);
                    return;
                }

                switch (option) {
                    case 1:
                        double ans = squareRoot(value);
                        if(ans == -1) return;
                        System.out.println("Answer : " + ans);
                        break;
                    case 2:

                        if(value < 0) {
                            logger.error("Invalid number for factorial");
                        } else {
                            BigInteger inp = factorial(value);
                            System.out.println("Answer : " + factorial(value));
                        }


                        break;
                    case 3:
                        double answer;
                        try {
                            answer = Math.log(value);
                            System.out.println("Answer : " + answer);
                        } catch(ArithmeticException e) {
                            logger.error("Error for natural log :: " + e);
                            System.out.println("Error for natural log :: " + e);
                        }
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
