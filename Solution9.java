import java.util.*;

public class Solution9 
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
       
        int iCnt = 1;
       
        while(sobj.hasNext())
        {
            String str = sobj.nextLine();
            System.out.println(iCnt+" "+str);
            iCnt++;
        } 
       
       sobj.close();
    }
}
