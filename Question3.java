import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = in.nextInt();
    in.close();

    int multiplied = number * number;
    System.out.println("The square of the integer is " + multiplied);
  }
}
