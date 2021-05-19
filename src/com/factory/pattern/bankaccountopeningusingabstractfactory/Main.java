package com.factory.pattern.bankaccountopeningusingabstractfactory;

public class Main {
	public static void main(String...args) {
		AbstractAccountFactory factory = AccountFactoryProvider.getAccountFactory("SAVING");
		Account acct1 = factory.createAccount(new AccountOpeningDetails(12345678l, "Vijay Kumar", AccountType.SAVING));
		acct1.deposit(10000.0d);
		System.out.println(acct1);
		System.out.printf(" has interest : %10.2f\n", acct1.getInterest(5));
	}
}
