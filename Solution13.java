import java.text.NumberFormat;
import java.util.*;

public class Solution13
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        double payment = sobj.nextDouble();
        sobj.close();

        NumberFormat nobj = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nobj.format(payment);
        
        nobj = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN"));
        String india = nobj.format(payment);

        nobj = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nobj.format(payment);

        nobj = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nobj.format(payment);
        
        if((payment > 0) && (payment < Math.pow(10,9)))
        {
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }
}
