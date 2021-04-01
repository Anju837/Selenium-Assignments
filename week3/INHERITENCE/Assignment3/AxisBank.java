package week3.day1;



public class AxisBank extends BankInfo{
	
	
	public void deposit()
	{
		System.out.println("New deposit opened");
}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
}}
