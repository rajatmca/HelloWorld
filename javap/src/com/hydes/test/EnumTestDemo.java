package com.hydes.test;

import java.util.Enumeration;
import java.util.Vector;

public class EnumTestDemo {

	public static void main(String[] args) {
		Vector<Integer> vv = new Vector<>();
		//vv.add(e)
		for(int i = 0; i<10;i++)
		{
			vv.addElement(i);
		}
		System.out.println(vv);
		Enumeration< Integer> ee = vv.elements();
		while(ee.hasMoreElements())
		{
			Integer ii= ee.nextElement();
			if(ii%2==0)
				System.out.println(ii);
		}
		System.out.println(vv);

	}

}
