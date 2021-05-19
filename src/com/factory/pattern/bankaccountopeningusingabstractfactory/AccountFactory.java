package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class AccountFactory extends AbstractAccountFactory {

	@Override
	public Account createAccount(AccountOpeningDetails openingDetails) {
		if(openingDetails == null || openingDetails.isNotValid(false)) {
			throw new IllegalArgumentException("Account Opening Details are not valid!");
		}
		Account account = null;
		AccountType accountType = openingDetails.getAccountType();
		switch(accountType) {
		case SAVING:
			account = new SavingAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName());
			break;
		case CURRENT:
			account = new CurrentAccount(openingDetails.getAccountNo(),openingDetails.getAccountHolderName());
			break;
		default:
			System.err.println("Unknown/unsupported account-type.");
		}
		return account;
	}

}
