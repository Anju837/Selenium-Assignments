package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		String reverse = "";
		char[] charsr=name.toCharArray();
		for(int i=charsr.length-1;i>=0;i--)
		{   
			reverse=reverse+charsr[i];
		    
		    
			if(name.equals(reverse))
			{
			System.out.println(name+ " is a palindrome");
			}
			
	}

	}}
