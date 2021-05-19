package com.factory.pattern.bankaccountopeningusingabstractfactory;

public abstract class AbstractAccountFactory {
	public abstract Account createAccount(AccountOpeningDetails openingDetails);
}
