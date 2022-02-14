import java.util.Scanner;
public class FoodMenu {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int dosa=0;
	int Samosa=0;
	int idli=0;
	int rice=0;
	int q=0;
	System.out.println("Menu::");//(eg 1. Dosa 2. Samosa 3.Idli 4. Rice 5 . Generate Bill
	System.out.println("1.Dosa");
	System.out.println("2.Samosa");
	System.out.println("3.Idli");
	System.out.println("4.Rice:");
	System.out.println("5.Generate Bill:");
	System.out.println("6.Exit");
	
	boolean flag=true;
	
	while(flag!=false)
	{
		System.out.println("Enter Your Choice::");
		
		int ch=sc.nextInt();
		
	switch(ch)
	{
	case 1: 
        System.out.println("Enter quantity::");
		q=sc.nextInt();
		dosa=q*50;
	
	break;
	
	case 2: 
		System.out.println("Enter quantity::");
		q=sc.nextInt();
		Samosa=q*20;
	break;
	
	case 3: 
	    System.out.println("Enter quantity::");
	    q=sc.nextInt();
	    idli=q*15;
	break;
	
	case 4: 
		System.out.println("Enter quantity::");
	    q=sc.nextInt();
	    rice=25;
	break;
	
	case 5: 
		int bill=dosa+Samosa+idli+rice;
		System.out.println("Your Total Bill is::"+bill);
		
	case 6: flag=false;
	break;
	
	default: System.out.println("Enter valid Choice");
	break;
	}
	}
	sc.close();
	}
}
