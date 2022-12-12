1.  System.out.println("String");

2.  Scanner sobj = new Scanner(System.in);
     int a = sobj.nextInt();

3.  sobj.close();

4.  Scanner sobj = new Scanner(System.in);
    int i = sobj.nextInt();
    sobj.nextLine();  // Removes integer from sobj object
    String s = sobj.nextLine();

5.  String s1 = sobj.next();
    int x = sobj.nextInt();
    System.out.printf("%-15s%03d\n",s1,x);

6.  BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
    int iValue = Integer.parseInt(bobj.readLine().trim());

7.  a^b = Math.pow(a,b)  // import java.lang.Math;
    // return value(double *)

8.  try
    {
        // Logic
    }
    catch(Exception eobj)
    {
        System.out.println(sobj.next()+" can't be fitted anywhere.");
    }  // sobj.next() prints value which caused Exception

9.  while(sobj.hasNext())
    {
        // Logic
    } 

10. static
    {
        // Logic here executed before main
    }
    try
    {
        if(condition)
        {
            throw new Exception("String");
        }
    }
    catch(Exception eobj)
    {
        System.out.println(eobj);
    }

11. int n = sobj.nextInt();
    String s = Integer.toString(n);  // Converts integer to string

12. import java.util.Calendar;
    // Create a default calender cobj using Calender class;
    Calendar cobj = Calendar.getInstance();

    // Using set() method to set required date using input parameters;
    // In default calender January is considered 0;
    cobj.set(year, month-1, day);

    // Using get() method with DAY_OF_WEEK characteistic of Calender class
    // as parameter to get day of week inside dayInInt(integer) variable;
    // Default first day of week is considered as SUNDAY, but we require MONDAY as 1 
    int dayInInt = cobj.get(cobj.DAY_OF_WEEK) - 1;
    // We have Days_Of_Week(0-6) -> (Sunday - Saturday)

13. 