import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of integers you will be entering: ");
    int total = in.nextInt();
    
    List<Integer> numbers = new ArrayList<Integer>();
    for (int i = total; i > 0; i--)
    {
      System.out.print("Enter number: ");
      int number = in.nextInt();
      numbers.add(number);
    }

    in.close();
    int highest = 0;
    int mode = 0;
    for (int i : numbers) 
    {
      int freq = Collections.frequency(numbers, i);
      if (freq > highest)
      {
        highest = freq;
        mode = i;
      }
    }
    System.out.println(mode);
  }
}
