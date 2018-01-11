package adsf;

public class SavingsAccount {
	private static float yearRate;
	private int savingBalance;

	public static float getYearRate() {
		return yearRate;
	}

	public static void setYearRate(float yearRate) {
		SavingsAccount.yearRate = yearRate;
	}

	public int getSavingBalance() {
		return savingBalance;
	}

	public SavingsAccount setSavingBalance(int savingBalance) {
		this.savingBalance = savingBalance;
		return this;
	}

	public float calculateMonthlyInterest() {
		return savingBalance * yearRate / 12;
	}

}
