package testpackage;

public class Student {
	
	
	String name="Kiruthika";
	int rollNumb=7399;
	public int college()
	{
		System.out.println("College method");
		int sectionCode=59;
		return sectionCode;
	}
	public static void main(String args[])
	{
		Student obj=new Student();
		obj.college();
		System.out.println("Name-"+obj.name);
		System.out.println("Roll number-"+obj.rollNumb);
	}

}
