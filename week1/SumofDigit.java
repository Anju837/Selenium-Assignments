package week1.day2;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=123;
		
		int sum=0;
		int j=0;
		while(input >0)
		{
			j = input % 10;
			sum= sum + j;
			input = input / 10;				
}

	System.out.println(sum);
	}}
