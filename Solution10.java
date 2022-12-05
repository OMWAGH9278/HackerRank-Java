import java.util.*;

public class Solution10
{
    public static boolean flag;
    public static int B;
    public static int H;

    static
    {
        flag = false;

        Scanner sobj = new Scanner(System.in);

        B = sobj.nextInt();
        H = sobj.nextInt();

        try
        {
            if((B <= 0) || (H <= 0))
            {
                throw new Exception("Breadth and height must be positive");
            }
            else if((B <= 100) && (H <= 100))
            {
                flag = true;
            }
            else
            {
                flag = false;
            }        
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }

    public static void main(String arg[])
        {
            if(flag)
            {
                int area = B * H;
                System.out.print(area);
            }
            
        }//end of main

}//end of class