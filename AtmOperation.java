package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperation implements ATMInterface {

	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	public void Viewbalance() {
		// TODO Auto-generated method stub
		System.out.println("Avilable Balance:"+atm.getBalance());
		
	}

	public void Withdrawmount(double Withdrawamount) {
		// TODO Auto-generated method stub
		if(Withdrawamount%500==0) {
			if(Withdrawamount<=atm.getBalance()) {
				System.out.println("Collect the Cash:"+Withdrawamount);
				atm.setBalance(atm.getBalance()-Withdrawamount);
				ministmt.put(Withdrawamount, "Amount Withdrawn");
				Viewbalance();
				
			}
			else {
				System.out.println("Insufficient Balance:");
			}
			
		}
		else {
			System.out.println("Enter teh mount in Terms of 500");
		}
		
	}

	public void Depositmount(double Depositamount) {
		// TODO Auto-generated method 
		System.out.println("Deposited Amount is"+Depositamount);
		atm.setBalance(atm.getBalance()+Depositamount);
		ministmt.put(Depositamount, "Deposited Successfully:");
		Viewbalance();
		
		
	}

	public void ViewMiniStatement() {
		// TODO Auto-generated method stub
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"--"+ministmt.get(d));
		}
	}

}
