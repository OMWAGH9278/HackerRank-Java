import java.io.*;

class Arithmetic
{
    public int iNo;

    public Arithmetic(int a)
    {
        iNo = a;
    }

    public void table()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo+" x "+iCnt+" = "+iCnt*iNo);
        }
    }
}

class Solution6 
{
    public static void main(String arg[]) throws IOException 
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iValue = Integer.parseInt(bobj.readLine().trim());

        Arithmetic aobj = new Arithmetic(iValue);

        aobj.table();

        bobj.close();
    }
}
