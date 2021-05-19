package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class LoanAccountFactory extends AbstractAccountFactory {

	@Override
	public LoanAccount createAccount(AccountOpeningDetails openingDetails) {
		if(openingDetails == null || openingDetails.isNotValid(false)) {
			throw new IllegalArgumentException("Account Opening Details are not valid!");
		}
		LoanAccount loanAccount = null;
		AccountType type = openingDetails.getAccountType();
		switch(type) {
		case PERSONAL_LOAN:
			loanAccount = new PersonalLoanAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName(), openingDetails.getTermInMonths());
			break;
		case HOME_LOAN:
			loanAccount = new HomeLoanAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName(), openingDetails.getTermInMonths());
			break;
		case VEHICLE_LOAN:
			loanAccount = new VehicleLoanAccount(openingDetails.getAccountNo(), openingDetails.getAccountHolderName(), openingDetails.getTermInMonths());
			break;
		default:
			System.err.println("Unknown/unsupported account-type.");
		}
		return loanAccount;
	}

}
