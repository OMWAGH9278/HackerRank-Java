import java.util.*;

public class Solution11 
{
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sobj = new Scanner(System.in);
            int n = sobj.nextInt();
            sobj.close();

            //String s=???; Complete this line below

            String s = Integer.toString(n);
            
            if (n == Integer.parseInt(s)) 
            {
                System.out.println("Good job");
            } 
            else 
            {
                System.out.println("Wrong answer.");
            }
        } 
        catch (DoNotTerminate.ExitTrappedException eobj) 
        {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate 
{
    public static class ExitTrappedException extends SecurityException 
    {
        private static final long serialVersionUID = 1;
    }
}
