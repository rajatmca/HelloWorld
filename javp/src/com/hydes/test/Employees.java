package com.hydes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees implements Iterable<Employee>{
	private List<Employee> emp =null;
	public Employees() {
		emp= new ArrayList<Employee>();
		emp.add(new Employee(1001,"Rams","hyd", "lead"));
		emp.add(new Employee(1002,"Syamss","hydnn", "SE"));
		emp.add(new Employee(1003,"Narms","delhi", "JE"));
	}
	

	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return emp.iterator();
	}

}
