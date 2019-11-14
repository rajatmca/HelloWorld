package com.hydes.test;
class Th1 extends Thread{
	public void run() {
		for (int i = 0; i< 5; i++) {
			//Thread.yield();
			System.out.println("Th1.run()");
		}
	}
}

public class TreadYeildDemo {

	public static void main(String[] args) {
		Th1 th = new Th1();
		th.start();
		for(int i = 0; i<5; i++) {
			System.out.println("TreadYeildDemo.main()");
		}

	}

}
