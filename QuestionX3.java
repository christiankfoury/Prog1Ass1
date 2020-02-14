import java.util.*;
public class QuestionX3
{
    public static void main(String[] args) {
          // Creating Scanner and naming kb (KeyBoard)
          Scanner kb = new Scanner(System.in);

          // Prompt the user and ask for a 3 digit integer number
          System.out.println("Enter a 3 digit whole number:");
          int number = kb.nextInt();
        
          int sum = 0;
            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            System.out.println(sum); 


    }
}
