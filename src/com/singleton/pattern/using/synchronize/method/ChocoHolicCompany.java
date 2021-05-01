package com.singleton.pattern.using.synchronize.method;



public class ChocoHolicCompany implements Runnable{
	public void run() {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		System.out.println(chocolateBoiler);
		//chocolateBoiler.fill();
		//chocolateBoiler.boil();
		//chocolateBoiler.drain();
	}
	public static void main(String...args) {		
		for(int i = 0;i<10;i++) {
			Runnable worker = new ChocoHolicCompany();
			Thread thread = new Thread(worker);
			thread.start();
		}
	}
}
