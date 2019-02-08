package _19.datatable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DatatablePersonBean {
	
	private String name;
	private String surname;
	private int age;
	private int phoneNumber;
	
	public DatatablePersonBean() {
		super();
	}

	public DatatablePersonBean(String name, String surname, int age, int phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
