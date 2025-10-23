import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    //1
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter word:");
    String word = sc.next();
    int maxC = 0;
    String mode = "";

    for (int i = 0; i < word.length(); i++)
    {
      String target = word.substring(i, i+1);
      int count = 0;
      

      for (int j = 0; j < word.length(); j++)
      {
        String currentLetter = word.substring(j, j+1);
        if (currentLetter.equals(target))
        {
            count++;
        }
      }

      if(count > maxC)
      {
        maxC = count;
        mode = target;
      }
    }
    System.out.println(mode + " shows up the most at " + maxC + " times");
  }
}
