package day5_Assingment;

public class Bank_Account
{
	private int Account_No;
	private String Name;
	private double Balance;
	
	public void setter(int acn, String nm,Double bal)
	{
		Account_No=acn;
		Name=nm;
		Balance=bal;	
	} 
	
	public void display()
	{
		System.out.println(" Account No.= "+Account_No);
		System.out.println(" The Name of Accountee is = "+Name);
		System.out.println(" The Balane is = "+Balance);
	}
	
	public void display_Bal(int acn)
	{
		Account_No=acn;
		System.out.println("Your balance is = "+Balance);
	} 
	
	public void withdraw(double amt)
	{
		Balance-=amt;
		System.out.println("Your balance is = "+Balance);
	}
	
	public void deposit(double amt)
	{
		Balance+=amt;
		System.out.println("Your balance is = "+Balance);
	}
	
	
	
}
