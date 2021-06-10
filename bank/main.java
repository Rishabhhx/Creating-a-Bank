package bank;
import java.util.Scanner;

class info {
	int accno;
	String name;
	int pin;
	public void createNew()
	{
	
	Scanner myobj = new Scanner(System.in);
	System.out.println("Enter your Name");
	name= myobj.nextLine();
	System.out.println("Enter your accno");
	accno= myobj.nextInt();
	System.out.println("Enter your pin");
	pin= myobj.nextInt();
	System.out.println("YOUR ACCOUNT IS CREATED, CONGRATULATIONs!!");
	
}
}
class login extends info
{
	String savename="Rishabh";
	int saveaccno=88821;
	int savepin=001;
	int savebal=35000;
	void verify() {
		Scanner myobj2 = new Scanner(System.in);
		System.out.println("Enter User Account no.");
		int verifyaccno= myobj2.nextInt();
		if (verifyaccno==saveaccno||verifyaccno==accno)
		{
			System.out.println("Enter Pin");
			int verifypin= myobj2.nextInt();
			if(verifypin==savepin||verifypin==pin)
			{
				System.out.println("WELCOME " + savename + " "+ verifyaccno);
				trans();
			}
			else
				System.out.println("WRONG PIN");
		}
		else
			System.out.println("WRONG ACCNO");
	}
	void trans()
	{
		Scanner myobj2 = new Scanner(System.in);
		System.out.println("!!WELCOME TO TRANSACTION MENU!!");
		System.out.println("WELCOME " + savename + " ");
		System.out.println("Choose what you want to do");
		System.out.println("1) Check ballance");
		System.out.println("2) Deposit");
		System.out.println("3) Withdraw");
		int ch = myobj2.nextInt();
			switch (ch)
			
		{
		case 1:
			System.out.println("Your current balance is " + savebal);
			break;
		case 2:
			System.out.println("Enter ammount you want to deposit");
			int deposit= myobj2.nextInt();
			deposit= savebal+deposit;
			System.out.println("Your Updated Balance is : " + deposit);
			break;
		case 3:
			System.out.println("Enter ammount you want to withdraw");
			int withdraw= myobj2.nextInt();
			withdraw= savebal-withdraw;
			System.out.println("Your Updated Balance is : " + withdraw);
			break;
		}
	}
}
class main{
	public static void main(String[] args) {
		Scanner myobj2 = new Scanner(System.in);
		info info1 = new info();
		login login1= new login();
		int i=0;
		do
		{
		System.out.println("!!!!!WELCOME TO BANK!!!!");
		System.out.println("What would you llike to do");
		System.out.println("1) Create an Account");
		System.out.println("2) Login in");
		int ch = myobj2.nextInt();
		switch (ch)
		{
			case 1:
				info1.createNew();
				break;
			case 2:
				login1.verify();
				
				break;
		}
		i++;
		}while(i<=2);
		
		
	}
}