package com.test;

public class Employee {

	int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", slalry=" + slalry + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSlalry() {
		return slalry;
	}
	public void setSlalry(Integer slalry) {
		this.slalry = slalry;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Integer slalry) {
		super();
		this.id = id;
		this.name = name;
		this.slalry = slalry;
	}
	String name;
	Integer slalry;
}
