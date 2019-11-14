package com.hydes.test;

public class TryCatchException {

	public static void main(String[] args) {
		try {
			System.out.println("divide "+15/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally{System.out.println("\n normal");}

	}

}
