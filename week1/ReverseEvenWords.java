package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
		String test = "I am a software tester"; 
		 String[] words=test.split(" ");
		 for(int i=0;i<words.length;i++)
			{
				if(i%2==0)
				{System.out.print(words[i]);	
				}
				
				if(i%2==1)
				{
					String reversethestring=words[i];
					char[] reverse=reversethestring.toCharArray();
					for(int j=reverse.length-1;j>=0;j--)
							System.out.print(reverse[j]);
				}
			}
			
	}}