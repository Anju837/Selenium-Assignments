package week1.day2;

public class RemovesDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     String text="We learn java basics as part of java sessions in java week1";
	     
	 int count=0;
		String[] sen = text.split(" ");
		
	     
		for(int i=0;i<sen.length;i++)    
	    {
	      if(sen[i]!=null)
	      {
	      
	      for(int j=i+1;j<sen.length;j++)          
	      {
	        
	      if(sen[i].equals(sen[j]))          
	        {
	          sen[j]=""; 
	          count=count+1;
	          			                        
	        }
	      }
	      }
	    }
	    for(int k=0;k<sen.length;k++)     
	    {
	      if(sen[k]!=null)
	      {
	        System.out.print(sen[k] + " ");
	      }
	    }
	}}