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

    for (int i = 0; i < word.length(); i++) // for each letter in word
    {
      String target = word.substring(i, i+1); // get the letter
      int count = 0;
      

      for (int j = 0; j < word.length(); j++) //look at whole word for letter
      {
        String currentLetter = word.substring(j, j+1); // get current letter
        if (currentLetter.equals(target))
        {
            count++;
        }
        //then repeat
      }

      if(count > maxC) //if count of the current letter is larger than current max letter count
      {
        maxC = count;
        mode = target;
      }
    }
    System.out.println(mode + " shows up the most at " + maxC + " times");
  }
}
