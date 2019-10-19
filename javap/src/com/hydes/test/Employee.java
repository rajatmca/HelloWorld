package com.hydes.test;

import java.util.Comparator;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>  {
	int eid;
	String name;
	int age;
	

	public Employee1(int eid, String name, int age) {
		this.eid = eid;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(Employee1 o) {
		int eid1= this.eid;
		int eid2= o.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else
		return 0;
	}

}
public class Employee 
{
public static void main(String[] args) {
	Employee1 emp= new Employee1(101, "rajat", 28);
	Employee1 emp1= new Employee1(102, "ajat", 29);
	Employee1 emp2= new Employee1(103, "sajat", 25);
	Employee1 emp3= new Employee1(104, "jajat", 28);
	TreeSet<Employee1> tset = new TreeSet<>();
	tset.add(emp);
	tset.add(emp1);
	tset.add(emp2);
	tset.add(emp3);
	System.out.println(tset);
	TreeSet<Employee1> tset1 = new TreeSet<>(new MyComprator1());
	tset1.add(emp);
	tset1.add(emp1);
	tset1.add(emp2);
	tset1.add(emp3);
	System.out.println(tset1);
	MyComprator1 ct= new MyComprator1();
	//System.out.println(ct.);
	
		

	}
	}
class MyComprator1 implements Comparator<Employee1>
{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		String name1= o1.name;
		String name2= o2.name;
		//System.out.println(name1);
		//System.out.println(name2);
		//System.out.println();
		return name1.compareTo(name2);
	}
	
}
