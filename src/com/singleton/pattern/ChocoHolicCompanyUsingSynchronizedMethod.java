package com.singleton.pattern;



public class ChocoHolicCompanyUsingSynchronizedMethod implements Runnable{
	public void run() {
		ChocolateBoilerUsingSynchronizedMethod chocolateBoiler = ChocolateBoilerUsingSynchronizedMethod.getInstance();
		System.out.println(chocolateBoiler);
		//chocolateBoiler.fill();
		//chocolateBoiler.boil();
		//chocolateBoiler.drain();
	}
	public static void main(String...args) {		
		for(int i = 0;i<10;i++) {
			Runnable worker = new ChocoHolicCompanyUsingSynchronizedMethod();
			Thread thread = new Thread(worker);
			thread.start();
		}
	}
}
