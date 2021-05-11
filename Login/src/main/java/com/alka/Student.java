package com.alka;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="student")
public class Student {
	
	private String name;
	private String id;
	private String roll;
	public String getName() {
		return name;
	}
	//@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	//@XmlElement
	public void setId(String id) {
		this.id = id;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
}
