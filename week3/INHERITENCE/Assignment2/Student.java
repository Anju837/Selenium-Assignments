package org.student;

import org.department.Department;

public class Student extends Department 
{
	public void studentName()
	{
		System.out.println("Ann");
}
	public void studentDept()
	{
		System.out.println("CS");
}
	public void studentId()
	{
		System.out.println("234567");
}

public static void main(String[] args) {
	Student stud = new Student();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
	stud.deptName();
	stud.studentName();
	stud.studentId();
	stud.studentDept();
}
}
