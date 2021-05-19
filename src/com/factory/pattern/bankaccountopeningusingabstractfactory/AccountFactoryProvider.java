package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class AccountFactoryProvider {
	public static AbstractAccountFactory getAccountFactory(String accountCategory) {
		AbstractAccountFactory accountFactory = null;
		if(accountCategory!=null) {
			switch(accountCategory) {
			case "SAVING":
				accountFactory = new AccountFactory();
				break;
			case "LOAN":
				accountFactory = new LoanAccountFactory();
				break;
			case "DEPOSIT":
				accountFactory = new DepositAccountFactory();
				break;
			default:
				break;
			}
		}
		return accountFactory;
	}
}
