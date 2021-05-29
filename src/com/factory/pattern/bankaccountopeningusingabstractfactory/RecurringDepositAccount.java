package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class RecurringDepositAccount extends DepositAccount {

	public RecurringDepositAccount(long accountNo, String accountHolderName,
			int termInMonths) {
		super(accountNo, accountHolderName, AccountType.RECURRING_DEPOSIT, termInMonths);
		setInterestStrategy(InterestStrategy.COMPOUND);
	}

	@Override
	public double getInterest(int term) {
		return this.getInterestStrategy().getInterest(accountType, amount, term);
	}

}
