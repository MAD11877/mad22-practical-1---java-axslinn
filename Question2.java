import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your height: "); 
    double height = in.nextDouble();
    System.out.print("Enter your weight: "); 
    double weight = in.nextDouble();
    in.close();

    double bmi = weight / (height * height);
    System.out.println("Your BMI is " + bmi);

  }
}
