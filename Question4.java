import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = in.nextInt();
    in.close();
    for (int i = number; i > 0; i--)
    {
      for (int j = i; j > 0; j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
