package com.hydes.test;

public class EmployeeTest {

	public static void main(String[] args) {
		/*Employees emps = new Employees();
		//for( Employee em : emps)
		{
			System.out.println(em);
		}
		*/
		Employees emps = new Employees();
		for(Employee emp : emps){
			System.out.println(emp);
		}
	}

}
