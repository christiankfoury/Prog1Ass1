import java.util.*;
public class QuestionX4
{
    public static void main(String[] args) {
        // Creating Scanner and naming kb (KeyBoard)
        Scanner kb = new Scanner(System.in);

        // Prompt the user and ask for a URL
        System.out.println("Enter a URL: ");
        // Input from the user adn trimming
        String url = kb.nextLine();
        url = url.trim();

        // Calling the method for the amount of characters in the URL
        int length = url.length();
        String http = "https://";

        // Output
        System.out.println("Verifying an URL with " + length + " characters");
        
        // Substracting the first 8 characters that could be written https:// so I can compare later
        url = url.substring(0,9);
      
        boolean boo1 = Boolean.parseBoolean(url);
        boolean boo2 = Boolean.parseBoolean(http);

        // If statement to see if the first 8 letters equal to http:// or not
            if (boo1 == boo2 ){ 
                boo1 = boo2;
                System.out.println("Is this a valid and secure URL? true");
            }
            else {
            System.out.println("Is this a valid and secure URL? false");
            }
        


    }
}