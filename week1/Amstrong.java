package week1.day2;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=153;
		int temp=a;
		
		int c=0;
		int b=0;
		while(a>0)
		{
			c=a%10;
		b=b+c*c*c;
		a=a/10;}
	if(temp==b)
	{
		System.out.println("given no is amstrong");
			
	}	
	else
	{
		System.out.println("given no is not an amstrong number");
	}

	


}}