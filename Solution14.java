import java.util.*;

class Student
{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) 
    {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() 
    {
		return id;
	}
	public String getFname() 
    {
		return fname;
	}
	public double getCgpa() 
    {
		return cgpa;
	}
}

//Complete the code
public class Solution14
{
	public static void main(String arg[])
    {
		Scanner sobj = new Scanner(System.in);
		int testCases = Integer.parseInt(sobj.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		
        while(testCases>0)
        {
			int id = sobj.nextInt();
			String fname = sobj.next();
			double cgpa = sobj.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
      	for(Student st: studentList)
        {
			System.out.println(st.getFname());
		}
	}
}



