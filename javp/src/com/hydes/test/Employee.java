package com.hydes.test;

public class Employee {
	private int eid;
	private String name;
	private String addrs;
	private String job;
	public Employee(int eid, String name, String addrs, String job) {
		this.eid = eid;
		this.name = name;
		this.addrs = addrs;
		this.job = job;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", addrs=" + addrs + ", job=" + job + "]";
	}
	

}
