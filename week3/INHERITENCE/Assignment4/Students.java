package week3.day1;



public class Students {
	
	
	public static void getStudentInfo(int id)
	{
	System.out.println("Student id : " + id);
	}
	public static void getStudentInfo(int id,String name)
	{
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);
	}
	public static void getStudentInfo(String email, String phoneNumber)
	{
		System.out.println("Student email : " + email);
		System.out.println("Student phoneNumber : " + phoneNumber);
	}
	public static void main(String[] args) {
		Students inform = new Students();
		inform.getStudentInfo(3);
		inform.getStudentInfo(3,"ann");
	inform.getStudentInfo("ann@gmail.com","1234567890");
	}}