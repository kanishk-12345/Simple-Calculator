import java.util.Scanner;

public class Factorial {
    public static void factorial(double n) {
        if(n < 0) {
            System.out.print("Invalid Number");
            return;
        }
        double fact = 1;
        for(double i = n; i >= 1; i--) {
             fact = fact * i;

        }
        System.out.println("The Factorial is: " + fact);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextInt();
        factorial(n);

        sc.close();
        }
}
