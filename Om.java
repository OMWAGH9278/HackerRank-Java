
import java.text.*;
import java.util.*;

class Om 
{
    public static void main(String arr[])
    {
        double payment = 12324.134;
        // NumberFormat nobj = NumberFormat.getCurrencyInstance(Currency.getInstance(Locale.US));
        
        NumberFormat nobj = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nobj.format(payment);
        
        System.out.println(us);
        
    }     
}
