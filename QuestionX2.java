import java.lang.management.ManagementPermission;
import java.text.DecimalFormat;
import java.util.*;
public class QuestionX2
{
    public static void main(String[] args) {
          // Creating Scanner and naming kb (KeyBoard)
          Scanner kb = new Scanner(System.in);

          // Prompt the user
          System.out.println("Enter the price of a product: ");
          double price = kb.nextInt();

          //Initializing the tps, tvq and tips value
          double tps = 0.05;
          double tvq = 0.09975;
          double tips = 0.15;

          double finalPrice = price + (price * tps) + (price * tvq) + (price * tips);

          DecimalFormat df = new DecimalFormat("#.##");
          String format = df.format(finalPrice);
          finalPrice = Double.valueOf(format);

          System.out.println("Product: " + price + " $CAD");
          System.out.println("TPS: " + price * tps + " $CAD");
          System.out.println("TVQ: " + price * tvq + " $CAD");
          System.out.println("Tips: " + price * tips + " $CAD");
          System.out.println("Total: " + finalPrice + " $CAD");



    }
}