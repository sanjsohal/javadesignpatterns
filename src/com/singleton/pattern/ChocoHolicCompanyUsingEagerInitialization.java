package com.singleton.pattern;

public class ChocoHolicCompanyUsingEagerInitialization implements Runnable {

	@Override
	public void run() {
		ChocolateBoilerUsingEagerInitialization boiler = ChocolateBoilerUsingEagerInitialization.getInstance();
		System.out.println(boiler);		
	}
	public static void main(String...args) {		
		for(int i = 0;i<10;i++) {
			Runnable worker = new ChocoHolicCompanyUsingEagerInitialization();
			Thread thread = new Thread(worker);
			thread.start();
		}
	}
}
