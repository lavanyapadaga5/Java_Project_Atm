package ATM;

import java.util.Scanner;

public class Userinterface{
	private static int status;
	public static void main(String[] args) {
		AtmOperation op=new AtmOperation();
		Scanner scan=new Scanner(System.in);
		int atmnum=123456;
		int atmpin=123;
		System.out.println("ENTER THE ATM NUMBER:");
		int atmnum2=scan.nextInt();
		System.out.println("ENTER ATM PIN:");
		int atmpin2=scan.nextInt();
		if(atmnum==atmnum2 && atmpin==atmpin2) {
			while(true) {
			System.out.println("1.Viewbalance\n2.Withdrawamount\n3.Depositamount\n4.Viewministatement\n5.exit\n");
			System.out.println("Enter your choice:");
			int ch=scan.nextInt();
			if(ch==1) {
				op.Viewbalance();
			}
			else if(ch==2) {
				System.out.println("Enter teh amount to withdraw:");
				double withdrawamount=scan.nextDouble();
				op.Withdrawmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to deposit:");
				double depositamount=scan.nextDouble();
				op.Depositmount(depositamount);
			}
			else if(ch==4) {
				op.ViewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("Collect your atm card:\nThank you");
				System.exit(status);
			}
			}	
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN:");
		}
	}
}
