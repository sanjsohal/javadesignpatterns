package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class FixedDepositAccount extends DepositAccount {

	private boolean depositDone;
	
	public FixedDepositAccount(long accountNo, String accountHolderName, int termInMonths) {
		super(accountNo, accountHolderName, AccountType.FIXED_DEPOSIT, termInMonths);
		setInterestStrategy(InterestStrategy.SIMPLE);
	}

	@Override
	public double getInterest(int term) {
		return this.getInterestStrategy().getInterest(accountType, amount, term);
	}
	
	@Override
	public void deposit(double amount) {
		if(!depositDone && amount> 0.0d) {
			this.amount = amount;
			depositDone = true;
		} else {
			System.out.println("Sorry! We can deposit only once in a Fixed Deposit Account!");
		}
	}
	
}
