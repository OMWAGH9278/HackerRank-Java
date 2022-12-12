import java.io.*;
import java.util.Calendar;

class Result 
{
    public static String findDay(int month, int day, int year) 
    {
        // Create a default calender cobj using Calender class;
        Calendar cobj = Calendar.getInstance();

        // Using set() method to set required date using input parameters;
        // In default calender January is considered 0;
        cobj.set(year, month-1, day);

        // Using get() method with DAY_OF_WEEK characteistic of Calender class
        // as parameter to get day of week inside dayInInt(integer) variable;
        // Default first day of week is considered as SUNDAY, but we require MONDAY as 1 
        int dayInInt = cobj.get(cobj.DAY_OF_WEEK) - 1;

        // Sunday will be 0
        if(dayInInt == 0)
        {
            dayInInt = 7;
        }

        // Convert integer into a string
        String str = null;

        if(dayInInt == 1)
        {
            str = "MONDAY";
        }
        else if(dayInInt == 2)
        {
            str = "TUESDAY";
        }
        else if(dayInInt == 3)
        {
            str = "WEDNESDAY";
        }
        else if(dayInInt == 4)
        {
            str = "THURSDAY";
        }
        else if(dayInInt == 5)
        {
            str = "FRIDAY";
        }
        else if(dayInInt == 6)
        {
            str = "SATURDAY";
        }
        else
        {
            str = "SUNDAY";
        }

        return str;  
    }
}

public class Solution12 
{
    public static void main(String arg[]) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String firstMultipleInput[] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
