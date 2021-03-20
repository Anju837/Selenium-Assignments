package week1.day2;

import java.util.Arrays;

public class Dulpicateno {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] input= {2,5,3,7,2,7,2,1};
		Arrays.sort(input);
		for(int i=0;i<input.length-1;i++)
		{
			if(input[i] == input[i+1])
			{
				System.out.println(input[i+1]);
				break;
		}
	}


}}