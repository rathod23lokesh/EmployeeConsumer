package com.example.demo.model;

public class Employee {

	public int rno;
	public	String name;
	public String address;

	
	public Employee(int rno, String name, String address) {
		this.rno = rno;
		this.name = name;
		this.address = address;
	}

	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [rno=" + rno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
