package com.singleton.pattern;

public class ChocoHolicCompanyUsingDoubleCheckedLocking implements Runnable	 {

	@Override
	public void run() {
		ChocolateBoilerUsingDoubleCheckedLocking boiler = ChocolateBoilerUsingDoubleCheckedLocking.getInstance();
		System.out.println(boiler);		
	}
	public static void main(String...args) {
		for(int i = 0;i<10;i++) {
			Runnable worker = new ChocoHolicCompanyUsingDoubleCheckedLocking();
			Thread thread = new Thread(worker);
			thread.start();
		}
	}

}
