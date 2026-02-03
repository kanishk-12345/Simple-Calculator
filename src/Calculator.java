import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Choose an operation : ");
  System.out.println("1. Addition");
  System.out.println("2. Subtraction");
  System.out.println("3. Mutilication");
  System.out.println("4. Division");
  System.out.println("5. Modular");
  System.out.println("Enter your choice : ");
  int choice = sc.nextInt();
  System.out.println("Enter a first number : ");
  double num1 = sc.nextDouble();
  System.out.println("Enter a second number : ");
  double num2 = sc.nextDouble();

  switch(choice) {
   case 1:

    System.out.println("The addition of two number is : " + (num1 + num2));
    break;

   case 2:
    System.out.println("The subtraction of two number is : " + (num1 - num2));
    break;

   case 3:
    System.out.println("The mutiplication of two number is : " + (num1 * num2));
    break;

   case 4:
    if(num2 != 0) {
     System.out.println("The division of two number is : " + (num1 / num2));
    } else {
     System.out.println("The division is not possible.");
    }
    break;

   case 5:
    System.out.println("The module of two number is : " + (num1 % num2));
    break;

   default:
    System.out.println("Invalid operation.");
  }

 }
}