package com.todo.myfirstwebapp.hello;

public class Person {

	private String name;
	private Short age;
	private String address;
	private String mobile;

	public Person() {
		super();
	}

	public Person(String name, Short age, String address, String mobile) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", mobile=" + mobile + "]";
	}

}
