package week3.day1;

public class Calculator {
	
	public void add(int a , int b){
		System.out.println("The addition of two number" +(a+b));
	}
	public void add(int a , int b, int c){
		System.out.println("The addition of three number" +(a+b+c));
 }
	public void multiply(int a , int b){
		System.out.println("The multiplication of two integer number is " +(a*b));		
	}
	public void multiply(int a , double b){
		System.out.println("The multiplication of integer and double number is " +(a*b));				
	}
	public void subtract(int a , int b){
		System.out.println("The subtraction of two integer number is " +(a-b));
	}
	public void subtract(double a, double b){
		System.out.println("The subtraction of two double number is " +(b-a));	
	}
	public void divide(int a , int b){
		System.out.println("The division of two integer number is " +(a/b));				
	}
	public void divide(double b,int a){
		System.out.println("The division of integer and double number is " +(a/b));						
	}
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(3, 3);
	cal.add(1, 3, 4);
	cal.subtract(2, 3);
	cal.subtract(5.51, 8.0);
	cal.subtract(2,3);
	cal.multiply(2,4);
	cal.multiply(4, 10.6);
	cal.divide(23.3,3);
	cal.divide(4,3);
}}
