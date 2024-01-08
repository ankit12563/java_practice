import java.util.Scanner;

class Calculator1 {
  int num1;
  int num2;

  Calculator1() {
    System.out.println("Calculating....");
  }
}

class Add extends Calculator1 {

  public int Adding(int x, int y) {
    return x + y;
  }
}

public class Calculator {
  public static void main(String args[]) {
    try (Scanner user = new Scanner(System.in)) {
      System.out.print("Enter the first number: ");
      int num1 = user.nextInt();

      System.out.print("Enter the second number: ");
      int num2 = user.nextInt();

      Add calc = new Add();
      System.out.println("Result: " + calc.Adding(num1, num2));
    }
  }
}
