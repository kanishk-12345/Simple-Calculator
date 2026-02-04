import java.util.Scanner;

public class Function {
    public static int multiply(int a, int b) {
        return a * b;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        System.out.println("The Multiply of two number: " + multiply(a,b));
    }
}
