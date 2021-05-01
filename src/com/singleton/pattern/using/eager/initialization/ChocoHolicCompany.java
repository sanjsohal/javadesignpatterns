package com.singleton.pattern.using.eager.initialization;

public class ChocoHolicCompany implements Runnable {

	@Override
	public void run() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		System.out.println(boiler);		
	}
	public static void main(String...args) {		
		for(int i = 0;i<10;i++) {
			Runnable worker = new ChocoHolicCompany();
			Thread thread = new Thread(worker);
			thread.start();
		}
	}
}
