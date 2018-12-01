package com.ddlab.rnd;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "Emp")
public class Emp {
	
//	@XmlElement(name = "name")
	private String name;
	
//	@XmlElement(name = "age")
	private int age;
	
	private Address adrs;

	public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
