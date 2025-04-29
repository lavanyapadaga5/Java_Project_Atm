package ATM;

public class Atm {
	private double Balance;
	private double Depositamount;
	private double Withdrawamount;
	public Atm() {
		super();
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
	public double getDepositamount() {
		return Depositamount;
	}
	public void setDepositamount(double depositamount) {
		Depositamount = depositamount;
	}
	public double getWithdrawamount() {
		return Withdrawamount;
	}
	public void setWithdrawamount(double withdrawamount) {
		Withdrawamount = withdrawamount;
	}
	@Override
	public String toString() {
		return "Atm [Balance=" + Balance + ", Depositamount=" + Depositamount + ", Withdrawamount=" + Withdrawamount
				+ "]";
	}
    
}
