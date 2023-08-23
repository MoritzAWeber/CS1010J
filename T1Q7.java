import java.util.Scanner;

public class T1Q7 {
    
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  // ask user to enter a value into num1
  System.out.print("Enter an integer: ");
  
  // do computation
  int num1 = sc.nextInt();
  double num2 = num1 + 1.2;

  System.out.println("num2 = " + num2);
  }
}