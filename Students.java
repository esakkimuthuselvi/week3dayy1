package AssignOverri;

public class Students {
	
	public void getStudentInfo(int studentId)
	{
		System.out.println("Student Id :" + studentId);
	}
	public void getStudentInfo(int studentId, String studentName)
	{
		System.out.println("Student Id :" + " " +studentId);
		System.out.println("Student Name :" +" "+ studentName);
		
	}
	public void getStudentInfo(String studentemail, String studentphoneNumber)
	{
		System.out.println("Student Emai :l" +" "+ studentemail);
		System.out.println("Student PhoneNumber :" +" "+ studentphoneNumber);
	}
	
	public static void main(String []args)
	{
		Students stu=new Students();
		stu.getStudentInfo(112);
		stu.getStudentInfo(112, "Selvi");
		stu.getStudentInfo("selvi@gmail.com", "9657435345");
	}
}
