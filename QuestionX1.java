import java.text.DecimalFormat;
import java.util.*;
public class QuestionX1
{
    public static void main(String[] args) {
        // Creating Scanner and naming kb (KeyBoard)
        Scanner kb = new Scanner(System.in);

        // Prompt the user and ask how many kilometers will be  travelled
        System.out.println("How many kilometers will be travelled?");
        double kilometers = kb.nextInt();

        // Prompt the user and ask the average distance that the vehicle can run with 1 liter of gas
        System.out.println("What is the average distance that the vehicule can run with 1 liter of gas");
        double avgdistance = kb.nextInt();

        // Initialize the price of gas (1.16 CAD)
        double price =  1.16;

        double formula = (kilometers / avgdistance) * price;
        
        DecimalFormat df = new DecimalFormat("#.##");
        String format = df.format(formula);
        formula = Double.valueOf(format);

        System.out.print("The estimated cost of the trip will be: " + formula);


        
        
    }
}