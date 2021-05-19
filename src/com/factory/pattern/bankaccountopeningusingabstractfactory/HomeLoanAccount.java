package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class HomeLoanAccount extends LoanAccount {

	public HomeLoanAccount(long accountNo, String accountHolderName, int termInMonths) {
		super(accountNo, accountHolderName, AccountType.HOME_LOAN, termInMonths);
		setInterestStrategy(InterestStrategy.COMPOUND);
	}

	@Override
	public double getInterest(int term) {
		return this.getInterestStrategy().getInterest(accountType, amount, term);
	}

}
